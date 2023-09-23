package SimpleRhythmGame;

import java.awt.Color;

public class Config {
	private boolean fullscreen;
	private int sizeToForce;
	private Controls[] controls;
	private int[][] colors;
	private String[] fonts;
	private Menu[] menus;
	
	public Config() {
		// Do Nothing
	}
	
	public Config(boolean fullscreen, int sizeToForce, Controls[] controls, Color[] colors, String[] fonts, Menu[] menus) {
		this.fullscreen = fullscreen;
		this.sizeToForce = sizeToForce;
		this.controls = controls;
		setColors(colors);
		this.fonts = fonts;
		this.menus = menus;
	}

	public boolean isFullscreen() {
		return fullscreen;
	}

	public void setFullscreen(boolean fullscreen) {
		this.fullscreen = fullscreen;
	}

	public int getSizeToForce() {
		return sizeToForce;
	}

	public void setSizeToForce(int sizeToForce) {
		this.sizeToForce = sizeToForce;
	}

	public Controls[] getControls() {
		return controls;
	}

	public void setControls(Controls[] controls) {
		this.controls = controls;
	}

	public Color[] getColors() {
		Color[] toOutputColors = new Color[colors.length];
		for (int i = 0 ; i < colors.length ; i++) {
			int[] color = colors[i];
			toOutputColors[i] = new Color(color[1],color[2],color[3],color[4]);
		}
		return toOutputColors;
	}

	public void setColors(Color[] colorsInput) {
		int[][] toInputColors = new int[colorsInput.length][4];
		for (int i = 0; i < colorsInput.length ; i++) {
			toInputColors[i] = new int[]{colorsInput[i].getRed(),colorsInput[i].getGreen(),colorsInput[i].getBlue(),colorsInput[i].getAlpha()};
		}
		this.colors = toInputColors;
	}

	public String[] getFonts() {
		return fonts;
	}

	public void setFonts(String[] fonts) {
		this.fonts = fonts;
	}

	public Menu[] getMenus() {
		return menus;
	}

	public void setMenus(Menu[] menus) {
		this.menus = menus;
	}
}
