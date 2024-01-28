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
	private ArrayList<Element> gameGraphics;
	
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
	private boolean died;
	private boolean noFail;
	private boolean unpaused;
	
	private boolean isTutorial;
	
	private static transient BufferedImage noteImages[];
	
	public static final int hitLocation = 360;
	
	public boolean removingNote = false;
	public ArrayList<Note> noteRemovalQueue;
	
	public boolean songEnded = false;
	
	private static final int hit = 0;
	private static final int hitPerfect = 1;
	private static final int miss = 2;
	private static final int die = 3;
	
	public Game(Level level, boolean noFail) {
		currentLevel = level;
		gameGraphics = new ArrayList<>();
		rawNotes = currentLevel.getSortedNotes();
		currentNotes = new ArrayList<>();
		futureNotes = new ArrayList<>(Arrays.asList(rawNotes));
		hitNotes = new ArrayList<>();
		currentNotesLimits = new int[] {0,0};
		rawGameMenu = generateGameMenu();
		millisPassed = 0;
		score = 0;
		combo = 0;
		notesHit = 0;
		notesMissed = 0;
		updateAccuracy();
		health = 75;
		died = false;
		this.noFail = noFail;
		noteRemovalQueue = new ArrayList<>();
		
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
//		millisStarted = Framerate.getCurrentTime() + 2500 - (debugStartTime * 1000);
		millisStarted = Framerate.getCurrentTime() + 2500;
		player.playAtNoVolume();
		refreshCurrentNotes();
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (!isTutorial) {
			player.play();
			//player.setFramePosition(debugStartTime * 44100);
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
				if (toUpdateList.get(0).equals(note)) {
					currentNotesLimits[0]++;
				}
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
			futureNotes = toUpdateList;
		}
	}
	
	public boolean removeLeakedNotes() {
		for (Note note : hitNotes) {
			if (rawNotes[currentNotesLimits[0]].equals(note)) {
				if (rawNotes.length > currentNotesLimits[0] + 1) {
					currentNotesLimits[0]++;
				}
				return true;
			}
		}
		return false;
	}

	public void refreshCurrentNotes() {
		double currentTime = unpaused ? Framerate.getCurrentTime() - millisStarted : millisPassed;
		boolean updateFuture = false;
		
		while(removeLeakedNotes()) {}
		
		for (Note note : getFutureNotes()) {
			int noteLocationX = hitLocation + 
					(int) (currentLevel.getPPS() * note.getSpeed() * 
							(note.getCalculatedTimeFromStart() - currentTime));
			
			if (noteLocationX < 2100 + (5000 * currentLevel.getPPS() * note.getSpeed())) {
				currentNotesLimits[1]++;
				updateFuture = true;
			} else {
				break;
			}
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
		try {
			Thread.sleep((int) Main.getConfig().getTransitionTime() * 2);
		} catch (InterruptedException e) {
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
					// game functions run on 2ms refresh rate (500fps).
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// checks once per game cycle (at 1000fps)
				if (!Main.getState().equals("Stopped") && !songEnded) {
					checkForSongEnd();
					checkForMiss();
					checkRedundantGameElements();
				}
				
				if (Main.getState().equals("Stopped") && songEnded) {
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
		int notesLength = currentNotes.size();
		Note note;
		for (int i = 0 ; i < notesLength ; i++) {
			if (!(currentNotes.size() > i)) {
				break;
			}
			note = currentNotes.get(i);
			if (note != null) {
				if (getTimeSinceGameStart() > note.getCalculatedTimeFromStart() + Main.getConfig().getFORCED_millisecondLeniency() + 200 / currentLevel.getPPS()) {
//					System.out.println("miss" + note.getCalculatedTimeFromStart() + "type" + note.getType());
					miss(note);
					break;
				}
			}
		}
	}
	
	private Scores summarizeFinalScores(boolean completed) {
		int finalScore = score;
		int finalMaxCombo = maxCombo;
		int finalNotesHit = notesHit;
		int finalNotesMissed = notesMissed;
		boolean finalCompleted = completed;
		boolean finalFlawlessed = (finalNotesMissed == 0) && completed;
//		System.out.println(score);
//		System.out.println(Main.getPlayerData().getLevelStats(currentLevel).getHighscore());
		if (score > Main.getPlayerData().getLevelStats(currentLevel).getHighscore()) {
			RandomAccess.newHighscore = true;
		} else {
			RandomAccess.newHighscore = false;
		}
		float accuracy = completed ?
				notesHit == 0 ? 0 : ((float) notesHit / (float) (notesHit + notesMissed)) * 100f
				: (notesHit == 0 ? 0 : ((float) notesHit / (float) currentLevel.getTotalNotes()) * 100f);
		return new Scores(finalCompleted, finalFlawlessed, finalScore, finalMaxCombo, finalNotesHit, finalNotesMissed, accuracy);
	}
	
	public void interruptSong(boolean died) {
		Scores score = summarizeFinalScores(false);
		if (died) {
			RandomAccess.levelComplete(score);
			Main.addPopup(2);
		}
		Main.getPlayerData().updateStatsFromScores(currentLevel, score, (int) Math.max((unpaused ? Framerate.getCurrentTime() - millisStarted : millisPassed),0)/1000);
		if (player != null) {
			player.stop();
		}
		Main.setState("Stopped");
		songEnded = true;
	}
	
	public void endSong() {
		Scores score = summarizeFinalScores(!died);
		RandomAccess.levelComplete(score);
		Database.updateOldHighscore(currentLevel, Main.getPlayerData(), score);
		Main.addPopup(1);
		Main.getPlayerData().updateStatsFromScores(currentLevel, score, currentLevel.getTotalTimeSeconds());
		if (player != null) {
			player.stop();
		}
		Main.setState("Stopped");
		songEnded = true;
	}
	
	private void die() {
		score = score / 2;
		addGameGraphic(Game.die);
		health = -99999999;
		died = true;
		if (!noFail) {
			interruptSong(true);
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
//		System.out.println("Late by: " + noteInfo[1]);
		incrementNotesHit();
		// x2 for 5, x3 for 10, x4 for 15 and x5 for 20	
		boolean perfect = Math.abs((double) noteInfo[1]) < 25;
		// System.out.println(perfect);
		int timingScore = 200 - (int) Math.abs((double) noteInfo[1]);
		// 200 points minus each ms delay
		int comboMulti = Math.min(((combo / 5) + 1) , 5);
		incrementScore(timingScore + (100 * (perfect ? 1 : 0)) * comboMulti);
		incrementCombo(true);
		incrementHealth(1);
		// System.out.println(note);
		if (perfect) {
			addGameGraphic(Game.hitPerfect);
		} else {
			addGameGraphic(Game.hit);
		}
		
	}
	
	public void miss() {
		// System.out.println("Miss!");
		incrementNotesMissed();
		incrementCombo(false);
		incrementHealth(-5);
		addGameGraphic(Game.miss);
	}
	
	public void miss(String key) {
		// System.out.println("Missed with keypress " + key);
		incrementNotesMissed();
		incrementCombo(false);
		incrementHealth(-2); // pressed key when not supposed to, lose 2
		addGameGraphic(Game.miss);
	}
	
	public void miss(Note note) {
		hitNotes.add(note);
		currentNotes.remove(note);
//		System.out.println("note" + currentNotes.get(0).getCalculatedTimeFromStart());
		// System.out.println("Miss!");
		incrementNotesMissed();
		incrementCombo(false);
		incrementHealth(-5); // missed a note, lose 5
		addGameGraphic(Game.miss);
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
		if (died) {
			this.score = this.score + (score / 2);
		} else {
			this.score = this.score + score;
		}
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
		if (!died) {
			this.health = Math.min(this.health + addHealth, 100);
			if (health < 0) {
				die();
			}
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

//	public boolean getNoFail() {
//		return noFail;
//	}
	
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
	
	public Element[] getGameGraphics() {
		if (gameGraphics.size() > 0) {
			return gameGraphics.toArray(new Element[gameGraphics.size()]);
		} else {
			return new Element[] {};
		}
	}
	
	private void checkRedundantGameElements() {
		boolean stopRemoving = false;
		while (!stopRemoving) {
			if (gameGraphics.size() == 0) {
				break;
			}
			if (gameGraphics.get(0).getTransform()[2].getCurrentTime() >= 1) {
				gameGraphics.remove(0);
//				System.out.println("removed");
			} else {
				stopRemoving = true;
			}
		}
	}
	
	private void addGameGraphic(int type) {
		boolean renderHit = false;
		boolean renderPerfect = false;
		boolean renderMiss = true;
		boolean renderDeath = true;
		boolean renderCombo = true;
		
		if (type == Game.hit && renderHit) {
			Element element = new Element(
					new Selector(
							new int[]{-1,-1}, // Selector Index
							new int[][]{{0,0},{0,0},{0,0},{0,0}} // E, S, W, N to select next
							),
						-1, // mask index
						false, // hover overlap
						-1, // hover effect
						-1, // click effect
						21 + (int) Math.round(Math.random() * 3), // arbritraty animation (to be used for scroll)
						DefaultValues.TransformIndex_500msScale0, // entry animation
					new TextBox(
						//Text
						1f, // scale
						"noFunction", // function
						"Nice", // name
						new Text(
								"Nice!", // text
								"center", "center", // align
								0, 0, // text offset (x, y)
								70, // text size
								6, // text color (index of colors)
								"Archivo Narrow", // font
								false // bold
								),
						new RoundedArea(
							(int) Math.round(Math.random() * 800) + 500,
							(int) Math.round(Math.random() * 400) + 400
							, 0, 0, 0  // x, y, xSize, ySize, round%
							),
						DefaultValues.Color_TRANSPARENT, // box color (index of colors)
						255, // opacity (0-255)
						8, // shadowOffset
						5, 6 // strokeWidth, strokeColor
						));
//			System.out.println(Main.getScale());
			element = element.getScaledInstance(Main.getScale(), Main.getScale());
			element.animateScroll(1);
			gameGraphics.add(element);
		} else if (type == Game.hitPerfect && renderPerfect) {
			Element element = new Element(
					new Selector(
							new int[]{-1,-1}, // Selector Index
							new int[][]{{0,0},{0,0},{0,0},{0,0}} // E, S, W, N to select next
							),
						-1, // mask index
						false, // hover overlap
						-1, // hover effect
						-1, // click effect
						21 + (int) Math.round(Math.random() * 3), // arbritraty animation (to be used for scroll)
						DefaultValues.TransformIndex_500msScale0, // entry animation
					new TextBox(
						//Text
						1f, // scale
						"noFunction", // function
						"Perfect", // name
						new Text(
								"PERFECT!", // text
								"center", "center", // align
								0, 0, // text offset (x, y)
								70, // text size
								6, // text color (index of colors)
								"Archivo Narrow", // font
								true // bold
								),
						new RoundedArea(
							(int) Math.round(Math.random() * 800) + 500,
							(int) Math.round(Math.random() * 400) + 400
							, 0, 0, 0  // x, y, xSize, ySize, round%
							),
						DefaultValues.Color_TRANSPARENT, // box color (index of colors)
						255, // opacity (0-255)
						8, // shadowOffset
						5, 6 // strokeWidth, strokeColor
						));
			element = element.getScaledInstance(Main.getScale(), Main.getScale());
			element.animateScroll(1);
			gameGraphics.add(element);
		} else if (type == Game.miss && renderMiss) {
			Element element = new Element(
					new Selector(
							new int[]{-1,-1}, // Selector Index
							new int[][]{{0,0},{0,0},{0,0},{0,0}} // E, S, W, N to select next
							),
						-1, // mask index
						false, // hover overlap
						-1, // hover effect
						-1, // click effect
						21 + (int) Math.round(Math.random() * 3), // arbritraty animation (to be used for scroll)
						DefaultValues.TransformIndex_500msScale0, // entry animation
					new TextBox(
						//Text
						1f, // scale
						"noFunction", // function
						"Miss", // name
						new Text(
								"Miss", // text
								"center", "center", // align
								0, 0, // text offset (x, y)
								50, // text size
								6, // text color (index of colors)
								"Archivo Narrow", // font
								true // bold
								),
						new RoundedArea(
							(int) Math.round(Math.random() * 800) + 500,
							(int) Math.round(Math.random() * 400) + 400
							, 0, 0, 0  // x, y, xSize, ySize, round%
							),
						DefaultValues.Color_TRANSPARENT, // box color (index of colors)
						255, // opacity (0-255)
						8, // shadowOffset
						5, 6 // strokeWidth, strokeColor
						));
//			System.out.println(Main.getScale());
			element = element.getScaledInstance(Main.getScale(), Main.getScale());
			element.animateScroll(1);
			gameGraphics.add(element);
		} else if (type == Game.die && renderDeath) {
			Element element = new Element(
					new Selector(
							new int[]{-1,-1}, // Selector Index
							new int[][]{{0,0},{0,0},{0,0},{0,0}} // E, S, W, N to select next
							),
						-1, // mask index
						false, // hover overlap
						-1, // hover effect
						-1, // click effect
						25, // arbritraty animation (to be used for scroll)
						DefaultValues.TransformIndex_500msScale0, // entry animation
					new TextBox(
						//Text
						1f, // scale
						"noFunction", // function
						"Red", // name
						new RoundedArea(
							960, 540,
							1920, 1080, 0  // x, y, xSize, ySize, round%
							),
						DefaultValues.Color_ACCENT, // box color (index of colors)
						100, // opacity (0-255)
						8, // shadowOffset
						5, 6 // strokeWidth, strokeColor
						));
//			System.out.println(Main.getScale());
			element = element.getScaledInstance(Main.getScale(), Main.getScale());
			element.animateScroll(1);
			gameGraphics.add(element);
		}
		
		if ((type == Game.hitPerfect || type == Game.hit) && renderCombo) {
			int random = (int) Math.round(Math.random() * 3);
			int randX = (int) Math.round(Math.random() * 200);
			int randY = (int) Math.round(Math.random() * 100);
			Element element = new Element(
					new Selector(
							new int[]{-1,-1}, // Selector Index
							new int[][]{{0,0},{0,0},{0,0},{0,0}} // E, S, W, N to select next
							),
						-1, // mask index
						false, // hover overlap
						-1, // hover effect
						-1, // click effect
						21 + random, // arbritraty animation (to be used for scroll)
						DefaultValues.TransformIndex_500msScale0, // entry animation
					new TextBox(
						//Text
						1f, // scale
						"noFunction", // function
						"Perfect", // name
						new Text(
								Integer.toString(combo), // text
								"center", "center", // align
								0, 0, // text offset (x, y)
								80, // text size
								6, // text color (index of colors)
								"Archivo Narrow", // font
								true // bold
								),
						new RoundedArea(
								randX + 600,
								randY + 500
							, 0, 0, 0  // x, y, xSize, ySize, round%
							),
						DefaultValues.Color_TRANSPARENT, // box color (index of colors)
						255, // opacity (0-255)
						8, // shadowOffset
						5, 6 // strokeWidth, strokeColor
						));
			element = element.getScaledInstance(Main.getScale(), Main.getScale());
			element.animateScroll(1);
			gameGraphics.add(element);
			Element element2 = new Element(
					new Selector(
							new int[]{-1,-1}, // Selector Index
							new int[][]{{0,0},{0,0},{0,0},{0,0}} // E, S, W, N to select next
							),
						-1, // mask index
						false, // hover overlap
						-1, // hover effect
						-1, // click effect
						21 + random, // arbritraty animation (to be used for scroll)
						DefaultValues.TransformIndex_500msScale0, // entry animation
					new TextBox(
						//Text
						1f, // scale
						"noFunction", // function
						"Perfect", // name
						new Text(
								"combo", // text
								"center", "center", // align
								0, 0, // text offset (x, y)
								30, // text size
								6, // text color (index of colors)
								"Archivo Narrow", // font
								true // bold
								),
						new RoundedArea(
								randX + 600,
								randY + 550
							, 0, 0, 0  // x, y, xSize, ySize, round%
							),
						DefaultValues.Color_TRANSPARENT, // box color (index of colors)
						255, // opacity (0-255)
						8, // shadowOffset
						5, 6 // strokeWidth, strokeColor
						));
			element2 = element2.getScaledInstance(Main.getScale(), Main.getScale());
			element2.animateScroll(1);
			gameGraphics.add(element2);
		} 
	}
}
