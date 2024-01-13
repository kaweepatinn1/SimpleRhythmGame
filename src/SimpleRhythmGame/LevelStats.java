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
	
	private int attempts;
	private int notesHit;
	private int notesMissed;
	private float bestAccuracy;
	
	public LevelStats(String levelName, String levelAuthor, UUID levelUUID, int levelVersion) {
		this.levelName = levelName;
		this.levelAuthor = levelAuthor;
		this.levelUUID = levelUUID;
		this.levelVersion = levelVersion;
		highscore = 0;
		longestCombo = 0;
		completed = false;
		flawless = false;
		attempts = 0;
		notesHit = 0;
		notesMissed = 0;
		bestAccuracy = 0;
	}
	
	public LevelStats(String levelName, String levelAuthor, 
			UUID levelUUID, int levelVersion, int highscore,
			int longestCombo, boolean completed, boolean flawless,
			int attempts, int notesHit, int notesMissed, float bestAccuracy) {
		this.levelName = levelName;
		this.levelAuthor = levelAuthor;
		this.levelUUID = levelUUID;
		this.levelVersion = levelVersion;
		this.highscore = highscore;
		this.longestCombo = longestCombo;
		this.completed = completed;
		this.flawless = flawless;
		this.attempts = attempts;
		this.notesHit = notesHit;
		this.notesMissed = notesMissed;
		bestAccuracy = bestAccuracy;
	}
	
	public LevelStats(Level level) {
		levelName = level.getName();
		this.levelAuthor = level.getAuthor();
		this.levelUUID = level.getUUID();
		this.levelVersion = level.getVersion();
		highscore = 0;
		longestCombo = 0;
		completed = false;
		flawless = false;
		attempts = 0;
		notesHit = 0;
		notesMissed = 0;
		bestAccuracy = 0;
	}
	
	public LevelStats() {
		levelName = "";
		this.levelAuthor = "";
		this.levelUUID = null;
		this.levelVersion = 0;
		highscore = 0;
		longestCombo = 0;
		completed = false;
		flawless = false;
		attempts = 0;
		notesHit = 0;
		notesMissed = 0;
		bestAccuracy = 0;
	}
	
	public static Level locateLevel(LevelStats toFindLevel) {
		for (Level level : Main.getConfig().getLevelsList()) {
			if (level.getUUID().equals(toFindLevel.getLevelUUID())) {
				return level;
			}
		}
		return null;
	}
	
	public static LevelStats locateLevel (Level toFindLevel) {
		for (LevelStats levelStats : Main.getPlayerData().getLevelStats()) {
			if (levelStats.getLevelUUID().equals(toFindLevel.getUUID())) {
				return levelStats;
			}
		}
		return null;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public String getLevelAuthor() {
		return levelAuthor;
	}

	public void setLevelAuthor(String levelAuthor) {
		this.levelAuthor = levelAuthor;
	}

	public UUID getLevelUUID() {
		return levelUUID;
	}

	public void setLevelUUID(UUID levelUUID) {
		this.levelUUID = levelUUID;
	}

	public int getLevelVersion() {
		return levelVersion;
	}

	public void setLevelVersion(int levelVersion) {
		this.levelVersion = levelVersion;
	}

	public int getHighscore() {
		return highscore;
	}

	public void setHighscore(int highscore) {
		this.highscore = highscore;
	}

	public int getLongestCombo() {
		return longestCombo;
	}

	public void setLongestCombo(int longestCombo) {
		this.longestCombo = longestCombo;
	}

	public boolean getCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public boolean getFlawless() {
		return flawless;
	}

	public void setFlawless(boolean flawless) {
		this.flawless = flawless;
	}

	public int getAttempts() {
		return attempts;
	}

	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}
	
	public void incrementAttempt() {
		attempts++;
	}

	public float getAccuracy() {
		return bestAccuracy;
	}
	
	public void updateStats(Scores scores) {
		completed = (scores.getCompleted() || completed);
		flawless = (scores.getFlawlessed() || flawless);
		highscore = Math.max(scores.getScore(), highscore);
		longestCombo = Math.max(scores.getMaxCombo(), longestCombo);
		attempts++;
		notesHit = notesHit + scores.getNotesHit();
		notesMissed = notesMissed + scores.getNotesMissed();
		System.out.println(scores.getNotesHit());
		Float accuracy = scores.getNotesHit() == 0 ? 0 : 100 * (float) scores.getNotesHit() / (float) (scores.getNotesHit() + scores.getNotesMissed());
		System.out.println(accuracy);
		bestAccuracy = Math.max(accuracy, bestAccuracy);
	}
}
