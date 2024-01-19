package SimpleRhythmGame;

public class Statistics {
	private int timePlayedSeconds;
	private int notesHit;
	private int notesMissed;
	private int totalAttempts;
	private int songsCompleted;
	private int songsFlawlessed;
	private int totalScore;
	private int longestCombo;
	
	public Statistics(){
		timePlayedSeconds = 0;
		notesHit = 0;
		notesMissed = 0;
		totalAttempts = 0;
		songsCompleted = 0;
		songsFlawlessed = 0;
		totalScore = 0;
		longestCombo = 0;
	}
	
	public void resetStats() {
		timePlayedSeconds = 0;
		notesHit = 0;
		notesMissed = 0;
		totalAttempts = 0;
		songsCompleted = 0;
		songsFlawlessed = 0;
		totalScore = 0;
		longestCombo = 0;
	}
	
	public void incrementTimePlayed(int time) {
		timePlayedSeconds = timePlayedSeconds + time;
	}
	
	public void incrementNotesHit(int notes) {
		notesHit = notesHit + notes;
	}
	
	public void incrementNotesMissed(int notes) {
		notesMissed = notesMissed + notes;
	}
	
	public void incrementAttempts(int attempts) {
		totalAttempts = totalAttempts + attempts;
	}
	
	public void incrementSongsCompleted(int completed) {
		songsCompleted = songsCompleted + completed;
	}
	
	public void incrementSongsFlawlessed(int flawlessed) {
		songsFlawlessed = songsFlawlessed + flawlessed;
	}
	
	public void incrementTotalScore(int score) {
		totalScore = totalScore + score;
	}
	public void updateLongestCombo(int combo) {
		longestCombo = Math.max(longestCombo, combo);
	}
	
	public int getTimePlayedSeconds() {
		return timePlayedSeconds;
	}
	public int getNotesHit() {
		return notesHit;
	}
	public int getNotesMissed() {
		return notesMissed;
	}
	public int getTotalAttempts() {
		return totalAttempts;
	}
	public int getSongsCompleted() {
		return songsCompleted;
	}
	public int getSongsFlawlessed() {
		return songsFlawlessed;
	}
	public int getTotalScore() {
		return totalScore;
	}
	
	public int getLongestCombo() {
		return longestCombo;
	}
	
	public float getAccuracy() {
		Float accuracy = getNotesHit() == 0 ? 0 : 100 * (float) getNotesHit() / (float) (getNotesHit() + getNotesMissed());
		return accuracy;
	}
	
	// global stats only updates completed if it is a new copmletion
	public void updateStats(Scores scores, Level level) {
		updateCompleted();
		updateFlawless();
		timePlayedSeconds = timePlayedSeconds + level.getTotalTimeSeconds();
		notesHit = notesHit + scores.getNotesHit();
		notesMissed = notesMissed + scores.getNotesMissed();
		updateLongestCombo(scores.getMaxCombo());
		totalAttempts++;
		totalScore = totalScore + scores.getScore();
	}
	
	public void updateCompleted() {
		int count = 0;
		for (LevelStats levelStat : Main.getPlayerData().getLevelStats()) {
			if (levelStat.getCompleted()) {
				count++;
			}
		}
		songsCompleted = count;
	}
	
	public void updateFlawless() {
		int count = 0;
		for (LevelStats levelStat : Main.getPlayerData().getLevelStats()) {
			if (levelStat.getFlawless()) {
				count++;
			}
		}
		songsFlawlessed = count;
	}
	
	
	// session stats summarises total songs completed, ignoring duplicates
	public void updateSessionStats(Scores scores, Level level) {
		songsCompleted = scores.getCompleted() ? songsCompleted + 1 : songsCompleted;
		songsFlawlessed = scores.getFlawlessed() ? songsFlawlessed + 1 : songsFlawlessed;
		timePlayedSeconds = timePlayedSeconds + level.getTotalTimeSeconds();
		notesHit = notesHit + scores.getNotesHit();
		notesMissed = notesMissed + scores.getNotesMissed();
		totalAttempts++;
		totalScore = totalScore + scores.getScore();
		updateLongestCombo(scores.getMaxCombo());
	}
	
	
}
