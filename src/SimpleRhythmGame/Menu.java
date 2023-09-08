package SimpleRhythmGame;

import java.awt.Color;

// each menu instance is a list of elements item that makes up that menu.
// essentially, each menu is a list of elements.

public class Menu {
	private Color bgColor;
	private Element[] elements;
	
	Menu(Color bgColor, Element[] elements){
		this.bgColor = bgColor;
		this.elements = elements;
	}
	
	public Color getBGColor() {
		return bgColor;
	}
	
	public void setBGColor(Color bgColor) {
		this.bgColor = bgColor;
	}
	
	public Element[] getElements() {
		return elements;
	}
	
	public void setElements(Element[] elements) {
		this.elements = elements;
	}
}
