package SimpleRhythmGame;

import java.awt.Color;

// each menu instance is a list of elements item that makes up that menu.
// essentially, each menu is a list of elements.

public class Menu {
	private String menuName;
	private int bgColor;
	private Element[] elements;
	
	Menu(String menuName, int bgColor, Element[] elements){
		this.menuName = menuName;
		this.bgColor = bgColor;
		this.elements = elements;
	}
	
	public String getMenuName() {
		return menuName;
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
}
