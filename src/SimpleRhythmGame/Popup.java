package SimpleRhythmGame;

public class Popup {
	private String type; // standard (like a menu) / text input
	/* Accepted Types:
	 * Standard
	 * TextField16
	*/
	private String inputItem; // The variable that is being written to / edited in a text input field
	private String popupName;
	private String popupTitle;
	private Element[] elements;
	
	public Popup(String type, String popupName, String popupTitle, Element[] elements) {
		this.type= type;
		inputItem = null;
		this.popupName = popupName;
		this.popupTitle = popupTitle;
		this.elements = elements;
	}
	
	public Popup(String type, String inputItem, String popupName, String popupTitle, Element[] elements) {
		this.type= type;
		this.inputItem = inputItem;
		this.popupName = popupName;
		this.popupTitle = popupTitle;
		this.elements = elements;
	}
	
	public String getType() {
		return type;
	}

	public String getInputItem() {
		return inputItem;
	}

	public void setInputItem(String inputItem) {
		this.inputItem = inputItem;
		if (inputItem == null) {
			type = "Standard";
		} else {
			type = "TextField16";
		}
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
