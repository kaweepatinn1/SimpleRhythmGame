package compsciia;
import java.util.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
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
    private static Renderable[] renderables;
    private static Renderable[] rawRenderablesList;
    private static TextBox[] textBoxesList;
    private static TextBox[] rawTextBoxesList;
    private static BufferedImage[] extraImages;
    private static int clickedImageIndex = -1;
    private static Color[] colorsList;
    private static JFrame frame;
    
    public ShowImage(Renderable[] renderables, TextBox[] textBoxes, Color[] colors) {
        setLayout(new BorderLayout()); // Set the main panel's layout to BorderLayout
        try {
            // Initialize the array to store the images and renderables
            images = new BufferedImage[renderables.length];
            this.renderables = renderables;
            this.textBoxesList = textBoxes; // Assign the parameter to the instance variable
            this.colorsList = colors; // Assign the colors parameter to the instance variable
            LinkedList<BufferedImage> extraImagesList = new LinkedList();

            // Load the images from the file names in the renderables into the images list
            for (int i = 0; i < renderables.length; i++) {
                Renderable renderable = renderables[i];
                File input = new File(renderable.getImagePath());
                images[i] = ImageIO.read(input);
            }
            for (int i = 0; i < textBoxes.length; i++) {
                if (textBoxes[i].shouldRenderRenderable() == true) {
	            	Renderable renderable = textBoxes[i].getRenderableObject();
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

                for (int i = 0; i < renderables.length; i++) {
                    Renderable renderable = renderables[i];
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
                    Renderable clickedRenderable = renderables[clickedImageIndex];
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
                //System.out.println("Mouse moved to (" + mouseX + ", " + mouseY +  ")");            
                for (int i = 0; i < textBoxesList.length; i++) {
                    TextBox currentBox = textBoxesList[i];
                    roundedRect roundRectAttributes = getBoxAttributes(currentBox);
                    int x = roundRectAttributes.getX();
                	int y = roundRectAttributes.getY();
                	int xSize = roundRectAttributes.getXSize();
                	int ySize = roundRectAttributes.getYSize();
                	int round = roundRectAttributes.getRound();
                    RoundRectangle2D roundRect = new RoundRectangle2D.Double(x, y,xSize, ySize,round,round);
                    if (roundRect.contains(mouseX, mouseY)) {
                        System.out.println("Hovering" + currentBox.getName());
                        frame.setSize(1920, 1080);
                        break;
                    }
                }
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
            Renderable renderable = renderables[i];

            Graphics2D g2d = (Graphics2D) g.create();
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
        	TextBox textbox = textBoxesList[i];
        	g.setColor(colorsList[textbox.getColor()]);
        	roundedRect roundRectAttributes = getBoxAttributes(textbox);
        	int x = roundRectAttributes.getX();
        	int y = roundRectAttributes.getY();
        	int xSize = roundRectAttributes.getXSize();
        	int ySize = roundRectAttributes.getYSize();
        	int round = roundRectAttributes.getRound();
            g.fillRoundRect(x, y,xSize, ySize,round,round);
            g.setColor(colorsList[textbox.getFontColor()]);
            Font font;
            if (textbox.getBold() == true) {
            	font = new Font("Roboto", Font.BOLD, textbox.getTextSize());
            	g.setFont(font);
            } else {
            	font = new Font("Roboto", Font.PLAIN, textbox.getTextSize());
            	g.setFont(font);
            }
            int finalX = x + textbox.getOffsetX();
            int finalY = y + textbox.getOffsetY();
            g.drawString(textbox.getText(), finalX, finalY);
        	
        }
        
        for (int i = 0; i < extraImages.length; i++) {
            BufferedImage image = extraImages[i];
            TextBox textbox = textBoxesList[i];

            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, textbox.getOpacity() / 255f));

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
    	double xScale = intToDouble(screenWidth) / 1920;
    	double yScale = intToDouble(screenHeight) / 1080;
    	System.out.println(screenWidth);
    	System.out.println(xScale);
    	textBoxesList = new TextBox[rawTextBoxesList.length];
        for (int i = 0; i < rawTextBoxesList.length; i++) {
        	TextBox currentItem = rawTextBoxesList[i];
        	String name = currentItem.getName();
        	String text = currentItem.getText();
        	int fontColor = currentItem.getFontColor();
        	int textSize = (int) Math.round(currentItem.getTextSize() * Math.min(xScale, yScale));
        	int x = (int) Math.round(currentItem.getX() * xScale);
        	int y = (int) Math.round(currentItem.getY() * yScale);
        	int xSize = (int) Math.round(currentItem.getXSize() * xScale);
        	int ySize = (int) Math.round(currentItem.getYSize() * yScale);
        	int offsetX = (int) Math.round(currentItem.getOffsetX() * xScale);
        	int offsetY = (int) Math.round(currentItem.getOffsetY() * yScale);
        	int color = currentItem.getColor();
        	int opacity = currentItem.getOpacity();
        	boolean renderRenderable = currentItem.shouldRenderRenderable();
        	Renderable renderableObject = currentItem.getRenderableObject();
        	boolean bold = currentItem.getBold();
        	int roundPercentage = currentItem.getRoundPercentage();
        	if (renderRenderable) {
        		textBoxesList[i] =  new TextBox(name, renderableObject, x, y, xSize, ySize, offsetX, offsetY,
        				color, opacity, bold, roundPercentage);
        	} else {
        		textBoxesList[i] =  new TextBox(name, text, fontColor, textSize, x, y, xSize, ySize, offsetX, offsetY,
        				color, opacity, bold, roundPercentage);
        	}
        }
        return textBoxesList;
    }
    
    private static int[] dynamicFrameSize(boolean forceSize, int sizeToForce) { 
    	//returns an array of size two with possible screen dimensions for the screen size
    	//or if specified forces a size declared in sizeToForce if forceSize is true.
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
        int screenWidth = Math.min(screenDefaultWidth, screenDefaultHeight * 16 / 9);
        int screenHeight = screenWidth / 16 * 9;
        int[] toReturn = {screenWidth, screenHeight};
        return toReturn;
    }
    
    private static int[] dynamicFrameSize() { 
    	//returns an array of size two with possible screen dimensions for the screen size
    	//or if specified forces a size declared in sizeToForce if forceSize is true.
    	GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    	int screenDefaultWidth;
        int screenDefaultHeight;
    	screenDefaultWidth = gd.getDisplayMode().getWidth(); // gets the width of the current display
        screenDefaultHeight = gd.getDisplayMode().getHeight(); // gets the height of the current display
        int screenWidth = Math.min(screenDefaultWidth, screenDefaultHeight * 16 / 9);
        int screenHeight = screenWidth / 16 * 9;
        int[] toReturn = {screenWidth, screenHeight};
        return toReturn;
    }
    
    public static void main(String args[]) throws Exception {
    	boolean forceSize = true;
        int sizeToForce = 1920;
    	int[] screenDimensions = dynamicFrameSize(forceSize, sizeToForce);
    	int screenWidth = screenDimensions[0];
    	int screenHeight = screenDimensions[1];
        // Define the image renderables
        rawRenderablesList = new Renderable[]{
                new Renderable("textures/kosbia.png", 10, 50, 255),
                new Renderable("textures/defaultcursor.png", 550, 100, 150),
        };
        
        rawTextBoxesList = new TextBox[]{
        		//TextBox(name, text, fontColor, textSize, x, y, xSize, ySize, offsetX, offsetY, color, opacity, bold, roundPercentage)
        		//TextBox(name,  renderableObject, x, y, xSize, ySize, offsetX, offsetY, color, opacity, bold, roundPercentage) 
        		new TextBox("Box1", "Test", 2, 12, 100, 500, 550, 50, 0, 25, 3, 255, false, 50),
        		new TextBox("Box2", "Test2", 2, 35, 200, 300, 550, 50, 0, 25, 3, 255, false, 100),
        		new TextBox("Box3", "Test3", 1, 20, 300, 100, 550, 50, 0, 25, 3, 255, false, 100)
        };
        
        Renderable[] renderablesList = refreshScreenSizeRenderable(screenWidth,screenHeight);
        TextBox[] textBoxesList = refreshScreenSizeText(screenWidth,screenHeight);
        
        Color[] colorsList = {
        		new Color (0,0,0,255),
        		new Color (255,0,0,255),
        		new Color (0,255,0,255),
        		new Color (0,0,255,255)
        };
        
        frame = new JFrame("Game");
        ShowImage panel = new ShowImage(renderablesList, textBoxesList, colorsList);
        frame.getContentPane().add(panel);
        frame.setSize(screenWidth, screenHeight);
        if (forceSize) {
        	frame.setResizable(false);
        } else {
        	frame.setResizable(true);
        }
        // Set the frame size to the screen dimensions
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


}