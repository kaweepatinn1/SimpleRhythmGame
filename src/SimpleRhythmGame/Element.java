package SimpleRhythmGame;

// Initialize and then read only class.

public class Element {
	private Renderable renderable;
	private TextBox textbox;
	private boolean isRenderable;
	private boolean isTextBox;
	
	public Element(TextBox textbox) {
		this.renderable = null;
		this.textbox = textbox;
		this.isRenderable = false;
		this.isTextBox = true;
	}
	
	public Element(Renderable renderable) {
		this.renderable = renderable;
		this.textbox = null;
		this.isRenderable = true;
		this.isTextBox = false;
	}
	
	public boolean isRenderable() {
		return isRenderable;
	}
	
	public boolean isTextBox() {
		return isTextBox;
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
