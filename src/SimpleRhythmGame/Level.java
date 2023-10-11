package SimpleRhythmGame;

public class Level {
	private String name;
	private String songPath;
	private String author;
	
	private int bpm;
	private float pps; // pixels per second the notes should move at (relative to 1920)
	private int totalTimeSeconds;
	private int[] timeSignature;
	private Note notes[];
	
	public Level(String name, String songPath, String author, int bpm, int pps, int totalTimeSeconds, int[] timeSignature, Note[] notes) {
		super();
		this.name = name;
		this.songPath = songPath;
		this.author = author;
		this.bpm = bpm;
		this.pps = pps;
		this.timeSignature = timeSignature;
		this.notes = notes;
	}
	
	public Note[] getSortedNotes() {
		//TODO
		return null;
	}
	
	public int getTotalNotes() {
		return notes.length;
	}
	
	public float getNotesPerSecond() {
		return Math.round((float) notes.length) * 100f / ((float) totalTimeSeconds) / 100f;
	}

	public String getName() {
		return name;
	}

	public String getSongPath() {
		return songPath;
	}

	public String getAuthor() {
		return author;
	}

	public int getBPM() {
		return bpm;
	}

	public int getTotalTimeSeconds() {
		return totalTimeSeconds;
	}

	public int[] getTimeSignature() {
		return timeSignature;
	}

	public Note[] getNotes() {
		return notes;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSongPath(String songPath) {
		this.songPath = songPath;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setBpm(int bpm) {
		this.bpm = bpm;
	}

	public void setTotalTimeSeconds(int totalTimeSeconds) {
		this.totalTimeSeconds = totalTimeSeconds;
	}

	public void setTimeSignature(int[] timeSignature) {
		this.timeSignature = timeSignature;
	}

	public void setNotes(Note[] notes) {
		this.notes = notes;
	}

	public float getPps() {
		return pps;
	}

	public void setPps(float pps) {
		this.pps = pps;
	}
}
