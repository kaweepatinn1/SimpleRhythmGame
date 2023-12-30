package SimpleRhythmGame;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Arrays;

public class Game extends Thread {
	private Level currentLevel;
	private AudioPlayer player;
	
	private Menu rawGameMenu;
	
	private Note[] rawNotes;
	// the unrendered notes queue. First in first out.
	private ArrayList<Note> currentNotes;
	private ArrayList<Note> futureNotes;
	private ArrayList<Note> hitNotes;
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
	private double accuracy;
	// stored so doesn't have to be calculated every frame, and only every hit
	private int health;
	private boolean noFail;
	private boolean unpaused;
	
	private boolean tutorial;
	
	private static transient BufferedImage noteImages[];
	
	public static final int hitLocation = 380;
	
	public Game(Level level, boolean noFail) {
		currentLevel = level;
		rawNotes = currentLevel.getSortedNotes();
		currentNotes = new ArrayList<>();
		futureNotes = new ArrayList<>(Arrays.asList(rawNotes));
		hitNotes = new ArrayList<>();
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
		
		if (!level.getName().equals("Tutorial")){
			player = new AudioPlayer();
	        player.loadAudio("/levels/" + level.getName() + "/" + level.getName() + ".wav");
	        player.setVolume(Main.getConfig().getFinalMusicVolume());
	        tutorial = false;
		} else {
			tutorial = true;
		}
        
        noteImages = new BufferedImage[5];
        for (int i = 0 ; i < 5 ; i++) {
        	noteImages[i] = Renderable.resize(Main.getNoteImage(i), (int) (Main.getScale() * 100), (int) (Main.getScale() * 100));
        }
	}
	
	public static BufferedImage getNoteImage(int index) {
		return noteImages[index];
	}
	
	public void calculateNotesTimeFromStart() {
		for (Note note : rawNotes) {
			note.calculateTimeFromStart(currentLevel);
		}
	}

	public void init() {
		calculateNotesTimeFromStart();
		millisStarted = Framerate.getCurrentTime() + 2500;
		refreshCurrentNotes();
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (!tutorial) {
			player.play();
		}
		unpaused = true;
	}
	
	public void updateCurrentNotes() {
		if (currentNotesLimits == null) {
			currentNotes = new ArrayList<>();;
		} else {
			Note[] toUpdate = new Note[currentNotesLimits[1] - currentNotesLimits[0]];
			System.arraycopy(rawNotes,currentNotesLimits[0],toUpdate,0,currentNotesLimits[1] - currentNotesLimits[0]);
			ArrayList<Note> toUpdateList = new ArrayList<>(Arrays.asList(toUpdate));
			for (Note note : hitNotes) {
				toUpdateList.remove(note);
			}
			currentNotes = toUpdateList;
		}
	}
	
	public void updateFutureNotes() {
		if (currentNotesLimits == null) {
			futureNotes = new ArrayList<>(Arrays.asList(rawNotes));;
		} else {
			Note[] toUpdate = new Note[rawNotes.length - currentNotesLimits[1]];
			System.arraycopy(rawNotes,currentNotesLimits[1],toUpdate,0,rawNotes.length - currentNotesLimits[1]);
			ArrayList<Note> toUpdateList = new ArrayList<>(Arrays.asList(toUpdate));
			for (Note note : hitNotes) {
				toUpdateList.remove(note);
			}
			futureNotes = toUpdateList;
		}
	}

	public void refreshCurrentNotes() {
		double currentTime = unpaused ? Framerate.getCurrentTime() - millisStarted : millisPassed;
		boolean updateCurrent = false;
		boolean updateFuture = false;
		for (Note note : getCurrentNotes()) {
			
			int noteLocationX = hitLocation + 
					(int) (currentLevel.getPPS() * note.getSpeed() * 
							(note.getCalculatedTimeFromStart() - currentTime));
			
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
							(note.getCalculatedTimeFromStart() - currentTime));
			
			if (noteLocationX < 2100 + (5000 * currentLevel.getPPS() * note.getSpeed())) {
				// three second leeway, so that this function only has to be run every three seconds.
				currentNotesLimits[1]++;
				updateFuture = true;
			} else {
				break; // this is why it's important for the queue to be sorted.
				// breaks as soon as we know this element should not be displayed.
			}
		}
		
