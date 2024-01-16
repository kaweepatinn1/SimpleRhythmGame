package SimpleRhythmGame;

import java.util.UUID;

public class RandomAccess {
	// Store public use variables here to declutter main class
	public static String usernameToSet;
	
	public static String levelTitle;
	public static String levelAuthor;
	public static int levelLength;
	public static int levelNotes;
	public static float levelNPS;
	public static int levelBPM;
	public static int levelLevelAttempts;
	public static int levelMaxCombo;
	public static int levelHighscore;
	public static float levelBestAccuracy;
	public static boolean levelComplete;
	public static boolean levelFlawless;
	
	public static int levelComplete_Combo;
	public static int levelComplete_Score;
	public static float levelComplete_Accuracy;
	
	public static boolean viewSessionStats;
	
	public static Level leaderboardLevelSelected;
	public static DatabaseData leaderboardData;
	
	public static boolean newHighscore;
	
	public RandomAccess(){
		usernameToSet = "";
		
		levelTitle = "Select a level";
		levelAuthor = "Select a level";
		levelLength = 0;
		levelNotes = 0;
		levelNPS = 0;
		levelBPM = 0;
		levelLevelAttempts = 0;
		levelMaxCombo = 0;
		levelHighscore = 0;
		levelBestAccuracy = 0;
		levelComplete = false;
		levelFlawless = false;
		
		viewSessionStats = false;
		
		leaderboardLevelSelected = null;
		leaderboardData = null;
		
		newHighscore = false;
	}
	
	public static void setLevelStats(Level level) {
		PlayerData playerData = Main.getPlayerData();
		LevelStats levelStats = playerData.getLevelStats(level);
		if (levelStats == null) {
			levelStats = playerData.createLevelStats(level);
		} 
		
		levelTitle = level.getName();
		levelAuthor = level.getAuthor();
		levelLength = level.getTotalTimeSeconds();
		levelNotes = level.getTotalNotes();
		levelNPS = level.getNotesPerSecond();
		levelBPM = level.getBPM();
		levelFlawless = levelStats.getFlawless();
		levelComplete = levelStats.getCompleted();
		levelLevelAttempts = levelStats.getAttempts();
		levelMaxCombo = levelStats.getLongestCombo();
		levelHighscore = levelStats.getHighscore();
		levelBestAccuracy = levelStats.getAccuracy();
	}
	
	public static void resetLevelStats() {
		levelTitle = "Select a level";
		levelAuthor = "Select a level";
		levelLength = 0;
		levelNotes = 0;
		levelNPS = 0;
		levelBPM = 0;
		levelLevelAttempts = 0;
		levelMaxCombo = 0;
		levelHighscore = 0;
		levelBestAccuracy = 0;
		levelComplete = false;
		levelFlawless = false;
	}
	
	public static void levelComplete(Scores score) {
		levelComplete_Combo = score.getMaxCombo();
		levelComplete_Score = score.getScore();
		levelComplete_Accuracy = score.getAccuracy();
	}
	
	public static void switchStats() {
		viewSessionStats = !viewSessionStats;
	}
	
	public static void setSessionStats(boolean setting) {
		viewSessionStats = setting;
	}
	
	public static void setLeaderboardData(DatabaseData data) {
		leaderboardData = data;
	}
}
