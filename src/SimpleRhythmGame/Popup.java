package SimpleRhythmGame;

public class Popup {
	private String popupName;
	private String popupTitle;
	private Element[] elements;
	
	public Popup(String popupName, String popupTitle, Element[] elements) {
		this.popupName = popupName;
		this.popupTitle = popupTitle;
		this.elements = elements;
	}

	public String getPopupName() {
		return popupName;
	}

	public void setPopupName(String popupName) {
		this.popupName = popupName;
	}

	public String getPopupTitle() {
		return popupTitle;
	}

	public void setPopupTitle(String popupTitle) {
		this.popupTitle = popupTitle;
	}

	public Element[] getElements() {
		return elements;
	}

	public void setElements(Element[] elements) {
		this.elements = elements;
	}
	
	
	
}
