package SimpleRhythmGame;

import java.util.Arrays;
import java.util.Comparator;

public class Level {
	private String name;
	private String author;
	
	private double songOffset; // ms offset for the entire song

	private int bpm;
	private float pps; // pixels per millisecond the notes should move at (relative to 1920)
	private int totalTimeSeconds;
	private int[] timeSignature;
	private Note notes[];
	
	public Level(String name, String author, double songOffset, int bpm, float pps, 
			int totalTimeSeconds, int[] timeSignature, Note[] notes) {
		super();
		this.name = name;
		this.author = author;
		this.songOffset = songOffset;
		this.bpm = bpm;
		this.pps = pps;
		this.totalTimeSeconds = totalTimeSeconds;
		this.timeSignature = timeSignature;
		this.notes = notes;
	}
	
	public Note[] getSortedNotes() {
		Note[] sortedNotes = new Note[notes.length];
		System.arraycopy(notes, 0, sortedNotes, 0, notes.length);
		Arrays.sort(sortedNotes, Comparator.comparing(Note::getComparableTime));
		return sortedNotes;
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

	public float getPPS() {
		return pps;
	}

	public void setPPS(float pps) {
		this.pps = pps;
	}

	public double getSongOffset() {
		return songOffset;
	}

	public void setSongOffset(double offset) {
		this.songOffset = offset;
	}
}
