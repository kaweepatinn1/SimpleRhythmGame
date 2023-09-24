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
    private static Element[] elementsToRender;
    private static RoundedArea[] masksToRender;
    private static StoredTransform[] transformsToRender;
    private static Menu rawCurrentMenu;
    private static int[] selected;
    private static Selector[] selectionsList;
    
    private static JFrame frame;
    private static Config config;
    
    private static String lastHovered = null;
    private static String mouseDragCurrent = null; 
    private static String mouseDragStart = null;
    // The name of the element that the current drag has started on
    private static boolean currentMouseDragging = false;
    
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
        		selected = rawCurrentMenu.resetSelectors(getElementFromName(nameOfHoveredElement).getSelectorIndex());
                if (lastHovered == nameOfHoveredElement) {
                	// Do nothing, nothing has changed.
                } else {
                	if (nameOfHoveredElement != null){
                		getElementFromName(nameOfHoveredElement).animate();
                	}
                	if (lastHovered != null) {
                		getElementFromName(lastHovered).deanimate();
                	}
                	// System.out.println("no longer hovering: " + lastHovered);
                	// System.out.println("hovering: " + nameOfHoveredElement);
                	
                }
                lastHovered = nameOfHoveredElement; 
        	} else {
        		selected = rawCurrentMenu.resetSelectors(new int[]{-1,-1});
        		if (lastHovered == null) {
        			// Do nothing, nothing has changed.
        		} else {
                	if (lastHovered != null) {
                		getElementFromName(lastHovered).deanimate();
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
            if (mouseDragCurrent == nameOfDraggedElement) {
            	// DO NOTHING
            } else {
            	// TODO stopClickAnimation(mouseDragCurrent);
            	if (clickedElement != null) {
            		// TODO startClickAnimation(clickedBox.getName());
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
        
        Graphics2D g2d = (Graphics2D) g.create();
        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON                    
                );
        g2d.setRenderingHints(rh);
        
        for (int i = 0; i < elementsToRender.length; i++) {
	        Element currentElement = elementsToRender[i];
	        
	        if (currentElement.isTextbox()) {
	        	
	        	TextBox textbox = currentElement.getTextbox();
	        	
	        	int maskIndex = textbox.getMaskIndex();
	        	
	        	if (maskIndex == -1 || masksToRender.length == 0) {
	        		Rectangle fullscreenSize = new Rectangle(0, 0, calculatedScreenWidth, calculatedScreenHeight);
	        		Area noMask = new Area(fullscreenSize);
	        		g2d.setClip(noMask);
	        	} else {
        			RoundedRect maskAttributes = getBoxAttributes(masksToRender[maskIndex]);
		        	
		        	RoundRectangle2D maskBounds = new RoundRectangle2D.Double(
		        			maskAttributes.getX(), 
		        			maskAttributes.getY(), 
		        			maskAttributes.getXSize(), 
		        			maskAttributes.getYSize(), 
		        			maskAttributes.getRound(), 
		        			maskAttributes.getRound());
		        	
		        	Area mask = new Area(maskBounds);
		        	g2d.setClip(mask);
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
	        	
	        	Shape finalRect;
	        	if (currentElement.getTransform().getNewTransform() != null) {
	        		finalRect = currentElement.getTransform().getCurrentPosition().getFinalTransform().createTransformedShape(roundRect);
	        	} else {
	        		finalRect = roundRect;
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
	            if (currentElement.getTransform().getNewTransform() != null) {
	            	g2d.transform(currentElement.getTransform().getCurrentPosition().getFinalTransform());
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
	            
	            g2d.setTransform(new AffineTransform());

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
        }
        
     // Draw Menu Title Box
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
    			1,
				"", // function
				"",  // name
				new Text(rawCurrentMenu.getMenuDisplayName(),
						"center", "center", // align
						calculatedScreenWidth * 50 / 100, calculatedScreenHeight * 15 / 400, // text offset (x, y)
						(int) (75 * scale), // text size
						6, // text color (index of colors)
						"Archivo Narrow", // font
						true // bold
						), // text
				new RoundedArea(0,0,0,0,0),  // x, y, xSize, ySize
				-1, // Mask Index
				1, // box color (index of colors)
				0, // opacity (0-255)
				 // bold boolean
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
    		RoundedArea[] drawMasks = rawCurrentMenu.getMasks();
        	for (int i = 0 ; i < drawMasks.length ; i++) {
        		RoundedRect maskAttributes = getBoxAttributes(masksToRender[i]);
	        	
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
    	Element currentBox = null;
    	
        for (int i = 0; i < elementsToRender.length; i++) {
            Element currentElement = elementsToRender[i];
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
	        	
	        	Shape finalRect;
	        	
	        	if (currentElement.getTransform().getNewTransform() != null) {
	        		finalRect = currentElement.getTransform().getCurrentPosition().getFinalTransform().createTransformedShape(roundRect);
	        	} else {
	        		finalRect = roundRect;
	        	}
	        	Area buttonArea = new Area(finalRect);
	        	
        		int maskIndex = textbox.getMaskIndex();
	        	
	        	if (maskIndex == -1) {
	        		// No mask
	        	} else {
	        		
        			RoundedRect strokeInclusiveAttributes = getBoxAttributes(masksToRender[maskIndex]);
		        	
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
	            	bounds = new Rectangle(renderable.getX(), renderable.getY(), image.getWidth(), image.getHeight());
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
        return currentBox;
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
            		if (selectionsList[i].getSelectorIndex()[0] == selected[0] && selectionsList[i].getSelectorIndex()[1] == selected[1]) {
            			directionalOptions = selectionsList[i].getSelectorOptions();
            			// retrieves directional options from the currently selected item
            			element = rawCurrentMenu.getElements()[i];
            			elementToDeanimate = element;
            			found = true;
            			break;
            		}
            	}
            	
            	if (!found) { // set the selected to 0 instead if not currently selecting a valid item (can be -1,-1)
            		selected = rawCurrentMenu.resetSelectors(new int[]{0,0});
            		for (int i = 0 ; i < selectionsList.length; i++) {
                		if (selectionsList[i].getSelectorIndex()[0] == selected[0] && selectionsList[i].getSelectorIndex()[1] == selected[1]) {
                			element = rawCurrentMenu.getElements()[i];
                			element.animate();
                			lastHovered = element.getName();
                			break;
                		}
                	}
            	} else {
            		
            		if (hotkeyPressed == "Enter") {
            			String functionToRun = element.getFunction();
            			boolean ranFunction = Functions.runFunction(functionToRun);
            			if (!ranFunction) {
                      	System.out.println("ERROR: DID NOT RUN ANY FUNCTION FOR \nElement Name: " + element.getName() + 
                      			"\nwhich is a \nRenderable: " + element.isRenderable() + "\nTextbox: " + element.isTextbox());
            			}
            		} else {
            			if (hotkeyPressed == "Right") {
    			        	selected = rawCurrentMenu.resetSelectors(directionalOptions[0]);
    			            } else if (hotkeyPressed == "Down") {
    			            	selected = rawCurrentMenu.resetSelectors(directionalOptions[1]);
    			            } else if (hotkeyPressed == "Left") {
    			            	selected = rawCurrentMenu.resetSelectors(directionalOptions[2]);
    	                    } else if (hotkeyPressed == "Up") {
    	                    	selected = rawCurrentMenu.resetSelectors(directionalOptions[3]);
                        }
            			for (int i = 0 ; i < selectionsList.length; i++) {
                    		if (selectionsList[i].getSelectorIndex()[0] == selected[0] && selectionsList[i].getSelectorIndex()[1] == selected[1]) {
                    			element = rawCurrentMenu.getElements()[i];
                    			if (element.equals(elementToDeanimate)){
                    				// Do nothing, no change in element.
                    			} else {
                    				elementToDeanimate.deanimate();
                    				element.animate();
                    				lastHovered = element.getName();
                    			}
                    			break;
                    		}
                    	}
            		}
            	}
            } 
            
            else if (hotkeyPressed == "Escape") {
            	String menuToEnter = rawCurrentMenu.getPreviousMenuName();
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
    	Element[] elementsList = rawCurrentMenu.getElements();
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
	
	
	private static StoredTransform[] refreshTransforms(int screenWidth,int screenHeight) {
    	double xScale = intToDouble(screenWidth) / 1920;
    	double yScale = intToDouble(screenHeight) / 1080;
    	
    	StoredTransform[] transforms = rawCurrentMenu.getTransforms();
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
    	
    	return transformsToReturn;
    }
	
    private static RoundedArea[] refreshMasks(int screenWidth,int screenHeight) {
    	double xScale = intToDouble(screenWidth) / 1920;
    	double yScale = intToDouble(screenHeight) / 1080;
    	
    	RoundedArea[] masks = rawCurrentMenu.getMasks();
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
    	
    	return areasToReturn;
    }
    
    private static Element[] refreshElements(int screenWidth,int screenHeight) {
    	// refreshes all textbox sizes to fit the new screen size, runs on dynamicFrameSize() end.
    	
    	double xScale = intToDouble(screenWidth) / 1920;
    	double yScale = intToDouble(screenHeight) / 1080;
    	scale = ( xScale + yScale ) / 2;
    	// System.out.println(screenWidth);
    	// System.out.println(xScale);
    	
    	Element[] rawElementsList = rawCurrentMenu.getElements();
    	Element[] elementsToReturn = new Element[rawElementsList.length];
        for (int i = 0; i < rawElementsList.length; i++) {
        	
        	Element currentElement = rawElementsList[i];
        	Selector selector = currentElement.getSelector();
        	
        	int hoverEffectIndex = currentElement.getHoverEffectIndex();
        	int clickEffectIndex = currentElement.getClickEffectIndex();
        	int arbitraryTransformIndex = currentElement.getArbitraryTransformIndex();
        	
        	if (currentElement.isTextbox()) {
	        	TextBox currentItem = currentElement.getTextbox();
	        	TweenTransform transform = currentElement.getTransform();
	        	float textBoxScale = currentItem.getScale();
	        	String function = currentItem.getFunction();
	        	String name = currentItem.getName();
	        	String text = currentItem.getText();
	        	String alignX = currentItem.getAlignX();
	        	String alignY = currentItem.getAlignY();
	        	String font = currentItem.getFont();
	        	int textSize = (int) Math.round(currentItem.getTextSize() * Math.min(xScale, yScale) * textBoxScale);
	        	int fontColor = currentItem.getTextColor();
	        	
	        	int xSize = (int) Math.round(currentItem.getXSize() * xScale * textBoxScale);
	        	int ySize = (int) Math.round(currentItem.getYSize() * yScale * textBoxScale);
	        	int x = (int) Math.round(currentItem.getX() * xScale - (xSize / 2));
	        	int y = (int) Math.round(currentItem.getY() * yScale - (ySize / 2));
	        	int roundPercentage = currentItem.getRoundPercentage();
	        	
	        	int maskIndex = currentItem.getMaskIndex();
	        	
	        	int offsetX = (int) Math.round(currentItem.getOffsetX() * xScale * textBoxScale);
	        	int offsetY = (int) Math.round(currentItem.getOffsetY() * yScale * textBoxScale);
	        	int color = currentItem.getColor();
	        	int opacity = currentItem.getOpacity();
	        	Renderable renderableObject = currentItem.getRenderableObject();
	        	boolean bold = currentItem.getBold();
	        	
	        	int shadowOffset = (int) Math.round(currentItem.getShadowOffset() * Math.min(xScale, yScale) * textBoxScale);
	        	float stroke = (int) Math.round(currentItem.getStrokeWidth() * Math.min(xScale, yScale) * textBoxScale);
	        	int strokeColor = currentItem.getStrokeColor();
	        	
	        	if (currentItem.getRenderableObject() != null) {
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
	            	if (currentItem.getText() != null) {
		        		
		        		elementsToReturn[i] =  
		        				new Element(
	        						transform, selector, hoverEffectIndex, clickEffectIndex, arbitraryTransformIndex,
			        				new TextBox( // First Constructor (Text AND Renderable)
		        						textBoxScale, function, name, 
				        				new Text(text, alignX, alignY, offsetX, offsetY, textSize, fontColor, font, bold), 
				        				newRenderableObject,  
				        				new RoundedArea(x, y, xSize, ySize, roundPercentage), 
				        				maskIndex,
				        				color, opacity, shadowOffset, 
				        				stroke, strokeColor
				        				)
	        						);
		        		
		        	} else {
		        		elementsToReturn[i] =  
		        				new Element( // Third Constructor (Only Renderable)
	        						transform, selector, hoverEffectIndex, clickEffectIndex, arbitraryTransformIndex,
	        						new TextBox(
        								textBoxScale, function, name,
        								newRenderableObject,
        								new RoundedArea(x, y, xSize, ySize, roundPercentage), 
				        				maskIndex,
				        				color, opacity, shadowOffset, 
				        				stroke, strokeColor
				        				)
	        						);
		        	}
	        	} else if (currentItem.getText() != null) {
	        		 elementsToReturn[i] = 
	        				 new Element(
        						 transform, selector, hoverEffectIndex, clickEffectIndex, arbitraryTransformIndex,
        						 new TextBox(
    								 textBoxScale, function, name,
    								 new Text(text, alignX, alignY, offsetX, offsetY, textSize, fontColor, font, bold), 
			        				 new RoundedArea(x, y, xSize, ySize, roundPercentage), 
			        				 maskIndex,
			        				 color, opacity, shadowOffset, 
			        				 stroke, strokeColor));
	        	} else {
	        		System.out.println("NO TEXT OR RENDERABLE!");
	        	}
	        	
        	} else if (currentElement.isRenderable()) {
        		Renderable currentItem = currentElement.getRenderable();
        		String renderableFunction = currentItem.getFunction();
        		String renderableName = currentItem.getName();
            	String imagePath = currentItem.getImagePath();
            	int renderableX = (int) Math.round(currentItem.getX() * xScale);
            	int renderableY = (int) Math.round(currentItem.getY() * yScale);
            	int renderableXSize = (int) Math.round(currentItem.getXSize() * xScale);
            	int renderableYSize = (int) Math.round(currentItem.getYSize() * yScale);
            	int renderableOpacity = currentItem.getOpacity();
            	
            	elementsToReturn[i] =  new Element(selector, hoverEffectIndex, clickEffectIndex, arbitraryTransformIndex,
            			new Renderable(renderableFunction, renderableName, imagePath, 
            			renderableX, renderableY, renderableXSize, renderableYSize, renderableOpacity));
        	}
        }
        return elementsToReturn;
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
    	elementsToRender = refreshElements(calculatedScreenWidth,calculatedScreenHeight);
    	masksToRender = refreshMasks(calculatedScreenWidth,calculatedScreenHeight);
    	transformsToRender = refreshTransforms(calculatedScreenWidth,calculatedScreenHeight);
    	repaintPanel();
    }
    
    public static void setMenuFromAnIndex(int menu) {
    	currentMenuIndex = menu;
    	rawCurrentMenu = config.getMenuFromIndex(currentMenuIndex);
    	selected = rawCurrentMenu.resetSelectors(new int[]{-1,-1});
        Element[] tempElementsList = rawCurrentMenu.getElements();
        selectionsList = new Selector[tempElementsList.length];
        int i = 0;
        for (Element element : tempElementsList) {
        	selectionsList[i] = element.getSelector();
        	i++;
        }
        elementsToRender = refreshElements(calculatedScreenWidth,calculatedScreenHeight);
    	masksToRender = refreshMasks(calculatedScreenWidth,calculatedScreenHeight);
    	transformsToRender = refreshTransforms(calculatedScreenWidth,calculatedScreenHeight);
    }
    
    public static void setBG(Color bgColor) {
    	panel.setBackground(bgColor);
    }
    
    public static void repaintPanel() {
    	setBG(rawCurrentMenu.getBGColor());
    	panel.repaint();
    }
    
    public static int getMenu() {
    	return currentMenuIndex;
    }
    
	public static StoredTransform[] getTransformsToRender() {
		return transformsToRender;
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
        
        if (userHasUsername) {
        	Functions.setMenu("Main Menu");
        } else {
        	Functions.setMenu("Init User");
        }
        
        setNewFrameSize(config.getFullscreen(), config.getSizeToForce()); // uses the above raw lists and variables to set the frame size.
        
        panel = new ShowImage(); // runs showimage class (top of this class) to show text and renderables into a panel
        
        if (config.getCursorEnabled()) {
    		panel.setCursor(Cursor.getDefaultCursor());
    	} else {
    		BufferedImage cursorImg = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
    		Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(
    			    cursorImg, new Point(0, 0), "blank cursor");
    		panel.setCursor(blankCursor);
    	}
        
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