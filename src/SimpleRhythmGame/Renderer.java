package SimpleRhythmGame;

import java.awt.EventQueue;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Renderer implements KeyListener {

    private JFrame frame;
	public int screenWidth;
	public int screenHeight;
	private JTextField textField;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Renderer window = new Renderer();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Renderer() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
    	frame = new JFrame();
    	GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    	screenWidth = 1920; //temporary width height values used during development
    	screenHeight = 1080;
    	//screenWidth = gd.getDisplayMode().getWidth(); // gets the width and height of the current display
    	//screenHeight = gd.getDisplayMode().getHeight();
    	frame.setSize(screenWidth,screenHeight);
        
    	
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_UP) {
            System.out.println("Up Arrow Key is pressed!");
        } else if (keyCode == KeyEvent.VK_DOWN) {
            System.out.println("Down Arrow Key is pressed!");
        } else if (keyCode == KeyEvent.VK_LEFT) {
            System.out.println("Left Arrow Key is pressed!");
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            System.out.println("Right Arrow Key is pressed!");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not needed for this example
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Not needed for this example
    }
}