package SimpleRhythmGame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class KeyInput implements KeyListener {
    
    public KeyInput() {
        JFrame frame = new JFrame("Key Input Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addKeyListener(this);
        frame.setFocusable(true);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new KeyInput();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not needed for this example
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
    public void keyReleased(KeyEvent e) {
        // Not needed for this example
    }
}