package SimpleRhythmGame;

import java.util.UUID;

public class Note {
	private int type;
	private int subtype; // for when one note has multiple options (tom)
	private int bar; // which full musical bar to place the note in
	private int beat; // which beat to place the note in (in terms of quavers)
	private int[] subBeat; 
	// value 0 is the numerator, and value 1 is the denominator.
	// says where to place each note if it does not fall on a full beat. 
	// 1/2, 1/3, and 2/3 should be most common
	private float speed; // multi for level pps.
	private double noteOffset; // extra offset for this note (ms)
	
	private transient double timeFromStart; // not initialized until after the program runs
	
	public transient static final int[] typeLocations = {330,450,570,690,810};
	
	public transient static final int Note_HIHAT = 0;
	public transient static final int Note_SNAREDRUM = 1;
	public transient static final int Note_CRASHCYMBAL = 2;
	public transient static final int Note_TOM = 3;
	public transient static final int Note_KICKDRUM = 4;
	
	public transient static final int HiHat_OPEN = 1;
	public transient static final int HiHat_CLOSED = 0;
	
	public transient static final int Tom_LOW = 0;
	public transient static final int Tom_MEDIUM = 1;
	public transient static final int Tom_HIGH = 2;
	
	public Note(int type, int subtype, int bar, int beat, 
			int[] subBeat, float speed, double noteOffset) {
		this.type = type;
		this.subtype = subtype;
		this.bar = bar;
		this.beat = beat;
		this.subBeat = subBeat;
		this.speed = speed;
		this.noteOffset = noteOffset;
	}
	
	public int getComparableTime() { // returns a time that prioritizes bar > beat > subbeat
		return (bar * 1000000) + (beat * 1000) + (subBeat[1] == 0 ? 0 : subBeat[0] / subBeat[1]);
	}
	
	public double getCalculatedTimeFromStart() {
		return timeFromStart;
	}
	
	public void calculateTimeFromStart(Level level) {
		double beatTime = 60d / (double) level.getBPM();
		double subBeatRatio = getSubBeat()[1] == 0 ? 0 : ((double) getSubBeat()[0] / (double) getSubBeat()[1]);
		double barTime = (double) level.getTimeSignature()[0] * beatTime;
		
		double noteIntendedSecondsFromStart = (barTime * (bar - 1)) + (beatTime * (beat - 1)) + (subBeatRatio * beatTime)
				+ getNoteOffset() / 1000 + level.getSongOffset() / 1000;
		// System.out.println(noteIntendedSecondsFromStart);
		double noteIntendedMillisFromStart = noteIntendedSecondsFromStart * 1000;
		timeFromStart = noteIntendedMillisFromStart;
	}

	public double getNoteOffset() {
		return noteOffset;
	}

	public void setNoteOffset(double noteOffset) {
		this.noteOffset = noteOffset;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	public int getSubtype() {
		return subtype;
	}

	public void setSubtype(int subtype) {
		this.subtype = subtype;
	}

	public int getBar() {
		return bar;
	}

	public void setBar(int bar) {
		this.bar = bar;
	}

	public int getBeat() {
		return beat;
	}

	public void setBeat(int beat) {
		this.beat = beat;
	}

	public int[] getSubBeat() {
		return subBeat;
	}

	public void setSubBeat(int[] subBeat) {
		this.subBeat = subBeat;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}
	
	public int getSoundIndex() {
		return Sound.getSoundIndex(type, subtype);
	}
	
	/**
	* Returns the amount of milliseconds the user has missed the note by.
	* Positive means too early and negative means too late.
	*
	* @param  level  The current level.
	* @return      the time offset as a double.
	*/
}
