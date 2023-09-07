package SimpleRhythmGame;

// Initialize and read only class

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Renderable {
    private String imagePath;
    private int x;
    private int y;
    private int opacity;
    private File file;
    private BufferedImage image;

    public Renderable(String imagePath, int x, int y, int opacity) {
        this.imagePath = imagePath;
        this.x = x;
        this.y = y;
        this.opacity = opacity;
        this.file = new File(imagePath);
        try {
        	this.image = ImageIO.read(file);
        } catch(IOException e){
        	this.image = null;
            System.out.println (e.toString());
            System.out.println("Could not find file: " + file);
        }
    }

    public String getImagePath() {
        return imagePath;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getOpacity() {
        return opacity;
    }
    
    public File getFile() {
    	return file;
    }
    
    public BufferedImage getImage() {
    	return image;
    }
}
