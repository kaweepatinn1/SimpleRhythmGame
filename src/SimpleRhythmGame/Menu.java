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
	private Popup[] popups;
	private int[][] secondarySelections;
	private RoundedArea[] masks;
	private StoredTransform[] transforms;
	
	Menu(
		String menuName, String menuDisplayName, String previousMenuName, 
		int bgColor, int[][] secondarySelections, RoundedArea[] masks,
		StoredTransform[] transforms,
		Element[] elements, Popup[] popups
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
	
	Menu (Menu menu){
		menuName = menu.getMenuName();
		menuDisplayName = menu.getMenuDisplayName();
		previousMenuName = menu.getPreviousMenuName();
		bgColor = menu.getBGColorInt();
		elements = menu.getElements();
		popups = menu.getPopups();
		secondarySelections = menu.getSecondarySelections();
		masks = menu.getMasks();
		transforms = menu.getTransforms();
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
	
	public int getBGColorInt() {
		return bgColor;
	}
	
	public Color getBGColor() {
		return Main.getConfig().getCurrentThemeColors()[bgColor];
	}
	
	public void setBGColor(int bgColor) {
		this.bgColor = bgColor;
	}
	
	public Element[] getElements() {
		return elements;
	}
	
	public Popup[] getPopups(){
		return popups;
	}
	
	public Popup getPopup(int index) {
		return popups[index];
	}
	
	public void setPopups(Popup[] popups) {
		this.popups = popups;
	}
	
	public void setPopup(Popup popup, int index) {
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
			
			Element[] elementsToCheck = (popup == -1) ? elements : popups[popup].getElements();
			
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
				popups[popup].setElements(elementsToCheck);
			}
			
			if (!found) {
				toReturn = new int[]{-1,-1};
			}
			return toReturn;
		} else {
			Element[] elementsToCheck = (popup == -1) ? elements : popups[popup].getElements();
			
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
				popups[popup].setElements(elementsToCheck);
			}
			return new int[]{-1,-1};
		}
	}
	
	public int[] resetSelectors(int[] currentlySelected, int[] lastSelected, int popup) {
		boolean found = false;
		Element[] elementsToCheck = (popup == -1) ? elements : popups[popup].getElements();
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
				popups[popup].setElements(elementsToCheck);
			}
			return currentlySelected;
		} else {
			if (popup == -1) {
				elements = elementsToCheck;
			} else {
				popups[popup].setElements(elementsToCheck);
			}
			return lastSelected;
		}
	}

	public StoredTransform[] getTransforms() {
		return transforms;
	}
	
	public Menu getScaledMenu(int width, int height) {
		
		double xScale = Main.intToDouble(width) / 1920;
    	double yScale = Main.intToDouble(height) / 1080;
    	
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
    	Popup[] popupsToReturn = new Popup[popups.length];
    	
    	for (int iter = 0 ; iter < popups.length + 1 ; iter++) {
    		boolean popupsComplete = (iter == popups.length);
    		Element[] rawElementsList;
    		Popup rawPopup = null;
    		if (popupsComplete) {
    			rawElementsList = getElements();
    		} else {
    			rawPopup = getPopup(iter);
    			rawElementsList = rawPopup.getElements();
    		}
    		
    		int additionalElements = 0;
    		
    		for (int i = 0; i < rawElementsList.length; i++) {
            	
            	Element currentElement = rawElementsList[i];
            	if (currentElement.isOptionsList()) {
            		Object[] objects = currentElement.getOptionsList().getObjects();
                	int objectsCount = objects.length;
                	additionalElements = additionalElements + objectsCount;
            	}
            	
        	}
    		
        	Element[] elementsToReturn = new Element[rawElementsList.length + additionalElements];
        	
        	int i = 0;
        	for (int elementsNumber = 0; elementsNumber < rawElementsList.length; elementsNumber++) {
            	
            	Element currentElement = rawElementsList[elementsNumber];
            	if (currentElement.isOptionsList()) {
            		Object[] objects = currentElement.getOptionsList().getObjects();
            		int objectsCount = objects.length;
            		
            		Element scaledOptionsList = currentElement.getScaledInstance(xScale, yScale);
            		elementsToReturn[i] = scaledOptionsList;
            		i++;
            		
                	for (int index = 0 ; index < objectsCount ; index++) {
                		Element toRenderElement = new Element(currentElement, index, objectsCount, transformsToReturn, transforms); // still unscaled
                		Element scaledElement = toRenderElement.getScaledInstance(xScale, yScale);
                		elementsToReturn[i] = scaledElement;
                		i++;
                	}
            	} else {
            		elementsToReturn[i] = currentElement.getScaledInstance(xScale, yScale);
            		i++;
            	}
            	
            	
        	}
        	
        	if (popupsComplete) {
        		elementsToReturnFinal = elementsToReturn;
        	} else {
        		popupsToReturn[iter] = 
					new Popup(
    						rawPopup.getPopupName(),
    						rawPopup.getPopupTitle(),
    						elementsToReturn);
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

	public static Menu newMenuWithElements(Menu oldMenu, Element[] extraElements) {
		if (extraElements != null) {
			Menu menuToReturn = new Menu(oldMenu);
			menuToReturn.addElements(extraElements);
			return menuToReturn;
		} else {
			return oldMenu;
		}
	}
	
	public void addElements(Element[] extraElements) {
		Element[] oldElements = getElements();
		Element[] newElementsList = new Element[oldElements.length + extraElements.length];
		System.arraycopy(oldElements, 0, newElementsList, 0, oldElements.length);
		System.arraycopy(extraElements, 0, newElementsList, oldElements.length, extraElements.length);
		setElements(newElementsList);
	}
}
