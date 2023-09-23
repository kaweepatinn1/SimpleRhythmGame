package SimpleRhythmGame;

// Initialize and then read only class.

public class Element {
	private Selector selector;
	private Renderable renderable;
	private TextBox textbox;
	private boolean isRenderable;
	private boolean isTextbox;
	
	public Element(Selector selector, TextBox textbox) {
		this.selector = selector;
		this.renderable = null;
		this.textbox = textbox;
		this.isRenderable = false;
		this.isTextbox = true;
	}
	
	public Element(Selector selector, Renderable renderable) {
		this.selector = selector;
		this.renderable = renderable;
		this.textbox = null;
		this.isRenderable = true;
		this.isTextbox = false;
	}
	
	public Selector getSelector() {
		return selector;
	}
	
	public int[] getSelectorIndex() {
		return selector.getSelectorIndex();
	}
	
	public int[][] getSelectorOptions() {
		return selector.getSelectorOptions();
	}
	
	public boolean isPrimaryHovered() {
		return selector.isPrimaryHovered();
	}
	
	public boolean isSecondaryHovered() {
		return selector.isSecondaryHovered();
	}
	
	public void setPrimaryHovered() {
		selector.setPrimaryHovered();
		if (isTextbox) {
			textbox.setStrokeColor(3);
		}
	}
	
	public void setSecondaryHovered() {
		selector.setSecondaryHovered();
		if (isTextbox) {
			textbox.setStrokeColor(4);
		}
	}
	
	public void setNotHovered() {
		selector.setNotHovered();
		if (isTextbox) {
			textbox.setStrokeColor(6);
		}
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
