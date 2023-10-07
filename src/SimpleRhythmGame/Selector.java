package SimpleRhythmGame;

public class Selector {
	private int[] selectorIndex; // current index
	private int[][] selectorOptions; // E, S, W, N
	private boolean primaryHovered;
	private boolean secondaryHovered;
	private boolean selected;
	
	public Selector(int[] selectorIndex, int[][] selectorOptions) {
		this.selectorIndex = selectorIndex;
		this.selectorOptions = selectorOptions;
		this.primaryHovered = false;
		this.secondaryHovered = false;
		this.selected = false;
	}
	
	public Selector() {
		selectorIndex = new int[] {-1,-1};
		selectorOptions = new int[][] {{-1,-1},{-1,-1},{-1,-1},{-1,-1}};
		this.primaryHovered = false;
		this.secondaryHovered = false;
		this.selected = false;
	}
	
	public int[] getSelectorIndex() {
		return selectorIndex;
	}
	
//	public void incrementSelectorIndex() {
//		selectorIndex[1] = selectorIndex[1] + 1;
//		selectorOptions[1][1] = selectorOptions[1][1] + 1;
//		selectorOptions[3][1] = selectorOptions[3][1] + 1;
//		// increments main, and north and south positions.
//	}
	
	public int[][] getSelectorOptions(){
		return selectorOptions;
	}
	
	public boolean isPrimaryHovered() {
		return primaryHovered;
	}
	
	public boolean isSecondaryHovered() {
		return secondaryHovered;
	}
	
	public boolean isSelected() {
		return selected;
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
	
	public void setSelected() {
		selected = true;
		primaryHovered = false;
		secondaryHovered = false;
	}
	
	public void setUnselected() {
		selected = false;
	}
	
}