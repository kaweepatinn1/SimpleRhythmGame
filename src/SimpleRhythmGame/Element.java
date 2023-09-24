package SimpleRhythmGame;

// Initialize and then read only class.

public class Element {
	private transient TweenTransform transform;
	private Selector selector;
	private Renderable renderable;
	private TextBox textbox;
	private int maskIndex; // mask to use for this element
	private int hoverEffectIndex; // animation to play when hovered
	private int clickEffectIndex; // animation to play when clicked
	private int arbitraryTransformIndex; // for scroll boxes, ect.
	
	public Element(Selector selector, int maskIndex, int hoverEffect, int clickEffect, 
			int arbitraryTransform, TextBox textbox
			) {
		transform = new TweenTransform(textbox);
		this.selector = selector;
		this.renderable = null;
		this.textbox = textbox;
		this.maskIndex = maskIndex;
		this.hoverEffectIndex = hoverEffect;
		this.clickEffectIndex = clickEffect;
		this.arbitraryTransformIndex = arbitraryTransform;
	}
	
	public Element(Selector selector, int maskIndex, int hoverEffect, int clickEffect, 
			int arbitraryTransform, Renderable renderable) {
		transform = new TweenTransform(renderable);
		this.selector = selector;
		this.renderable = renderable;
		this.textbox = null;
		this.maskIndex = maskIndex;
		this.hoverEffectIndex = hoverEffect;
		this.clickEffectIndex = clickEffect;
		this.arbitraryTransformIndex = arbitraryTransform;
	}
	
	public Element(TweenTransform transform, Selector selector, int maskIndex, int hoverEffect, int clickEffect, 
			int arbitraryTransform, TextBox textbox
			) {
		this.transform = transform;
		this.selector = selector;
		this.renderable = null;
		this.textbox = textbox;
		this.maskIndex = maskIndex;
		this.hoverEffectIndex = hoverEffect;
		this.clickEffectIndex = clickEffect;
		this.arbitraryTransformIndex = arbitraryTransform;
	}
	
	public Element(TweenTransform transform, Selector selector, int maskIndex, int hoverEffect, int clickEffect, 
			int arbitraryTransform, Renderable renderable) {
		this.transform = transform;
		this.selector = selector;
		this.renderable = renderable;
		this.textbox = null;
		this.maskIndex = maskIndex;
		this.hoverEffectIndex = hoverEffect;
		this.clickEffectIndex = clickEffect;
		this.arbitraryTransformIndex = arbitraryTransform;
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
	
	public void animate() {
		if (getHoverEffectIndex() != -1) {
			StoredTransform hoverEffect = ShowImage.getTransformsToRender()[getHoverEffectIndex()];
			TweenTransform tweenTransform = new TweenTransform(
					new SpecialTransform(getTransform().getCurrentPosition(), getTextbox().getRectShape()),
					new SpecialTransform(hoverEffect, getTextbox().getRectShape()),
					(long) (Math.min((getTransform().getCurrentTime() + 0.5),1) * hoverEffect.getTimeToTransformMillis()),
					hoverEffect.getDelayMillis(),
					hoverEffect.getEaseType()
					);
			setTransform(tweenTransform);
		}
	}
	
	public void deanimate() {
		if (getHoverEffectIndex() != -1) {
			StoredTransform hoverEffect = ShowImage.getTransformsToRender()[getHoverEffectIndex()];
			TweenTransform tweenTransform = new TweenTransform(
					new SpecialTransform(getTransform().getCurrentPosition(), getTextbox().getRectShape()),
					new SpecialTransform(getTextbox().getRectShape()),
					(long) (Math.min((getTransform().getCurrentTime() + 0.5),1) * hoverEffect.getTimeToTransformMillis()),
					hoverEffect.getDelayMillis(),
					hoverEffect.getEaseType()
					);
			setTransform(tweenTransform);
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

	public void setArbitraryTransformIndex(int arbitraryTransform) {
		this.arbitraryTransformIndex = arbitraryTransform;
	}

	public TweenTransform getTransform() {
		return transform;
	}

	public void setTransform(TweenTransform transform) {
		this.transform = transform;
	}

	public int getMaskIndex() {
		return maskIndex;
	}

	public void setMaskIndex(int maskIndex) {
		this.maskIndex = maskIndex;
	}
}
