package SimpleRhythmGame;

public class Game {
	private Level currentLevel;
	private Note[] noteQueue; 
	private Menu rawGameMenu;
	// the unrendered notes queue. First in first out.
	private Element[] currentNotes; 
	// notes that should be currently rendered. First in first out.
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
	
	public Game(Level level, boolean noFail) {
		currentLevel = level;
		noteQueue = currentLevel.getSortedNotes();
		currentNotes = null;
		loadCurrentNotes(); // refreshes noteQueue into currentNotes.
		rawGameMenu = generateGameMenu(); // uses currentNotes to initially generate the game menu
		millisPassed = -1;
		millisStarted = Framerate.getCurrentTime();
		score = 0;
		combo = 0;
		notesHit = 0;
		notesMissed = 0;
		updateAccuracy();
		health = 100;
		this.noFail = noFail;
	}

	public void hit() {
		
	}
	
	public void miss() {
		
	}

	public Element[] getCurrentNotes() {
		return currentNotes;
	}

	public void setCurrentNotes(Element[] currentNotes) {
		this.currentNotes = currentNotes;
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
		return noteQueue;
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
