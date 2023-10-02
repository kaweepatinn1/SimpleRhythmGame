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