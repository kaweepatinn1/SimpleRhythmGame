package SimpleRhythmGame;

public class TextBox {
	// private Tween tween;
	private float scale;
	private String function;
	private String name;
	private Text text;
    private RoundedArea rectShape;
    private int maskIndex;
    private Renderable renderableObject;
    private int color;
    private int opacity;
    private int shadowOffset;
    private float strokeWidth;
    private int strokeColor;
    
    public TextBox( // Renderable, Text
    		float scale, String function, String name,
    		Text text, 
    		Renderable renderableObject,
    		RoundedArea rectShape, 
    		int maskIndex, 
    		int color, int opacity, int shadowOffset, 
    		float strokeWidth, int strokeColor
    		) {
    	this.scale = scale;
    	this.function = function;
        this.name = name;
        this.text = text;
        this.rectShape = rectShape;
        this.maskIndex = maskIndex;
        this.renderableObject = renderableObject;
        this.color = color;
        this.opacity = opacity;
        this.shadowOffset = shadowOffset;
        this.strokeWidth = strokeWidth;
        this.strokeColor = strokeColor;
    }
    
    public TextBox( // Just Text
    		float scale, String function, String name,
    		Text text, 
    		RoundedArea rectShape, 
    		int maskIndex, 
    		int color, int opacity, int shadowOffset, 
    		float strokeWidth, int strokeColor) {
    	this.scale = scale;
    	this.function = function;
        this.name = name;
        this.text = text;
        this.rectShape = rectShape;
        this.maskIndex = maskIndex;
        this.renderableObject = null;
        this.color = color;
        this.opacity = opacity;
        this.shadowOffset = shadowOffset;
        this.strokeWidth = strokeWidth;
        this.strokeColor = strokeColor;
    }

    public TextBox( // Just Renderable
    		float scale, String function, String name, 
    		Renderable renderableObject, 
    		RoundedArea rectShape, 
    		int maskIndex, 
    		int color, int opacity, int shadowOffset, 
    		float strokeWidth, int strokeColor) {
    	this.scale = scale;
    	this.function = function;
    	this.name = name;
    	this.text = null;
        this.rectShape = rectShape;
        this.maskIndex = maskIndex;
        this.renderableObject = renderableObject;
        this.color = color;
        this.opacity = opacity;
        this.shadowOffset = shadowOffset;
        this.strokeWidth = strokeWidth;
        this.strokeColor = strokeColor;
    }
    
    public int getMaskIndex() {
    	return maskIndex;
    }
    
    public void setMaskIndex(int maskIndex) {
    	this.maskIndex = maskIndex;
    }
    
    public float getScale() {
    	return scale;
    }
    
    public String getFunction() {
    	return function;
    }
    
    public String getName(){
    	return name;
    }
    
    public String getText() {
        return text.getText();
    }
    
    public String getAlignX() {
        return text.getAlignX();
    }

    public String getAlignY() {
        return text.getAlignY();
    }
    
    public String getFont() {
    	return text.getFont();
    }
    
    public int getTextColor() {
    	return text.getTextColor();
    }

    public int getTextSize() {
        return text.getTextSize();
    }

    public int getX() {
        return rectShape.getX();
    }

    public int getY() {
        return rectShape.getY();
    }

    public int getXSize() {
        return rectShape.getXSize();
    }

    public int getYSize() {
        return rectShape.getYSize();
    }

    public int getOffsetX() {
        return text.getOffsetX();
    }
    
    public int getOffsetY() {
        return text.getOffsetY();
        }

    public int getColor() {
        return color;
    }
    
    public int getOpacity() {
        return opacity;
    }

    public Renderable getRenderableObject() {
        return renderableObject;
    }
    
    public boolean getBold() {
        return text.isBold();
    }
    
    public int getShadowOffset() {
    	return shadowOffset;
    }
    
    public float getStrokeWidth() {
    	return strokeWidth;
    }
    
    public int getStrokeColor() {
    	return strokeColor;
    }
    
    public int getRoundPercentage() {
    	return rectShape.getRoundPercentage();
    }
    
    public void setScale(float scale) {
    	this.scale = scale;
    }
    
    public void setFunction(String function) {
    	this.function = function;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setText(String text) {
        this.text.setText(text);
    }
    
    public void setAlignX(String alignX) {
    	this.text.setAlignX(alignX);
    }
    
    public void setAlignY(String alignY) {
    	this.text.setAlignY(alignY);
    }
    
    public void setFont(String font) {
    	this.text.setFont(font);
    }
    
    public void setTextColor(int fontColor) {
    	this.text.setTextColor(fontColor);
    }

    public void setTextSize(int textSize) {
        this.text.setTextSize(textSize);
    }

    public void setX(int x) {
        this.rectShape.setX(x);
    }

    public void setY(int y) {
    	this.rectShape.setX(y);
    }

    public void setXSize(int xSize) {
    	this.rectShape.setXSize(xSize);
    }

    public void setYSize(int ySize) {
    	this.rectShape.setXSize(ySize);
    }

    public void setOffsetX(int offsetX) {
        this.text.setOffsetX(offsetX);
    }

    public void setOffsetY(int offsetY) {
    	this.text.setOffsetY(offsetY);
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
        this.text.setBold(bold);
    }
    
    public void setRoundPercentage(int roundPercentage) {
        this.rectShape.setRoundPercentage(roundPercentage);
    }
    
    public void setShadowOffset(int shadowOffset) {
    	this.shadowOffset = shadowOffset;
    }
    
    public void setStrokeWidth(float strokeWidth) {
    	this.strokeWidth = strokeWidth;
    }
    
    public void setStrokeColor(int strokeColor) {
    	this.strokeColor = strokeColor;
    }

	public RoundedArea getRectShape() {
		return rectShape;
	}

	public void setRectShape(RoundedArea rectShape) {
		this.rectShape = rectShape;
	}

	public void setText(Text text) {
		this.text = text;
	}
}