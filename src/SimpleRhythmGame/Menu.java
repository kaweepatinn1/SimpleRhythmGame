package SimpleRhythmGame;

import java.awt.Color;

// each menu instance is a list of elements item that makes up that menu.
// essentially, each menu is a list of elements.

public class Menu {
	private String menuName;
	private String menuDisplayName;
	private String previousMenuName;
	private int bgColor;
	private Element[] elements;
	private int[][] secondarySelections;
	private RoundedArea[] masks;
	private StoredTransform[] transforms;
	
	Menu(
		String menuName, String menuDisplayName, String previousMenuName, 
		int bgColor, int[][] secondarySelections, RoundedArea[] masks,
		StoredTransform[] transforms,
		Element[] elements
		) {
		this.menuName = menuName;
		this.menuDisplayName = menuDisplayName;
		this.previousMenuName = previousMenuName;
		this.bgColor = bgColor;
		this.elements = elements;
		this.secondarySelections = secondarySelections;
		this.masks = masks;
		this.transforms = transforms;
	}
	
	public String getMenuName() {
		return menuName;
	}
	
	public String getMenuDisplayName() {
		return menuDisplayName;
	}
	
	public String getPreviousMenuName() {
		return previousMenuName;
	}
	
	public Color getBGColor() {
		return DefaultValues.getDefaultColors()[bgColor];
	}
	
	public void setBGColor(int bgColor) {
		this.bgColor = bgColor;
	}
	
	public Element[] getElements() {
		return elements;
	}
	
	public RoundedArea[] getMasks() {
		return masks;
	}
	
	public void setElements(Element[] elements) {
		this.elements = elements;
	}
	
	public int[][] getSecondarySelections() {
		return secondarySelections;
	}
	
	public int getIndexForSelector(int[] toSelect) {
		int toReturn = -1;
		for (int i = 0; i < elements.length ; i++) {
			Element element = elements[i];
			int[] elementSelectorIndex = element.getSelectorIndex();
			toReturn =  elementSelectorIndex[0] == toSelect[0] && elementSelectorIndex[1] == toSelect[1] ? i : toReturn;
		}
		// System.out.println(toReturn);
		return toReturn;
	}
	
	public int[] resetSelectors(boolean resetToDefault) {
		if (resetToDefault) {
			int[] toReturn = null;
			boolean found = false;
			for (int i = 0; i < elements.length ; i++) {
				if (elements[i].getSelectorIndex()[0] + elements[i].getSelectorIndex()[1] > -1) {
					elements[i].setPrimaryHovered();
					toReturn = elements[i].getSelectorIndex();
					found = true;
					break;
				}
			} 
			if (!found) {
				toReturn = new int[]{-1,-1};
			}
			return toReturn;
		} else {
			for (int i = 0; i < elements.length ; i++) {
				Element element = elements[i];
				element.setNotHovered();
			}
			return new int[]{-1,-1};
		}
	}
	
	public int[] resetSelectors(int[] currentlySelected, int[] lastSelected) {
		boolean found = false;
		for (int i = 0; i < elements.length ; i++) {
			Element element = elements[i];
			int[] elementSelectorIndex = element.getSelectorIndex();
			
			boolean setSecondaryHovered = false; // see if the requirements for secondary hovering are met
			for (int[] secondarySelectionIndex : secondarySelections) {
				if (secondarySelectionIndex[0] == elementSelectorIndex[0] && secondarySelectionIndex[1] == elementSelectorIndex[1] && currentlySelected[0] > elementSelectorIndex[0]
						&& elementSelectorIndex[0] + elementSelectorIndex[1] > -1) {
					// the element's index must be on the secondary whitelist and less than currently selected
					setSecondaryHovered = true;
				}
			}
			
			if (elementSelectorIndex[0] == currentlySelected[0] && elementSelectorIndex[1] == currentlySelected[1]) {
				element.setPrimaryHovered();
				found = true;
				
			} else if (setSecondaryHovered) {
				element.setSecondaryHovered();
			} else {
				element.setNotHovered();
			}
		}
		if (found) {
			return currentlySelected;
		} else {
			return lastSelected;
		}
	}

	public StoredTransform[] getTransforms() {
		return transforms;
	}
}
