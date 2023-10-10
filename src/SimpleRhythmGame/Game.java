package SimpleRhythmGame;

public class Game {
	private Level currentLevel;
	private Note[] noteQueue; 
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
	private int health;
	// stored so doesn't have to be calculated every frame, and only every hit
}
