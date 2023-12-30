package SimpleRhythmGame;

public class Statistics {
	private int timePlayedSeconds;
	private int notesHit;
	private int notesMissed;
	private int totalAttempts;
	private int songsCompleted;
	private int songsFlawlessed;
	private int totalScore;
	
	public Statistics(){
		timePlayedSeconds = 0;
		notesHit = 0;
		notesMissed = 0;
		totalAttempts = 0;
		songsCompleted = 0;
		songsFlawlessed = 0;
		totalScore = 0;
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
	
	
}
