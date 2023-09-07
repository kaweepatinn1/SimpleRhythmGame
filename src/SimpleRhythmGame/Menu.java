package SimpleRhythmGame;

// each menu instance is a list of elements item that makes up that menu.
// essentially, each menu is a list of elements.

public class Menu {
	private Element[] elements;
	
	Menu(Element[] elements){
		this.elements = elements;
	}
	
	public Element[] getElements() {
		return elements;
	}
	
	public void setElements(Element[] elements) {
		this.elements = elements;
	}
}
