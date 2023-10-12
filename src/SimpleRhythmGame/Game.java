package SimpleRhythmGame;

import java.awt.image.BufferedImage;

public class Game extends Thread {
	private Level currentLevel;
	private AudioPlayer player;
	
	private Menu rawGameMenu;
	
	private Note[] rawNotes;
	// the unrendered notes queue. First in first out.
	private Note[] currentNotes;
	private Note[] futureNotes;
	private int[] currentNotesLimits; 
	// defines
	private double millisPassed; 
// 	time in millis since the song has started. set when
//	paused to recalculate millisStarted once resumed.
//	The rest of the game uses Framerate.getCurrentTime() - millisStarted
//	as it will be most up to date.
	private double millisStarted;
//	The "start" time of the song. May not actually reflect
//	the start time if the song was paused, as millisStarted
//	will be set to a further on value once resumed.
	
	private int score;
	private int combo;
	private int notesHit;
	private int notesMissed;
	private int accuracy;
	// stored so doesn't have to be calculated every frame, and only every hit
	private int health;
	private boolean noFail;
	private boolean unpaused;
	
	private static transient BufferedImage noteImages[];
	
	public static final int hitLocation = 400;
	
	public Game(Level level, boolean noFail) {
		currentLevel = level;
		rawNotes = currentLevel.getSortedNotes();
		currentNotes = new Note[] {};
		futureNotes = rawNotes;
		currentNotesLimits = new int[] {0,0};
		rawGameMenu = generateGameMenu(); // uses currentNotes to initially generate the game menu
		millisPassed = 0;
		score = 0;
		combo = 0;
		notesHit = 0;
		notesMissed = 0;
		updateAccuracy();
		health = 100;
		this.noFail = noFail;
		
		player = new AudioPlayer();
        player.loadAudio("/levels/" + level.getName() + "/" + level.getName() + ".wav");
        player.setVolume(ShowImage.getConfig().getFinalMusicVolume());
        
        noteImages = new BufferedImage[5];
        for (int i = 0 ; i < 5 ; i++) {
        	noteImages[i] = Renderable.resize(ShowImage.getNoteImage(i), (int) (ShowImage.getScale() * 100), (int) (ShowImage.getScale() * 100));
        }
	}
	
	public static BufferedImage getNoteImage(int index) {
		return noteImages[index];
	}

	public void init() {
		millisStarted = Framerate.getCurrentTime() + 2500;
		refreshCurrentNotes();
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		player.play();
		unpaused = true;
	}
	
	public void updateCurrentNotes() {
		if (currentNotesLimits != null) {
			currentNotes = new Note[] {};
		} else {
			System.arraycopy(rawNotes,currentNotesLimits[0],currentNotes,0,currentNotesLimits[1] - currentNotesLimits[0]);
		}
	}
	
	public void updateFutureNotes() {
		if (currentNotesLimits != null) {
			futureNotes = rawNotes;
		} else {
			System.arraycopy(rawNotes,currentNotesLimits[1],currentNotes,0,rawNotes.length - currentNotesLimits[1]);
		}
	}

	public void refreshCurrentNotes() {
		double currentTime = unpaused ? Framerate.getCurrentTime() - millisStarted : millisPassed;
		boolean updateCurrent = false;
		boolean updateFuture = false;
		for (Note note : getCurrentNotes()) {
			
			int noteLocationX = hitLocation + 
					(int) (currentLevel.getPPS() * note.getSpeed() * 
							(currentTime - note.getCalculatedTimeFromStart(currentLevel)));
			
			if (noteLocationX < -180 - (5000 * currentLevel.getPPS() * note.getSpeed())) {
				// three second leeway, so that this function only has to be run every three seconds.
				currentNotesLimits[0]++;
				updateCurrent = true;
			} else {
				break; // this is why it's important for the queue to be sorted.
				// breaks as soon as we know this element should be displayed.
			}
		}
		
		for (Note note : getFutureNotes()) {
//			System.out.println(currentTime);
//			System.out.println(note.getCalculatedTimeFromStart(currentLevel));
			int noteLocationX = hitLocation + 
					(int) (currentLevel.getPPS() * note.getSpeed() * 
							(currentTime - note.getCalculatedTimeFromStart(currentLevel)));
			
			if (noteLocationX < 2100 + (5000 * currentLevel.getPPS() * note.getSpeed())) {
				// three second leeway, so that this function only has to be run every three seconds.
				currentNotesLimits[1]++;
				updateFuture = true;
			} else {
				break; // this is why it's important for the queue to be sorted.
				// breaks as soon as we know this element should be displayed.
			}
		}
		
		if (updateCurrent) {
			updateCurrentNotes();
		}
		if (updateFuture) {
			updateFutureNotes();
		}
	}
	
