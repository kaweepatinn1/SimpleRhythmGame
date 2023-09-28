package SimpleRhythmGame;

import java.awt.Color;

// each menu instance is a list of elements item that makes up that menu.
// essentially, each menu is a list of elements.

public class Menu {
	private String menuName;
	private String menuDisplayName;
	private String previousMenuName;
	private int bgColor;
	private Element[] elements;
	private Element[][] popups;
	private int[][] secondarySelections;
	private RoundedArea[] masks;
	private StoredTransform[] transforms;
	
	Menu(
		String menuName, String menuDisplayName, String previousMenuName, 
		int bgColor, int[][] secondarySelections, RoundedArea[] masks,
		StoredTransform[] transforms,
		Element[] elements, Element[][] popups
		) {
		this.menuName = menuName;
		this.menuDisplayName = menuDisplayName;
		this.previousMenuName = previousMenuName;
		this.bgColor = bgColor;
		this.elements = elements;
		this.popups = popups;
		this.secondarySelections = secondarySelections;
		this.masks = masks;
		this.transforms = transforms;
	}
	
	public String getMenuName() {
		return menuName;
	}
	
	public String getMenuDisplayName() {
		return menuDisplayName;
	}
	
	public String getPreviousMenuName() {
		return previousMenuName;
	}
	
	public Color getBGColor() {
		return ShowImage.getConfig().getCurrentColors()[bgColor];
	}
	
	public void setBGColor(int bgColor) {
		this.bgColor = bgColor;
	}
	
	public Element[] getElements() {
		return elements;
	}
	
	public Element[][] getPopups(){
		return popups;
	}
	
	public Element[] getPopup(int index) {
		return popups[index];
	}
	
	public void setPopups(Element[][] popups) {
		this.popups = popups;
	}
	
	public void setPopup(Element[] popup, int index) {
		this.popups[index] = popup;
	}
	
	public RoundedArea[] getMasks() {
		return masks;
	}
	
	public void setElements(Element[] elements) {
		this.elements = elements;
	}
	
	public int[][] getSecondarySelections() {
		return secondarySelections;
	}
	
	public int getIndexForSelector(int[] toSelect) {
		int toReturn = -1;
		for (int i = 0; i < elements.length ; i++) {
			Element element = elements[i];
			int[] elementSelectorIndex = element.getSelectorIndex();
			toReturn =  elementSelectorIndex[0] == toSelect[0] && elementSelectorIndex[1] == toSelect[1] ? i : toReturn;
		}
		// System.out.println(toReturn);
		return toReturn;
	}
	
	public int[] resetSelectors(boolean resetToDefault, int popup) {
		if (resetToDefault) {
			int[] toReturn = null;
			boolean found = false;
			
			Element[] elementsToCheck = (popup == -1) ? elements : popups[popup];
			
			for (int i = 0; i < elementsToCheck.length ; i++) {
				if (elementsToCheck[i].getSelectorIndex()[0] + elementsToCheck[i].getSelectorIndex()[1] > -1) {
					elementsToCheck[i].setPrimaryHovered();
					toReturn = elementsToCheck[i].getSelectorIndex();
					found = true;
					break;
				}
			} 
			if (popup == -1) {
				elements = elementsToCheck;
			} else {
				popups[popup] = elementsToCheck;
			}
			
			if (!found) {
				toReturn = new int[]{-1,-1};
			}
			return toReturn;
		} else {
			Element[] elementsToCheck = (popup == -1) ? elements : popups[popup];
			
			for (int i = 0; i < elementsToCheck.length ; i++) {
				Element element = elementsToCheck[i];
				
				boolean setSecondaryHovered = false; // see if the requirements for secondary hovering are met
				for (int[] secondarySelectionIndex : secondarySelections) {
					if (secondarySelectionIndex[0] == element.getSelectorIndex()[0] && secondarySelectionIndex[1] == element.getSelectorIndex()[1]
							&& element.getSelectorIndex()[0] + element.getSelectorIndex()[1] > -1) {
						// the element's index must be on the secondary whitelist and less than currently selected
						setSecondaryHovered = true;
					}
				}
				
				if (setSecondaryHovered) {
					element.setSecondaryHovered();
				} else {
					element.setNotHovered();
				}
			}
			if (popup == -1) {
				elements = elementsToCheck;
			} else {
				popups[popup] = elementsToCheck;
			}
			return new int[]{-1,-1};
		}
	}
	
