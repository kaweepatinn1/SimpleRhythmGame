package SimpleRhythmGame;

public class OptionsList {
	private float scale;
	private String function; 
	// will also be based on selected item
	private Object[] rawObjects;
	private String listObjectsName; 
	// the variable that the list should be populated with
	// private String listObjectField;
	// if the list texts should show a field of the object,
	// use this to specify which field to show.
	// moved into text's getText() field.
	private int objectsCount;
	private int selector;
	private String name;
	
	private Text text;
	private RoundedArea rectShape;
	// the original rect shape; 
	private int color;
    private int opacity;
    private int shadowOffset;
    private float strokeWidth;
    private int strokeColor;
    
    public OptionsList(
    		float scale, String function, String listObjects, 
    		int selector, String name, 
    		Text text, RoundedArea rectShape,
			int color, int opacity, int shadowOffset, 
			float strokeWidth, int strokeColor) {
		this.scale = scale;
		this.function = function;
		this.listObjectsName = listObjects;
		this.selector = selector;
		this.setName(name);
		
		this.text = text;
		this.rectShape = rectShape;
		this.color = color;
		this.opacity = opacity;
		this.shadowOffset = shadowOffset;
		this.strokeWidth = strokeWidth;
		this.strokeColor = strokeColor;
//		setObjects(getObjects());
//		countObjects();
	}
    
    public OptionsList( // TODO call this constructor in scaledmenu
    		float scale, String function, String listObjects, 
    		int selector, Object[] objects, int objectsCount, String name, 
    		Text text, RoundedArea rectShape,
			int color, int opacity, int shadowOffset, 
			float strokeWidth, int strokeColor) {
		this.scale = scale;
		this.function = function;
		this.listObjectsName = listObjects;
		this.selector = selector;
		this.setName(name);
		this.rawObjects = objects;
		this.objectsCount = objectsCount;
		
		this.text = text;
		this.rectShape = rectShape;
		this.color = color;
		this.opacity = opacity;
		this.shadowOffset = shadowOffset;
		this.strokeWidth = strokeWidth;
		this.strokeColor = strokeColor;
	}
    
    public void countObjects() {
    	objectsCount = rawObjects.length;
    }
    
    public void setObjects(Object[] objects) {
    	rawObjects = objects;
    }
    
    public Object[] getObjects() {
    	return ShowImage.getConfig().getObjectList(listObjectsName);
    }
    
	public void incremenetSelector(boolean forwards) {
		selector = forwards ? 
			selector + (selector < objectsCount - 1 ? 1 : 0) :
			selector - (selector > 0 ? 1 : 0);
	}
    
	public float getScale() {
		return scale;
	}

	public void setScale(float scale) {
		this.scale = scale;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getListObjects() {
		return listObjectsName;
	}

	public void setListObjects(String listObjects) {
		this.listObjectsName = listObjects;
	}

	public int getSelector() {
		return selector;
	}

	public void setSelector(int selector) {
		this.selector = selector;
	}

	public Text getText() {
		return text;
	}

	public void setText(Text text) {
		this.text = text;
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

	public int getObjectsCount() {
		return objectsCount;
	}

	public void setObjectsCount(int objectsCount) {
		this.objectsCount = objectsCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
}
