package SimpleRhythmGame;

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
	public static float levelAccuracy;
	public static boolean levelComplete;
	public static boolean levelFlawless;
	
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
		levelAccuracy = 0;
		levelComplete = false;
		levelFlawless = false;
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
		levelFlawless = levelStats.isFlawless();
		levelComplete = levelStats.isCompleted();
		levelLevelAttempts = levelStats.getAttempts();
		levelMaxCombo = levelStats.getLongestCombo();
		levelHighscore = levelStats.getHighscore();
		levelAccuracy = levelStats.getAccuracy();
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
		levelAccuracy = 0;
		levelComplete = false;
		levelFlawless = false;
	}
}
