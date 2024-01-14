package SimpleRhythmGame;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Arrays;

public class Game extends Thread {
	private static int debugStartTime = 0; // for DEBUG ONLY
	
	public static int getDebugStartTime() {
		return debugStartTime;
	}
	
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
	private int maxCombo;
	private int notesHit;
	private int notesMissed;
	private double accuracy;
	// stored so doesn't have to be calculated every frame, and only every hit
	private int health;
	private boolean noFail;
	private boolean unpaused;
	
	private boolean isTutorial;
	
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
	        isTutorial = false;
		} else {
			isTutorial = true;
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
		millisStarted = Framerate.getCurrentTime() + 2500 - (debugStartTime * 1000);
		refreshCurrentNotes();
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (!isTutorial) {
			player.play();
			player.setFramePosition(debugStartTime * 44100);
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
		// System.out.println(Thread.currentThread().getPriority());
		try {
			Thread.sleep((int) Main.getConfig().getTransitionTime() * 2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		init();
		refreshCurrentNotes();
		while(unpaused) {
			if (Main.getState().equals("Playing")) {
				refreshCurrentNotes();
			}
			for (int i = 0 ; i < 500 ; i++) {
				try {
					Thread.sleep(2); 
					// 1 second total refresh time, so four full second leeway 
					// to run 500 iterations before refresh onto screen.
					// game on 2ms refresh rate (500fps).
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// checks once per game cycle (at 1000fps)
				checkForSongEnd();
				checkForMiss();
				
				if (Main.getState().equals("Stopped")) {
					currentThread().interrupt();
					unpaused = false;
					break;
				}
			}
		}
	}
	
	public void checkForSongEnd() {
		// System.out.println(Framerate.getCurrentTime() - millisStarted);
		// Uncomment for time since game start
		if (Framerate.getCurrentTime() - millisStarted > 
		currentLevel.getTotalTimeSeconds() * 1000) {
			// System.out.println("SONG ENDED");
			if (Main.getState().equals("Playing")) {
				endSong();
			}
		}
	}
	
	public void checkForMiss() {
		for (int i = 0 ; i < currentNotes.size() ; i ++) {
			Note note = currentNotes.get(i);
			if (getTimeSinceGameStart() > note.getCalculatedTimeFromStart() + Main.getConfig().getFORCED_millisecondLeniency() + 200 / currentLevel.getPPS()) {
				miss(note);
				break;
			}
		}
	}
	
	private Scores summarizeFinalScores(boolean completed) {
		int finalScore = score;
		int finalMaxCombo = maxCombo;
		int finalNotesHit = notesHit;
		int finalNotesMissed = notesMissed;
		boolean finalCompleted = completed;
		boolean finalFlawlessed = (finalNotesMissed == 0);
		return new Scores(finalCompleted, finalFlawlessed, finalScore, finalMaxCombo, finalNotesHit, finalNotesMissed);
	}
	
	public void endSong() {
		Scores score = summarizeFinalScores(true);
		RandomAccess.levelComplete(score);
		Database.updateOldHighscore(currentLevel, Main.getPlayerData(), score);
		Main.addPopup(1);
		Main.getPlayerData().updateStatsFromScores(currentLevel, score);
		if (player != null) {
			player.stop();
		}
		Main.setState("Stopped");
	}
	
	private void die() {
		//TODO;
	}
	
	public boolean checkIfGotNewHighscore() {
		if (score > Main.getPlayerData().getLevelStats(currentLevel).getHighscore()) {
			return true;
		} else{
			return false;
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
		Menu menuToReturn = DefaultValues.defaultGameMenu();
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
		// System.out.println(perfect);
		int timingScore = 200 - (int) Math.abs((double) noteInfo[1]);
		// 200 points minus each ms delay
		int comboMulti = Math.min(((combo / 5) + 1) , 5);
		incrementScore(timingScore * comboMulti);
		incrementCombo(true);
		if (!noFail) {
			incrementHealth(1);
		}
		// System.out.println(note);
	}
	
	public void miss() {
		// System.out.println("Miss!");
		incrementNotesMissed();
		incrementCombo(false);
		if (!noFail) {
			incrementHealth(-10);
		}
	}
	
	public void miss(String key) {
		System.out.println("Missed with keypress " + key);
		incrementNotesMissed();
		incrementCombo(false);
		if (!noFail) {
			incrementHealth(-10);
		}
	}
	
	public void miss(Note note) {
		currentNotes.remove(note);
		// System.out.println("Miss!");
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
		maxCombo = Math.max(maxCombo, combo);
		// anti if statement coding 😎
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
	
	public String getCurrentLevelName() {
		return currentLevel.getName();
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
