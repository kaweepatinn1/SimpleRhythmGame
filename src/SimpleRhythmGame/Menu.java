package SimpleRhythmGame;

import java.awt.Color;

// each menu instance is a list of elements item that makes up that menu.
// essentially, each menu is a list of elements.

public class Menu {
	private String menuName;
	private String previousMenuName;
	private int bgColor;
	private Element[] elements;
	private int[] secondarySelections;
	
	Menu(String menuName, String previousMenuName, int bgColor, int[] secondarySelections, Element[] elements){
		this.menuName = menuName;
		this.previousMenuName = previousMenuName;
		this.bgColor = bgColor;
		this.elements = elements;
		this.secondarySelections = secondarySelections;
	}
	
	public String getMenuName() {
		return menuName;
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
	
	public void setElements(Element[] elements) {
		this.elements = elements;
	}
	
	public int[] getSecondarySelections() {
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
	
	public int[] resetSelectors(int[] currentlySelected) {
		for (int i = 0; i < elements.length ; i++) {
			Element element = elements[i];
			int[] elementSelectorIndex = element.getSelectorIndex();
			
			boolean setSecondaryHovered = false; // see if the requirements for secondary hovering are met
			for (int secondarySelectionIndex : secondarySelections) {
				if (secondarySelectionIndex == elementSelectorIndex[0] && currentlySelected[0] > elementSelectorIndex[0]) {
					// the element's index must be on the secondary whitelist and less than currently selected
					setSecondaryHovered = true;
				}
			}
			
			if (elementSelectorIndex[0] == currentlySelected[0] && elementSelectorIndex[1] == currentlySelected[1]) {
				element.setPrimaryHovered();
			} else if (setSecondaryHovered) {
				element.setSecondaryHovered();
			} else {
				element.setNotHovered();
			}
		}
		return currentlySelected;
	}
}
