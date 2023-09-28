package SimpleRhythmGame;

import java.awt.Color;

public class Theme {
	private String themeName;
	private IntColor[] colorsList;
	
	public Theme(String themeName, IntColor[] colorList) {
		this.themeName = themeName;
		this.colorsList = colorList;
	}
	
	public String getThemeName() {
		return themeName;
	}
	public void setThemeName(String themeName) {
		this.themeName = themeName;
	}
	public IntColor[] getColorsList() {
		return colorsList;
	}
	public void setColorList(IntColor[] colorList) {
		this.colorsList = colorList;
	}
	
	public void setColorsList(Color[] newColorsList) {
		IntColor[] toSet = new IntColor[newColorsList.length];
		for (int i = 0 ; i < newColorsList.length ; i++) {
			toSet[i] = new IntColor(newColorsList[i]);
		}
		this.colorsList = toSet;
	}
	
	public IntColor getColorOfIndex(int index) {
		return colorsList[index];
	}
	
	public void setColorOfIndex(IntColor color, int index) {
		this.colorsList[index] = color;
	}
	
	
}
