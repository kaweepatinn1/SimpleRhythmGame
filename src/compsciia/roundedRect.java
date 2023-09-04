package compsciia;

public class roundedRect {
	private int x;
    private int y;
    private int xSize;
    private int ySize;
    private int round;
    
    public roundedRect(int x, int y, int xSize, int ySize, int round) {
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
}
