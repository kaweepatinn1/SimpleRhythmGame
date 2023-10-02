package SimpleRhythmGame;

public class Text {
	private String text;
	private String alignX;
    private String alignY;
    private int offsetX;
    private int offsetY;
    private int textSize;
    private int textColor;
    private String font;
    private boolean bold;
    
    public Text(String text, String alignX, String alignY, int offsetX, int offsetY, int textSize, int textColor,
			String font, boolean bold) {
		this.text = text;
		this.alignX = alignX;
		this.alignY = alignY;
		this.offsetX = offsetX;
		this.offsetY = offsetY;
		this.textSize = textSize;
		this.textColor = textColor;
		this.font = font;
		this.bold = bold;
	}
    
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getAlignX() {
		return alignX;
	}
	public void setAlignX(String alignX) {
		this.alignX = alignX;
	}
	public String getAlignY() {
		return alignY;
	}
	public void setAlignY(String alignY) {
		this.alignY = alignY;
	}
	public int getOffsetX() {
		return offsetX;
	}
	public void setOffsetX(int offsetX) {
		this.offsetX = offsetX;
	}
	public int getOffsetY() {
		return offsetY;
	}
	public void setOffsetY(int offsetY) {
		this.offsetY = offsetY;
	}
	public String getFont() {
		return font;
	}
	public void setFont(String font) {
		this.font = font;
	}
	public boolean getBold() {
		return bold;
	}
	public void setBold(boolean bold) {
		this.bold = bold;
	}
	public int getTextSize() {
		return textSize;
	}
	public void setTextSize(int textSize) {
		this.textSize = textSize;
	}
	public int getTextColor() {
		return textColor;
	}
	public void setTextColor(int fontColor) {
		this.textColor = fontColor;
	}
}
