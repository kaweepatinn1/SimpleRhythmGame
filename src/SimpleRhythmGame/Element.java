package SimpleRhythmGame;

// Initialize and then read only class.

public class Element {
	private transient TweenTransform[] transforms;
	private Selector selector;
	private Renderable renderable;
	private TextBox textbox;
	private boolean hoverOverlap; // whether to overlap other elements when hovered.
	private int maskIndex; // mask to use for this element
	private int hoverEffectIndex; // animation to play when hovered
	private int clickEffectIndex; // animation to play when clicked
	private int arbitraryTransformIndex; // for scroll boxes, ect.
	private int entryAnimationTransformIndex; // for entering a new menu, or leaving.
	
	public Element(Selector selector, int maskIndex, boolean hoverOverlap, int hoverEffect, int clickEffect, 
			int arbitraryTransform, int entryAnimationTransformIndex , TextBox textbox
			) {
		transforms = new TweenTransform[4];
		for (int i = 0 ; i < 4 ; i++) {
			transforms[i] = new TweenTransform(textbox);
		}
		this.selector = selector;
		this.renderable = null;
		this.textbox = textbox;
		this.maskIndex = maskIndex;
		this.hoverOverlap = hoverOverlap;
		this.hoverEffectIndex = hoverEffect;
		this.clickEffectIndex = clickEffect;
		this.arbitraryTransformIndex = arbitraryTransform;
		this.entryAnimationTransformIndex = entryAnimationTransformIndex;
	}
	
	public Element(Selector selector, int maskIndex, boolean hoverOverlap, int hoverEffect, int clickEffect, 
			int arbitraryTransform, int entryAnimationTransformIndex , Renderable renderable) {
		transforms = new TweenTransform[4];
		for (int i = 0 ; i < 4 ; i++) {
			transforms[i] = new TweenTransform(renderable);
		}
		this.selector = selector;
		this.renderable = renderable;
		this.textbox = null;
		this.maskIndex = maskIndex;
		this.hoverOverlap = hoverOverlap;
		this.hoverEffectIndex = hoverEffect;
		this.clickEffectIndex = clickEffect;
		this.arbitraryTransformIndex = arbitraryTransform;
		this.entryAnimationTransformIndex = entryAnimationTransformIndex;
	}
	
	public Element(TweenTransform[] transforms, Selector selector, int maskIndex,
			boolean hoverOverlap, int hoverEffect, int clickEffect, 
			int arbitraryTransform, int entryAnimationTransformIndex ,TextBox textbox
			) {
		this.transforms = transforms;
		this.selector = selector;
		this.renderable = null;
		this.textbox = textbox;
		this.maskIndex = maskIndex;
		this.hoverOverlap = hoverOverlap;
		this.hoverEffectIndex = hoverEffect;
		this.clickEffectIndex = clickEffect;
		this.arbitraryTransformIndex = arbitraryTransform;
		this.entryAnimationTransformIndex = entryAnimationTransformIndex;
	}
	
	public Element(TweenTransform[] transforms, Selector selector, int maskIndex,
			boolean hoverOverlap, int hoverEffect, int clickEffect, 
			int arbitraryTransform, int entryAnimationTransformIndex ,Renderable renderable) {
		this.transforms = transforms;
		this.selector = selector;
		this.renderable = renderable;
		this.textbox = null;
		this.maskIndex = maskIndex;
		this.hoverOverlap = hoverOverlap;
		this.hoverEffectIndex = hoverEffect;
		this.clickEffectIndex = clickEffect;
		this.arbitraryTransformIndex = arbitraryTransform;
		this.entryAnimationTransformIndex = entryAnimationTransformIndex;
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
		if (getTextbox() != null) {
			textbox.setStrokeColor(3);
		}
	}
	
	public void setSecondaryHovered() {
		selector.setSecondaryHovered();
		if (getTextbox() != null) {
			textbox.setStrokeColor(4);
		}
	}
	