	public int[] resetSelectors(int[] currentlySelected, int[] lastSelected, int popup) {
		boolean found = false;
		Element[] elementsToCheck = (popup == -1) ? elements : popups[popup];
		for (int i = 0; i < elementsToCheck.length ; i++) {
			Element element = elementsToCheck[i];
			int[] elementSelectorIndex = element.getSelectorIndex();
			
			boolean setSecondaryHovered = false; // see if the requirements for secondary hovering are met
			for (int[] secondarySelectionIndex : secondarySelections) {
				if (secondarySelectionIndex[0] == elementSelectorIndex[0] && secondarySelectionIndex[1] == elementSelectorIndex[1]
						&& elementSelectorIndex[0] + elementSelectorIndex[1] > -1) {
					// the element's index must be on the secondary whitelist and less than currently selected
					setSecondaryHovered = true;
				}
			}
			
			if (elementSelectorIndex[0] == currentlySelected[0] && elementSelectorIndex[1] == currentlySelected[1]) {
				element.setPrimaryHovered();
				found = true;
				
			} else if (setSecondaryHovered) {
				element.setSecondaryHovered();
			} else {
				element.setNotHovered();
			}
		}
		if (found) {
			if (popup == -1) {
				elements = elementsToCheck;
			} else {
				popups[popup] = elementsToCheck;
			}
			return currentlySelected;
		} else {
			if (popup == -1) {
				elements = elementsToCheck;
			} else {
				popups[popup] = elementsToCheck;
			}
			return lastSelected;
		}
	}

	public StoredTransform[] getTransforms() {
		return transforms;
	}
	
	public Menu getScaledMenu(int width, int height) {
		
		double xScale = ShowImage.intToDouble(width) / 1920;
    	double yScale = ShowImage.intToDouble(height) / 1080;
    	
    	RoundedArea[] masks = getMasks();
    	RoundedArea[] areasToReturn;
    	
    	if (masks != null) {
    		areasToReturn = new RoundedArea[masks.length];
        	
        	for (int i = 0; i < masks.length; i++) {
        		RoundedArea mask = masks[i];
        		
        		int maskXSize = (int) Math.round(mask.getXSize() * xScale);
            	int maskYSize = (int) Math.round(mask.getYSize() * yScale);
            	int maskX = (int) Math.round(mask.getX() * xScale);
            	int maskY = (int) Math.round(mask.getY() * yScale);
            	int maskRoundPercentage = mask.getRoundPercentage();
            	
            	areasToReturn[i] = new RoundedArea(maskX, maskY, maskXSize, maskYSize, maskRoundPercentage);
        	}
    	} else {
    		areasToReturn = null;
    	}
		
    	StoredTransform[] transforms = getTransforms();
    	StoredTransform[] transformsToReturn;
    	
    	if (transforms != null) {
    		transformsToReturn = new StoredTransform[transforms.length];
        	
        	for (int i = 0; i < transforms.length; i++) {
        		StoredTransform transform = transforms[i];
        		
        		double transformX = transform.getTransformX() * xScale;
        		double transformY = transform.getTransformY() * yScale;
        		
        		transformsToReturn[i] = new StoredTransform(transform, transformX, transformY);
        		
        	}
    	} else {
    		transformsToReturn = null;
    	}
    	
    	Element[] elementsToReturnFinal = null;
    	Element[][] popupsToReturn = new Element[popups.length][];
    	
    	for (int iter = 0 ; iter < popups.length + 1 ; iter++) {
    		boolean popupsComplete = (iter == popups.length);
    		Element[] rawElementsList;
    		if (popupsComplete) {
    			rawElementsList = getElements();
    		} else {
    			rawElementsList = getPopup(iter);
    		}
    		
        	Element[] elementsToReturn = new Element[rawElementsList.length];
        	
        	for (int i = 0; i < rawElementsList.length; i++) {
            	
            	Element currentElement = rawElementsList[i];
            	Selector selector = currentElement.getSelector();
            	
            	int maskIndex = currentElement.getMaskIndex();
            	
            	int hoverEffectIndex = currentElement.getHoverEffectIndex();
            	int clickEffectIndex = currentElement.getClickEffectIndex();
            	int arbitraryTransformIndex = currentElement.getArbitraryTransformIndex();
            	int entryAnimationTransformIndex = currentElement.getEntryAnimationIndex();
            	
            	if (currentElement.isTextbox()) { // textbox
            		
    	        	TextBox currentItem = currentElement.getTextbox();
    	        	TweenTransform[] transformIndexes = currentElement.getTransform();
    	        	
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
    		            	
    		            	elementsToReturn[i] =  
    		        				new Element( // Third Constructor (Only Renderable)
    	        						transformIndexes, selector,
    			        				maskIndex,
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
    	        			elementsToReturn[i] =  
    		        				new Element( // Fourth Constructor (No Renderable or Textbox)
    	        						transformIndexes, selector,
    			        				maskIndex,
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
    		            	
    		            	elementsToReturn[i] =  
    		        				new Element(
    	        						transformIndexes, selector,
    			        				maskIndex, 
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
    		            		elementsToReturn[i] = 
    			        				 new Element( // Second Constructor (Only Text)
    		        						 transformIndexes, selector, 
    				        				 maskIndex,
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
            		//TODO
            		
            	}
        	}
        	
        	if (popupsComplete) {
        		elementsToReturnFinal = elementsToReturn;
        	} else {
        		popupsToReturn[iter] = elementsToReturn;
        	}
        
        }
        
        Menu finalMenu = new Menu(
        		menuName,
        		menuDisplayName,
        		previousMenuName,
        		bgColor,
        		secondarySelections,
        		areasToReturn,
        		transformsToReturn,
        		elementsToReturnFinal,
        		popupsToReturn
        		);
        
        return finalMenu;
	}
}
