package SimpleRhythmGame;

// Initialize and read and write class

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Renderable {
	private String function;
	private String name;
    private String imagePath;
    private int x;
    private int y;
    private int xSize;
    private int ySize;
    private int opacity;
    private File file;
    private BufferedImage image;

    public Renderable(String function, String name, String imagePath, int x, int y,
    		int xSize, int ySize, int opacity) {
        this.function = function;
    	this.name = name;
    	this.imagePath = imagePath;
        this.x = x;
        this.y = y;
        this.xSize = xSize;
        this.ySize = ySize;
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
    
    public Renderable(String name, String imagePath, int x, int y, 
    		int xSize, int ySize, int opacity) {
        this.function = null;
    	this.name = name;
    	this.imagePath = imagePath;
        this.x = x;
        this.y = y;
        this.xSize = xSize;
        this.ySize = ySize;
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
    
    public void setFunction(String function) {
    	this.function = function;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public void setX(int x) {
        this.x =  x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public void setXSize(int xSize) {
    	this.xSize = xSize;
    }
    
    public void setYSize(int ySize) {
    	this.ySize = ySize;
    }

    public void setOpacity(int opacity) {
        this.opacity = opacity;
    }
    
    public void setFile(File file) {
    	this.file = file;
    }
    
    public void setImage(BufferedImage image) {
    	this.image = image;
    }
    
    public String getFunction() {
    	return function;
    }
    
    public String getName() {
    	return name;
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
    
    public int getXSize() {
    	return xSize;
    }
    
    public int getYSize() {
    	return ySize;
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
