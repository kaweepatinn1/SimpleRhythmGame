package SimpleRhythmGame;

public class Note {
	private int type;
	private int bar; // which full musical bar to place the note in
	private int beat; // which beat to place the note in (in terms of quavers)
	private int[] subBeat; 
	// value 0 is the numerator, and value 1 is the denominator.
	// says where to place each note if it does not fall on a full beat. 
	// 1/2, 1/3, and 2/3 should be most common
	private float speed;
	
	public static final int Note_HIHAT = 0;
	public static final int Note_SNAREDRUM = 1;
	public static final int Note_CRASHCYMBAL = 2;
	public static final int Note_TOM = 3;
	public static final int Note_RIDECYMBAL = 4;
}
