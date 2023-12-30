package SimpleRhythmGame;

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
	
	public void setStats(Statistics stats) {
		this.stats = stats;
	}
	
	public void setLevelStats (LevelStats[] levelStats) {
		this.levelStats = levelStats;
	}
}
