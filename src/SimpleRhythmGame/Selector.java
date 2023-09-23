package SimpleRhythmGame;

public class Selector {
	private int[] selectorIndex; // current index
	private int[][] selectorOptions; // E, S, W, N
	private boolean primaryHovered;
	private boolean secondaryHovered;
	
	public Selector(int[] selectorIndex, int[][] selectorOptions) {
		this.selectorIndex = selectorIndex;
		this.selectorOptions = selectorOptions;
		this.primaryHovered = false;
		this.secondaryHovered = false;
	}
	
	public int[] getSelectorIndex() {
		return selectorIndex;
	}
	
	public int[][] getSelectorOptions(){
		return selectorOptions;
	}
	
	public boolean isPrimaryHovered() {
		return primaryHovered;
	}
	
	public boolean isSecondaryHovered() {
		return secondaryHovered;
	}
	
	public void setPrimaryHovered() {
		primaryHovered = true;
		secondaryHovered = false;
	}
	
	public void setSecondaryHovered() {
		primaryHovered = false;
		secondaryHovered = true;
	}
	
	public void setNotHovered() {
		primaryHovered = false;
		secondaryHovered = false;
	}
	
}