package SimpleRhythmGame;

import java.awt.Color;

public class IntColor {
	private int red;
	private int green;
	private int blue; 
	private int alpha;
	
	IntColor(Color color){
		red = color.getRed();
		green = color.getGreen();
		blue = color.getBlue();
		alpha = color.getAlpha();
	}
	
	IntColor(int red, int green, int blue, int alpha){
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.alpha = alpha;
	}
	
	IntColor(int red, int green, int blue){
		this.red = red;
		this.green = green;
		this.blue = blue;
		alpha = 255;
	}
	
	IntColor(){
		red = 0;
		green = 0;
		blue = 0;
		alpha = 0;
	}
	
	public int[] getColorInts() {
		return new int[]{red, green, blue, alpha};
	}
	
	public Color toColor() {
		return new Color(red, green, blue, alpha);
	}
	
	public void setColor(int red, int blue, int green, int alpha) {
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.alpha = alpha;
	}
	
	public void setColor(Color colors) {
		red = colors.getRed();
		green = colors.getGreen();
		blue = colors.getBlue();
		alpha = colors.getAlpha();
	}
	
	public void setColor(String hex) {
		// System.out.println(hex);
		red = Integer.parseInt(hex.substring(1, 3),16);
		green = Integer.parseInt(hex.substring(3, 5),16);
		blue = Integer.parseInt(hex.substring(5, 7),16);
		alpha = 255;
	}
	
	public void setColorFromInts(int[] colors) {
		red = colors[0];
		green = colors[1];
		blue = colors[2];
		alpha = colors[3];
	}

	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
		this.green = green;
	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) {
		this.blue = blue;
	}

	public int getAlpha() {
		return alpha;
	}

	public void setAlpha(int alpha) {
		this.alpha = alpha;
	}
	
	public String toHex() {
		String r = (Integer.toHexString(red).toUpperCase().length() == 1 ? "0" : "") + Integer.toHexString(red).toUpperCase();
		String g = (Integer.toHexString(green).toUpperCase().length() == 1 ? "0" : "") + Integer.toHexString(green).toUpperCase();
		String b = (Integer.toHexString(blue).toUpperCase().length() == 1 ? "0" : "") + Integer.toHexString(blue).toUpperCase();
		return '#' + 
				r +
				g + 
				b;
	}
}
