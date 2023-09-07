package SimpleRhythmGame;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.geom.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class ShowImage extends JPanel implements KeyListener {
    private static ShowImage panel;
	private static BufferedImage[] images;
    private static int currentMenu;
    private static Element[] elementsToRender;
    private static Element[] rawElementsList;
    private static Color[] colorsList;
    private static JFrame frame;
    private static String lastHovered = null;
    private static String mouseDragCurrent = null; 
    private static String mouseDragStart = null;
    // The name of the element that the current drag has started on
    private static boolean currentMouseDragging = false;
    private static boolean fullscreen;
    private static int sizeToForce;
    private static int calculatedScreenHeight;
    private static int calculatedScreenWidth;
    
    public ShowImage() {
        setLayout(new BorderLayout()); // Set the main panel's layout to BorderLayout

        // Add mouse listener to the panel
        addMouseListener(new MouseAdapter() {
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
        });
        
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                // Handle the mouse move event
            	int mouseX = e.getX();
            	int mouseY = e.getY();
                //System.out.println("Mouse moved to (" + mouseX + ", " + mouseY +  ")");  
            	
            	Element hoveredElement = checkLocation(mouseX, mouseY);
                
            	if (hoveredElement != null) {
            		String nameOfHoveredElement = hoveredElement.getName();
	                if (lastHovered == nameOfHoveredElement) {
	                	// Do nothing, nothing has changed.
	                } else {
	                	// System.out.println("no longer hovering: " + lastHovered);
	                	// System.out.println("hovering: " + nameOfHoveredElement);
	                	/*
	                	 if (lastHovered != null) {
	                		 TODO stopHoverAnimation(lastHovered);
	                	 }
	                	 */
	                	// TODO startHoverAnimation(nameOfHoveredElement);
	                }
	                lastHovered = nameOfHoveredElement; 
            	} else {
            		if (lastHovered == null) {
            			// Do nothing, nothing has changed.
            		} else {
            			// System.out.println("no longer hovering: " + lastHovered);
	                	// System.out.println("hovering: " + null);
            			// TODO stopHoverAnimation(lastHovered);
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
        });

        // Add key listener to the panel
        setFocusable(true);
        addKeyListener(this);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        for (int i = 0; i < elementsToRender.length; i++) {
	        Element currentElement = elementsToRender[i];
	        
	        if (currentElement.isTextbox()) {
	        	
	        	Graphics2D g2d = (Graphics2D) g.create();
	            RenderingHints rh = new RenderingHints(
	                    RenderingHints.KEY_ANTIALIASING,
	                    RenderingHints.VALUE_ANTIALIAS_ON                    
	                    );
	            g2d.setRenderingHints(rh);
	        	
	        	TextBox textbox = currentElement.getTextbox();
	        	
	        	
	        	
	        	roundedRect roundRectAttributes = getBoxAttributes(textbox);
	        	
	        	int x = roundRectAttributes.getX();
	        	int y = roundRectAttributes.getY();
	        	int xSize = roundRectAttributes.getXSize();
	        	int ySize = roundRectAttributes.getYSize();
	        	int round = roundRectAttributes.getRound();
	        	
	        	if (textbox.getShadowOffset() != 0) { // fills a drop shadow on command
	            	int dropShadowX = x + textbox.getShadowOffset();
	            	int dropShadowY = y + textbox.getShadowOffset();
	            	g2d.setColor(new Color(0, 0, 0, 100));
	            	g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f));
	            	g2d.fillRoundRect(dropShadowX, dropShadowY, xSize, ySize, round, round);
	            }
	        	
	            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));
	            
	            float thickness = textbox.getStrokeWidth();
	            g2d.setStroke(new BasicStroke(thickness));
	            
	            g2d.setColor(colorsList[textbox.getColor()]); // set box color
	            g2d.fillRoundRect(x, y, xSize, ySize, round, round);
	            g2d.setColor(colorsList[textbox.getStrokeColor()]);
	            g2d.drawRoundRect(x, y, xSize, ySize, round, round);
	            
	            g2d.setStroke(new BasicStroke(0));
	            
	            // ^ Textbox section
	            // v Text / Image section
	            
	            if(textbox.isRenderable()) { // render image
	            	Renderable renderable = textbox.getRenderableObject();
	            	BufferedImage image = renderable.getImage();
	            	g2d.drawImage(image, renderable.getX(), renderable.getY(), null);
	            	
	            } else { // render text instead
	            	
	            	g2d.setColor(colorsList[textbox.getFontColor()]); // set text color
		            
		            Font font;
		            
		            if (textbox.getBold() == true) {
		            	font = new Font("Roboto", Font.BOLD, textbox.getTextSize());
		            	g2d.setFont(font);
		            } else {
		            	font = new Font("Roboto", Font.PLAIN, textbox.getTextSize());
		            	g2d.setFont(font);
		            }
		            // Below code grabs the size of the text using the string to be entered
		            FontMetrics fontMetrics = g2d.getFontMetrics();
		            int textWidth = fontMetrics.stringWidth(textbox.getText());
		            int textHeight = fontMetrics.getAscent();
		            // Initializes extraAlign variables
		            int extraAlignX = 0;
		            int extraAlignY = 0;
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
		            
		            int finalX = x + (textbox.getXSize() / 2) + textbox.getOffsetX() + extraAlignX;
		            int finalY = y + (textbox.getYSize() / 2) + textbox.getOffsetY() + extraAlignY - (int) Math.round(textHeight * 0.0);
		            g2d.drawString(textbox.getText(), finalX, finalY);
		            
	            }
	            

	        } else if (currentElement.isRenderable()) {
	        	
	            Renderable renderable = currentElement.getRenderable();
	            BufferedImage image = renderable.getImage();
	
	            Graphics2D g2d = (Graphics2D) g.create();
	            RenderingHints rh = new RenderingHints(
	                    RenderingHints.KEY_ANTIALIASING,
	                    RenderingHints.VALUE_ANTIALIAS_ON                    
	                    );
	            
	            g2d.setRenderingHints(rh);
	            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, renderable.getOpacity() / 255f));
	
	            g2d.drawImage(image, renderable.getX(), renderable.getY(), null);
	            g2d.dispose();
	            
	        } else {
        		System.out.println("Fatal Error: currentElement to render is not renderable or textbox.");
        		System.out.println(currentElement);
        	}
        }
    }
    

    public Element checkLocation(int mouseX, int mouseY) {
    	Element currentBox = null;
        for (int i = 0; i < elementsToRender.length; i++) {
            Element currentElement = elementsToRender[i];
            if (currentElement.isTextbox()) {
            	TextBox textbox = currentElement.getTextbox();
	            roundedRect roundRectAttributes = getBoxAttributes(textbox);
	            Rectangle bounds = new Rectangle();
	            
	            int x = roundRectAttributes.getX();
	        	int y = roundRectAttributes.getY();
	        	int xSize = roundRectAttributes.getXSize();
	        	int ySize = roundRectAttributes.getYSize();
	        	int round = roundRectAttributes.getRound();
	        	
	            RoundRectangle2D roundRect = new RoundRectangle2D.Double(x, y, xSize, ySize, round, round);
	            
	            if (textbox.isRenderable()) {
	            	Renderable renderable = textbox.getRenderableObject();
	            	BufferedImage image = renderable.getImage();
	            	bounds = new Rectangle(renderable.getX(), renderable.getY(), image.getWidth(), image.getHeight());
	            }
	            if ((roundRect.contains(mouseX, mouseY) && textbox.getOpacity() != 0) ||
	            	(bounds.contains(mouseX, mouseY) && textbox.getRenderableObject().getOpacity() != 0 && textbox.isRenderable())
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
        int keyCode = e.getKeyCode();
        System.out.println("Key Pressed: " + KeyEvent.getKeyText(keyCode));
    }

    public void keyReleased(KeyEvent e) {
        // Do nothing
    }

    public void keyTyped(KeyEvent e) {
        // Do nothing
    }
    
    private Element getElementFromName(String name) { 
    	// get the box for the name given through the parameter
    	Element elementToReturn = null;
    	for (int i = 0; i < elementsToRender.length; i++) {
    		Element currentElement = elementsToRender[i];
    		if (currentElement.getName() == name) {
    			elementToReturn = currentElement;
    			break;
    		}
    	}
    	return elementToReturn;
    }
    
    private roundedRect getBoxAttributes(TextBox textbox) { 
    	// gets attributes of the box by converting roundpercentage to a useful number
    	int x = textbox.getX();
    	int y = textbox.getY();
    	int xSize = textbox.getXSize();
    	int ySize = textbox.getYSize();
    	int roundPercentage = textbox.getRoundPercentage();
    	int round;
    	if (xSize < ySize) {
    		round = xSize * roundPercentage / 100;
    	} else {
        	round = ySize * roundPercentage / 100;
    	}
    	roundedRect attributesToReturn = new roundedRect(x,y,xSize,ySize,round);
    	return attributesToReturn;
    }
    
    
    private static Element[] refreshScreenSizeElements(int screenWidth,int screenHeight) {
    	// refreshes all textbox sizes to fit the new screen size, runs on dynamicFrameSize() end.
    	double xScale = intToDouble(screenWidth) / 1920;
    	double yScale = intToDouble(screenHeight) / 1080;
    	// System.out.println(screenWidth);
    	// System.out.println(xScale);
    	Element[] elementsToReturn = new Element[rawElementsList.length];
        for (int i = 0; i < rawElementsList.length; i++) {
        	Element currentElement = rawElementsList[i];
        	if (currentElement.isTextbox()) {
	        	// WAS HERE KEEP WORKING
	        	TextBox currentItem = currentElement.getTextbox();
	        	String function = currentItem.getFunction();
	        	String name = currentItem.getName();
	        	String text = currentItem.getText();
	        	String alignX = currentItem.getAlignX();
	        	String alignY = currentItem.getAlignY();
	        	int textSize = (int) Math.round(currentItem.getTextSize() * Math.min(xScale, yScale));
	        	int fontColor = currentItem.getFontColor();
	        	int x = (int) Math.round(currentItem.getX() * xScale);
	        	int y = (int) Math.round(currentItem.getY() * yScale);
	        	int xSize = (int) Math.round(currentItem.getXSize() * xScale);
	        	int ySize = (int) Math.round(currentItem.getYSize() * yScale);
	        	int offsetX = (int) Math.round(currentItem.getOffsetX() * xScale);
	        	int offsetY = (int) Math.round(currentItem.getOffsetY() * yScale);
	        	int color = currentItem.getColor();
	        	int opacity = currentItem.getOpacity();
	        	boolean renderRenderable = currentItem.isRenderable();
	        	Renderable renderableObject = currentItem.getRenderableObject();
	        	boolean bold = currentItem.getBold();
	        	int roundPercentage = currentItem.getRoundPercentage();
	        	int shadowOffset = (int) Math.round(currentItem.getShadowOffset() * yScale);
	        	float stroke = (int) Math.round(currentItem.getStrokeWidth() * yScale);
	        	int strokeColor = currentItem.getStrokeColor();
	        	if (renderRenderable) {
	        		String renderableName = renderableObject.getName();
	        		String renderableFunction = renderableObject.getFunction();
	            	String imagePath = renderableObject.getImagePath();
	            	int renderableX = (int) Math.round(renderableObject.getX() * xScale);
	            	int renderableY = (int) Math.round(renderableObject.getY() * yScale);
	            	int renderableXSize = (int) Math.round(renderableObject.getXSize() * xScale);
	            	int renderableYSize = (int) Math.round(renderableObject.getYSize() * yScale);
	            	int renderableOpacity = renderableObject.getOpacity();
	            	Renderable newRenderableObject =  new Renderable(renderableFunction, renderableName, imagePath, 
	            			renderableX, renderableY, renderableXSize, renderableYSize, renderableOpacity);
	        		elementsToReturn[i] =  new Element(new TextBox(function, name, newRenderableObject, x, y, xSize, ySize,
	        				color, opacity, roundPercentage, shadowOffset, stroke, strokeColor));
	        	} else {
	        		elementsToReturn[i] =  new Element(new TextBox(function, name, text, alignX, alignY, fontColor, textSize, 
	        				x, y, xSize, ySize, offsetX, offsetY,
	        				color, opacity, bold, roundPercentage, shadowOffset, stroke, strokeColor));
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
            	elementsToReturn[i] =  new Element(new Renderable(renderableFunction, renderableName, imagePath, 
            			renderableX, renderableY, renderableXSize, renderableYSize, renderableOpacity));
        	}
        }
        return elementsToReturn;
    }
    
    private static int[] dynamicFrameSize(boolean forceSize, int sizeToForce) { 
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
        elementsToRender = refreshScreenSizeElements(screenWidth,screenHeight);
        calculatedScreenWidth = screenWidth;
        calculatedScreenHeight = screenHeight;
        return toReturn;
    }
    
    private static void setScreenSize(boolean fullscreen, int size) { 
    	// sets the screen size to provided integer or fullscreen, depending on the passed boolean.
    	if (fullscreen) {
    		dynamicFrameSize(false, 0);
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
            frame.setUndecorated(true);
    	} else {
    		dynamicFrameSize(true, size);
    	}
    	
    }
    
    public static void setMenu(int menu) {
    	currentMenu = menu;
    	rawElementsList = DefaultValues.getMenu(currentMenu).getElements();
    	elementsToRender = refreshScreenSizeElements(calculatedScreenWidth, calculatedScreenHeight);
    	panel.repaint(); // TODO framerate class to replace this
    }
    
    public static int getMenu() {
    	return currentMenu;
    }

    public static void main(String args[]) throws Exception {
    	// main method
    	frame = new JFrame("Game"); // initialises the frame to allow changes to be applied
    	
    	fullscreen = true; // changable variables: if not fullscreen will force below
        sizeToForce = 1920; // changable variables: can foce this screen size if above is true
        
        // TODO: create a class that holds all static or final variables, including the above two and the other values
        // for below lists.
        
        // below defines the static variables which are the raw lists. Should be set again (ADD SETTER METHODS) when
        // a different page is selected. Colors need not be set on new page, but should have setter methods for the
        // settings page. Raw lists are used in refreshScreenSize() methods to calculate real size. Raw list values
        // are relative to the 1920x1080 screen size.
        
        
        
        // Add code here to read a settings file
        // TODO: Create functions
        // TODO: Move functions to a ReadFile class
        
        // READ INITIALIZATION STATUS
        
        // for username
        boolean userHasUsername = true;
        // String userUsername = xx;
        // UUID userUUID = xx;
        
        // for screen size
        boolean userHasScreenSize = false;
        // boolean userFullscreenOption = xx;
        // int userScreenSize = xx;
        
        // loads the default if not true
        if (userHasScreenSize) {
        	// boolean fullscreen = userFullscreenOption;
        	// int sizeToForce = userScreenSize;
        } else {
        	fullscreen = DefaultValues.getDefaultFullscreen();
        	sizeToForce = DefaultValues.getDefaultSizeToForce();
        }
        
        // READ USER COLOR
        boolean userHasColorScheme = false;
        Color[] userColorScheme = new Color[] {
        		new Color (0,0,0,0) // replace with the function to read the scheme
        };
        
        // READ
        
        // TODO: ADD BELOW TO A COMMENT ONCE DEV IS FINISHED:
        fullscreen = false;

        rawElementsList = DefaultValues.getMenu(currentMenu).getElements();
        
        if (userHasColorScheme) {
        	colorsList = userColorScheme;
        } else {
        	colorsList = DefaultValues.getDefaultColors();
        }
        
        setScreenSize(fullscreen, sizeToForce); // uses the above raw lists and variables to set the frame size.
        panel = new ShowImage(); // runs showimage class (top of this class) to show text and renderables into a panel
        frame.getContentPane().add(panel); // adds the panel to frame content
        
        frame.setResizable(false);
        // BELOW IS DEPRECIATED: FRAME WILL ALWAYS BE UNRESIZABLE. can be resized in possibly settings
        
        /*if (forceSize) {
        	frame.setResizable(false);
        } else {
        	frame.setResizable(true);
        }*/
        
        // Set the frame size to the screen dimensions
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets closing operation
        frame.setVisible(true); // allows client to see frame
    }


}