	public void setNotHovered() {
		selector.setNotHovered();
		if (getTextbox() != null) {
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
	
	public void animateHover() {
		if (getHoverEffectIndex() != -1) {
			StoredTransform hoverEffect = ShowImage.getTransformsToRender()[getHoverEffectIndex()];
			TweenTransform tweenTransform = new TweenTransform(
					new SpecialTransform(getTransform()[0].getCurrentPosition(), getTextbox().getRectShape()),
					new SpecialTransform(hoverEffect, getTextbox().getRectShape()),
					(long) (Math.min((getTransform()[0].getCurrentTime() + 0.5),1) * hoverEffect.getTimeToTransformMillis()),
					hoverEffect.getDelayMillis(),
					hoverEffect.getEaseType()
					);
			setTransform(tweenTransform, 0);
		}
	}
	
	public void deanimateHover(boolean instant) {
		if (getHoverEffectIndex() != -1) {
			StoredTransform hoverEffect = ShowImage.getTransformsToRender()[getHoverEffectIndex()];
			TweenTransform tweenTransform = new TweenTransform(
					new SpecialTransform(getTransform()[0].getCurrentPosition(), getTextbox().getRectShape()),
					new SpecialTransform(getTextbox().getRectShape()),
					instant ? 0 : (long) (Math.min((getTransform()[0].getCurrentTime() + 0.5),1) * hoverEffect.getTimeToTransformMillis()),
					instant ? 0 : hoverEffect.getDelayMillis(),
					hoverEffect.getEaseType()
					);
			setTransform(tweenTransform, 0);
		}
	}
	
	public void animateClick(boolean boomerang) {
		if (getClickEffectIndex() != -1) {
			StoredTransform clickEffect = ShowImage.getTransformsToRender()[getClickEffectIndex()];
			TweenTransform tweenTransform = new TweenTransform(
					new SpecialTransform(getTransform()[1].getCurrentPosition(), getTextbox().getRectShape()),
					new SpecialTransform(clickEffect, getTextbox().getRectShape()),
					(long) (Math.min((getTransform()[1].getCurrentTime() + 0.5),1) * clickEffect.getTimeToTransformMillis()),
					clickEffect.getDelayMillis(),
					clickEffect.getEaseType(),
					boomerang
					);
			setTransform(tweenTransform, 1);
		}
	}
	
	public void deanimateClick(boolean instant) {
		if (getClickEffectIndex() != -1) {
			StoredTransform clickEffect = ShowImage.getTransformsToRender()[getClickEffectIndex()];
			TweenTransform tweenTransform = new TweenTransform(
					new SpecialTransform(getTransform()[1].getCurrentPosition(), getTextbox().getRectShape()),
					new SpecialTransform(getTextbox().getRectShape()),
					instant ? 0 : (long) (Math.min((getTransform()[1].getCurrentTime() + 0.5),1) * clickEffect.getTimeToTransformMillis()),
					instant ? 0 : clickEffect.getDelayMillis(),
					clickEffect.getEaseType()
					);
			setTransform(tweenTransform, 1);
		}
	}
	
	public void animateExit(boolean instant) {
		if (getEntryAnimationIndex() != -1) {
			StoredTransform entryEffect = ShowImage.getTransformsToRender()[getEntryAnimationIndex()];
			TweenTransform tweenTransform = new TweenTransform(
					new SpecialTransform(getTransform()[3].getCurrentPosition(), getTextbox().getRectShape()),
					new SpecialTransform(entryEffect, getTextbox().getRectShape()),
					(long) (Math.min((getTransform()[3].getCurrentTime() + 0.5),1) * entryEffect.getTimeToTransformMillis()),
					instant ? 0 : entryEffect.getDelayMillis(),
					instant ? 0 : entryEffect.getEaseType()
					);
			setTransform(tweenTransform, 3);
		}
	}
	
	public void animateEntry() {
		if (getEntryAnimationIndex() != -1) {
			StoredTransform entryEffect = ShowImage.getTransformsToRender()[getEntryAnimationIndex()];
			TweenTransform tweenTransform = new TweenTransform(
					new SpecialTransform(getTransform()[3].getCurrentPosition(), getTextbox().getRectShape()),
					new SpecialTransform(getTextbox().getRectShape()),
					(long) (Math.min((getTransform()[3].getCurrentTime() + 0.5),1) * entryEffect.getTimeToTransformMillis()),
					entryEffect.getDelayMillis(),
					entryEffect.getEaseType()
					);
			setTransform(tweenTransform, 3);
		}
	}
	
	public boolean isRenderable() {
		return (getRenderable() != null);
	}
	
	public boolean isTextbox() {
		return (getTextbox() != null);
	}
	
	public Renderable getRenderable() {
		return renderable;
	}
	
	public TextBox getTextbox() {
		return textbox;
	}

	public int getHoverEffectIndex() {
		return hoverEffectIndex;
	}

	public int getClickEffectIndex() {
		return clickEffectIndex;
	}

	public int getArbitraryTransformIndex() {
		return arbitraryTransformIndex;
	}
	
	public int getEntryAnimationIndex() {
		return entryAnimationTransformIndex;
	}
	
	public void setEntryAnimationTransformIndex(int entryAnimationTransformIndex) {
		this.entryAnimationTransformIndex = entryAnimationTransformIndex;
	}

	public void setArbitraryTransformIndex(int arbitraryTransform) {
		this.arbitraryTransformIndex = arbitraryTransform;
	}

	public TweenTransform[] getTransform() {
		return transforms;
	}

	public void setTransform(TweenTransform transform, int index) {
		this.transforms[index] = transform;
	}

	public int getMaskIndex() {
		return maskIndex;
	}

	public void setMaskIndex(int maskIndex) {
		this.maskIndex = maskIndex;
	}
	
	public boolean getHoverOverlap() {
		return hoverOverlap;
	}
	
	public void setHoverOverlap() {
		this.hoverOverlap = hoverOverlap;
	}
	
	public Element scale(double xScale, double yScale) {
		Element currentElement = this;
		Element toReturn = null;
		
		Selector selector = currentElement.getSelector();
    	TweenTransform[] transformIndexes = currentElement.getTransform();
    	
    	int maskIndex = currentElement.getMaskIndex();
    	
    	boolean hoverOverlap = currentElement.getHoverOverlap();
    	
    	int hoverEffectIndex = currentElement.getHoverEffectIndex();
    	int clickEffectIndex = currentElement.getClickEffectIndex();
    	int arbitraryTransformIndex = currentElement.getArbitraryTransformIndex();
    	int entryAnimationTransformIndex = currentElement.getEntryAnimationIndex();
    	
    	if (currentElement.isTextbox()) { // textbox
    		
        	TextBox currentItem = currentElement.getTextbox();
        	
        	float textBoxScale = currentItem.getScale();
        	String function = currentItem.getFunction();
        	String name = currentItem.getName();
        	
        	int xSize = (int) Math.round(currentItem.getXSize() * xScale * textBoxScale);
        	int ySize = (int) Math.round(currentItem.getYSize() * yScale * textBoxScale);
        	int x = (int) Math.round(currentItem.getX() * xScale - (xSize / 2));
        	int y = (int) Math.round(currentItem.getY() * yScale - (ySize / 2));
        	int color = currentItem.getColor();
        	int opacity = currentItem.getOpacity();
        	int roundPercentage = currentItem.getRoundPercentage();
        	int shadowOffset = (int) Math.round(currentItem.getShadowOffset() * Math.min(xScale, yScale) * textBoxScale);
        	float stroke = (int) Math.round(currentItem.getStrokeWidth() * Math.min(xScale, yScale) * textBoxScale);
        	int strokeColor = currentItem.getStrokeColor();
        	
        	Renderable renderableObject = currentItem.getRenderableObject();
        	
        	if (currentItem.getText() == null) { // No textbox
        		if (currentItem.getRenderableObject() != null) { // No textbox and no renderable
	        		String renderableName = renderableObject.getName();
	        		String renderableFunction = renderableObject.getFunction();
	            	String imagePath = renderableObject.getImagePath();
	            	int renderableXSize = (int) Math.round(renderableObject.getXSize() * xScale * textBoxScale);
	            	int renderableYSize = (int) Math.round(renderableObject.getYSize() * yScale * textBoxScale);
	            	int renderableX = (int) Math.round(renderableObject.getX() * xScale * textBoxScale);
	            	int renderableY = (int) Math.round(renderableObject.getY() * yScale * textBoxScale);
	            	int renderableOpacity = renderableObject.getOpacity();
	            	Renderable newRenderableObject =  new Renderable(renderableFunction, renderableName, imagePath, 
	            			renderableX, renderableY, renderableXSize, renderableYSize, renderableOpacity);
	            	
	            	toReturn =  
	        				new Element( // Third Constructor (Only Renderable)
        						transformIndexes, selector,
		        				maskIndex, hoverOverlap,
		        				hoverEffectIndex, clickEffectIndex, arbitraryTransformIndex,
		        				entryAnimationTransformIndex,
        						new TextBox(
    								textBoxScale, function, name,
    								newRenderableObject,
    								new RoundedArea(x, y, xSize, ySize, roundPercentage), 
			        				color, opacity, shadowOffset, 
			        				stroke, strokeColor
			        				)
        						);
        		} else { // No textbox and no renderable
        			toReturn =  
	        				new Element( // Fourth Constructor (No Renderable or Textbox)
        						transformIndexes, selector,
		        				maskIndex, hoverOverlap,
		        				hoverEffectIndex, clickEffectIndex, arbitraryTransformIndex,
		        				entryAnimationTransformIndex,
        						new TextBox(
    								textBoxScale, function, name,
    								new RoundedArea(x, y, xSize, ySize, roundPercentage), 
			        				color, opacity, shadowOffset, 
			        				stroke, strokeColor
			        				)
        						);
        		}
        	} else { // Yes Textbox
        		
        		String text = currentItem.getText();
	        	String alignX = currentItem.getAlignX();
	        	String alignY = currentItem.getAlignY();
	        	String font = currentItem.getFont();
	        	int textSize = (int) Math.round(currentItem.getTextSize() * Math.min(xScale, yScale) * textBoxScale);
	        	int fontColor = currentItem.getTextColor();
	        	boolean bold = currentItem.getBold();
	        	int offsetX = (int) Math.round(currentItem.getOffsetX() * xScale * textBoxScale);
	        	int offsetY = (int) Math.round(currentItem.getOffsetY() * yScale * textBoxScale);
	        	
	        	if (renderableObject != null) {
	        		
	        		String renderableName = renderableObject.getName();
	        		String renderableFunction = renderableObject.getFunction();
	            	String imagePath = renderableObject.getImagePath();
	            	int renderableXSize = (int) Math.round(renderableObject.getXSize() * xScale * textBoxScale);
	            	int renderableYSize = (int) Math.round(renderableObject.getYSize() * yScale * textBoxScale);
	            	int renderableX = (int) Math.round(renderableObject.getX() * xScale * textBoxScale);
	            	int renderableY = (int) Math.round(renderableObject.getY() * yScale * textBoxScale);
	            	int renderableOpacity = renderableObject.getOpacity();
	            	Renderable newRenderableObject =  new Renderable(renderableFunction, renderableName, imagePath, 
	            			renderableX, renderableY, renderableXSize, renderableYSize, renderableOpacity);
	            	
	            	toReturn =  
	        				new Element(
        						transformIndexes, selector,
		        				maskIndex, hoverOverlap,
		        				hoverEffectIndex, clickEffectIndex, arbitraryTransformIndex,
		        				entryAnimationTransformIndex,
		        				new TextBox( // First Constructor (Text AND Renderable)
	        						textBoxScale, function, name, 
			        				new Text(text, alignX, alignY, offsetX, offsetY, textSize, fontColor, font, bold), 
			        				newRenderableObject,  
			        				new RoundedArea(x, y, xSize, ySize, roundPercentage), 
			        				color, opacity, shadowOffset, 
			        				stroke, strokeColor
			        				)
        						);
            	} else {
            		toReturn = 
		        				 new Element( // Second Constructor (Only Text)
	        						 transformIndexes, selector, 
			        				 maskIndex, hoverOverlap,
			        				 hoverEffectIndex, clickEffectIndex, arbitraryTransformIndex,
			        				 entryAnimationTransformIndex,
	        						 new TextBox(
	    								 textBoxScale, function, name,
	    								 new Text(text, alignX, alignY, offsetX, offsetY, textSize, fontColor, font, bold), 
				        				 new RoundedArea(x, y, xSize, ySize, roundPercentage), 
				        				 color, opacity, shadowOffset, 
				        				 stroke, strokeColor));
            	}
        	}
    	} else if (currentElement.isRenderable()) { // no textbox
    		
    		Renderable renderableObject = currentElement.getRenderable();
    		
    		String renderableName = renderableObject.getName();
    		String renderableFunction = renderableObject.getFunction();
        	String imagePath = renderableObject.getImagePath();
        	int renderableXSize = (int) Math.round(renderableObject.getXSize() * xScale);
        	int renderableYSize = (int) Math.round(renderableObject.getYSize() * yScale);
        	int renderableX = (int) Math.round(renderableObject.getX() * xScale);
        	int renderableY = (int) Math.round(renderableObject.getY() * yScale);
        	int renderableOpacity = renderableObject.getOpacity();
        	Renderable newRenderableObject =  new Renderable(renderableFunction, renderableName, imagePath, 
        			renderableX, renderableY, renderableXSize, renderableYSize, renderableOpacity);
        	
        	toReturn =  
    				new Element(
						transformIndexes, selector,
        				maskIndex, hoverOverlap,
        				hoverEffectIndex, clickEffectIndex, arbitraryTransformIndex,
        				entryAnimationTransformIndex,
        				newRenderableObject
						);
    	}
    	
    	return toReturn;
	}
}
