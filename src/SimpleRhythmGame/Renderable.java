package SimpleRhythmGame;

// Initialize and read and write class

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.imgscalr.Scalr;

// Use 1920/1080 for best performance.

public class Renderable {
	private String function;
	private String name;
    private String imagePath;
    private int x;
    private int y;
    private int xSize;
    private int ySize;
    private int opacity;
    private transient BufferedImage image;

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
        try {
        	BufferedImage originalImage = ImageIO.read(getFile());
        	this.image = Scalr.resize(originalImage, Scalr.Method.QUALITY, Scalr.Mode.FIT_EXACT,
                    xSize, ySize, Scalr.OP_ANTIALIAS);
        } catch(IOException e){
        	this.image = null;
            System.out.println (e.toString());
            System.out.println("Could not find file: " + getFile());
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
        try {
        	BufferedImage originalImage = ImageIO.read(getFile());
        	this.image = Scalr.resize(originalImage, Scalr.Method.QUALITY, Scalr.Mode.FIT_EXACT,
                    xSize, ySize, Scalr.OP_ANTIALIAS);
        } catch(IOException e){
        	this.image = null;
            System.out.println (e.toString());
            System.out.println("Could not find file: " + getFile());
        }
    }
    
    public Renderable(String function, String name, int type, int texture, int x, int y,
    		int xSize, int ySize, int opacity) { // note type renderable
        this.function = function;
    	this.name = name;
    	if (type == DefaultValues.Texture_NOTE) {
    		this.imagePath = "#note " + texture;
    	} else if (type == DefaultValues.Texture_DRUM) {
    		this.imagePath = "#drum " + texture;
    	}
        this.x = x;
        this.y = y;
        this.xSize = xSize;
        this.ySize = ySize;
        this.opacity = opacity;
        if (imagePath.substring(0, 5).equals("#note")) {
    		BufferedImage originalImage = Main.getNoteImage(Integer.parseInt(imagePath.substring(6)));
        	BufferedImage scaledImage = Scalr.resize(originalImage, Scalr.Method.QUALITY, Scalr.Mode.FIT_EXACT,
                    xSize, ySize, Scalr.OP_ANTIALIAS);
        	this.image = scaledImage;
    	} else if (imagePath.substring(0, 5).equals("#drum")) {
    		BufferedImage originalImage = Main.getDrumImage(Integer.parseInt(imagePath.substring(6)));
        	BufferedImage scaledImage = Scalr.resize(originalImage, Scalr.Method.QUALITY, Scalr.Mode.FIT_EXACT,
                    xSize, ySize, Scalr.OP_ANTIALIAS);
        	this.image = scaledImage;
    	}
    }
    
    public Renderable(String name, int type, int texture, int x, int y,
    		int xSize, int ySize, int opacity) { // note type renderable
        this.function = null;
    	this.name = name;
    	if (type == DefaultValues.Texture_NOTE) {
    		this.imagePath = "#note " + texture;
    	} else if (type == DefaultValues.Texture_DRUM) {
    		this.imagePath = "#drum " + texture;
    	}
        this.x = x;
        this.y = y;
        this.xSize = xSize;
        this.ySize = ySize;
        this.opacity = opacity;
        if (imagePath.substring(0, 5).equals("#note")) {
    		BufferedImage originalImage = Main.getNoteImage(Integer.parseInt(imagePath.substring(6)));
        	BufferedImage scaledImage = Scalr.resize(originalImage, Scalr.Method.QUALITY, Scalr.Mode.FIT_EXACT,
                    xSize, ySize, Scalr.OP_ANTIALIAS);
        	this.image = scaledImage;
    	} else if (imagePath.substring(0, 5).equals("#drum")) {
    		BufferedImage originalImage = Main.getDrumImage(Integer.parseInt(imagePath.substring(6)));
        	BufferedImage scaledImage = Scalr.resize(originalImage, Scalr.Method.QUALITY, Scalr.Mode.FIT_EXACT,
                    xSize, ySize, Scalr.OP_ANTIALIAS);
        	this.image = scaledImage;
    	}
    }
    
    public static BufferedImage resize(BufferedImage originalImage, int newX, int newY) {
    	BufferedImage scaledImage = Scalr.resize(originalImage, Scalr.Method.QUALITY, Scalr.Mode.FIT_EXACT,
                newX, newY, Scalr.OP_ANTIALIAS);
    	return scaledImage;
    }
    
    public void setFunction(String function) {
    	this.function = function;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
        resetImage();
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
    
    public void setImage(BufferedImage image) {
    	this.image = Scalr.resize(image, Scalr.Method.QUALITY, Scalr.Mode.FIT_EXACT,
		        xSize, ySize, Scalr.OP_ANTIALIAS);
    }
    
    public void resetImage() {
    	if (imagePath.charAt(0) == '#') {
    		BufferedImage originalImage = Main.getNoteImage(Integer.parseInt(imagePath.substring(1)) - 1);
        	BufferedImage scaledImage = Scalr.resize(originalImage, Scalr.Method.QUALITY, Scalr.Mode.FIT_EXACT,
                    xSize, ySize, Scalr.OP_ANTIALIAS);
        	this.image = scaledImage;
    	} else {
    		try {
            	BufferedImage originalImage = ImageIO.read(getFile());
            	this.image = Scalr.resize(originalImage, Scalr.Method.QUALITY, Scalr.Mode.FIT_EXACT,
                        xSize, ySize, Scalr.OP_ANTIALIAS);
            } catch(IOException e){
            	this.image = null;
                System.out.println (e.toString());
                System.out.println("Could not find file: " + getFile());
            }
    	}
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
    	if (imagePath.charAt(0) == '%') {
    		if (Main.getConfig() != null) {
    			return new File((String) Main.getConfig().getVariable(imagePath));
    		} else {
    			return new File("src/textures/skins/" + DefaultValues.getDefaultSelectedSkin());
    		}
    	} else {
    		return new File(imagePath);
    	}
    }
    
    public BufferedImage getImage() {
		return image;
    }
    
    public RoundedArea toArea() {
    	return new RoundedArea(x,y,xSize,ySize,0);
    }
}

//ADD RESIZE IMAGE:
//Default code (to be changed)
/*
 BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) throws IOException {
 Image resultingImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_DEFAULT);
 BufferedImage outputImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
 outputImage.getGraphics().drawImage(resultingImage, 0, 0, null);
 return outputImage;
}*/
