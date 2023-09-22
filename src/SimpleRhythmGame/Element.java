package SimpleRhythmGame;

// Initialize and then read only class.

public class Element {
	private Selector selector;
	private Renderable renderable;
	private TextBox textbox;
	private boolean isRenderable;
	private boolean isTextbox;
	
	public Element(int[] seletorIndex, TextBox textbox) {
		this.selectorIndex = selectorIndex;
		this.selectorOptions
		this.renderable = null;
		this.textbox = textbox;
		this.isRenderable = false;
		this.isTextbox = true;
	}
	
	public Element(int[] seletorIndex, Renderable renderable) {
		this.selectorIndex = selectorIndex;
		this.renderable = renderable;
		this.textbox = null;
		this.isRenderable = true;
		this.isTextbox = false;
	}
	
	public int[] getSelectorIndex() {
		return selectorIndex;
	}
	
	public void setSelectorIndex() {
		this.selectorIndex = selectorIndex;
	}
	
	public String getFunction() {
		String toReturn = null;
		if (isRenderable()) {
			toReturn = getRenderable().getFunction();
		} else if (isTextbox()) {
			toReturn = getTextbox().getFunction();
		} else {
			toReturn = "ERROR: READ CONSOLE";
			System.out.println("Error: Not renderable or Textbox!\n"
					+ "In class: Element, Method: getFunction()");
		}
		return toReturn;
	}
	
	public String getName() {
		String toReturn = "null";
		if (isRenderable()) {
			toReturn = getRenderable().getName();
		} else if (isTextbox()) {
			toReturn = getTextbox().getName();
		} else {
			toReturn = "ERROR: READ CONSOLE";
			System.out.println("Error: Not renderable or Textbox!\n"
					+ "In class: Element, Method: getName()");
		}
		return toReturn;
	}
	
	public boolean isRenderable() {
		return isRenderable;
	}
	
	public boolean isTextbox() {
		return isTextbox;
	}
	
	public Renderable getRenderable() {
		return renderable;
	}
	
	public TextBox getTextbox() {
		return textbox;
	}
}
