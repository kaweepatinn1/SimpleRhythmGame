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
    private static BufferedImage[] images;
    private static Renderable[] renderablesList;
    private static Renderable[] rawRenderablesList;
    private static TextBox[] textBoxesList;
    private static TextBox[] rawTextBoxesList;
    private static BufferedImage[] extraImages;
    private static int clickedImageIndex = -1;
    private static Color[] colorsList;
    private static JFrame frame;
    private static String lastHovered = "";
    
    public ShowImage() {
        setLayout(new BorderLayout()); // Set the main panel's layout to BorderLayout
        try {
            // Initialize the array to store the images and renderables
            images = new BufferedImage[renderablesList.length];
            LinkedList<BufferedImage> extraImagesList = new LinkedList();

            // Load the images from the file names in the renderables into the images list
            for (int i = 0; i < renderablesList.length; i++) {
                Renderable renderable = renderablesList[i];
                File input = new File(renderable.getImagePath());
                images[i] = ImageIO.read(input);
            }
            for (int i = 0; i < textBoxesList.length; i++) {
                if (textBoxesList[i].renderable() == true) {
	            	Renderable renderable = textBoxesList[i].getRenderableObject();
	                File input = new File(renderable.getImagePath());
	                extraImagesList.add(ImageIO.read(input));
                }
            }
            extraImages = extraImagesList.toArray(new BufferedImage[0]);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Add mouse listener to the panel
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Check if the mouse click is within the boundaries of any image
                int x = e.getX();
                int y = e.getY();
                clickedImageIndex = -1; // Reset clickedImageIndex

                for (int i = 0; i < renderablesList.length; i++) {
                    Renderable renderable = renderablesList[i];
                    BufferedImage image = images[i];

                    Rectangle bounds = new Rectangle(renderable.getX(), renderable.getY(), image.getWidth(), image.getHeight());

                    if (bounds.contains(x, y)) {
                        clickedImageIndex = i;
                        break;
                    }
                }

                // Repaint the panel to update the display
                repaint();

                // Output the clicked image information or mouse coordinates
                if (clickedImageIndex != -1) {
                    Renderable clickedRenderable = renderablesList[clickedImageIndex];
                    System.out.println("Clicked Image: " + clickedRenderable.getImagePath());
                    System.out.println("Image Position: X=" + clickedRenderable.getX() + ", Y=" + clickedRenderable.getY());
                    System.out.println("Image Opacity: " + clickedRenderable.getOpacity());
                    System.out.println();
                } else {
                    System.out.println("Clicked Image: null");
                    System.out.println("Mouse Position: X=" + x + ", Y=" + y);
                    System.out.println();
                }
            }
        });
        
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                // Handle the mouse move event
            	int mouseX = e.getX();
            	int mouseY = e.getY();
            	String hoveredBox = null;
                //System.out.println("Mouse moved to (" + mouseX + ", " + mouseY +  ")");            
                for (int i = 0; i < textBoxesList.length; i++) {
                    TextBox currentBox = textBoxesList[i];
                    roundedRect roundRectAttributes = getBoxAttributes(currentBox);
                    int x = roundRectAttributes.getX();
                	int y = roundRectAttributes.getY();
                	int xSize = roundRectAttributes.getXSize();
                	int ySize = roundRectAttributes.getYSize();
                	int round = roundRectAttributes.getRound();
                    RoundRectangle2D roundRect = new RoundRectangle2D.Double(x, y, xSize, ySize, round, round);
                    if (roundRect.contains(mouseX, mouseY)) {
                        hoveredBox = currentBox.getName(); 
                        // does not break so that the element which is highest in the hierarchy
                        // can be selected instead of the first (which would be more background items)
                        // break;
                    }
                }
                if (hoveredBox == lastHovered) {
                	
                } else {
                	System.out.println("no longer hovering: " + lastHovered);
                	System.out.println("hovering: " + hoveredBox);
                }
                lastHovered = hoveredBox; 
            }
        });

        // Add key listener to the panel
        setFocusable(true);
        addKeyListener(this);
    }
    
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw the images on the panel
        for (int i = 0; i < images.length; i++) {
            BufferedImage image = images[i];
            Renderable renderable = renderablesList[i];

            Graphics2D g2d = (Graphics2D) g.create();
            RenderingHints rh = new RenderingHints(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON                    
                    );
            g2d.setRenderingHints(rh);
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, renderable.getOpacity() / 255f));

            g2d.drawImage(image, renderable.getX(), renderable.getY(), null);
            g2d.dispose();

            // Highlight the clicked image
            if (i == clickedImageIndex) {
                g.setColor(new Color(255, 0, 0, 100)); // Semi-transparent red color
                g.fillRect(renderable.getX(), renderable.getY(), image.getWidth(), image.getHeight());
            }
        }
        
        for (int i = 0; i < textBoxesList.length; i++) {
        	Graphics2D g2d = (Graphics2D) g.create();
            RenderingHints rh = new RenderingHints(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON                    
                    );
            g2d.setRenderingHints(rh);
        	
        	TextBox textbox = textBoxesList[i];
        	
        	
        	
        	roundedRect roundRectAttributes = getBoxAttributes(textbox);
        	
        	int x = roundRectAttributes.getX();
        	int y = roundRectAttributes.getY();
        	int xSize = roundRectAttributes.getXSize();
        	int ySize = roundRectAttributes.getYSize();
        	int round = roundRectAttributes.getRound();
        	
        	if (textbox.getShadowOffset() != 0) { // fills a drop shadow on command
            	int dropShadowX = x + textbox.getShadowOffset();
            	int dropShadowY = y + textbox.getShadowOffset();
            	g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f));
            	g2d.fillRoundRect(dropShadowX, dropShadowY, xSize, ySize, round, round);
            }
        	
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));
            
            float thickness = textbox.getStroke();
            g2d.setStroke(new BasicStroke(thickness));
            
            g2d.setColor(colorsList[textbox.getColor()]); // set box color
            g2d.fillRoundRect(x, y, xSize, ySize, round, round);
            g2d.setColor(colorsList[textbox.getStrokeColor()]);
            g2d.drawRoundRect(x, y, xSize, ySize, round, round);
            
            g2d.setStroke(new BasicStroke(0));
            
            // ^ Textbox section
            // v Text section
            
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
        
        for (int i = 0; i < extraImages.length; i++) {
            BufferedImage image = extraImages[i];
            TextBox textbox = textBoxesList[i];
        
            Graphics2D g2d = (Graphics2D) g.create();
            RenderingHints rh = new RenderingHints(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON                    
                    );
            g2d.setRenderingHints(rh);
            
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, (textbox.getOpacity() / 255f) / 2));

            g2d.drawImage(image, textbox.getX() + (textbox.getXSize() / 2) + textbox.getOffsetX(), textbox.getY() + (textbox.getXSize() / 2) + textbox.getOffsetY(), null);
            g2d.dispose();
        }
    }
    
    public static double intToDouble(int input) {
		double toReturn = input;
		return toReturn;
	}
    
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        System.out.println(extraImages.length);
        System.out.println("Key Pressed: " + KeyEvent.getKeyText(keyCode));
    }

    public void keyReleased(KeyEvent e) {
        // Do nothing
    }

    public void keyTyped(KeyEvent e) {
        // Do nothing
    }
    
    private TextBox getBoxFromName(String name) { 
    	// get the box for the name given through the parameter
    	TextBox boxToReturn = null;
    	for (int i = 0; i < textBoxesList.length; i++) {
    		TextBox currentBox = textBoxesList[i];
    		if (currentBox.getName() == name) {
    			boxToReturn = currentBox;
    			break;
    		}
    	}
    	return boxToReturn;
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
    
    private static Renderable[] refreshScreenSizeRenderable(int screenWidth,int screenHeight) { 
    	// refreshes all renderables' sizes to fit the new screen size, runs on dynamicFrameSize() end.
    	double xScale = intToDouble(screenWidth) / 1920;
    	double yScale = intToDouble(screenHeight) / 1080;
    	Renderable[] renderablesList = new Renderable[rawRenderablesList.length];
        for (int i = 0; i < rawRenderablesList.length; i++) {
        	Renderable currentItem = rawRenderablesList[i];
        	String imagePath = currentItem.getImagePath();
        	int x = (int) Math.round(currentItem.getX() * xScale);
        	int y = (int) Math.round(currentItem.getY() * yScale);
        	int opacity = currentItem.getOpacity();
        	renderablesList[i] =  new Renderable(imagePath, x, y, opacity);
        }
        return renderablesList;
    }
    
    private static TextBox[] refreshScreenSizeText(int screenWidth,int screenHeight) {
    	// refreshes all textbox sizes to fit the new screen size, runs on dynamicFrameSize() end.
    	double xScale = intToDouble(screenWidth) / 1920;
    	double yScale = intToDouble(screenHeight) / 1080;
    	// System.out.println(screenWidth);
    	// System.out.println(xScale);
    	textBoxesList = new TextBox[rawTextBoxesList.length];
        for (int i = 0; i < rawTextBoxesList.length; i++) {
        	TextBox currentItem = rawTextBoxesList[i];
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
        	boolean renderRenderable = currentItem.renderable();
        	Renderable renderableObject = currentItem.getRenderableObject();
        	boolean bold = currentItem.getBold();
        	int roundPercentage = currentItem.getRoundPercentage();
        	int shadowOffset = currentItem.getShadowOffset();
        	float stroke = currentItem.getStroke();
        	int strokeColor = currentItem.getStrokeColor();
        	if (renderRenderable) {
        		textBoxesList[i] =  new TextBox(name, renderableObject, x, y, xSize, ySize, offsetX, offsetY,
        				color, opacity, bold, roundPercentage, shadowOffset, stroke, strokeColor);
        	} else {
        		textBoxesList[i] =  new TextBox(name, text, alignX, alignY, fontColor, textSize, x, y, xSize, ySize, offsetX, offsetY,
        				color, opacity, bold, roundPercentage, shadowOffset, stroke, strokeColor);
        	}
        }
        return textBoxesList;
    }
    
    private static int[] dynamicFrameSize(boolean forceSize, int sizeToForce) { 
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
        renderablesList = refreshScreenSizeRenderable(screenWidth,screenHeight);
        textBoxesList = refreshScreenSizeText(screenWidth,screenHeight);
        return toReturn;
    }

    public static void main(String args[]) throws Exception {
    	// main method
    	frame = new JFrame("Game"); // initialises the frame to allow changes to be applied
    	
    	boolean forceSize = true; // changable variables: can force the below screen size
        int sizeToForce = 1280; // changable variables: can foce this screen size if above is true
        
        // TODO: create a class that holds all static or final variables, including the above two and the other values
        // for below lists.
        
        // below defines the static variables which are the raw lists. Should be set again (ADD SETTER METHODS) when
        // a different page is selected. Colors need not be set on new page, but should have setter methods for the
        // settings page. Raw lists are used in refreshScreenSize() methods to calculate real size. Raw list values
        // are relative to the 1920x1080 screen size.
        
        rawRenderablesList = new Renderable[]{
                new Renderable("textures/kosbia.png", 10, 50, 255),
                new Renderable("textures/defaultcursor.png", 550, 100, 150),
        };
        
        rawTextBoxesList = new TextBox[]{
        		//TextBox(name, text, alignX, alignY, fontColor, textSize, x, y, xSize, ySize, offsetX, offsetY, color, opacity, bold, roundPercentage, ?shadowOffset)
        		//TextBox(name, renderableObject, x, y, xSize, ySize, offsetX, offsetY, color, opacity, bold, roundPercentage, ?shadowOffset) 
        		
        		// GO TO REFRESHSCREENSIZETEXT after adding new variables
        		new TextBox("Box1", "Test", "left", "top", 			 4, 50, 1280, 500, 550, 50, 0, 0, 2, 255, false, 50, 10, 5, 1),
        		new TextBox("Box2", "Test2", "center", "center", 	 2, 50, 200, 300, 550, 50, 0, 0, 3, 255, false, 100, 10, 5, 1),
        		new TextBox("Box3", "Test3", "right", "bottom", 	 1, 50, 300, 100, 550, 50, 0, 0, 1, 255, false, 100, 10, 5, 1)
        };
        
        colorsList = new Color[]{
        		new Color (0,0,0,255), // 0
        		new Color (255,0,0,255), // 1
        		new Color (0,255,0,255), // 2
        		new Color (0,0,255,255), // 3
        		new Color (255,0,0,50), // 4
        		new Color (0,255,0,50), // 5
        		new Color (0,0,255,50) // 6
        };
        
        dynamicFrameSize(forceSize, sizeToForce); // uses the above raw lists and variables to set the frame size.
        ShowImage panel = new ShowImage(); // runs showimage class (top of this class) to show text and renderables into a panel
        frame.getContentPane().add(panel); // adds the panel to frame content
        
        frame.setResizable(false);
        // BELOW IS DEPRECIATED: FRAME WILL ALWAYS BE UNRESIZABLE. can be resized in possibly settings
        
        /*if (forceSize) {
        	frame.setResizable(false);
        } else {
        	frame.setResizable(true);
        }*/
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        //frame.setUndecorated(true);
        
        // Set the frame size to the screen dimensions
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets closing operation
        frame.setVisible(true); // allows client to see frame
    }


}