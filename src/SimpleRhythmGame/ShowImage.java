package SimpleRhythmGame;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.geom.*;
import java.io.File;
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
    private static Selector[] selectionsList;
    
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
    
    private static boolean transitioning = false;
    // whether or not the menu is currently transitioning (includes the p
    // the menu has changed but is still fading in
    private static boolean transitionBlackOut = false; 
    // used to stop errors when transitioning between menus. stops the mouse
    // and keyboard listeners when value is set to true
    private static boolean menuSwitched = false;
    private static long transitionTime;
    private static int transitionTo;
    
    private static int calculatedScreenHeight;
    private static int calculatedScreenWidth;
    private static double scale;

    private static MouseListener mouseListener = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
    		int mouseX = e.getX();
        	int mouseY = e.getY();
        	// System.out.println("clicked");
            Element clickedElement = checkLocation(mouseX, mouseY);
            if (clickedElement != null) {
            	if (clickedElement.getClickEffectIndex() != -1) {
            		getElementFromName(clickedElement.getName()).animateClick(true);
            	}
            	// System.out.println(releasedElement.getName());
        		String functionToRun = clickedElement.getFunction();
                boolean ranFunction = Functions.runFunction(functionToRun);
                if (!ranFunction) {
                	System.out.println("ERROR: DID NOT RUN ANY FUNCTION FOR \nElement Name: " + clickedElement.getName() + 
                			"\nwhich is a \nRenderable: " + clickedElement.isRenderable() + "\nTextbox: " + clickedElement.isTextbox());
                } 
                mouseDragStart = null;
        	}
        }
        
        public void mouseReleased(MouseEvent e) {
    		int mouseX = e.getX();
        	int mouseY = e.getY();
        	// System.out.println("released");
        	// System.out.println(mouseDragStart);
            Element releasedElement = checkLocation(mouseX, mouseY);
            if (releasedElement != null) {
            	// System.out.println(releasedElement.getName());
            	if (releasedElement.getName() == mouseDragStart && currentMouseDragging == true) {
            		if (mouseDragCurrent != null) {
                		getElementFromName(mouseDragCurrent).deanimateClick();
                		mouseDragCurrent = null;
                	}
            		String functionToRun = releasedElement.getFunction();
                    boolean ranFunction = Functions.runFunction(functionToRun);
                    if (!ranFunction) {
                    	System.out.println("ERROR: DID NOT RUN ANY FUNCTION FOR \nElement Name: " + releasedElement.getName() + 
                    			"\nwhich is a \nRenderable: " + releasedElement.isRenderable() + "\nTextbox: " + releasedElement.isTextbox());
                	}
                } 
        	} else {
            	// Clicked on nothing.
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
        		String nameOfHoveredElement = hoveredElement.getName();
        		selected = scaledMenu.resetSelectors(getElementFromName(nameOfHoveredElement).getSelectorIndex(), selected);
                if (lastHovered == nameOfHoveredElement) {
                	// Do nothing, nothing has changed.
                } else {
                	if (nameOfHoveredElement != null){
                		getElementFromName(nameOfHoveredElement).animateHover();
                	}
                	if (lastHovered != null) {
                		getElementFromName(lastHovered).deanimateHover();
//                		Element lastElementHovered = getElementFromName(lastHovered);
//                		if (lastElementHovered != null) {
//                			lastElementHovered.deanimateHover();
//                		}
                	}
                	// System.out.println("no longer hovering: " + lastHovered);
                	// System.out.println("hovering: " + nameOfHoveredElement);
                	
                }
                lastHovered = nameOfHoveredElement; 
        	} else {
        		selected = scaledMenu.resetSelectors(false);
        		if (lastHovered == null) {
        			// Do nothing, nothing has changed.
        		} else {
                	if (lastHovered != null) {
                		Element toDeanimate = getElementFromName(lastHovered);
                		if (toDeanimate != null) {
                			toDeanimate.deanimateHover();
                		}
                	}
        			// System.out.println("no longer hovering: " + lastHovered);
                	// System.out.println("hovering: " + null);
            		lastHovered = null;	
        		}
        	}
        }
        
        @Override
        public void mouseDragged(MouseEvent e) {
        	int mouseX = e.getX();
        	int mouseY = e.getY();
        	// System.out.println("dragged");
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
            	if (clickedElement != null){
            		if (clickedElement.getClickEffectIndex() != -1) {
                		getElementFromName(nameOfDraggedElement).animateClick(false);
                	}
            	}
            }
            if (mouseDragCurrent == nameOfDraggedElement) {
            	// DO NOTHING
            } else {
            	if (mouseDragCurrent != null && mouseDragStart == mouseDragCurrent) {
            		System.out.println("deanimate");
            		getElementFromName(mouseDragCurrent).deanimateClick();
            	}
            	mouseDragCurrent = nameOfDraggedElement;
            }
        }
    };
    
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
        
        for (int i = 0; i < scaledMenu.getElements().length; i++) {
	        Element currentElement = scaledMenu.getElements()[i];
	        
	        Graphics2D g2d = (Graphics2D) g.create();
	        g2d.setRenderingHints(rh);
	        
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
	        	
	        	for (int k = 2 ; k > -1 ; k--) {
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
	            	g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f));
	            	g2d.fill(shadowRect);
	            }
	        	
	            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));
	            
	            float thickness = textbox.getStrokeWidth();
	            g2d.setStroke(new BasicStroke(thickness));
	            
	            g2d.setColor(config.getColors()[textbox.getColor()]); // set box color
	            g2d.fill(finalRect);
	            g2d.setColor(config.getColors()[textbox.getStrokeColor()]);
	            g2d.draw(finalRect);
	            
	            g2d.setStroke(new BasicStroke(0));
	            
	            // ^ Textbox section
	            // v Text / Image section
	            
	        	for (int k = 2 ; k > -1 ; k--) {
	        		if (currentElement.getTransform()[k].getNewTransform() != null) {
	        			g2d.transform(currentElement.getTransform()[k].getCurrentPosition().getFinalTransform());
		        	}
	        	}
	        	
	            if (textbox.getRenderableObject() != null) { // render image if contained
	            	Renderable renderable = textbox.getRenderableObject();
	            	BufferedImage image = renderable.getImage();
	            	int rule = AlphaComposite.SRC_OVER;
	                Composite comp = AlphaComposite.getInstance(rule , ((float) renderable.getOpacity())/255);
	                g2d.setComposite(comp);
	            	g2d.drawImage(image, textbox.getX() + renderable.getX(), textbox.getY() + renderable.getY(), null);
	            	g2d.setComposite(AlphaComposite.getInstance(rule , 1));
	            	// Reset the composite after using it
	            } 
	            
	            if (textbox.getText() != null){ // render text if contained
	            	
	            	g2d.setColor(config.getColors()[textbox.getTextColor()]); // set text color
		            
		            Font font;
		            
	            	font = new Font(textbox.getFont(), textbox.getBold() ? Font.BOLD:Font.PLAIN, textbox.getTextSize());
	            	g2d.setFont(font);
		            // Below code grabs the size of the text using the string to be entered
		            FontMetrics fontMetrics = g2d.getFontMetrics();
		            
		            int[] extraAligns = getTextAligns(textbox, fontMetrics);
		            
		            int extraAlignX = extraAligns[0];
		            int extraAlignY = extraAligns[1];
		            
		            int finalX = roundRectAttributes.getX() + (textbox.getXSize() / 2) + textbox.getOffsetX() + extraAlignX;
		            int finalY = roundRectAttributes.getY() + (textbox.getYSize() / 2) + textbox.getOffsetY() + extraAlignY;
		            g2d.drawString(textbox.getText(), finalX, finalY);
	            }

	        } else if (currentElement.isRenderable()) {
	        	
	            Renderable renderable = currentElement.getRenderable();
	            BufferedImage image = renderable.getImage();
	            
	            g2d.setRenderingHints(rh);
	            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, renderable.getOpacity() / 255f));
	
	            g2d.drawImage(image, renderable.getX(), renderable.getY(), null);
	            g2d.dispose();
	            
	        } else {
        		System.out.println("Fatal Error: currentElement to render is not renderable or textbox.");
        		System.out.println(currentElement);
        	}
	        g2d.dispose();
        }
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHints(rh);
     // Draw Menu Title Box
        g2d.setClip(getBoxAttributes(new RoundedArea(0, 0, calculatedScreenWidth, calculatedScreenHeight, 0)).getArea());
        g2d.setColor(config.getColors()[1]);
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
        
        g2d.setColor(config.getColors()[1]);
        g2d.fill(polyline);
        
        float thickness = 5 * (float) scale;
        g2d.setColor(config.getColors()[6]);
        g2d.setStroke(new BasicStroke(thickness));
        g2d.draw(polyline);
        
    	TextBox titletextbox = new TextBox(
        		// TextBox with Text
    			1f, // scale 
				"", // function
				"",  // name
				new Text(scaledMenu.getMenuDisplayName(),
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
    	
        int[] extraAligns = getTextAligns(titletextbox, fontMetrics);
        
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
    			Color finalColor = new Color(color.getRed(),color.getGreen(),color.getBlue(),127);
	        	g2d.setColor(finalColor);
	        	g2d.fill(maskBounds);
        	}
        }
    	
    	if (transitioning) {
    		g2d.setColor(new Color(0,0,0,
    				Framerate.getCurrentTime() - transitionTime < 280000000l ?
    				Math.max(Math.min((int)((Framerate.getCurrentTime() - transitionTime) / 1000000),255),0): 
    					Math.max(Math.min((int)(550 - ((Framerate.getCurrentTime() - transitionTime) / 1000000)),255),0)));
    		g2d.fill(new Rectangle(0,0,calculatedScreenWidth,calculatedScreenHeight));
    	}
    }
    
    private int[] getTextAligns(TextBox textbox, FontMetrics fontMetrics){
    	int textWidth = fontMetrics.stringWidth(textbox.getText());
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
    

    public static Element checkLocation(int mouseX, int mouseY) {
    	if (!transitionBlackOut) {
    		Element currentBox = null;
        	
            for (int i = 0; i < scaledMenu.getElements().length; i++) {
                Element currentElement = scaledMenu.getElements()[i];
                if (currentElement.getSelectorIndex()[0] + currentElement.getSelectorIndex()[1] > -1) {
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
        	        	
        	        	for (int k = 2 ; k > -1 ; k--) {
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
        	                currentBox = currentElement; 
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
                        	currentBox = currentElement; 
                        }
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
    
    public void keyPressed(KeyEvent e) {
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
        
        if (foundKey) {
        	String hotkeyPressed = KeyEvent.getKeyText(keyCode);
        	
            if (hotkeyPressed == "Enter"
            		|| hotkeyPressed == "Up"
            		|| hotkeyPressed == "Down"
            		|| hotkeyPressed == "Left"
            		|| hotkeyPressed == "Right"
            		) { // arrow keys real keycodes
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
            			element = scaledMenu.getElements()[i];
            			elementToDeanimate = element;
            			found = true;
            			break;
            		}
            	}
            	
            	if (!found) { // set the selected to 0 instead if not currently selecting a valid item (like if currently on -1,-1)
            		selected = scaledMenu.resetSelectors(true);
            		for (int i = 0 ; i < selectionsList.length; i++) {
                		if (selectionsList[i].getSelectorIndex()[0] == selected[0] && selectionsList[i].getSelectorIndex()[1] == selected[1] &&
                				selectionsList[i].getSelectorIndex()[0] + selectionsList[i].getSelectorIndex()[1] > -1) {
                			element = scaledMenu.getElements()[i];
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
    			        	selected = scaledMenu.resetSelectors(directionalOptions[0], selected);
    			            } else if (hotkeyPressed == "Down") {
    			            	selected = scaledMenu.resetSelectors(directionalOptions[1], selected);
    			            } else if (hotkeyPressed == "Left") {
    			            	selected = scaledMenu.resetSelectors(directionalOptions[2], selected);
    	                    } else if (hotkeyPressed == "Up") {
    	                    	selected = scaledMenu.resetSelectors(directionalOptions[3], selected);
                        }
            			for (int i = 0 ; i < selectionsList.length; i++) {
                    		if (selectionsList[i].getSelectorIndex()[0] == selected[0] && selectionsList[i].getSelectorIndex()[1] == selected[1]) {
                    			element = scaledMenu.getElements()[i];
                    			if (element.equals(elementToDeanimate)){
                    				// Do nothing, no change in element.
                    			} else {
                    				elementToDeanimate.deanimateHover();
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
            	String menuToEnter = scaledMenu.getPreviousMenuName();
            	if (menuToEnter != null){
            		String functionToRun = "setMenu String " + menuToEnter.replace(" ", "_");
        			Functions.runFunction(functionToRun);
            	} else {
            		System.out.println("No Previous Menu");
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

    public void keyReleased(KeyEvent e) {
        // Do nothing
    }

    public void keyTyped(KeyEvent e) {
        // Do nothing
    }
    
    private static Element getElementFromName(String name) { 
    	// get the box for the name given through the parameter
    	Element elementToReturn = null;
    	Element[] elementsList = scaledMenu.getElements();
    	for (int i = 0; i < elementsList.length; i++) {
    		Element currentElement = elementsList[i];
    		if (currentElement.getName() == name) {
    			elementToReturn = currentElement;
    			break;
    		}
    	}
    	return elementToReturn;
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
    	// TODO: write new values to config file
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
    		if (Framerate.getCurrentTime() > transitionTime + 560000000l && transitionBlackOut == false) {
    			transitioning = false;
    			menuSwitched = false;
    		} else if (Framerate.getCurrentTime() > transitionTime + 280000000l && transitionBlackOut == true) {
    			Element[] currentMenu = scaledMenu.getElements();
    			for (int i = 0; i < currentMenu.length ; i++) {
    				currentMenu[i].deanimateHover();
    			}
    			lastHovered = null;
    			selected = null;
    			System.out.println("hi");
    			currentMenuIndex = transitionTo;
    	    	rawCurrentMenu = config.getMenuFromIndex(currentMenuIndex);
            	scaledMenu = rawCurrentMenu.getScaledMenu(calculatedScreenWidth, calculatedScreenHeight);
    	    	selected = scaledMenu.resetSelectors(false);
    	    	Element[] tempElementsList = scaledMenu.getElements();
    	        selectionsList = new Selector[tempElementsList.length];
    	        int i = 0;
    	        for (Element element : tempElementsList) {
    	        	selectionsList[i] = element.getSelector();
    	        	i++;
    	        }
    	        menuSwitched = true;
    	        transitionBlackOut = false;
    		} else if (Framerate.getCurrentTime() > transitionTime + 260000000l && transitionBlackOut == false && menuSwitched == false) {
    			transitionBlackOut = true;
    		}
    	}
    	repaintPanel();
    }
    
    private static void transition(int menu) {
    	transitioning = true;
    	transitionTime = Framerate.getCurrentTime();
    	transitionTo = menu;
    }
    
    public static void setMenuFromAnIndex(int menu) {
    	transition(menu);
    	if (init == true) {
            init = false;
    		currentMenuIndex = menu;
        	rawCurrentMenu = config.getMenuFromIndex(currentMenuIndex);
        	scaledMenu = rawCurrentMenu.getScaledMenu(calculatedScreenWidth, calculatedScreenHeight);
        	selected = scaledMenu.resetSelectors(false);
        	Element[] tempElementsList = scaledMenu.getElements();
	        selectionsList = new Selector[tempElementsList.length];
	        int i = 0;
	        for (Element element : tempElementsList) {
	        	selectionsList[i] = element.getSelector();
	        	i++;
	        }
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
        	Functions.setMenu("Main Menu");
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

	public static boolean getTransitioning() {
		return transitioning;
	}

	public static void setTransitioning(boolean transitioning) {
		ShowImage.transitioning = transitioning;
	}
}