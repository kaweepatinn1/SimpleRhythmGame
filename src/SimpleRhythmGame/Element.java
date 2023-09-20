package SimpleRhythmGame;

// Initialize and then read only class.

public class Element {
	private Renderable renderable;
	private TextBox textbox;
	private boolean isRenderable;
	private boolean isTextbox;
	private boolean isRenderableAndTextbox;
	
	public Element(TextBox textbox) {
		this.renderable = null;
		this.textbox = textbox;
		this.isRenderable = false;
		this.isTextbox = true;
		this.isRenderableAndTextbox;
	}
	
	public Element(Renderable renderable) {
		this.renderable = renderable;
		this.textbox = null;
		this.isRenderable = true;
		this.isTextbox = false;
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
	
	public boolean isRenderableAndTextbox() {
		return isRenderableAndTextbox;
	}
	
	public boolean isTextBoxRenderable() {
		return textbox.isRenderable();
	}
	
	public Renderable getRenderable() {
		return renderable;
	}
	
	public TextBox getTextbox() {
		return textbox;
	}
}
