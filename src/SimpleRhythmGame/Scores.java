package SimpleRhythmGame;

public class Scores {
	private boolean completed;
	private boolean flawlessed;
	private int score;
	private int maxCombo;
	private int notesHit;
	private int notesMissed;
	private float accuracy;
	
	public Scores(boolean completed, boolean flawlessed, int score, int maxCombo, int notesHit, int notesMissed, float accuracy) {
		this.completed = completed;
		this.flawlessed = flawlessed;
		this.score = score;
		this.maxCombo = maxCombo;
		this.notesHit = notesHit;
		this.notesMissed = notesMissed;
		this.accuracy = accuracy;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getMaxCombo() {
		return maxCombo;
	}

	public void setMaxCombo(int maxCombo) {
		this.maxCombo = maxCombo;
	}

	public int getNotesHit() {
		return notesHit;
	}

	public void setNotesHit(int notesHit) {
		this.notesHit = notesHit;
	}

	public int getNotesMissed() {
		return notesMissed;
	}

	public void setNotesMissed(int notesMissed) {
		this.notesMissed = notesMissed;
	}

	public float getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(float accuracy) {
		this.accuracy = accuracy;
	}

	public boolean getCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public boolean getFlawlessed() {
		return flawlessed;
	}

	public void setFlawlessed(boolean flawlessed) {
		this.flawlessed = flawlessed;
	}
}
