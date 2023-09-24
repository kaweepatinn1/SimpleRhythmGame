package SimpleRhythmGame;

import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;

public class RoundedRect {
	private int x;
    private int y;
    private int xSize;
    private int ySize;
    private int round;
    
    public RoundedRect(int x, int y, int xSize, int ySize, int round) {
    	this.x = x;
        this.y = y;
        this.xSize = xSize;
        this.ySize = ySize;
        this.round = round;
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

    public int getRound() {
        return round;
    }
    
    public void setX(int x) {
        this.x = x;
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
    
    public void setRound(int round) {
    	this.round = round;
    }
    
    public Area getArea() {
    	
    	RoundRectangle2D areaBounds = new RoundRectangle2D.Double(
    			getX(), 
    			getY(), 
    			getXSize(), 
    			getYSize(), 
    			getRound(), 
    			getRound());
    	
    	Area area = new Area(areaBounds);
    	return area;
    }
}