	public void pauseGame() {
		player.pause();
		millisPassed = Framerate.getCurrentTime() - millisStarted;
		unpaused = false;
	}
	
	public void resumeGame() {
		player.resume();
		millisStarted = Framerate.getCurrentTime() - millisPassed;
		millisPassed = 0;
		unpaused = true;
		refreshCurrentNotes();
	}
	
	public void run() {
		try {
			Thread.sleep((int) ShowImage.getConfig().getTransitionTime() * 2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		init();
		refreshCurrentNotes();
		while(unpaused) {
			if (!ShowImage.getState().equals("Paused")) {
				refreshCurrentNotes();
			}
			try {
				Thread.sleep(4000); // 4 second refresh, so one full second leeway to refresh.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public Note[] getCurrentNotes() {
		return currentNotes;
	}
	
	private Note[] getFutureNotes() {
		return futureNotes;
	}

	public Menu generateGameMenu() {
		//Element[] gameElements;
		Menu menuToReturn = new Menu(
				"Gameplay", // Menu name
				currentLevel.getName(), // Menu Display Name
				"%Pause", // Previous Menu
				DefaultValues.Color_BG, // BGColor
				new int[][]{{-1,-1}}, // Secondary Selections
				new RoundedArea[]{ // Masks
					new RoundedArea(0, 0, 1920, 1080, 0), // 0. Full Screen
					new RoundedArea(88, 163, 1746, 796, 0) // 1. Notes
					// Insert here
				},
				DefaultValues.StoredTransforms_DEFAULT(),
				new Element[] {
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{-1,-1},{-1,-1},{-1,-1},{-1,-1}} // E, S, W, N to select next
									),
								-1, // Mask Index
								false, // hover overlap
								-1, // hover effect
								-1, // click effect
								-1, // arbritraty animation (to be used for scroll)
								DefaultValues.TransformIndex_500msScale0, // entry animation
								new TextBox(
									// No Text, No Renderable
									1, // scale
									null, // function
									"Green Background",  // name
									new RoundedArea(
										960, 560, 1750, 800,  // x, y, xSize, ySize, round%
										5 // roundPercentage
										),
									DefaultValues.Color_MENU, // box color (index of colors)
									255, // opacity (0-255)
									25, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)
								),
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{2,0},{1,0},{0,0},{1,0}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								-1, // click effect
								-1, // arbritraty animation (to be used for scroll)
								DefaultValues.TransformIndex_500msScale0, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									"GameRenderLast", // function
									"ErrorMessage",  // name
									new RoundedArea(
										400, 560, 0, 800, 0  // x, y, xSize, ySize, round%
										),
									DefaultValues.Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
				}, // Elements
				new Popup[] {DefaultValues.Popup_GAMEPAUSE()} // Popups
				);
		return menuToReturn;
	}

	public void hit() {
		
	}
	
	public void miss() {
		
	}

	public double getMillisPassed() {
		return millisPassed;
	}

	public void setMillisPassed(double millisPassed) {
		this.millisPassed = millisPassed;
	}

	public double getMillisStarted() {
		return millisStarted;
	}

	public void setMillisStarted(double millisStarted) {
		this.millisStarted = millisStarted;
	}

	public int getScore() {
		return score;
	}

	public void incrementScore(int score) {
		this.score = this.score + score;
	}

	public int getCombo() {
		return combo;
	}

	public void incrementCombo(boolean hit) {
		combo = hit ? combo + 1 : 0;
	}

	public int getHealth() {
		return health;
	}

	public void incrementHealth(int health) {
		this.health = this.health + health;
	}

	public Level getCurrentLevel() {
		return currentLevel;
	}

	public Note[] getFullNoteQueue() {
		return rawNotes;
	}

	public Menu getRawGameMenu() {
		return rawGameMenu;
	}

	public int getNotesHit() {
		return notesHit;
	}
	
	public void incrementNotesHit() {
		notesHit++;
	}
	
	public void incrementNotesMissed() {
		notesMissed++;
	}

	public int getNotesMissed() {
		return notesMissed;
	}

	public int getAccuracy() {
		updateAccuracy();
		return accuracy;
	}
	
	private void updateAccuracy() {
		accuracy = (notesMissed == 0) ? 100 : (notesHit / (notesHit + notesMissed));
	}

	public boolean isNoFail() {
		return noFail;
	}
	
}
