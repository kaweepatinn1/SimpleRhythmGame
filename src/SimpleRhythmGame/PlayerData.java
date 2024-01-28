package SimpleRhythmGame;

import java.util.Arrays;
import java.util.UUID;

public class PlayerData {
	private String username;
	private UUID uuid;
	
	private Statistics stats;
	private LevelStats[] levelStats;
	
	public PlayerData(String username){
		this.username = username;
		this.uuid = UUID.randomUUID();
		this.stats = new Statistics();
		this.levelStats = new LevelStats[]{};
	}
	
	public String getUsername() {
		return username;
	}
	
	public UUID getUUID() {
		return uuid;
	}
	
	public Statistics getStats() {
		return stats;
	}
	
	public LevelStats[] getLevelStats() {
		return levelStats;
	}
	
	public LevelStats getLevelStats(Level toFindLevel) {
//		System.out.println(toFindLevel.getUUID());
		for (LevelStats levelStats : getLevelStats()) {
			if (levelStats.getLevelUUID().equals(toFindLevel.getUUID())) {
				return levelStats;
			}
		}
		return null;
	}
	
	public LevelStats createLevelStats(Level level) {
		LevelStats newLevelStat = new LevelStats(level);
		LevelStats[] newLevelStats = Arrays.copyOf(levelStats, levelStats.length + 1);
		newLevelStats[levelStats.length] = newLevelStat;
		levelStats = newLevelStats;
		return newLevelStat;
	}
	
	public void setStats(Statistics stats) {
		this.stats = stats;
	}
	
	public void setLevelStats (LevelStats[] levelStats) {
		this.levelStats = levelStats;
	}
	
	public void updateStatsFromScores(Level level, Scores scores, int seconds) {
		boolean found = false;
		for (LevelStats levelStat : levelStats) {
			if (level.getUUID().equals(levelStat.getLevelUUID())) {
				levelStat.updateStats(scores);
				found = true;
				break;
			}
		}
		
		if (!found) {
			LevelStats newStat = createLevelStats(level);
			newStat.updateStats(scores);
		}
		
		stats.updateStats(scores, level, seconds);
		Main.getSessionStats().updateSessionStats(scores, level, seconds);
		FileIO.currentPlayerDataOut();
	}
}
