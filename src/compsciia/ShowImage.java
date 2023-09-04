package compsciia;

import java.util.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class ShowImage extends JPanel implements KeyListener {
    private BufferedImage[] images;
    private Renderable[] renderables;
    private BufferedImage[] extraImages;
    private int clickedImageIndex = -1;
    private TextBox[] textBoxesList;
    private Color[] colorsList;
    
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
                File input = new File(renderable.getImageName());
                images[i] = ImageIO.read(input);
            }
            for (int i = 0; i < textBoxes.length; i++) {
                if (textBoxes[i].shouldRenderRenderable() == true) {
	            	Renderable renderable = textBoxes[i].getRenderableObject();
	                File input = new File(renderable.getImageName());
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
                    System.out.println("Clicked Image: " + clickedRenderable.getImageName());
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
        	int x = textbox.getX();
        	int y = textbox.getY();
        	int xSize = textbox.getXSize();
        	int ySize = textbox.getYSize();
            g.fillRect(x, y, xSize, ySize);
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

    public static void main(String args[]) throws Exception {
        // Get the default screen device and screen dimensions
        int screenWidth = 1920; // Temporary width value used during development
        int screenHeight = 1080;
        //GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        //int screenWidth = gd.getDisplayMode().getWidth(); // gets the width of the current display
        //int screenHeight = gd.getDisplayMode().getHeight(); // gets the height of the current display

        // Define the image renderables
        Renderable[] renderablesList = {
                new Renderable("textures/kosbia.png", 10, 50, 255),
                new Renderable("textures/defaultcursor.png", 550, 100, 150),
        };
        
        TextBox[] textBoxesList = {
        		new TextBox("Test", 2, 12, 100, 100, 50, 50, 0, 0, 3, 255, false),
        		new TextBox("Test2", 2, 24, 200, 100, 50, 50, 0, 0, 3, 255, false),
        		new TextBox("Test3", 1, 20, 300, 100, 50, 50, 0, 0, 3, 255, false)
        };
        
        Color[] colorsList = {
        		new Color (0,0,0,255),
        		new Color (255,0,0,255),
        		new Color (0,255,0,255),
        		new Color (0,0,255,255)
        };
        
        JFrame frame = new JFrame("Game");
        ShowImage panel = new ShowImage(renderablesList, textBoxesList, colorsList);
        frame.getContentPane().add(panel);
        frame.setSize(screenWidth, screenHeight); // Set the frame size to the screen dimensions
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}