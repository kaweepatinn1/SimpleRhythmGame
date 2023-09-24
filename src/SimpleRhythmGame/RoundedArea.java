package SimpleRhythmGame;

public class RoundedArea {
	private int x;
	private int y;
	private int xSize;
	private int ySize;
	private int roundPercentage;
	
	public RoundedArea(int x, int y, int xSize, int ySize, int roundPercentage) {
		this.x = x;
		this.y = y;
		this.xSize = xSize;
		this.ySize = ySize;
		this.roundPercentage = roundPercentage;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getXSize() {
		return xSize;
	}
	public void setXSize(int xSize) {
		this.xSize = xSize;
	}
	public int getYSize() {
		return ySize;
	}
	public void setYSize(int ySize) {
		this.ySize = ySize;
	}
	public int getRoundPercentage() {
		return roundPercentage;
	}
	public void setRoundPercentage(int roundPercentage) {
		this.roundPercentage = roundPercentage;
	}
}
