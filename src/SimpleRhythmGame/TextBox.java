package SimpleRhythmGame;

public class TextBox {
	private String name;
    private String text;
    private String alignX;
    private String alignY;
    private int textSize;
    private int fontColor;
    private int x;
    private int y;
    private int xSize;
    private int ySize;
    private int offsetX;
    private int offsetY;
    private boolean renderRenderable;
    private Renderable renderableObject;
    private int color;
    private int opacity;
    private boolean bold;
    private int roundPercentage;
    private boolean hovered;
    
    public TextBox(String name, String text, String alignX, String alignY, int fontColor, int textSize, int x, int y, int xSize, int ySize, int offsetX, int offsetY, int color, int opacity, boolean bold, int roundPercentage) {
        this.name = name;
    	this.text = text;
    	this.alignX = alignX;
    	this.alignY = alignY;
        this.fontColor = fontColor;
        this.textSize = textSize;
        this.x = x;
        this.y = y;
        this.xSize = xSize;
        this.ySize = ySize;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.renderRenderable = false;
        this.renderableObject = null;
        this.color = color;
        this.opacity = opacity;
        this.bold = bold;
        this.roundPercentage = roundPercentage;
        this.hovered = false;
    }

    public TextBox(String name, Renderable renderableObject, int x, int y, int xSize, int ySize, int offsetX, int offsetY, int color, int opacity, boolean bold, int roundPercentage) {
    	this.name = name;
    	this.text = null;
    	this.alignX = null;
    	this.alignY = null;
        this.fontColor = -1;
        this.textSize = 0;
        this.x = x;
        this.y = y;
        this.xSize = xSize;
        this.ySize = ySize;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.renderableObject = renderableObject;
        this.color = color;
        this.opacity = opacity;
        this.bold = bold;
        this.roundPercentage = roundPercentage;
        this.hovered = false;
    }
    
    public String getName(){
    	return name;
    }
    
    public String getText() {
        return text;
    }
    
    public String getAlignX() {
        return alignX;
    }

    public String getAlignY() {
        return alignY;
    }
    
    public int getFontColor() {
    	return fontColor;
    }

    public int getTextSize() {
        return textSize;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getXSize() {
        return xSize;
    }

    public int getYSize() {
        return ySize;
    }

    public int getOffsetX() {
        return offsetX;
    }
    
    public int getOffsetY() {
        return offsetY;
    }

    public int getColor() {
        return color;
    }
    
    public int getOpacity() {
        return opacity;
    }
    
    public boolean shouldRenderRenderable() {
        return renderRenderable;
    }

    public Renderable getRenderableObject() {
        return renderableObject;
    }
    
    public boolean getBold() {
        return bold;
    }
    
    public int getRoundPercentage() {
    	return roundPercentage;
    }
    
    public boolean getHover(){
    	return hovered;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    
    public void setAlignX(String alignX) {
    	this.alignX = alignX;
    }
    
    public void setAlignY(String alignY) {
    	this.alignY = alignY;
    }
    
    public void setFontColor(int fontColor) {
    	this.fontColor = fontColor;
    }

    public void setTextSize(int textSize) {
        this.textSize = textSize;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXSize(int xSize) {
        this.xSize = xSize;
    }

    public void setYSize(int ySize) {
        this.ySize = ySize;
    }

    public void setOffsetX(int offsetX) {
        this.offsetX = offsetX;
    }

    public void setOffsetY(int offsetY) {
        this.offsetY = offsetY;
    }

    public void shouldRenderRenderable(boolean renderRenderable) {
        this.renderRenderable = renderRenderable;
    }

    public void setRenderableObject(Renderable renderableObject) {
        this.renderableObject = renderableObject;
    }
    
    public void setColor(int color) {
        this.color = color;
    }

    public void setOpacity(int opacity) {
        this.opacity = opacity;
    }
    
    public void setBold(boolean bold) {
        this.bold = bold;
    }
    
    public void setRoundPercentage(int roundPercentage) {
        this.roundPercentage = roundPercentage;
    }
    
    public void setHover(boolean hovered){
    	this.hovered = hovered;
    }
}