package SimpleRhythmGame;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.geom.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ShowImage extends JPanel implements KeyListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static ShowImage panel;
    private static int currentMenuIndex;
    private static Menu rawCurrentMenu;
    private static Menu scaledMenu;
    private static int[] selected;
    private static int[][] ogSelecteds = {};
    private static Selector[] selectionsList;
    private static boolean keyboardInputLast; 
    // if the last input to the program was made by a keyboard, returns true. else, returns false.
    // used to disable the mouse input after using the keyboard until hovering an element, or a click is made
    
    private static String selectedElement;
    private static int[] popupIndexes;
    
    private static JFrame frame;
    private static Config config;
    private static boolean init = true;
    
    private static String lastHovered = null;
    private static String mouseDragCurrent = null; 
    private static String mouseDragStart = null;
    // The name of the element that the current drag has started on
    private static boolean currentMouseDragging = false;
    
    // whether or not the next frame to be drawn should force reset the positions
    // and other values of elements, masks, and transforms
    
    private static boolean popupUpdate = false;
    private static double popupTime;
    private static int fadeOutPopup = -1;
    
    private static boolean transitioning = false;
    // whether or not the menu is currently transitioning (includes the p
    // the menu has changed but is still fading in
    private static boolean transitionBlackOut = false; 
    // used to stop errors when transitioning between menus. stops the mouse
    // and keyboard listeners when value is set to true
    private static boolean menuSwitched = false;
    private static double transitionTime;
    private static int transitionTo;
    
    private static int calculatedScreenHeight;
    private static int calculatedScreenWidth;
    private static double scale;

    private static MouseListener mouseListener = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
    		int mouseX = e.getX();
        	int mouseY = e.getY();
        	keyboardInputLast = false;
        	// System.out.println("clicked");
            Element clickedElement = checkLocation(mouseX, mouseY);
            if (clickedElement != null) {
            	Element element = getElementFromName(selectedElement);
            	if (element != null) {
            		if (clickedElement.getName().equals("Edit"+ selectedElement + "Button")) {
            			confirmElement(element);
            			element.getSelector().setUnselected();
            			element.animateClick(true);
                		selectedElement = null;
            		} else {
            			cancelElement(element);
                		element.getSelector().setUnselected();
                		element.animateClick(true);
                		selectedElement = null;
            		}
        		} else {
        			if (clickedElement.getClickEffectIndex() != -1) {
                		getElementFromName(clickedElement.getName()).animateClick(true);
                	}
        			
        			String functionToRun = clickedElement.getFunction();
                    boolean ranFunction = Functions.runFunction(functionToRun);
                    if (!ranFunction) {
                    	System.out.println("ERROR: DID NOT RUN ANY FUNCTION FOR \nElement Name: " + clickedElement.getName() + 
                    			"\nwhich is a \nRenderable: " + clickedElement.isRenderable() + "\nTextbox: " + clickedElement.isTextbox());
                    } 
        		}
            	// System.out.println(releasedElement.getName());
                mouseDragStart = null;
        	} else {
        		Element element = getElementFromName(selectedElement);
        		if (element != null) {
        			cancelElement(element);
        			element.getSelector().setUnselected();
        			selectedElement = null;
        		}
        	}
        }
        
        public void mouseReleased(MouseEvent e) {
    		int mouseX = e.getX();
        	int mouseY = e.getY();
        	keyboardInputLast = false;
        	// System.out.println("released");
        	// System.out.println(mouseDragStart);
            Element releasedElement = checkLocation(mouseX, mouseY);
            if (releasedElement != null) {
            	// System.out.println(releasedElement.getName());
            	if (releasedElement.getName() == mouseDragStart && currentMouseDragging == true) {
            		if (mouseDragCurrent != null) {
                		getElementFromName(mouseDragCurrent).deanimateClick(false);
                		mouseDragCurrent = null;
                	}
            		Element element = getElementFromName(selectedElement);
            		if (element != null) {
	            		if (releasedElement.getName().equals("Edit"+ selectedElement + "Button")) {
	            			confirmElement(element);
	            			element.getSelector().setUnselected();
	                		selectedElement = null;
	            		} else {
	            			cancelElement(element);
	                		element.getSelector().setUnselected();
	                		selectedElement = null;
	            		}
            		} else {
            			String functionToRun = releasedElement.getFunction();
                        boolean ranFunction = Functions.runFunction(functionToRun);
                        if (!ranFunction) {
                        	System.out.println("ERROR: DID NOT RUN ANY FUNCTION FOR \nElement Name: " + releasedElement.getName() + 
                        			"\nwhich is a \nRenderable: " + releasedElement.isRenderable() + "\nTextbox: " + releasedElement.isTextbox());
                    	}
            		}
                } 
        	} else {
            	// Clicked on nothing.
        		Element element = getElementFromName(selectedElement);
        		if (element != null) {
        			cancelElement(element);
        			element.getSelector().setUnselected();
        			selectedElement = null;
        		}
            }
            currentMouseDragging = false;
    	
        }
    };
    
    private static MouseMotionAdapter mouseMotionAdapter = new MouseMotionAdapter() {
        @Override
        public void mouseMoved(MouseEvent e) {
            // Handle the mouse move event
        	int mouseX = e.getX();
        	int mouseY = e.getY();
            //System.out.println("Mouse moved to (" + mouseX + ", " + mouseY +  ")");  
        	
        	Element hoveredElement = checkLocation(mouseX, mouseY);
            
        	if (hoveredElement != null) {
        		keyboardInputLast = false;
        		String nameOfHoveredElement = hoveredElement.getName();
        		selected = scaledMenu.resetSelectors(getElementFromName(nameOfHoveredElement).getSelectorIndex(), selected, getCurrentPopupIndex());
                if (lastHovered == nameOfHoveredElement) {
                	// Do nothing, nothing has changed.
                } else {
                	if (nameOfHoveredElement != null){
                		getElementFromName(nameOfHoveredElement).animateHover();
                	}
                	if (lastHovered != null) {
                		getElementFromName(lastHovered).deanimateHover(false);
//                		Element lastElementHovered = getElementFromName(lastHovered);
//                		if (lastElementHovered != null) {`
//                			lastElementHovered.deanimateHover();
//                		}
                	}
                	// System.out.println("no longer hovering: " + lastHovered);
                	// System.out.println("hovering: " + nameOfHoveredElement);
                	
                }
                lastHovered = nameOfHoveredElement; 
        	} else {
        		if (keyboardInputLast == false) {
	        		selected = scaledMenu.resetSelectors(false, getCurrentPopupIndex());
	        		if (lastHovered == null) {
	        			// Do nothing, nothing has changed.
	        		} else {
	                	if (lastHovered != null) {
	                		Element toDeanimate = getElementFromName(lastHovered);
	                		if (toDeanimate != null) {
	                			toDeanimate.deanimateHover(false);
	                		}
	                	}
	        			// System.out.println("no longer hovering: " + lastHovered);
	                	// System.out.println("hovering: " + null);
	            		lastHovered = null;	
	        		}
        		}
        	}
        }
        
        @Override
        public void mouseDragged(MouseEvent e) {
        	int mouseX = e.getX();
        	int mouseY = e.getY();
        	// System.out.println("dragged");
        	keyboardInputLast = false;
            Element clickedElement = checkLocation(mouseX, mouseY);
            String nameOfDraggedElement;
            if (clickedElement == null) {
            	nameOfDraggedElement = null;
            } else {
            	nameOfDraggedElement = clickedElement.getName();
            }
            if (!currentMouseDragging) {
            	
            	currentMouseDragging = true;
            	mouseDragStart = nameOfDraggedElement;
            }
            if (mouseDragStart == nameOfDraggedElement && !(mouseDragCurrent == nameOfDraggedElement)) {
            	if ((clickedElement != null && selectedElement == null) || clickedElement.equals(selectedElement)){
            		if (clickedElement.getClickEffectIndex() != -1) {
                		getElementFromName(nameOfDraggedElement).animateClick(false);
                	}
            	}
            }
            if (mouseDragCurrent == nameOfDraggedElement) {
            	// DO NOTHING
            } else {
            	if (mouseDragCurrent != null && mouseDragStart == mouseDragCurrent) {
            		// System.out.println("deanimate");
            		getElementFromName(mouseDragCurrent).deanimateClick(false);
            	}
            	mouseDragCurrent = nameOfDraggedElement;
            }
        }
    };
    
    public void keyPressed(KeyEvent e) {
    	if (!transitioning && !popupUpdate) {
    		int rawKeyCode = e.getKeyCode();
            // System.out.println(rawKeyCode);
            int keyCode = -1;
            boolean foundKey = false;
            for (Controls control : config.getControls()) {
            	for (int customKey : control.getNewKeyCodes())
            	if (customKey == rawKeyCode) {
            		keyCode = control.getOriginalKeyCode();
            		foundKey = true;
            		break;
            	}
            	if (foundKey) {
            		break;
            	}
            }
            
            if (selectedElement != null) { 
            	// override if there is a selected element
            	// also ignore keybinds; use vanilla.
            	String keyPressedName = KeyEvent.getKeyText(rawKeyCode);
            	// System.out.println(keyPressedName);
        		Element element = getElementFromName(selectedElement);
        		if (keyPressedName == "Enter") {
        			confirmElement(element);
        			element.setUnselected();
        			element.animateClick(true);
        			selectedElement = null;
        		}
        		else if (keyPressedName.equals("Left")) {
        			element.getTextfield().incrementSelector(false);
        		} 
        		else if (keyPressedName.equals("Right")) {
        			element.getTextfield().incrementSelector(true);
        		} 
        		else if (keyPressedName.equals("Backspace")) {
        			element.getTextfield().delChar(true);
        		} 
        		else if (keyPressedName.equals("Delete")) {
        			element.getTextfield().delChar(false);
        		}
        		else if (keyPressedName.equals("Escape")) {
        			cancelElement(element);
        			element.setUnselected();
        			selectedElement = null;
        		}
        		// Characters are handled at keyTyped();
        	}
            
            else if (foundKey) {
            	String hotkeyPressed = KeyEvent.getKeyText(keyCode);
            		
	                if (hotkeyPressed.equals("Enter")
	                		|| hotkeyPressed.equals("Up")
	                		|| hotkeyPressed.equals("Down")
	                		|| hotkeyPressed.equals("Left")
	                		|| hotkeyPressed.equals("Right")
	                		) { // arrow keys real keycodes
	                	keyboardInputLast = true;
	                	Element[] tempElementsList = (getCurrentPopupIndex() == -1) ?
	    	        			scaledMenu.getElements() : scaledMenu.getPopup(getCurrentPopupIndex()).getElements();
	                	int[][] directionalOptions = new int[4][2];
	                	boolean found = false;
	                	Element element = null;
	                	Element elementToDeanimate = null; 
	                	// Used so that switching from the same element to itself 
	                	// doesn't cause deanimate; it only deanimates when it is
	                	// a new element being switched to.
	                	for (int i = 0 ; i < selectionsList.length; i++) {
	                		if (selectionsList[i].getSelectorIndex()[0] == selected[0] && selectionsList[i].getSelectorIndex()[1] == selected[1] &&
	                				selectionsList[i].getSelectorIndex()[0] + selectionsList[i].getSelectorIndex()[1] > -1) {
	                			directionalOptions = selectionsList[i].getSelectorOptions();
	                			// retrieves directional options from the currently selected item
	                			element = tempElementsList[i];
	                			elementToDeanimate = element;
	                			found = true;
	                			break;
	                		}
	                	}
	                	
	                	if (!found) { // set the selected to 0 instead if not currently selecting a valid item (like if currently on -1,-1)
	                		selected = scaledMenu.resetSelectors(true, getCurrentPopupIndex());
	                		for (int i = 0 ; i < selectionsList.length; i++) {
	                    		if (selectionsList[i].getSelectorIndex()[0] == selected[0] && selectionsList[i].getSelectorIndex()[1] == selected[1] &&
	                    				selectionsList[i].getSelectorIndex()[0] + selectionsList[i].getSelectorIndex()[1] > -1) {
	                    			element = tempElementsList[i];
	                    			element.animateHover();
	                    			lastHovered = element.getName();
	                    			break;
	                    		}
	                    	}
	                	} else {
	                		
	                		if (hotkeyPressed == "Enter") {
	                			element.animateClick(true);
	                			String functionToRun = element.getFunction();
	                			boolean ranFunction = Functions.runFunction(functionToRun);
	                			if (!ranFunction) {
	                          	System.out.println("ERROR: DID NOT RUN ANY FUNCTION FOR \nElement Name: " + element.getName() + 
	                          			"\nwhich is a \nRenderable: " + element.isRenderable() + "\nTextbox: " + element.isTextbox());
	                			}
	                		} else {
	                			if (hotkeyPressed == "Right") {
	        			        	selected = scaledMenu.resetSelectors(directionalOptions[0], selected, getCurrentPopupIndex());
	        			            } else if (hotkeyPressed == "Down") {
	        			            	selected = scaledMenu.resetSelectors(directionalOptions[1], selected, getCurrentPopupIndex());
	        			            } else if (hotkeyPressed == "Left") {
	        			            	selected = scaledMenu.resetSelectors(directionalOptions[2], selected, getCurrentPopupIndex());
	        	                    } else if (hotkeyPressed == "Up") {
	        	                    	selected = scaledMenu.resetSelectors(directionalOptions[3], selected, getCurrentPopupIndex());
	                            }
	                			for (int i = 0 ; i < selectionsList.length; i++) {
	                        		if (selectionsList[i].getSelectorIndex()[0] == selected[0] && selectionsList[i].getSelectorIndex()[1] == selected[1]) {
	                        			element = tempElementsList[i];
	                        			if (element.equals(elementToDeanimate)){
	                        				// Do nothing, no change in element.
	                        			} else {
	                        				elementToDeanimate.deanimateHover(false);
	                        				element.animateHover();
	                        				lastHovered = element.getName();
	                        			}
	                        			break;
	                        		}
	                        	}
	                		}
	                	}
	                } 
	                
	                else if (hotkeyPressed == "Escape") {
	                	if (popupIndexes.length != 0) {
	                		removePopup(popupIndexes[popupIndexes.length - 1]);
	                	} else {
	                		String functionToRun = "escapeMenu";
	                		Functions.runFunction(functionToRun);
	                	}
	                }
            	
            	
            	String keyText = KeyEvent.getKeyText(rawKeyCode);
                System.out.println("Bound Key Pressed: " + hotkeyPressed);
                System.out.println("Raw Key Pressed: " + keyText);
                
                
            } else {
            	String keyText = KeyEvent.getKeyText(rawKeyCode);
            	System.out.println("Unbound Key Pressed: " + keyText);
            }
    	}
    }

    public void keyReleased(KeyEvent e) {
    	if (!transitioning && !popupUpdate) {
    		
    	}
        // Do nothing
    }

    public void keyTyped(KeyEvent e) {
    	if (!transitioning && !popupUpdate) {
    		if (selectedElement != null) {
        		Element element = getElementFromName(selectedElement);
        		// System.out.println(e.getKeyChar());
        		if (!e.isActionKey() && isAlphaNumeric(e.getKeyChar())) {
        			element.getTextfield().inputChar(e.getKeyChar());
        		}
        	}
    	}
        // Do nothing
    }
    
    
    
    /*
    setNewFrameSize --> calculateNewScreenDimensions
    NOW SEPARATED
     repaintPanel <-- updateFrame --> refreshElements <-- screenDimensions variables
     updateFrame calls refreshElements first which updates the elements list to latest info and then calls repaint.
     
     To add tweening consider choosing to put it in between updateFrame and refreshElements.
     
     rawCurrentMenu --> elementsToRender --> .repaint()
    */
    
    public ShowImage() {
        setLayout(new BorderLayout()); // Set the main panel's layout to BorderLayout

        // Add mouse listener to the panel
        if(config.getCursorEnabled()) {
        	addMouseListener(mouseListener);
            addMouseMotionListener(mouseMotionAdapter);
        }

        // Add key listener to the panel
        setFocusable(true);
        addKeyListener(this);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON                    
                );
        float opacityMulti = 0;
        
        for (int iter = -1 ; iter < popupIndexes.length; iter++) {
        	Element[] toRender = null;
        	if (iter == -1) {
        		toRender = scaledMenu.getElements();
        		opacityMulti = 1;
        	} else {
            	toRender = scaledMenu.getPopup(popupIndexes[iter]).getElements();
            	Graphics2D g2d = (Graphics2D) g.create();
    	        g2d.setRenderingHints(rh);
    	        Rectangle rect = new Rectangle(0,0,calculatedScreenWidth,calculatedScreenHeight);
    	        g2d.setColor(new Color(0,0,0,255));
    	        opacityMulti = (iter == popupIndexes.length - 1) ? 
    	        		( fadeOutPopup == -1 ? (float) Math.max(Math.min(((Framerate.getCurrentTime() - popupTime) / (config.getTransitionTime() * (45f/ 100f))),1f),0f)
    	        				: (float) Math.max(Math.min(1 -((Framerate.getCurrentTime() - popupTime) / (config.getTransitionTime() * (45f / 100f))),1f),0f))
    	        		: 1f;
    	        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f * opacityMulti));
    	        g2d.fill(rect);
    	        g2d.dispose();
        	}
        	
        	Element renderLast = null;
        	
        	for (int i = 0; i < toRender.length; i++) {
    	        Element currentElement = toRender[i];
    	        
    	        Graphics2D g2d = (Graphics2D) g.create();
    	        g2d.setRenderingHints(rh);
    	        
    	        if (currentElement.getSelectorIndex()[0] == selected[0] &&
    	        		currentElement.getSelectorIndex()[1] == selected[1] &&
    	        		currentElement.getHoverOverlap() == true &&
    	        		iter == popupIndexes.length - 1 // only sets renderlast on the topmost popup
    	        		) {
    	        	renderLast = currentElement;
    	        }
    	        
    	        renderElement(currentElement, g2d, opacityMulti);
    	        
            }
        	
        	if (renderLast != null) {
        		
        		Graphics2D g2d = (Graphics2D) g.create();
    	        g2d.setRenderingHints(rh);
    	        
        		renderElement(renderLast, g2d, opacityMulti);
        	}
        	
        }
        
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHints(rh);
     // Draw Menu Title Box
        g2d.setClip(getBoxAttributes(new RoundedArea(0, 0, calculatedScreenWidth, calculatedScreenHeight, 0)).getArea());
        g2d.setColor(config.getCurrentThemeColors()[1]);
        int x2Points[] = {
        		calculatedScreenWidth * 30 / 100,
        		calculatedScreenWidth * 34 / 100,
        		calculatedScreenWidth * 66 / 100,
        		calculatedScreenWidth * 70 / 100
        		};
        int y2Points[] = {
        		calculatedScreenHeight * 0 / 100, 
        		calculatedScreenHeight * 10 / 100, 
        		calculatedScreenHeight * 10 / 100, 
        		calculatedScreenHeight * 0 / 100
        		};
        GeneralPath polyline = 
                new GeneralPath(GeneralPath.WIND_EVEN_ODD, x2Points.length);

        polyline.moveTo (x2Points[0], y2Points[0]);

        for (int index = 1; index < x2Points.length; index++) {
                 polyline.lineTo(x2Points[index], y2Points[index]);
        };
        
        g2d.setColor(config.getCurrentThemeColors()[1]);
        g2d.fill(polyline);
        
        float thickness = 5 * (float) scale;
        g2d.setColor(config.getCurrentThemeColors()[6]);
        g2d.setStroke(new BasicStroke(thickness));
        g2d.draw(polyline);
        
    	TextBox titletextbox = new TextBox(
        		// TextBox with Text
    			1f, // scale 
				"", // function
				"",  // name
				new Text(popupIndexes.length < 1 ? scaledMenu.getMenuDisplayName() : scaledMenu.getPopup(popupIndexes[popupIndexes.length - 1]).getPopupTitle(),
						"center", "center", // align
						calculatedScreenWidth * 50 / 100, calculatedScreenHeight * 15 / 400, // text offset (x, y)
						(int) (75 * scale), // text size
						6, // text color (index of colors)
						"Archivo Narrow", // font
						true // bold
						), // text
				new RoundedArea(0,0,0,0,0),  // x, y, xSize, ySize
				1, // box color (index of colors)
				0, // opacity (0-255)
				0, // shadowOffset
				0, 0 // strokeWidth, strokeColor
        		);
    	
    	Font font = new Font(titletextbox.getFont(), titletextbox.getBold() ? Font.BOLD:Font.PLAIN , titletextbox.getTextSize());
    	g2d.setFont(font);
    	
    	FontMetrics fontMetrics = g2d.getFontMetrics();
    	
        int[] extraAligns = getTextAligns(titletextbox, fontMetrics, titletextbox.getText());
        
        int extraAlignX = extraAligns[0];
        int extraAlignY = extraAligns[1];
        
        int finalX = titletextbox.getOffsetX() + extraAlignX;
        int finalY = titletextbox.getOffsetY() + extraAlignY;
        g2d.drawString(titletextbox.getText(), finalX, finalY);
        
        // Draw Masks
        
    	if (config.DEBUG_drawMasks()){
    		RoundedArea[] drawMasks = scaledMenu.getMasks();
        	for (int i = 0 ; i < drawMasks.length ; i++) {
        		RoundedRect maskAttributes = getBoxAttributes(scaledMenu.getMasks()[i]);
	        	
	        	RoundRectangle2D maskBounds = new RoundRectangle2D.Double(
	        			maskAttributes.getX(), 
	        			maskAttributes.getY(), 
	        			maskAttributes.getXSize(), 
	        			maskAttributes.getYSize(), 
	        			maskAttributes.getRound(), 
	        			maskAttributes.getRound());
	        	
	        	float hue = (i + config.DEBUG_masksColorsOffset()) * 0.15f;
    			float saturation = 0.8f;
    			float brightness = 1f;
    			Color color = Color.getHSBColor(hue, saturation, brightness);
    			Color finalColor = new Color(color.getRed(),color.getGreen(),color.getBlue(),config.DEBUG_masksOpacity());
	        	g2d.setColor(finalColor);
	        	g2d.fill(maskBounds);
        	}
        }
    	
    	if (transitioning) {
    		double transitionProgress = Math.max(Math.min((Framerate.getCurrentTime() - transitionTime) / config.getTransitionTime(),255),0);
    		double transitionCompleteProgress = 1 - transitionProgress;
    		g2d.setColor(new Color(0,0,0,
    				Framerate.getCurrentTime() - transitionTime < (config.getTransitionTime() / 2) ?
					Math.max(Math.min((int)(transitionProgress * 255f * (100f / 45f)),255),0): 
						Math.max(Math.min((int)(transitionCompleteProgress * 255f * (100f / 45f)),255),0)
    					));
    		g2d.fill(new Rectangle(0,0,calculatedScreenWidth,calculatedScreenHeight));
    	}
    }
    
    private int[] getTextAligns(TextBox textbox, FontMetrics fontMetrics, String text){ 	
    	int textWidth = fontMetrics.stringWidth(text);
        int textHeight = fontMetrics.getAscent();
        // Initializes extraAlign variables
        int extraAlignX;
        int extraAlignY;
        // uses the align text settings to determing whether to use the fontMetrics for extraAlignX.
        if (textbox.getAlignX() == "right") {
        	extraAlignX = - textWidth;
        } else if (textbox.getAlignX() == "center") {
        	extraAlignX = - textWidth / 2;
        } else { // cases of left, and everything else
        	extraAlignX = 0;
        }
        // same, but for up and down (extraAlignY).
        if (textbox.getAlignY() == "bottom") {
        	extraAlignY = textHeight;
        } else if (textbox.getAlignY() == "center") {
        	extraAlignY = textHeight / 2;
        } else { // cases of up, and everything else
        	extraAlignY = 0;
        }
        int[] alignReturns = new int[] {extraAlignX, extraAlignY};
    	return alignReturns;
    }
    
    private int[] getTextAligns(TextField textfield, FontMetrics fontMetrics){
    	Text textObject = textfield.getTextObject();
    	
    	int textWidth = fontMetrics.stringWidth(textfield.getCurrentDisplay());
        int textHeight = fontMetrics.getAscent();
        
        int selectorOffset = textWidth - 
        		fontMetrics.stringWidth
        		(textfield.getCurrentDisplay()
        				.substring(
        						textfield.getSelectorLocation(),
        						textfield.getCurrentDisplay().length()
        						));
        // Initializes extraAlign variables
        int extraAlignX;
        int extraAlignY;
        // uses the align text settings to determing whether to use the fontMetrics for extraAlignX.
        if (textObject.getAlignX() == "right") {
        	extraAlignX = - textWidth;
        } else if (textObject.getAlignX() == "center") {
        	extraAlignX = - textWidth / 2;
        } else { // cases of left, and everything else
        	extraAlignX = 0;
        }
        // same, but for up and down (extraAlignY).
        if (textObject.getAlignY() == "bottom") {
        	extraAlignY = textHeight;
        } else if (textObject.getAlignY() == "center") {
        	extraAlignY = textHeight / 2;
        } else { // cases of up, and everything else
        	extraAlignY = 0;
        }
        int[] alignReturns = new int[] {extraAlignX, extraAlignY, selectorOffset};
    	return alignReturns;
    }
    
    public void renderElement(Element currentElement, Graphics2D g2d, float opacityMulti) {
    	if (currentElement.isTextbox()) {
        	
        	TextBox textbox = currentElement.getTextbox();
        	
        	int maskIndex = currentElement.getMaskIndex();
        	
        	if (maskIndex == -1 || scaledMenu.getMasks().length == 0) {
        		Rectangle fullscreenSize = new Rectangle(0, 0, calculatedScreenWidth, calculatedScreenHeight);
        		Area noMask = new Area(fullscreenSize);
        		g2d.setClip(noMask);
        	} else {
	        	g2d.setClip(getBoxAttributes(scaledMenu.getMasks()[maskIndex]).getArea());
        	}
    		
        	RoundedRect roundRectAttributes = getBoxAttributes(textbox.getRectShape());
        	
        	RoundRectangle2D roundRect = new RoundRectangle2D.Double(
        			roundRectAttributes.getX(),
        			roundRectAttributes.getY(),
        			roundRectAttributes.getXSize(),
        			roundRectAttributes.getYSize(),
        			roundRectAttributes.getRound(),
        			roundRectAttributes.getRound()
        			);
        	
        	Shape finalRect = roundRect;
        	
        	for (int k = currentElement.getTransform().length - 1 ; k > -1 ; k--) {
        		if (currentElement.getTransform()[k].getNewTransform() != null) {
	        		finalRect = currentElement.getTransform()[k].getCurrentPosition().getFinalTransform().createTransformedShape(finalRect);
	        	}
        	}
        
        	// grabs the SpecialTransform which grabs the AffineTransform to create a new shape from the transform
        	// of roundRect;
        	
        	if (textbox.getShadowOffset() != 0) { // fills a drop shadow on command
        		AffineTransform shadow = new AffineTransform();
        		shadow.translate(textbox.getShadowOffset(), textbox.getShadowOffset());
        		Shape shadowRect = shadow.createTransformedShape(finalRect);
            	g2d.setColor(new Color(0, 0, 0, 100));
            	
            	g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f * opacityMulti));
            	g2d.fill(shadowRect);
            }
        	
        	g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacityMulti));
            
            float thickness = textbox.getStrokeWidth();
            g2d.setStroke(new BasicStroke(thickness));
            
            g2d.setColor(config.getCurrentThemeColors()[textbox.getColor()]); // set box color
            g2d.fill(finalRect);
            g2d.setColor(config.getCurrentThemeColors()[textbox.getStrokeColor()]);
            g2d.draw(finalRect);
            
            g2d.setStroke(new BasicStroke(0));
            
            // ^ Textbox section
            // v Text / Image section
            AffineTransform oldForm = g2d.getTransform();
        	
            if (textbox.getRenderableObject() != null) { // render image if contained
            	for (int k = currentElement.getTransform().length - 1 ; k > -1 ; k--) {
            		if (currentElement.getTransform()[k].getNewTransform() != null) {
            			g2d.transform(currentElement.getTransform()[k].getCurrentPosition().getFinalTransform());
    	        	}
            	}
            	Renderable renderable = textbox.getRenderableObject();
            	BufferedImage image = renderable.getImage();
            	g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacityMulti * ((float) renderable.getOpacity())/255));
            	g2d.drawImage(image, textbox.getX() + renderable.getX(), textbox.getY() + renderable.getY(), null);
            	g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacityMulti));
            	// Reset the composite after using it
            	g2d.setTransform(oldForm);
            } 
            
            if (textbox.getText() != null){ // render text if contained
            	// g2d.translate(-textbox.getOffsetX(), -textbox.getOffsetY());
                for (int k = currentElement.getTransform().length - 1 ; k > -1 ; k--) {
            		if (currentElement.getTransform()[k].getNewTransform() != null) {
            			g2d.transform(currentElement.getTransform()[k].getCurrentPosition().getFinalTransform());
    	        	}
            	}
                // g2d.translate(textbox.getOffsetX(), textbox.getOffsetY());
            	
            	g2d.setColor(config.getCurrentThemeColors()[textbox.getTextColor()]); // set text color
	            
	            Font font;
	            
            	font = new Font(textbox.getFont(), textbox.getBold() ? Font.BOLD:Font.PLAIN, textbox.getTextSize());
            	g2d.setFont(font);
	            // Below code grabs the size of the text using the string to be entered
	            FontMetrics fontMetrics = g2d.getFontMetrics();
	            String text = textbox.getText().substring(0, 1).equals("%") ? 
	        			(String) config.getVariable(textbox.getText()) :
	        			textbox.getText();
	            
	            String[] splitText = text.split("%br%");
	            for (int i = 0 ; i < splitText.length ; i++) {
	            	String lineText = splitText[i];
	            	int[] extraAligns = getTextAligns(textbox, fontMetrics, lineText);
		            
		            int extraAlignX = extraAligns[0];
		            int extraAlignY = extraAligns[1];
		            
		            int finalX = roundRectAttributes.getX() + (textbox.getXSize() / 2) + textbox.getOffsetX() + extraAlignX;
		            int finalY = roundRectAttributes.getY() + (textbox.getYSize() / 2) + textbox.getOffsetY() + extraAlignY;
		            finalY = finalY + (fontMetrics.getAscent() * i);
		            g2d.drawString(lineText, finalX, finalY);
	            }
	            
	            g2d.setTransform(oldForm);
            }

        } else if (currentElement.isTextfield()) {
        	TextField textfield = currentElement.getTextfield();
        	
        	int maskIndex = currentElement.getMaskIndex();
        	
        	if (maskIndex == -1 || scaledMenu.getMasks().length == 0) {
        		Rectangle fullscreenSize = new Rectangle(0, 0, calculatedScreenWidth, calculatedScreenHeight);
        		Area noMask = new Area(fullscreenSize);
        		g2d.setClip(noMask);
        	} else {
	        	g2d.setClip(getBoxAttributes(scaledMenu.getMasks()[maskIndex]).getArea());
        	}
    		
        	RoundedRect roundRectAttributes = getBoxAttributes(textfield.getRectShape());
        	
        	RoundRectangle2D roundRect = new RoundRectangle2D.Double(
        			roundRectAttributes.getX(),
        			roundRectAttributes.getY(),
        			roundRectAttributes.getXSize(),
        			roundRectAttributes.getYSize(),
        			roundRectAttributes.getRound(),
        			roundRectAttributes.getRound()
        			);
        	
        	Shape finalRect = roundRect;
        	
        	for (int k = currentElement.getTransform().length - 1 ; k > -1 ; k--) {
        		if (currentElement.getTransform()[k].getNewTransform() != null) {
	        		finalRect = currentElement.getTransform()[k].getCurrentPosition().getFinalTransform().createTransformedShape(finalRect);
	        	}
        	}
        
        	// grabs the SpecialTransform which grabs the AffineTransform to create a new shape from the transform
        	// of roundRect;
        	
        	if (textfield.getShadowOffset() != 0) { // fills a drop shadow on command
        		AffineTransform shadow = new AffineTransform();
        		shadow.translate(textfield.getShadowOffset(), textfield.getShadowOffset());
        		Shape shadowRect = shadow.createTransformedShape(finalRect);
            	g2d.setColor(new Color(0, 0, 0, 100));
            	
            	g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f * opacityMulti));
            	g2d.fill(shadowRect);
            }
        	
        	g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacityMulti));
            
            float thickness = textfield.getStrokeWidth();
            g2d.setStroke(new BasicStroke(thickness));
            
            g2d.setColor(config.getCurrentThemeColors()[textfield.getColor()]); // set box color
            g2d.fill(finalRect);
            g2d.setColor(config.getCurrentThemeColors()[textfield.getStrokeColor()]);
            g2d.draw(finalRect);
            
            g2d.setStroke(new BasicStroke(0));
            
            // ^ Textbox section
            // v Text / Image section
        	
        	Text textObject = textfield.getTextObject();
        	RoundedArea area = textfield.getRectShape();
        	
        	// g2d.translate(-textObject.getOffsetX(), -textObject.getOffsetY());
            for (int k = currentElement.getTransform().length - 1 ; k > -1 ; k--) {
        		if (currentElement.getTransform()[k].getNewTransform() != null) {
        			g2d.transform(currentElement.getTransform()[k].getCurrentPosition().getFinalTransform());
	        	}
        	}
            // g2d.translate(textObject.getOffsetX(), textObject.getOffsetY());
            	
        	g2d.setColor(config.getCurrentThemeColors()[textObject.getTextColor()]); // set text color
            
            Font font;
            
        	font = new Font(textObject.getFont(), textObject.getBold() ? Font.BOLD:Font.PLAIN, textObject.getTextSize());
        	g2d.setFont(font);
            // Below code grabs the size of the text using the string to be entered
            FontMetrics fontMetrics = g2d.getFontMetrics();
            
            int[] extraAligns = getTextAligns(textfield, fontMetrics);
            
            int extraAlignX = extraAligns[0];
            int extraAlignY = extraAligns[1];
            
            int finalX = roundRectAttributes.getX() + (area.getXSize() / 2) + textObject.getOffsetX() + extraAlignX;
            int finalY = roundRectAttributes.getY() + (area.getYSize() / 2) + textObject.getOffsetY() + extraAlignY;
            g2d.drawString(textfield.getCurrentDisplay(), finalX, finalY);
            g2d.setColor(config.getCurrentThemeColors()[5]);
            if (currentElement.getSelector().isSelected()) {
            	double pointerTime = currentElement.getTextfield().getPointerTime();
            	g2d.drawString((Framerate.getCurrentTime() - pointerTime)  % 1000 < 500 ? "|" : "", finalX + extraAligns[2] - (int)(textObject.getTextSize() * 0.1),
            		finalY - (int)(textObject.getTextSize() * 0.1));
            }
    	
    	} else if (currentElement.isRenderable()) {
        	
            Renderable renderable = currentElement.getRenderable();
            BufferedImage image = renderable.getImage();
            
            int maskIndex = currentElement.getMaskIndex();
        	
        	if (maskIndex == -1 || scaledMenu.getMasks().length == 0) {
        		Rectangle fullscreenSize = new Rectangle(0, 0, calculatedScreenWidth, calculatedScreenHeight);
        		Area noMask = new Area(fullscreenSize);
        		g2d.setClip(noMask);
        	} else {
	        	g2d.setClip(getBoxAttributes(scaledMenu.getMasks()[maskIndex]).getArea());
        	}
            
            for (int k = currentElement.getTransform().length - 1 ; k > -1 ; k--) {
        		if (currentElement.getTransform()[k].getNewTransform() != null) {
        			g2d.transform(currentElement.getTransform()[k].getCurrentPosition().getFinalTransform());
	        	}
        	}
            
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacityMulti * ((float) renderable.getOpacity())/255));

            g2d.drawImage(image, renderable.getX(), renderable.getY(), null);
            g2d.dispose();
            
        } else if (currentElement.isOptionsList()) {
        	// does not render
        }
        
        
        else {
    		System.out.println("Fatal Error: currentElement to render is not renderable or textbox.");
    		System.out.println(currentElement);
    	}
        g2d.dispose();
    }
    

    public static Element checkLocation(int mouseX, int mouseY) {
    	if (!transitionBlackOut && !popupUpdate) {
    		Element currentBox = null;
        	
    		Element[] elementsToCheck;
    		if (popupIndexes.length > 0) {
    			// System.out.println(popupIndexes[popupIndexes.length - 1]);
    			elementsToCheck = scaledMenu.getPopup(popupIndexes[popupIndexes.length - 1]).getElements();
    		} else {
    			elementsToCheck = scaledMenu.getElements();
    		}
            for (int i = elementsToCheck.length - 1 ; i > -1 ; i--) {
                Element currentElement = elementsToCheck[i];
                
            	if (currentElement.isTextbox()) {
                	TextBox textbox = currentElement.getTextbox();
    	            RoundedRect roundRectAttributes = getStrokedBoxAttributes(textbox);
    	            // stroked box returns the round rectangle for the box including the surrounding stroke, giving the right hitbox
    	            Rectangle bounds = new Rectangle();
    	            
    	            int x = roundRectAttributes.getX();
    	        	int y = roundRectAttributes.getY();
    	        	int xSize = roundRectAttributes.getXSize();
    	        	int ySize = roundRectAttributes.getYSize();
    	        	int round = roundRectAttributes.getRound();
    	        	
    	        	RoundRectangle2D roundRect = new RoundRectangle2D.Double(x, y, xSize, ySize, round, round);
    	        	
            		Shape finalRect = roundRect;
    	        	
    	        	for (int k = currentElement.getTransform().length - 1 ; k > -1 ; k--) {
    	        		if (currentElement.getTransform()[k].getNewTransform() != null) {
    		        		finalRect = currentElement.getTransform()[k].getCurrentPosition().getFinalTransform().createTransformedShape(finalRect);
    		        	}
    	        	}
    	        	
    	        	Area buttonArea = new Area(finalRect);
    	        	
            		int maskIndex = currentElement.getMaskIndex();
    	        	
    	        	if (maskIndex == -1) {
    	        		// No mask
    	        	} else {
    	        		
            			RoundedRect strokeInclusiveAttributes = getBoxAttributes(scaledMenu.getMasks()[maskIndex]);
    		        	
    		        	RoundRectangle2D maskBounds = new RoundRectangle2D.Double(
    		        			strokeInclusiveAttributes.getX(), 
    		        			strokeInclusiveAttributes.getY(), 
    		        			strokeInclusiveAttributes.getXSize(), 
    		        			strokeInclusiveAttributes.getYSize(), 
    		        			strokeInclusiveAttributes.getRound(), 
    		        			strokeInclusiveAttributes.getRound());
    		        	
    		        	Area mask = new Area(maskBounds);
    		        	
    		        	buttonArea.intersect(mask);
    	        	}
    	            
    	            if (textbox.getRenderableObject() != null) {
    	            	Renderable renderable = textbox.getRenderableObject();
    	            	BufferedImage image = renderable.getImage();
    	            	bounds = new Rectangle(renderable.getX() + x, renderable.getY() + y, image.getWidth(), image.getHeight());
    	            }
    	            if ((buttonArea.contains(mouseX, mouseY) && textbox.getOpacity() != 0) ||
    	            	(bounds.contains(mouseX, mouseY) && textbox.getRenderableObject().getOpacity() != 0 && textbox.getRenderableObject() != null)
    	            		) { // sets the current hovered box as this if either its renderable (if there is one) or its shape is hovered AND not invisible
    	            	if (currentElement.getSelectorIndex()[0] + currentElement.getSelectorIndex()[1] > -1) {
    	            		currentBox = currentElement; 
    	            	} else {
    	            		currentBox = null;
    	            	}
    	                break;
    	                // does not break so that the element which is highest in the hierarchy
    	                // can be selected instead of the first (which would be more background items)
    	                // break;
    	            }
                } else if (currentElement.isTextfield()) {
	            	TextField textfield = currentElement.getTextfield();
		            RoundedRect roundRectAttributes = getStrokedBoxAttributes(textfield);
		            // stroked box returns the round rectangle for the box including the surrounding stroke, giving the right hitbox
		            
		            int x = roundRectAttributes.getX();
		        	int y = roundRectAttributes.getY();
		        	int xSize = roundRectAttributes.getXSize();
		        	int ySize = roundRectAttributes.getYSize();
		        	int round = roundRectAttributes.getRound();
		        	
		        	RoundRectangle2D roundRect = new RoundRectangle2D.Double(x, y, xSize, ySize, round, round);
		        	
	        		Shape finalRect = roundRect;
		        	
		        	for (int k = currentElement.getTransform().length - 1 ; k > -1 ; k--) {
		        		if (currentElement.getTransform()[k].getNewTransform() != null) {
			        		finalRect = currentElement.getTransform()[k].getCurrentPosition().getFinalTransform().createTransformedShape(finalRect);
			        	}
		        	}
		        	
		        	Area buttonArea = new Area(finalRect);
		        	
	        		int maskIndex = currentElement.getMaskIndex();
		        	
		        	if (maskIndex == -1) {
		        		// No mask
		        	} else {
		        		
	        			RoundedRect strokeInclusiveAttributes = getBoxAttributes(scaledMenu.getMasks()[maskIndex]);
			        	
			        	RoundRectangle2D maskBounds = new RoundRectangle2D.Double(
			        			strokeInclusiveAttributes.getX(), 
			        			strokeInclusiveAttributes.getY(), 
			        			strokeInclusiveAttributes.getXSize(), 
			        			strokeInclusiveAttributes.getYSize(), 
			        			strokeInclusiveAttributes.getRound(), 
			        			strokeInclusiveAttributes.getRound());
			        	
			        	Area mask = new Area(maskBounds);
			        	
			        	buttonArea.intersect(mask);
		        	}
		        	
		            if (buttonArea.contains(mouseX, mouseY) && textfield.getOpacity() != 0) { 
		            	// sets the current hovered box as this if its shape is hovered AND not invisible
		            	if (currentElement.getSelectorIndex()[0] + currentElement.getSelectorIndex()[1] > -1) {
		            		currentBox = currentElement; 
		            	} else {
		            		currentBox = null;
		            	}
		                break;
		                // does not break so that the element which is highest in the hierarchy
		                // can be selected instead of the first (which would be more background items)
		                // break;
    	            }
	            } else if (currentElement.isRenderable()) {
                	// Check if the mouse click is within the boundaries of any image
                    Renderable renderable = currentElement.getRenderable();
                    BufferedImage image = renderable.getImage();

                    Rectangle bounds = new Rectangle(renderable.getX(), renderable.getY(), image.getWidth(), image.getHeight());

                    if (bounds.contains(mouseX, mouseY) && renderable.getOpacity() != 0) {
                    	if (currentElement.getSelectorIndex()[0] + currentElement.getSelectorIndex()[1] > -1) {
    	            		currentBox = currentElement; 
    	            	} else {
    	            		currentBox = null;
    	            	}
                    	break;
                    }
                }
                }
            return currentBox;
    	} else {
    		return null;
    	}
    }
    
    public static double intToDouble(int input) {
		double toReturn = input;
		return toReturn;
	}
    
    
    public static int getCurrentPopupIndex() {
    	if (popupIndexes.length > 0) {
			return (popupIndexes[popupIndexes.length - 1]);
		} else {
			return -1;
		}
    }
    
    public static Menu getCurrentScaledMenu() {
    	return scaledMenu;
    }

    
    private static Element getElementFromName(String name) { 
    	// get the box for the name given through the parameter
    	Element elementToReturn = null;
    	Element[] elementsToCheck;
    	
    	if (popupIndexes.length > 0) {
			elementsToCheck = scaledMenu.getPopup(popupIndexes[popupIndexes.length - 1]).getElements();
		} else {
			elementsToCheck = scaledMenu.getElements();
		}
    	
    	for (int i = 0; i < elementsToCheck.length; i++) {
    		Element currentElement = elementsToCheck[i];
    		if (currentElement.getName().equals(name)) {
    			elementToReturn = currentElement;
    			break;
    		}
    	}
    	
    	
    	return elementToReturn;
    }
    
    public static void scrollOptionsList(String listName, boolean down) {
    	Element optionsListElement = getElementFromName(listName);
    	OptionsList optionsList = optionsListElement.getOptionsList();
    	optionsList.incrementScrollPosition(down);
    	String matchingName = optionsListElement.getName();
    	Element[] tempElementsList = (getCurrentPopupIndex() == -1) ?
    			scaledMenu.getElements() : scaledMenu.getPopup(getCurrentPopupIndex()).getElements();
    	for (Element element : tempElementsList) {
			if (element.getName().split("#")[0].equals(matchingName)) {
    			element.animateScroll(optionsList.getScrollPosition() * optionsList.getOptionsMax());
			}
		}
	}
    
    private static RoundedRect getBoxAttributes(RoundedArea roundedArea) { 
    	// gets values to use for rendering the box not including stroke (added after) by converting roundpercentage to a useful number
    	int x = roundedArea.getX();
    	int y = roundedArea.getY();
    	int xSize = roundedArea.getXSize();
    	int ySize = roundedArea.getYSize();
    	int roundPercentage = roundedArea.getRoundPercentage();
    	int round;
    	if (xSize < ySize) {
    		round = xSize * roundPercentage / 100;
    	} else {
        	round = ySize * roundPercentage / 100;
    	}
    	RoundedRect attributesToReturn = new RoundedRect(x,y,xSize,ySize,round);
    	return attributesToReturn;
    }
    
    private static RoundedRect getStrokedBoxAttributes(TextBox textbox) { 
    	// gets hitboxes of the box by converting roundpercentage to a useful number, and accounting for stroke
    	int x = textbox.getX();
    	int y = textbox.getY();
    	int xSize = textbox.getXSize();
    	int ySize = textbox.getYSize();
    	float stroke = textbox.getStrokeWidth();
    	int roundPercentage = textbox.getRoundPercentage();
    	int round;
    	x = x - Math.round(stroke / 2);
    	y = y - Math.round(stroke / 2);
    	xSize = xSize + Math.round(stroke);
    	ySize = ySize + Math.round(stroke);
    	if (xSize < ySize) {
    		round = xSize * roundPercentage / 100;
    	} else {
        	round = ySize * roundPercentage / 100;
    	}
    	RoundedRect attributesToReturn = new RoundedRect(x,y,xSize,ySize,round);
    	return attributesToReturn;
    }
    
    private static RoundedRect getStrokedBoxAttributes(TextField textfield) { 
    	// gets hitboxes of the box by converting roundpercentage to a useful number, and accounting for stroke
    	int x = textfield.getX();
    	int y = textfield.getY();
    	int xSize = textfield.getXSize();
    	int ySize = textfield.getYSize();
    	float stroke = textfield.getStrokeWidth();
    	int roundPercentage = 0;
    	int round;
    	x = x - Math.round(stroke / 2);
    	y = y - Math.round(stroke / 2);
    	xSize = xSize + Math.round(stroke);
    	ySize = ySize + Math.round(stroke);
    	if (xSize < ySize) {
    		round = xSize * roundPercentage / 100;
    	} else {
        	round = ySize * roundPercentage / 100;
    	}
    	RoundedRect attributesToReturn = new RoundedRect(x,y,xSize,ySize,round);
    	return attributesToReturn;
    }
    
    public static void setCursorEnabled(boolean enabled) {
    	config.setCursorEnabled(enabled);
    	if (enabled) {
    		panel.setCursor(Cursor.getDefaultCursor());
    	} else {
    		BufferedImage cursorImg = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
    		Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(
    			    cursorImg, new Point(0, 0), "blank cursor");
    		panel.setCursor(blankCursor);
    	}
    	FileIO.currentConfigOut(config);
    }
    
    public static Config getConfig() {
    	return config;
    }
    
    public static void setConfig(Config newConfig) {
    	config = newConfig;
    }
    
    private static int[] calculateNewScreenDimensions(boolean forceSize, int sizeToForce) { 
    	// Sets the dynamic frame size to the size passed through sizeToForce, if forceSize is true.
    	// When initially run, passes forceSize as false to use the client screen size. Forces the
    	// 16:9 aspect ratio. Can be passed later through perhaps a settings screen to force the window
    	// to choose a different size (initially uses larges possible 16:9 fit. Runs refreshScreenSize()
    	// for all scaleable properties before returning the new screen width and height as an integer
    	// array of size 2.
    	//
    	// WILL ALSO ACTUALLY CHANGE THE FRAME SIZE WITHIN THE METHOD.
    	GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    	int screenDefaultWidth;
        int screenDefaultHeight;
        
        if(forceSize == true) {
        	screenDefaultWidth = sizeToForce;
            screenDefaultHeight = sizeToForce / 16 * 9;
        } else {
        	screenDefaultWidth = gd.getDisplayMode().getWidth(); // gets the width of the current display
            screenDefaultHeight = gd.getDisplayMode().getHeight(); // gets the height of the current display
        }
        
        float screenDPI = java.awt.Toolkit.getDefaultToolkit().getScreenResolution();
        float defaultScreenDPI = 96;
        float scaleFactor = defaultScreenDPI / screenDPI;
        // System.out.println(scaleFactor);
        
        // System.out.println("default" + screenDefaultWidth);
        // System.out.println("default" + screenDefaultHeight);
        
        float screenScaledWidth = screenDefaultWidth * scaleFactor;
        float screenScaledHeight = screenDefaultHeight * scaleFactor;
        // System.out.println("scaled" + screenScaledWidth);
        // System.out.println("scaled" + screenScaledHeight);
        
        int screenWidth = (int) Math.min(screenScaledWidth, screenScaledHeight * 16 / 9);
        int screenHeight = (int) screenWidth / 16 * 9;
        
        int[] toReturn = {screenWidth, screenHeight};
        // System.out.println(java.awt.Toolkit.getDefaultToolkit().getScreenResolution());
        // System.out.println("final" + screenWidth);
        // System.out.println("final" + screenHeight);
        frame.setSize(screenWidth, screenHeight);
        
        calculatedScreenWidth = screenWidth;
        calculatedScreenHeight = screenHeight;
        double xScale = (double) calculatedScreenWidth / 1920d;
    	double yScale = (double) calculatedScreenHeight / 1080d;
		scale = ( xScale + yScale ) / 2;
        return toReturn;
    }
    
    private static void setNewFrameSize(boolean fullscreen, int size) { 
    	// sets the screen size to provided integer or fullscreen, depending on the passed boolean.
    	frame = new JFrame("Simple Rhythm Game");
    	if (fullscreen) {
    		calculateNewScreenDimensions(false, 0);
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
            frame.setUndecorated(true);
    	} else {
    		calculateNewScreenDimensions(true, size);
    	}
    }
    
    public static void updateFrame() {
    	if (transitioning) {
    		if (Framerate.getCurrentTime() > transitionTime + config.getTransitionTime() && transitionBlackOut == false && menuSwitched == true) {
    			transitioning = false;
    			menuSwitched = false;
    		} else if (Framerate.getCurrentTime() > transitionTime + config.getTransitionTime() / 2f && transitionBlackOut == true) {
    			Element[] currentMenu = scaledMenu.getElements();
    			for (int i = 0; i < currentMenu.length ; i++) {
    				currentMenu[i].deanimateHover(true);
    				currentMenu[i].deanimateClick(true);
    			}
    			lastHovered = null;
    			popupIndexes = new int[] {};
    			currentMenuIndex = transitionTo;
    	    	rawCurrentMenu = config.getMenuFromIndex(currentMenuIndex);
            	scaledMenu = rawCurrentMenu.getScaledMenu(calculatedScreenWidth, calculatedScreenHeight);
    			selected = scaledMenu.resetSelectors(false, getCurrentPopupIndex());
    			Element[] tempElementsList = scaledMenu.getElements();
    	        selectionsList = new Selector[tempElementsList.length];
    	        int i = 0;
    	        for (Element element : tempElementsList) {
    	        	selectionsList[i] = element.getSelector();
    	        	i++;
    	        }
    	        animateEntryMenu();
    	        menuSwitched = true;
    	        transitionBlackOut = false;
    		} else if (Framerate.getCurrentTime() > transitionTime + (45f * config.getTransitionTime() / 100f) && transitionBlackOut == false && menuSwitched == false) {
    			transitionBlackOut = true;
    		}
    	}
    	if (popupUpdate) {
    		if (Framerate.getCurrentTime() > popupTime + config.getTransitionTime() / 2f) {
    			Element[] tempElementsList = scaledMenu.getPopup(getCurrentPopupIndex()).getElements();
    			for (int i = 0; i < tempElementsList.length ; i++) {
    				tempElementsList[i].deanimateHover(true);
    				tempElementsList[i].deanimateClick(true);
    			}
    			
    			if (fadeOutPopup != -1) {
    				int arrayPos = 0;
    				int[][] newOgSelecteds = new int[ogSelecteds.length - 1][2];
    				int[] newPopupIndexes = new int[popupIndexes.length - 1];
    				for (int i = 0 ; i < popupIndexes.length ; i++) {
    					int currentIndex = popupIndexes[i];
    					int[] currentSelected = ogSelecteds[i];
    					if (currentIndex == fadeOutPopup) {
    					} else {
    						newPopupIndexes[arrayPos] = currentIndex;
    						newOgSelecteds[arrayPos] = currentSelected;
    						arrayPos++;
    					}
    				}
    				tempElementsList = scaledMenu.getPopup(getCurrentPopupIndex()).getElements();
    				
    				int[] toSelect = ogSelecteds[ogSelecteds.length - 1];
    				
    				popupIndexes = newPopupIndexes;
    				ogSelecteds = newOgSelecteds;
    				
    				lastHovered = null;
    				
    				tempElementsList = (getCurrentPopupIndex() == -1) ?
    	        			scaledMenu.getElements() : scaledMenu.getPopup(fadeOutPopup).getElements();
    		        selectionsList = new Selector[tempElementsList.length];
    		        int i = 0;
    		        for (Element element : tempElementsList) {
    		        	selectionsList[i] = element.getSelector();
    		        	i++;
    		        }
    		        
    		        for (int selection = 0 ; selection < selectionsList.length; selection++) {
//    		        	System.out.println(toSelect[0] + "|" + toSelect[1]);
//    		        	System.out.println(selectionsList[selection].getSelectorIndex()[0] + "|" + selectionsList[selection].getSelectorIndex()[1]);
    	        		if (selectionsList[selection].getSelectorIndex()[0] == toSelect[0] && selectionsList[selection].getSelectorIndex()[1] == toSelect[1] &&
    	        				selectionsList[selection].getSelectorIndex()[0] + selectionsList[selection].getSelectorIndex()[1] > -1) {
    	        			Element elementToDeanimate = scaledMenu.getElements()[selection];
    	        			elementToDeanimate.deanimateClick(false);
    	        			elementToDeanimate.deanimateHover(false);
    	        			break;
    	        		}
    	        	}
    		        
    		        if (config.getCursorEnabled()) {
    					selected = scaledMenu.resetSelectors(false, getCurrentPopupIndex());
    					
    				} else {
    					selected = scaledMenu.resetSelectors(toSelect, new int[] {-1,-1}, getCurrentPopupIndex());
    				}
    			}
    			
    			popupUpdate = false;
    			fadeOutPopup = -1;
    		}
    	}
    	repaintPanel();
    }
    
    private static void transition(int menu) {
    	transitioning = true;
    	transitionTime = Framerate.getCurrentTime();
    	transitionTo = menu;
    	animateExitMenu();
    }
    
    public static void animateExitMenu() {
    	for (Element element : scaledMenu.getElements()) {
    		element.animateExit(false);
    	}
    }
    
    public static void animateEntryMenu() {
    	for (Element element : scaledMenu.getElements()) {
    		element.animateEntry(true);
    	}
    }
    
    public static void animateExitPopup(int popupIndex) {
    	for (Element element : scaledMenu.getPopup(popupIndex).getElements()) {
    		element.animateExit(false);
    	}
    }
    public static void animateEntryPopup(int popupIndex) {
    	for (Element element : scaledMenu.getPopup(popupIndex).getElements()) {
    		element.animateEntry(true);
    	}
    }
    
    public static Object getVairableValue(String variableName) {
    	//TODO
    	return null;
    }
    
    public static void setMenuFromAnIndex(int menu) {
    	if (init == true) {
            init = false;
    		currentMenuIndex = menu;
        	rawCurrentMenu = config.getMenuFromIndex(currentMenuIndex);
        	scaledMenu = rawCurrentMenu.getScaledMenu(calculatedScreenWidth, calculatedScreenHeight);
        	popupIndexes = new int[] {};
        	selected = scaledMenu.resetSelectors(false, getCurrentPopupIndex());
        	Element[] tempElementsList = scaledMenu.getElements();
	        selectionsList = new Selector[tempElementsList.length];
	        int i = 0;
	        for (Element element : tempElementsList) {
	        	selectionsList[i] = element.getSelector();
	        	i++;
	        }
	        
	        transitioning = true;
	    	transitionTime = Framerate.getCurrentTime();
	    	transitionTo = menu;
	    	
	    	animateEntryMenu();
        } else {
        	transition(menu);
        }
	}
    
    public static void setBG(Color bgColor) {
    	panel.setBackground(bgColor);
    }
    
    public static void repaintPanel() {
    	setBG(scaledMenu.getBGColor());
    	panel.repaint();
    }
    
    public static int getMenu() {
    	return currentMenuIndex;
    }
    
	public static StoredTransform[] getTransformsToRender() {
		return scaledMenu.getTransforms();
	}
	
	public static int getCalculatedScreenHeight() {
		return calculatedScreenHeight;
	}

	public static int getCalculatedScreenWidth() {
		return calculatedScreenWidth;
	}
	
	public static void addPopup(int index) {
		boolean existing = false;
		for (int oldIndex : popupIndexes) {
			if (oldIndex == index) {
				existing = true;
			}
		}
		if (existing) {
			// System.out.println("Popup is already visible!");
		} else {
			lastHovered = null;
			
			popupUpdate = true;
			popupTime = Framerate.getCurrentTime();
			
			int[] newPopupIndexes = new int[popupIndexes.length + 1];
			System.arraycopy(popupIndexes, 0, newPopupIndexes, 0, popupIndexes.length);
			newPopupIndexes[newPopupIndexes.length - 1] = index;
			
			popupIndexes = newPopupIndexes;
			
			int[][] newOgSelecteds = new int[ogSelecteds.length + 1][2];
			System.arraycopy(newOgSelecteds, 0, newOgSelecteds, 0, newOgSelecteds.length);
			newOgSelecteds[newOgSelecteds.length - 1] = selected;
			
			ogSelecteds = newOgSelecteds;
			
        	Element[] tempElementsList = (index == -1) ?
        			scaledMenu.getElements() : scaledMenu.getPopup(index).getElements();
	        selectionsList = new Selector[tempElementsList.length];
	        int i = 0;
	        for (Element element : tempElementsList) {
	        	selectionsList[i] = element.getSelector();
	        	i++;
	        }
	        popupUpdate = true;
			popupTime = Framerate.getCurrentTime();
	        
			selected = scaledMenu.resetSelectors(false, getCurrentPopupIndex());
			animateEntryPopup(index);
	        
			// System.out.println("Successfully added popup" + index);
		}
	}
	
	public static void removePopup(int index) {
		popupUpdate = true;
		popupTime = Framerate.getCurrentTime();
		
		boolean existing = false;
		for (int i = 0 ; i < popupIndexes.length ; i++) {
			if (popupIndexes[i] == index) {
				existing = true;
				break;
			}
		}
		if (existing) {
	        popupUpdate = true;
			popupTime = Framerate.getCurrentTime();
			fadeOutPopup = index;
			
			lastHovered = null;
			animateExitPopup(index);
	        
			// System.out.println("Successfully removed popup" + index);
		} else {
			// System.out.println("Popup is already not shown!");
		}
	}

	public static boolean getTransitioning() {
		return transitioning;
	}

	public static void setTransitioning(boolean transitioning) {
		ShowImage.transitioning = transitioning;
	}
	
	public static void refreshMenu() {
		scaledMenu = rawCurrentMenu.getScaledMenu(calculatedScreenWidth, calculatedScreenHeight);
	}
	
	public static void setSelectedElement(String textField) {
		selectedElement = textField;
		Element element = getElementFromName(selectedElement);
		element.getTextfield().resetSelector(false);
		element.setSelected();
		
		Element editButton = getElementFromName("Edit" + selectedElement + "Button");
		if (editButton != null) {
			BufferedImage newImage;
			try {
				newImage = ImageIO.read(new File("src/textures/tick.png"));
				editButton.getTextbox().getRenderableObject().setImage(newImage);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public static void confirmElement(Element element) {
		element.getTextfield().confirmEntry();
		
		Element editButton = getElementFromName("Edit" + selectedElement + "Button");
		if (editButton != null) {
			editButton.getTextbox().getRenderableObject().resetImage();;
		}
		// confirm.
	}
	
	public static void cancelElement(Element element) {
		element.getTextfield().cancelEntry();
		
		Element editButton = getElementFromName("Edit" + selectedElement + "Button");
		if (editButton != null) {
			editButton.getTextbox().getRenderableObject().resetImage();;
		}
		// cancel.
	}
	
	public static String getSelectedElementName() {
		return selectedElement;
	}
	
	public static Element getSelectedElement() {
		return getElementFromName(selectedElement);
	}
	
	public static boolean isAlphaNumeric(char ch) {
	    if ((ch >= '0' & ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch == '_'))
	      return true;
	    return false;
	  }
	
	public static void main(String args[]) throws Exception {
    	
    	Framerate.checkCurrentTime();
    	
    	SysOutController.setSysOutLocationAddressor(); // FOR DEBUGGING (can be disabled)
    	
    	frame = new JFrame("Simple Rhythm Game"); // initialises the frame to allow changes to be applied
        
        // READ INITIALIZATION STATUS
        
        // for username
        boolean userHasUsername = true;
        // String userUsername = xx;
        // UUID userUUID = xx;
        
        // TODO: ADD BELOW TO A COMMENT ONCE DEV IS FINISHED:
        // System.out.println(currentMenuIndex);
        
        boolean useConfig = false; // use during development. TODO: set to true on completion
        
        File configFile = new File("./options.json");
        if(configFile.exists() && !configFile.isDirectory() && useConfig) { 
            config = FileIO.currentConfigIn();
        } else {
        	config = DefaultValues.getDefaultConfigs();
        	FileIO.currentConfigOut(config);
        }
        
        setNewFrameSize(config.getFullscreen(), config.getSizeToForce()); // uses the above raw lists and variables to set the frame size.
        
        if (userHasUsername) {
        	Functions.setMenu("Customization Theme Builder");
        } else {
        	Functions.setMenu("Init User");
        }
        
        panel = new ShowImage(); // runs showimage class (top of this class) to show text and renderables into a panel
        
        if (config.getCursorEnabled()) {
    		panel.setCursor(Cursor.getDefaultCursor());
    	} else {
    		BufferedImage cursorImg = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
    		Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(
    			    cursorImg, new Point(0, 0), "blank cursor");
    		panel.setCursor(blankCursor);
    	}
        
        updateFrame();
        
        frame.getContentPane().add(panel); // adds the panel to frame content
        
        frame.setResizable(false);
        // BELOW IS DEPRECIATED: FRAME WILL ALWAYS BE UNRESIZABLE. can be resized in possibly settings
        /*if (forceSize) {
        	frame.setResizable(false);
        } else {
        	frame.setResizable(true);
        }*/
        
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontList = DefaultValues.getDefaultFonts();
        for (String font : fontList) {
        	ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(font)));
        }
        
        /* 
        String []fontFamilies = ge.getAvailableFontFamilyNames();
        for (String var : fontFamilies) {
        	System.out.println(var);
        }
        */
        // Set the frame size to the screen dimensions
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets closing operation
        frame.setVisible(true); // allows client to see frame
        Framerate thread = new Framerate();
        thread.start();
    }
}