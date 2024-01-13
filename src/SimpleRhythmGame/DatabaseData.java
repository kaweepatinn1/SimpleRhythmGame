package SimpleRhythmGame;

public class DatabaseData {
	
	private int length;
	private String[] username;
	private int[] score;
	private float[] accuracy;
	private int[] maxCombo;
	private boolean denied;
	
	DatabaseData(int length){
		this.length = length;
		username = new String[length];
		score = new int[length];
		accuracy = new float[length];
		maxCombo = new int[length];
		denied = false;
	}
	
	DatabaseData(boolean any){
		denied = true;
	}
	
	public void setIndex(int index, String username, int score, float accuracy, int maxCombo) {
		this.username[index] = username;
		this.score[index] = score;
		this.accuracy[index] = accuracy;
		this.maxCombo[index] = maxCombo;
	}
	
	public boolean getDenied() {
		return denied;
	}
	
	public String[] getUsernames() {
		return username;
	}
	
	public int[] getScores() {
		return score;
	}
	
	public float[] getAccuracy() {
		return accuracy;
	}
	
	public int[] getMaxCombo() {
		return maxCombo;
	}
	
	public int getLength() {
		return length;
	}
	
	public String getUsername(int index) {
		return username[index];
	}
	
	public int getScore(int index) {
		return score[index];
	}
	
	public float getAccuracy(int index) {
		return accuracy[index];
	}
	
	public int getMaxCombo(int index) {
		return maxCombo[index];
	}
}
