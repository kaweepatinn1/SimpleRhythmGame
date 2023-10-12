package SimpleRhythmGame;

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
	private boolean running;
	
	public Game(Level level, boolean noFail) {
		currentLevel = level;
		rawNotes = currentLevel.getSortedNotes();
		currentNotes = new Note[] {};
		
		currentNotesLimits = new int[] {0,0};
		refreshCurrentNotes(); // refreshes noteQueue into currentNotes.
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
        init();
	}

	public void init() {
		millisStarted = Framerate.getCurrentTime();
		player.play();
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
		double currentTime = Framerate.getCurrentTime() - millisStarted;
		boolean updateCurrent = false;
		boolean updateFuture = false;
		for (Note note : getCurrentNotes()) {
			float speed = note.getSpeed();
			int bar = note.getBar();
			int beat = note.getBeat();
			int subBeatTop = note.getSubBeat()[0];
			int subBeatBottom = note.getSubBeat()[1];
			
			double beatTime = 60d / (double) currentLevel.getBPM();
			double subBeatTime = ((double) subBeatTop / (double) subBeatBottom);
			double barTime = (double) currentLevel.getTimeSignature()[0] * beatTime;
			
			double noteIntendedMillisFromStart = (barTime * bar) * (beatTime * beat) + (subBeatTime * subBeatTop);
			double millisOff = noteIntendedMillisFromStart - currentTime;
			int noteLocationX = 400 + (int) (speed * (millisOff));
			
			if (noteLocationX < -180 - (5000 * speed)) {
				// three second leeway, so that this function only has to be run every three seconds.
				currentNotesLimits[0]++;
				updateCurrent = true;
			} else {
				break; // this is why it's important for the queue to be sorted.
				// breaks as soon as we know this element should be displayed.
			}
		}
		
		for (Note note : getFutureNotes()) {
			float speed = note.getSpeed();
			int bar = note.getBar();
			int beat = note.getBeat();
			int subBeatTop = note.getSubBeat()[0];
			int subBeatBottom = note.getSubBeat()[1];
			
			double beatTime = 60d / (double) currentLevel.getBPM();
			double subBeatTime = ((double) subBeatTop / (double) subBeatBottom);
			double barTime = (double) currentLevel.getTimeSignature()[0] * beatTime;
			
			double noteIntendedMillisFromStart = (barTime * bar) * (beatTime * beat) + (subBeatTime * subBeatTop);
			double millisOff = noteIntendedMillisFromStart - currentTime;
			int noteLocationX = 400 + (int) (currentLevel.getPPS() * speed * (millisOff));
			
			if (noteLocationX < 2100 + (5000 * currentLevel.getPPS() * speed)) {
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
	
	public void run() {
		while(running) {
			if (ShowImage.getState() != "Paused") {
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
	
	private Note[] getCurrentNotes() {
		return currentNotes;
	}
	
	private Note[] getFutureNotes() {
		return futureNotes;
	}

	private Menu generateGameMenu() {
		//Element[] gameElements;
		Menu menuToReturn = new Menu(
				"Gameplay", // Menu name
				currentLevel.getName(), // Menu Display Name
				"%Pause", // Previous Menu
				DefaultValues.Color_BG, // BGColor
				new int[][]{{-1,-1}}, // Secondary Selections
				new RoundedArea[]{ // Masks
					new RoundedArea(0, 0, 1920, 1080, 0) // 0. Full Screen
					// Insert here
				},
				new StoredTransform[] {},
				new Element[] {
						
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

	public Note[] getNoteQueue() {
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
