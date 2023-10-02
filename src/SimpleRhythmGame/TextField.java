package SimpleRhythmGame;

public class TextField {
	private String currentDisplay; // what the screen can see in text
	private int maxSize; // max allowed size for the string
	private int selectorLocation; // One dimensional selector
	private double pointerTime;
	private int[] errorPopupIndexes; // popups to open on errors
	// 1. Duplicate Name!
	// 2. Name cannot be empty!
	
	// Other textbox attributes
	private float scale;
	private String name;
	private Text text; 
	// uses the text class for some of its attributes. actual "text" field becomes the variable to mutate.
	private RoundedArea rectShape;
	private int color;
    private int opacity;
    private int shadowOffset;
    private float strokeWidth;
    private int strokeColor;
    
    public TextField(
    		float scale, int maxSize, int[] errorPopupIndexes, String name, Text text, RoundedArea rectShape, int color, int opacity,
    		int shadowOffset, float strokeWidth, int strokeColor) {
    	this.currentDisplay = null;
    	this.maxSize = maxSize;
    	this.selectorLocation = 0;
    	this.errorPopupIndexes = errorPopupIndexes;
    	
    	this.scale = scale;
    	this.name = name;
    	this.text = text;
    	this.rectShape = rectShape;
    	this.color = color;
    	this.opacity = opacity;
    	this.shadowOffset = shadowOffset;
    	this.strokeWidth = strokeWidth;
    	this.strokeColor = strokeColor;
    }
    
    public TextField(
    		String currentDisplay,
    		float scale, int maxSize, int[] errorPopupIndexes, String name, Text text, RoundedArea rectShape, int color, int opacity,
    		int shadowOffset, float strokeWidth, int strokeColor) {
    	this.currentDisplay = currentDisplay;
    	this.maxSize = maxSize;
    	this.selectorLocation = 0;
    	this.errorPopupIndexes = errorPopupIndexes;
    	
    	this.scale = scale;
    	this.name = name;
    	this.text = text;
    	this.rectShape = rectShape;
    	this.color = color;
    	this.opacity = opacity;
    	this.shadowOffset = shadowOffset;
    	this.strokeWidth = strokeWidth;
    	this.strokeColor = strokeColor;
    }
    
    public void resetPointerTime() {
    	pointerTime = Framerate.getCurrentTime();
    }
    
    public double getPointerTime() {
    	return pointerTime;
    }
    
    public String getUnloadedCurrentDisplay() {
    	return (String) ShowImage.getConfig().getVariable(text.getText());
    }
    
    public void loadCurrentDisplay() {
    	currentDisplay = (String) ShowImage.getConfig().getVariable(text.getText());
    	//currentDisplay = text.getText();
    }
    
    public void confirmEntry() {
    	if (currentDisplay.equals("")) {
    		ShowImage.cancelElement(ShowImage.getSelectedElement());
    		ShowImage.addPopup(errorPopupIndexes[1]);
    	} else {
    		if (!getUnloadedCurrentDisplay().equals(currentDisplay)) { 
    			// if the old name is not the same as the new one
    			String status = ShowImage.getConfig().setVariable(text.getText(), currentDisplay);
        		if (status.equals("Success")) {
        			// Success!
        		} else if (status.equals("Duplicate")){
        			ShowImage.cancelElement(ShowImage.getSelectedElement());
        			ShowImage.addPopup(errorPopupIndexes[0]);
        		}
    		} else {
    			// there was no name change
    			System.out.println("No effect on name!");
    		}
    	}
    }
    
    public void cancelEntry() {    	
    	loadCurrentDisplay();
    	selectorLocation = 0;
    }
    
    public void delChar(boolean backspace) {
    	// System.out.println(selectorLocation);
    	if (selectorLocation != 0 && backspace) {
    		currentDisplay = currentDisplay.substring(0, selectorLocation - 1) + currentDisplay.substring(selectorLocation);
        	selectorLocation-- ;
    	}
    	else if (selectorLocation != currentDisplay.length() && !backspace) {
    		currentDisplay = currentDisplay.substring(0, selectorLocation) + currentDisplay.substring(selectorLocation + 1);
    	}
    	resetPointerTime();
    }
    
    public void inputChar(char c) {
    	if (currentDisplay.length() < maxSize) {
    		currentDisplay = currentDisplay.substring(0, selectorLocation) + c + currentDisplay.substring(selectorLocation);
        	selectorLocation++ ;
    	}
    	resetPointerTime();
    }
    
    public void incrementSelector(boolean forwards) {
    	selectorLocation = forwards ? 
    			selectorLocation + (selectorLocation == currentDisplay.length() ? 0 : 1) : 
    				selectorLocation - (selectorLocation == 0 ? 0 : 1);
    	resetPointerTime();
    }
    
    public void resetSelector(boolean beginning) {
    	selectorLocation = beginning ? 0 : currentDisplay.length();
    	resetPointerTime();
    }
    
	public String getInputItem() {
		return text.getText();
	}
	
	public void setInputItem(String inputItem) {
		text.setText(inputItem);
	}
	
	public int getMaxSize() {
		return maxSize;
	}
	
	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}
	
	public Text getTextObject() {
		return text;
	}
	
	public void setTextObject(Text text) {
		this.text = text;
	}
	
	public float getScale() {
		return scale;
	}
	
	public void setScale(float scale) {
		this.scale = scale;
	}
	
	public RoundedArea getRectShape() {
		return rectShape;
	}
	
	public void setRectShape(RoundedArea rectShape) {
		this.rectShape = rectShape;
	}
	
	public int getColor() {
		return color;
	}
	
	public void setColor(int color) {
		this.color = color;
	}
	
	public int getOpacity() {
		return opacity;
	}
	
	public void setOpacity(int opacity) {
		this.opacity = opacity;
	}
	
	public int getShadowOffset() {
		return shadowOffset;
	}
	
	public void setShadowOffset(int shadowOffset) {
		this.shadowOffset = shadowOffset;
	}
	
	public float getStrokeWidth() {
		return strokeWidth;
	}
	
	public void setStrokeWidth(float strokeWidth) {
		this.strokeWidth = strokeWidth;
	}
	
	public int getStrokeColor() {
		return strokeColor;
	}
	
	public void setStrokeColor(int strokeColor) {
		this.strokeColor = strokeColor;
	}

	public int getX() {
		return rectShape.getX();
	}
	
	public int getXSize() {
		return rectShape.getXSize();
	}
	
	public int getY() {
		return rectShape.getY();
	}
	
	public int getYSize() {
		return rectShape.getYSize();
	}
	
	public int getRoundPercentage() {
		return rectShape.getRoundPercentage();
	}
	
	public String getCurrentDisplay() {
		// loadCurrentDisplay();
		return currentDisplay;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSelectorLocation() {
		return selectorLocation;
	}
	
	public int[] getErrorPopupIndexes() {
		return errorPopupIndexes;
	}
	
	public void setErrorPopupIndexes(int[] errorPopupIndexes) {
		this.errorPopupIndexes = errorPopupIndexes;
	}
}