		if (updateCurrent) {
			updateCurrentNotes();
		}
		if (updateFuture) {
			updateFutureNotes();
			updateCurrentNotes();
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
		System.out.println(Thread.currentThread().getPriority());
		try {
			Thread.sleep((int) Main.getConfig().getTransitionTime() * 2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		init();
		refreshCurrentNotes();
		while(unpaused) {
			if (!Main.getState().equals("Paused")) {
				refreshCurrentNotes();
			}
			for (int i = 0 ; i < 400 ; i++) {
				try {
					Thread.sleep(10); // 4 second totalrefresh, so one full second leeway to refresh.
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				boolean stopMissing = false;
				int k = 0;
				while (stopMissing) {
					Note note = currentNotes.get(k);
					if (getTimeSinceGameStart() > note.getCalculatedTimeFromStart() + Main.getConfig().getFORCED_millisecondLeniency() + 200 / currentLevel.getPPS()) {
						miss(note);
						k++;
					} else {
						stopMissing = true;
				}
				}
			}
		}
	}
	
	public ArrayList<Note> getCurrentNotes() {
		return currentNotes;
	}
	
	private Note[] getFutureNotes() {
		Note[] arrayToReturn = new Note[futureNotes.size()];
		int i = 0;
		for (Note note : futureNotes) {
			arrayToReturn[i] = note;
			i++;
		}
		return arrayToReturn;
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
									new int[][]{{-1,-1},{-	1,-1},{-1,-1},{-1,-1}} // E, S, W, N to select next
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
									"null", // function
									"SpikedEnd",  // name
									new Renderable(
											// Renderable Without Function
											"SpikedEndPNG", // name
											"src/textures/spikeend.png", // file source
											0, 0, 58, 700, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										88, 612, 0, 685, 0  // x, y, xSize, ySize, round%
										),
									DefaultValues.Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									0, DefaultValues.Color_TRANSPARENT // strokeWidth, strokeColor
									)),
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
									"Hit Line",  // name
									new RoundedArea(
										400, 612, 0, 685, 0  // x, y, xSize, ySize, round%
										),
									DefaultValues.Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
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
									"null", // function
									"Stats Divider",  // name
									new RoundedArea(
										960, 270, 1750, 0, 0  // x, y, xSize, ySize, round%
										),
									DefaultValues.Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
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
									//Text
									1f, // scale
									"noFunction", // function
									"ScoreTitle", // name
									new Text(
											"Score: ", // text
											"left", "center", // align
											0, -9, // text offset (x, y)
											50, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										123, 217, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									DefaultValues.Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
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
									//Text
									1f, // scale
									"noFunction", // function
									"Score", // name
									new Text(
											"%ScorePercentage", // text
											"left", "center", // align
											0, -9, // text offset (x, y)
											50, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										250, 219, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									DefaultValues.Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
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
									//Text
									1f, // scale
									"noFunction", // function
									"ComboTitle", // name
									new Text(
											"Combo", // text
											"right", "center", // align
											0, -9, // text offset (x, y)
											50, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1805, 217, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									DefaultValues.Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
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
									//Text
									1f, // scale
									"noFunction", // function
									"Combo", // name
									new Text(
											"%Combo", // text
											"right", "center", // align
											0, -9, // text offset (x, y)
											50, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1658, 217, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									DefaultValues.Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
				}, // Elements
				new Popup[] {DefaultValues.Popup_GAMEPAUSE()} // Popups
				);
		return menuToReturn;
	}

	public void hit(Object[] noteInfo) {
		// Check note timing
		futureNotes.remove((Note) noteInfo[0]);
		currentNotes.remove((Note) noteInfo[0]);
		hitNotes.add((Note) noteInfo[0]);
		System.out.println(noteInfo[1]);
		incrementNotesHit();
		// x2 for 5, x3 for 10, x4 for 15 and x5 for 20	
		boolean perfect = Math.abs((double) noteInfo[1]) < 100;
		System.out.println(perfect);
		int timingScore = 200 - (int) Math.abs((double) noteInfo[1]);
		// 200 points minus each ms delay
		int comboMulti = Math.min(((combo / 5) + 1) , 5);
		incrementScore(timingScore * comboMulti);
		incrementCombo(true);
		if (!noFail) {
			incrementHealth(1);
		}
		//System.out.println(note);
	}
	
	public void miss() {
		System.out.println("Miss!");
		incrementNotesMissed();
		incrementCombo(false);
		if (!noFail) {
			incrementHealth(-10);
		}
	}
	
	public void miss(Note note) {
		System.out.println("Miss!");
		incrementNotesMissed();
		incrementCombo(false);
		if (!noFail) {
			incrementHealth(-10);
		}
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

	public void incrementHealth(int addHealth) {
		this.health = Math.min(this.health + addHealth, 100);
		if (health < 0) {
			die();
		}
	}
	
	private void die() {
		
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
		updateAccuracy();
	}
	
	public void incrementNotesMissed() {
		notesMissed++;
		updateAccuracy();
	}

	public int getNotesMissed() {
		return notesMissed;
	}

	public double getAccuracy() {
		return accuracy;
	}
	
	private void updateAccuracy() {
		accuracy = (notesMissed == 0) ? 100 : Math.round(((double) notesHit / (double) (notesHit + notesMissed)) * 1000d) / 10d;
	}

	public boolean isNoFail() {
		return noFail;
	}
	
	/**
	* Returns the closest note of given type to the current time in index 1 of an object array,
	* and the time to that note based on the current level in the second index.
	*
	* @param  int  The type of note.
	* @return      A note, and time from note as a double.
	*/
	public Object[] getClosestNote(int type) {
		for (Note note : currentNotes) {
			if (note.getType() == type) {
				// System.out.println("Time since start: " + getTimeSinceGameStart());
				// System.out.println("Time to hit: " + note.getCalculatedTimeFromStart());
				if ( getTimeSinceGameStart() > note.getCalculatedTimeFromStart() - Main.getConfig().getFORCED_millisecondLeniency() &&
						getTimeSinceGameStart() < note.getCalculatedTimeFromStart() + (Main.getConfig().getFORCED_millisecondLeniency() * 1)) {
					// within one leniency forwards and backwards (positive is late, neg is early)
					return new Object[] {note, getTimeSinceGameStart() - note.getCalculatedTimeFromStart()};
				}
			}
		}
		return null;
	}
	
	/**
	* Returns the closest note to the current time in index 1 of an object array,
	* and the time to that note based on the current level in the second index.
	*
	* @param  level  The current level.
	* @return        A note, and time from note as a double.
	*/
	public Object[] getClosestNote() {
		for (Note note : currentNotes) {
			// System.out.println("Time since start: " + getTimeSinceGameStart());
			// System.out.println("Time to hit: " + note.getCalculatedTimeFromStart());
			if ( getTimeSinceGameStart() > note.getCalculatedTimeFromStart() - Main.getConfig().getFORCED_millisecondLeniency() &&
					getTimeSinceGameStart() < note.getCalculatedTimeFromStart() + (Main.getConfig().getFORCED_millisecondLeniency() * 1)) {
				// within one leniency forwards and backwards (positive is late, neg is early)
				return new Object[] {note, getTimeSinceGameStart() - note.getCalculatedTimeFromStart()};
			}
		}
		return null;
	}
	
	public double getTimeSinceGameStart() {
		return Framerate.getCurrentTime() - getMillisStarted();
	}
	
}
