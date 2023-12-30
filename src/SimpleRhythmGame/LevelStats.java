package SimpleRhythmGame;

import java.util.UUID;

public class LevelStats {
	private String levelName;
	private String levelAuthor;
	private UUID levelUUID;
	private int levelVersion;
	private int highscore;
	private int longestCombo;
	private boolean completed;
	private boolean flawless;
	
	public LevelStats(String levelName, String levelAuthor, UUID levelUUID, int levelVersion) {
		this.levelName = levelName;
		this.levelAuthor = levelAuthor;
		this.levelUUID = levelUUID;
		this.levelVersion = levelVersion;
		highscore = 0;
		longestCombo = 0;
		completed = false;
		flawless = false;
	}
	
	public LevelStats(String levelName, String levelAuthor, 
			UUID levelUUID, int levelVersion, int highscore,
			int longestCombo, boolean completed, boolean flawless) {
		this.levelName = levelName;
		this.levelAuthor = levelAuthor;
		this.levelUUID = levelUUID;
		this.levelVersion = levelVersion;
		this.highscore = highscore;
		this.longestCombo = longestCombo;
		this.completed = completed;
		this.flawless = flawless;
	}
	
	public Level locateLevel() {
		//TODO
		return null;
	}
}
