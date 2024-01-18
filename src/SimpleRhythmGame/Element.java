package SimpleRhythmGame;

// Initialize and then read only class.

public class Element {
	private TweenTransform[] transforms;
	private Selector selector;
	private Renderable renderable;
	private TextBox textbox;
	private TextField textfield;
	private OptionsList optionsList;
	private boolean hoverOverlap; // whether to overlap other elements when hovered.
	private int maskIndex; // mask to use for this element
	private int hoverEffectIndex; // animation to play when hovered
	private int clickEffectIndex; // animation to play when clicked
	private int arbitraryTransformIndex; // for scroll boxes, ect.
	private int entryAnimationTransformIndex; // for entering a new menu, or leaving.
	
	public Element(Selector selector, int maskIndex, boolean hoverOverlap, int hoverEffect, int clickEffect, 
			int arbitraryTransform, int entryAnimationTransformIndex , TextField textfield
			) {
		transforms = new TweenTransform[4];
		for (int i = 0 ; i < 4 ; i++) {
			transforms[i] = new TweenTransform(textfield);
		}
		this.selector = selector;
		this.renderable = null;
		this.textbox = null;
		this.textfield = textfield;
		this.optionsList = null;
		this.maskIndex = maskIndex;
		this.hoverOverlap = hoverOverlap;
		this.hoverEffectIndex = hoverEffect;
		this.clickEffectIndex = clickEffect;
		this.arbitraryTransformIndex = arbitraryTransform;
		this.entryAnimationTransformIndex = entryAnimationTransformIndex;
	}
	
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
		this.textfield = null;
		this.optionsList = null;
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
		this.textfield = null;
		this.optionsList = null;
		this.maskIndex = maskIndex;
		this.hoverOverlap = hoverOverlap;
		this.hoverEffectIndex = hoverEffect;
		this.clickEffectIndex = clickEffect;
		this.arbitraryTransformIndex = arbitraryTransform;
		this.entryAnimationTransformIndex = entryAnimationTransformIndex;
	}
	
	public Element(Selector selector, int maskIndex, boolean hoverOverlap, int hoverEffect, int clickEffect, 
			int arbitraryTransform, int entryAnimationTransformIndex , OptionsList optionsList) {
		transforms = new TweenTransform[4];
		for (int i = 0 ; i < 4 ; i++) {
			transforms[i] = new TweenTransform(optionsList);
		}
		this.selector = selector;
		this.renderable = null;
		this.textbox = null;
		this.textfield = null;
		this.optionsList = optionsList;
		this.maskIndex = maskIndex;
		this.hoverOverlap = hoverOverlap;
		this.hoverEffectIndex = hoverEffect;
		this.clickEffectIndex = clickEffect;
		this.arbitraryTransformIndex = arbitraryTransform;
		this.entryAnimationTransformIndex = entryAnimationTransformIndex;
	}
	
	public Element(TweenTransform[] transforms, Selector selector, int maskIndex,
			boolean hoverOverlap, int hoverEffect, int clickEffect, 
			int arbitraryTransform, int entryAnimationTransformIndex ,TextField textfield
			) {
		this.transforms = transforms;
		this.selector = selector;
		this.renderable = null;
		this.textbox = null;
		this.textfield = textfield;
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
		this.textfield = null;
		this.maskIndex = maskIndex;
		this.hoverOverlap = hoverOverlap;
		this.hoverEffectIndex = hoverEffect;
		this.clickEffectIndex = clickEffect;
		this.arbitraryTransformIndex = arbitraryTransform;
		this.entryAnimationTransformIndex = entryAnimationTransformIndex;
	}
	
	public Element(TweenTransform[] transforms, Selector selector, int maskIndex,
			boolean hoverOverlap, int hoverEffect, int clickEffect, 
			int arbitraryTransform, int entryAnimationTransformIndex, Renderable renderable) {
		this.transforms = transforms;
		this.selector = selector;
		this.renderable = renderable;
		this.textbox = null;
		this.textfield = null;
		this.maskIndex = maskIndex;
		this.hoverOverlap = hoverOverlap;
		this.hoverEffectIndex = hoverEffect;
		this.clickEffectIndex = clickEffect;
		this.arbitraryTransformIndex = arbitraryTransform;
		this.entryAnimationTransformIndex = entryAnimationTransformIndex;
	}
	
	public Element(TweenTransform[] transforms, Selector selector, int maskIndex,
			boolean hoverOverlap, int hoverEffect, int clickEffect, 
			int arbitraryTransform, int entryAnimationTransformIndex, OptionsList optionsList) {
		this.transforms = transforms;
		this.selector = selector;
		this.renderable = null;
		this.textbox = null;
		this.textfield = null;
		this.optionsList = optionsList;
		this.maskIndex = maskIndex;
		this.hoverOverlap = hoverOverlap;
		this.hoverEffectIndex = hoverEffect;
		this.clickEffectIndex = clickEffect;
		this.arbitraryTransformIndex = arbitraryTransform;
		this.entryAnimationTransformIndex = entryAnimationTransformIndex;
	}
	
	public Element(Element currentElement, int index, int objectsCount, StoredTransform[] transforms, StoredTransform[] unscaledTransforms) { 
		// ONLY FOR AN OPTIONS LIST ELEMENT
		OptionsList currentOptionsList = currentElement.getOptionsList();
		this.transforms = currentElement.getTransform();
		this.selector = new Selector(
				new int[] {currentElement.getSelectorIndex()[0],
					currentElement.getSelectorIndex()[1] + index},
				new int[][]{
					{currentElement.getSelectorOptions()[0][0],currentElement.getSelectorOptions()[0][1]},
					{currentElement.getSelectorOptions()[1][0],currentElement.getSelectorOptions()[1][1] + index + (index != objectsCount - 1 ? 1 : 0)},
					{currentElement.getSelectorOptions()[2][0],currentElement.getSelectorOptions()[2][1]},
					{currentElement.getSelectorOptions()[3][0],currentElement.getSelectorOptions()[3][1] + index - (index != 0 ? 1 : 0)},
				}
				);
		this.renderable = null;
		RoundedArea rectShape = currentElement.getOptionsList().getRectShape();
		this.textbox = new TextBox(
				currentElement.getOptionsList().getScale(),
				currentElement.getOptionsList().getFunction() + " int " + index,
				currentElement.getOptionsList().getName() + '#' + index,
				new Text(
						(String) Main.getConfig().getVariable(
								currentElement.getOptionsList().getListObjectsName(), 
								currentElement.getOptionsList().getTextObject().getText(),
								index
								), // grabs to display
						currentElement.getOptionsList().getTextObject().getAlignX(),
						currentElement.getOptionsList().getTextObject().getAlignY(),
						currentElement.getOptionsList().getTextObject().getOffsetX(),
						currentElement.getOptionsList().getTextObject().getOffsetY(),
						currentElement.getOptionsList().getTextObject().getTextSize(),
						currentElement.getOptionsList().getTextObject().getTextColor(),
						currentElement.getOptionsList().getTextObject().getFont(),
						currentElement.getOptionsList().getTextObject().getBold()
						),
				new RoundedArea(
						rectShape.getX() + 
						(index % currentOptionsList.getOptionsMax()) * ((int) unscaledTransforms[currentElement.getArbitraryTransformIndex()].getTransformX()),
						rectShape.getY() +
						(index % currentOptionsList.getOptionsMax()) * ((int) unscaledTransforms[currentElement.getArbitraryTransformIndex()].getTransformY()),
						rectShape.getXSize(),
						rectShape.getYSize(),
						rectShape.getRoundPercentage()
						),
				currentElement.getOptionsList().getColor(),
				currentElement.getOptionsList().getOpacity(),
				currentElement.getOptionsList().getShadowOffset(),
				currentElement.getOptionsList().getStrokeWidth(),
				currentElement.getOptionsList().getStrokeColor()
				);
		this.textfield = null;
		this.optionsList = null;
		this.maskIndex = currentElement.getMaskIndex();
		this.hoverOverlap = currentElement.getHoverOverlap();
		this.hoverEffectIndex = currentElement.getHoverEffectIndex();
		this.clickEffectIndex = currentElement.getClickEffectIndex();
		this.arbitraryTransformIndex = currentElement.getArbitraryTransformIndex();
		this.entryAnimationTransformIndex = currentElement.getEntryAnimationIndex();
		appendListTransform(transforms, index, currentElement); 
			// !IMPORTANT! Doesn't do anything but splits each element
			// into new objects for some reason!!!
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
	
//	public boolean isPrimaryHovered() {
//		return selector.isPrimaryHovered();
//	}
//	
//	public boolean isSecondaryHovered() {
//		return selector.isSecondaryHovered();
//	}
	
	public void setPrimaryHovered() {
		if (!selector.isSelected()) {
			selector.setPrimaryHovered();
			if (getTextbox() != null) {
				textbox.setStrokeColor(DefaultValues.Color_PRIMARYSELECTOR);
			}
			if (getTextfield() != null) {
				textfield.setStrokeColor(DefaultValues.Color_PRIMARYSELECTOR);
			}
		}
	}
	
	public void setSecondaryHovered() {
		if (!selector.isSelected()) {
			selector.setSecondaryHovered();
			if (getTextbox() != null) {
				textbox.setStrokeColor(DefaultValues.Color_SECONDARYSELECTOR);
			}
			if (getTextfield() != null) {
				textfield.setStrokeColor(DefaultValues.Color_SECONDARYSELECTOR);
			}
		}
	}
	
	public void setNotHovered() {
		if (!selector.isSelected()) {
			selector.setNotHovered();
			if (getTextbox() != null) {
				textbox.setStrokeColor(DefaultValues.Color_STROKE);
			}
			if (getTextfield() != null) {
				textfield.setStrokeColor(DefaultValues.Color_STROKE);
			}
		}
	}
	
	public void setSelected() {
		selector.setSelected();
		if (getTextbox() != null) {
			textbox.setStrokeColor(DefaultValues.Color_ACCENT);
		}
		if (getTextfield() != null) {
			textfield.setStrokeColor(DefaultValues.Color_ACCENT);
		}
	}
	
	public void setUnselected() {
		selector.setUnselected();
		if (getTextbox() != null) {
			textbox.setStrokeColor(DefaultValues.Color_STROKE);
		}
		if (getTextfield() != null) {
			textfield.setStrokeColor(DefaultValues.Color_STROKE);
		}
	}
	
	public String getFunction() {
		String toReturn = null;
		if (isRenderable()) {
			toReturn = getRenderable().getFunction();
		} else if (isTextbox()) {
			toReturn = getTextbox().getFunction();
		} else if (isTextfield()) {
			toReturn = "enterTextField String " + getTextfield().getName();
		} else if (isOptionsList()) {
			toReturn = getOptionsList().getFunction(); 
		}
		
		else {
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
		} else if (isTextfield()) {
			toReturn = getTextfield().getName();
		} else if (isOptionsList()) {
			toReturn = getOptionsList().getName();
		}
		else {
			toReturn = "ERROR: READ CONSOLE";
			System.out.println("Error: Not renderable or Textbox!\n"
					+ "In class: Element, Method: getName()");
		}
		return toReturn;
	}
	
	public void appendListTransform(StoredTransform[] transforms, int index, Element currentElement) {
		// Doesn't actually apply anything at all, but somehow makes each element a new object. who knows.
		if (getArbitraryTransformIndex() != -1) {
			RoundedArea roundedArea = null;
			if (isTextbox()) {
				roundedArea = getTextbox().getRectShape();
			} else if (isRenderable()) {
				roundedArea = new RoundedArea(getRenderable());
			} else if (isTextfield()) {
				roundedArea = getTextfield().getRectShape();
			} else if (isOptionsList()) {
				roundedArea = getOptionsList().getRectShape();
			}
			StoredTransform unscaledTransform = transforms[getArbitraryTransformIndex()];
			StoredTransform transform = unscaledTransform.scaleTransform((
					index / currentElement.getOptionsList().getOptionsMax())
					* currentElement.getOptionsList().getOptionsMax());
			TweenTransform tweenTransform = new TweenTransform(
					new SpecialTransform(roundedArea),
					new SpecialTransform(transform, roundedArea),
					1, // propogation time
					0, // delay
					1 // ease type
					);
			appendTransform(tweenTransform);
		}
	}
	
	public void appendListTransform() {
		if (getArbitraryTransformIndex() != -1) {
			RoundedArea roundedArea = null;
			if (isTextbox()) {
				roundedArea = getTextbox().getRectShape();
			} else if (isRenderable()) {
				roundedArea = new RoundedArea(getRenderable());
			} else if (isTextfield()) {
				roundedArea = getTextfield().getRectShape();
			} else if (isOptionsList()) {
				roundedArea = getOptionsList().getRectShape();
			}
			StoredTransform transform = Main.getTransformsToRender()[getArbitraryTransformIndex()];
			TweenTransform tweenTransform = new TweenTransform(
					new SpecialTransform(roundedArea),
					new SpecialTransform(transform, roundedArea),
					0, // propogation time
					0, // delay
					1 // ease type
					);
			appendTransform(tweenTransform);
		}
	}
	
	public void animateScroll(int factor) {
		if (getArbitraryTransformIndex() != -1) {
			RoundedArea roundedArea = null;
			if (isTextbox()) {
				roundedArea = getTextbox().getRectShape();
			} else if (isRenderable()) {
				roundedArea = new RoundedArea(getRenderable());
			} else if (isTextfield()) {
				roundedArea = getTextfield().getRectShape();
			} else if (isOptionsList()) {
				roundedArea = getOptionsList().getRectShape();
			}
//			for (int i = 3 ; i < transforms.length ; i++) {
//				roundedArea.incrementX(transforms[i].getNewTransform() != null ? 
//						(int) transforms[i].getNewTransform().getTransformX() :
//							0);
//				roundedArea.incrementY(transforms[i].getNewTransform() != null ? 
//						(int) transforms[i].getNewTransform().getTransformY() :
//							0);
//			}
			StoredTransform rawScrollEffect = Main.getTransformsToRender()[getArbitraryTransformIndex()];
			StoredTransform scrollEffect = rawScrollEffect.scaleTransform(-factor);
			TweenTransform tweenTransform = new TweenTransform(
					new SpecialTransform(getTransform()[2].getCurrentPosition(), roundedArea),
					new SpecialTransform(scrollEffect, roundedArea),
					scrollEffect.getTimeToTransformMillis(),
					scrollEffect.getDelayMillis(),
					scrollEffect.getEaseType()
					);
			setTransform(tweenTransform, 2);
		}
	}
	
	public void animateHover() {
		if (getHoverEffectIndex() != -1) {
			RoundedArea roundedArea = null;
			if (isTextbox()) {
				roundedArea = getTextbox().getRectShape();
			} else if (isRenderable()) {
				roundedArea = new RoundedArea(getRenderable());
			} else if (isTextfield()) {
				roundedArea = getTextfield().getRectShape();
			}
//			for (int i = 1 ; i < transforms.length ; i++) {
//				roundedArea.incrementX(transforms[i].getNewTransform() != null ? 
//						(int) transforms[i].getNewTransform().getTransformX() :
//							0);
//				roundedArea.incrementY(transforms[i].getNewTransform() != null ? 
//						(int) transforms[i].getNewTransform().getTransformY() :
//							0);
//			}
			StoredTransform hoverEffect = Main.getTransformsToRender()[getHoverEffectIndex()];
			TweenTransform tweenTransform = new TweenTransform(
					new SpecialTransform(getTransform()[0].getCurrentPosition(), roundedArea),
					new SpecialTransform(hoverEffect, roundedArea),
					hoverEffect.getTimeToTransformMillis(),
					hoverEffect.getDelayMillis(),
					hoverEffect.getEaseType()
					);
			setTransform(tweenTransform, 0);
		}
	}
	
	public void deanimateHover(boolean instant) {
		if (getHoverEffectIndex() != -1) {
			RoundedArea roundedArea = null;
			if (isTextbox()) {
				roundedArea = getTextbox().getRectShape();
			} else if (isRenderable()) {
				roundedArea = new RoundedArea(getRenderable());
			} else if (isTextfield()) {
				roundedArea = getTextfield().getRectShape();
			}
//			for (int i = 1 ; i < transforms.length ; i++) {
//				roundedArea.incrementX(transforms[i].getNewTransform() != null ? 
//						(int) transforms[i].getNewTransform().getTransformX() :
//							0);
//				roundedArea.incrementY(transforms[i].getNewTransform() != null ? 
//						(int) transforms[i].getNewTransform().getTransformY() :
//							0);
//			}
				StoredTransform hoverEffect = Main.getTransformsToRender()[getHoverEffectIndex()];
				TweenTransform tweenTransform = new TweenTransform(
						new SpecialTransform(getTransform()[0].getCurrentPosition(), roundedArea),
						new SpecialTransform(roundedArea),
						instant ? 0 : hoverEffect.getTimeToTransformMillis(),
						instant ? 0 : hoverEffect.getDelayMillis(),
						hoverEffect.getEaseType()
						);
				setTransform(tweenTransform, 0);
		}
	}
	
	public void animateClick(boolean boomerang) {
		if (getClickEffectIndex() != -1) {
			RoundedArea area = isRenderable() ? renderable.toArea() : (isTextfield() ? getTextfield().getRectShape() : (isTextbox() ? getTextbox().getRectShape() : (isOptionsList() ? getOptionsList().getRectShape() : null)));
//			for (int i = 2 ; i < transforms.length ; i++) {
//				area.incrementX(transforms[i].getNewTransform() != null ? 
//						(int) transforms[i].getNewTransform().getTransformX() :
//							0);
//				area.incrementY(transforms[i].getNewTransform() != null ? 
//						(int) transforms[i].getNewTransform().getTransformY() :
//							0);
//			}
			StoredTransform clickEffect = Main.getTransformsToRender()[getClickEffectIndex()];
			TweenTransform tweenTransform = new TweenTransform(
					new SpecialTransform(getTransform()[1].getCurrentPosition(), area),
					new SpecialTransform(clickEffect, area),
					clickEffect.getTimeToTransformMillis(),
					clickEffect.getDelayMillis(),
					clickEffect.getEaseType(),
					boomerang
					);
			setTransform(tweenTransform, 1);
		}
	}
	
	public void deanimateClick(boolean instant) {
		if (getClickEffectIndex() != -1) {
			RoundedArea area = isRenderable() ? renderable.toArea() : (isTextfield() ? getTextfield().getRectShape() : (isTextbox() ? getTextbox().getRectShape() : (isOptionsList() ? getOptionsList().getRectShape() : null)));
//			for (int i = 2 ; i < transforms.length ; i++) {
//				area.incrementX(transforms[i].getNewTransform() != null ? 
//						(int) transforms[i].getNewTransform().getTransformX() :
//							0);
//				area.incrementY(transforms[i].getNewTransform() != null ? 
//						(int) transforms[i].getNewTransform().getTransformY() :
//							0);
//			}
			StoredTransform clickEffect = Main.getTransformsToRender()[getClickEffectIndex()];
			TweenTransform tweenTransform = new TweenTransform(
					new SpecialTransform(getTransform()[1].getCurrentPosition(), area),
					new SpecialTransform(area),
					instant ? 0 : clickEffect.getTimeToTransformMillis(),
					instant ? 0 : clickEffect.getDelayMillis(),
					clickEffect.getEaseType()
					);
			setTransform(tweenTransform, 1);
		}
	}
	
	public void animateExit(boolean instant) {
		if (getEntryAnimationIndex() != -1) {
			RoundedArea area = isRenderable() ? renderable.toArea() : (isTextfield() ? getTextfield().getRectShape() : (isTextbox() ? getTextbox().getRectShape() : (isOptionsList() ? getOptionsList().getRectShape() : null)));
//			for (int i = 4 ; i < transforms.length ; i++) {
//				area.incrementX(transforms[i].getNewTransform() != null ? 
//						(int) transforms[i].getNewTransform().getTransformX() :
//							0);
//				area.incrementY(transforms[i].getNewTransform() != null ? 
//						(int) transforms[i].getNewTransform().getTransformY() :
//							0);
//			}
			StoredTransform entryEffect = Main.getTransformsToRender()[getEntryAnimationIndex()];
			TweenTransform tweenTransform = new TweenTransform(
					new SpecialTransform(getTransform()[3].getCurrentPosition(), area),
					new SpecialTransform(entryEffect, area),
					instant ? 1 : entryEffect.getTimeToTransformMillis(),
					instant ? 0 : entryEffect.getDelayMillis(),
					entryEffect.getEaseType()
					);
			setTransform(tweenTransform, 3);
		}
	}
	
	public void animateEntry(boolean reset) {
		if (getEntryAnimationIndex() != -1) {
			RoundedArea area = isRenderable() ? renderable.toArea() : (isTextfield() ? getTextfield().getRectShape() : (isTextbox() ? getTextbox().getRectShape() : (isOptionsList() ? getOptionsList().getRectShape() : null)));
//			for (int i = 4 ; i < transforms.length ; i++) {
//				area.incrementX(transforms[i].getNewTransform() != null ? 
//						(int) transforms[i].getNewTransform().getTransformX() :
//							0);
//				area.incrementY(transforms[i].getNewTransform() != null ? 
//						(int) transforms[i].getNewTransform().getTransformY() :
//							0);
//			}
			// gets the area depending on the type of element present.
			StoredTransform entryEffect = Main.getTransformsToRender()[getEntryAnimationIndex()];
			// System.out.println((Math.min((getTransform()[3].getCurrentTime() + 0.5),1)));
			TweenTransform tweenTransform = new TweenTransform(
					new SpecialTransform(reset ? new SpecialTransform(entryEffect) : getTransform()[3].getCurrentPosition(), area),
					new SpecialTransform(area),
					entryEffect.getTimeToTransformMillis(),
					entryEffect.getDelayMillis(),
					entryEffect.getEaseType()
					);
			// TODO consider fixing: (long) (Math.min((getTransform()[3].getCurrentTime() + 0.5),1) * entryEffect.getTimeToTransformMillis()), 
			// which multiplies to getTimeToTransformMillis(). Sometimes getCurrentTime returns 0 for the first element of an optionsList,
			// which I don't understand.
			setTransform(tweenTransform, 3);
		}
	}
	
	public boolean isRenderable() {
		return (getRenderable() != null);
	}
	
	public boolean isTextbox() {
		return (getTextbox() != null);
	}
	
	public boolean isTextfield() {
		return (getTextfield() != null);
	}
	
	public boolean isOptionsList() {
		return (getOptionsList() != null);
	}
	
	public Renderable getRenderable() {
		return renderable;
	}
	
	public TextBox getTextbox() {
		return textbox;
	}
	
	public TextField getTextfield() {
		return textfield;
	}
	
	public OptionsList getOptionsList() {
		return optionsList;
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
	
	public void appendTransform(TweenTransform transform) {
		TweenTransform[] newTransforms = new TweenTransform[transforms.length + 1];
		System.arraycopy(transforms, 0, newTransforms, 0, transforms.length);
		newTransforms[newTransforms.length - 1] = transform;
		transforms = newTransforms;
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
	
	public void setHoverOverlap(boolean hoverOverlap) {
		this.hoverOverlap = hoverOverlap;
	}
	
	public Element getScaledInstance(double xScale, double yScale) {
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
                	int type = -1;
                	int texture = -1;
                	if (imagePath.substring(0, 5).equals("#note")) {
                		type = DefaultValues.Texture_NOTE;
                		texture = Integer.parseInt(imagePath.substring(6));
                	} else if (imagePath.substring(0, 5).equals("#drum")) {
                		type = DefaultValues.Texture_DRUM;
                		texture = Integer.parseInt(imagePath.substring(6));
                	}
                	int renderableXSize = (int) Math.round(renderableObject.getXSize() * xScale);
                	int renderableYSize = (int) Math.round(renderableObject.getYSize() * yScale);
                	int renderableX = (int) Math.round(renderableObject.getX() * xScale);
                	int renderableY = (int) Math.round(renderableObject.getY() * yScale);
                	int renderableOpacity = renderableObject.getOpacity();
                	Renderable newRenderableObject = null;
                	if (type == -1) {
                		newRenderableObject =  new Renderable(renderableFunction, renderableName, imagePath, 
                    			renderableX, renderableY, renderableXSize, renderableYSize, renderableOpacity);
                	} else {
                		newRenderableObject =  new Renderable(renderableFunction, renderableName, type, texture, 
                    			renderableX, renderableY, renderableXSize, renderableYSize, renderableOpacity);
                	}
	            	
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
	            	int type = -1;
                	int texture = -1;
                	if (imagePath.substring(0, 5).equals("#note")) {
                		type = DefaultValues.Texture_NOTE;
                		texture = Integer.parseInt(imagePath.substring(6));
                	} else if (imagePath.substring(0, 5).equals("#drum")) {
                		type = DefaultValues.Texture_DRUM;
                		texture = Integer.parseInt(imagePath.substring(6));
                	}
	            	int renderableXSize = (int) Math.round(renderableObject.getXSize() * xScale);
	            	int renderableYSize = (int) Math.round(renderableObject.getYSize() * yScale);
	            	int renderableX = (int) Math.round(renderableObject.getX() * xScale);
	            	int renderableY = (int) Math.round(renderableObject.getY() * yScale);
	            	int renderableOpacity = renderableObject.getOpacity();
	            	Renderable newRenderableObject = null;
	            	if (type == -1) {
	            		newRenderableObject =  new Renderable(renderableFunction, renderableName, imagePath, 
	                			renderableX, renderableY, renderableXSize, renderableYSize, renderableOpacity);
	            	} else {
	            		newRenderableObject =  new Renderable(renderableFunction, renderableName, type, texture, 
	                			renderableX, renderableY, renderableXSize, renderableYSize, renderableOpacity);
	            	}
	            	
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
        	int type = -1;
        	int texture = -1;
        	if (imagePath.substring(0, 5).equals("#note")) {
        		type = DefaultValues.Texture_NOTE;
        		texture = Integer.parseInt(imagePath.substring(6));
        	} else if (imagePath.substring(0, 5).equals("#drum")) {
        		type = DefaultValues.Texture_DRUM;
        		texture = Integer.parseInt(imagePath.substring(6));
        	}
        	int renderableXSize = (int) Math.round(renderableObject.getXSize() * xScale);
        	int renderableYSize = (int) Math.round(renderableObject.getYSize() * yScale);
        	int renderableX = (int) Math.round(renderableObject.getX() * xScale);
        	int renderableY = (int) Math.round(renderableObject.getY() * yScale);
        	int renderableOpacity = renderableObject.getOpacity();
        	Renderable newRenderableObject = null;
        	if (type == -1) {
        		newRenderableObject =  new Renderable(renderableFunction, renderableName, imagePath, 
            			renderableX, renderableY, renderableXSize, renderableYSize, renderableOpacity);
        	} else {
        		newRenderableObject =  new Renderable(renderableFunction, renderableName, type, texture, 
            			renderableX, renderableY, renderableXSize, renderableYSize, renderableOpacity);
        	}
        	toReturn =  
    				new Element(
						transformIndexes, selector,
        				maskIndex, hoverOverlap,
        				hoverEffectIndex, clickEffectIndex, arbitraryTransformIndex,
        				entryAnimationTransformIndex,
        				newRenderableObject
						);
    	} else if (currentElement.isTextfield()) {
    		TextField currentItem = currentElement.getTextfield();
        	
        	float textFieldScale = currentItem.getScale();
        	int maxSize = currentItem.getMaxSize();
        	
        	String currentDisplay = currentItem.getUnloadedCurrentDisplay();
        	String name = currentItem.getName();
        	int inputType = currentItem.getInputType();
        	
        	int[] errorPopupIndexes = currentItem.getErrorPopupIndexes();
        	
        	int xSize = (int) Math.round(currentItem.getXSize() * xScale * textFieldScale);
        	int ySize = (int) Math.round(currentItem.getYSize() * yScale * textFieldScale);
        	int x = (int) Math.round(currentItem.getX() * xScale - (xSize / 2));
        	int y = (int) Math.round(currentItem.getY() * yScale - (ySize / 2));
        	int color = currentItem.getColor();
        	int opacity = currentItem.getOpacity();
        	int roundPercentage = currentItem.getRoundPercentage();
        	int shadowOffset = (int) Math.round(currentItem.getShadowOffset() * Math.min(xScale, yScale) * textFieldScale);
        	float stroke = (int) Math.round(currentItem.getStrokeWidth() * Math.min(xScale, yScale) * textFieldScale);
        	int strokeColor = currentItem.getStrokeColor();
        	
        	Text textItem = currentItem.getTextObject();
        	String variableName = textItem.getText();
        	String alignX = textItem.getAlignX();
        	String alignY = textItem.getAlignY();
        	String font = textItem.getFont();
        	int textSize = (int) Math.round(textItem.getTextSize() * Math.min(xScale, yScale) * textFieldScale);
        	int fontColor = textItem.getTextColor();
        	boolean bold = textItem.getBold();
        	int offsetX = (int) Math.round(textItem.getOffsetX() * xScale * textFieldScale);
        	int offsetY = (int) Math.round(textItem.getOffsetY() * yScale * textFieldScale);
        	
        	toReturn =  
    				new Element( // Third Constructor (Only Renderable)
						transformIndexes, selector,
        				maskIndex, hoverOverlap,
        				hoverEffectIndex, clickEffectIndex, arbitraryTransformIndex,
        				entryAnimationTransformIndex,
						new TextField(
							currentDisplay,
							textFieldScale, maxSize, errorPopupIndexes, 
							inputType, name,
							new Text(variableName, alignX, alignY, offsetX, offsetY, textSize, fontColor, font, bold), 
							new RoundedArea(x, y, xSize, ySize, roundPercentage), 
	        				color, opacity, shadowOffset, 
	        				stroke, strokeColor
	        				)
						);
    	} else if (currentElement.isOptionsList()) {
    		OptionsList currentItem = currentElement.getOptionsList();
        	
        	float optionsListScale = currentItem.getScale();
        	
        	Object[] objects = currentItem.getObjects();
        	int objectsCount = objects.length;
        	
        	String function = currentItem.getFunction();
        	String listObjectsName = currentItem.getListObjectsName();
        	int optionsMax = currentItem.getOptionsMax();
        	int scrollPosition = 0;
        	
        	String name = currentItem.getName();
        	
        	int xSize = (int) Math.round(currentItem.getXSize() * xScale * optionsListScale);
        	int ySize = (int) Math.round(currentItem.getYSize() * yScale * optionsListScale);
        	int x = (int) Math.round(currentItem.getX() * xScale - (xSize / 2));
        	int y = (int) Math.round(currentItem.getY() * yScale - (ySize / 2));
        	int color = currentItem.getColor();
        	int opacity = currentItem.getOpacity();
        	int roundPercentage = currentItem.getRoundPercentage();
        	int shadowOffset = (int) Math.round(currentItem.getShadowOffset() * Math.min(xScale, yScale) * optionsListScale);
        	float stroke = (int) Math.round(currentItem.getStrokeWidth() * Math.min(xScale, yScale) * optionsListScale);
        	int strokeColor = currentItem.getStrokeColor();
        	
        	Text textItem = currentItem.getTextObject();
        	String variableName = textItem.getText();
        	String alignX = textItem.getAlignX();
        	String alignY = textItem.getAlignY();
        	String font = textItem.getFont();
        	int textSize = (int) Math.round(textItem.getTextSize() * Math.min(xScale, yScale) * optionsListScale);
        	int fontColor = textItem.getTextColor();
        	boolean bold = textItem.getBold();
        	int offsetX = (int) Math.round(textItem.getOffsetX() * xScale * optionsListScale);
        	int offsetY = (int) Math.round(textItem.getOffsetY() * yScale * optionsListScale);
        	
        	toReturn =  
    				new Element( // Third Constructor (Only Renderable)
						transformIndexes, new Selector(),
        				maskIndex, hoverOverlap,
        				hoverEffectIndex, clickEffectIndex, arbitraryTransformIndex,
        				entryAnimationTransformIndex,
						new OptionsList(
							optionsListScale, function, listObjectsName, 
							optionsMax, scrollPosition, objects, objectsCount, name,
							new Text(variableName, alignX, alignY, offsetX, offsetY, textSize, fontColor, font, bold), 
							new RoundedArea(x, y, xSize, ySize, roundPercentage), 
	        				color, opacity, shadowOffset, 
	        				stroke, strokeColor
	        				)
						);
    		
    	}
    	
    	return toReturn;
	}
}
