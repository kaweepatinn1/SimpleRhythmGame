package SimpleRhythmGame;

import java.awt.Color;

public class Config {
	private static int colorsLength = 7;
	
	private boolean fullscreen;
	private int sizeToForce;
	
	private boolean nanoSecondPrecision;
	private int framesToStore;
	private int framerate;
	private boolean shouldLimitFramerate;
	
	private boolean cursorEnabled;
	
	private boolean DEBUG_drawMasks;
	private int DEBUG_masksColorsOffset;
	
	private Controls[] controls;
	private int[][] colorsRaw;
	private transient Color[] colors; // used to return faster, not included in json file
	private String[] fonts;
	private Menu[] menus;
	
	public Config() {
		// Do Nothing
	}
	
	public Config(boolean fullscreen, int sizeToForce, Controls[] controls, Color[] colors, String[] fonts, Menu[] menus,
			boolean DEBUG_drawMasks, int DEBUG_masksColorsOffset, boolean nanoSecondPrecision, int framesToStore,
			int framerate, boolean shouldLimitFramerate, boolean cursorEnabled) {
		this.fullscreen = fullscreen;
		this.sizeToForce = sizeToForce;
		this.controls = controls;
		setColors(colors);
		this.fonts = fonts;
		this.menus = menus;
		this.nanoSecondPrecision = nanoSecondPrecision;
		this.framesToStore = framesToStore;
		this.framerate = framerate;
		this.shouldLimitFramerate = shouldLimitFramerate;
		this.cursorEnabled = cursorEnabled;
		this.DEBUG_drawMasks = DEBUG_drawMasks;
		this.DEBUG_masksColorsOffset = DEBUG_masksColorsOffset;
	}
	
	public static int getColorsLenth() {
		return colorsLength;
	}

	public boolean getFullscreen() {
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
		return colors;
//		Color[] toOutputColors = new Color[colorsRaw.length];
//		for (int i = 0 ; i < colorsRaw.length ; i++) {
//			int[] color = colorsRaw[i];
//			toOutputColors[i] = new Color(color[0],color[1],color[2],color[3]);
//		}
	}
	
	public void setIntToColors() {
		Color[] toSetColors = new Color[colorsRaw.length];
		for (int i = 0 ; i < colorsRaw.length ; i++) {
			int[] color = colorsRaw[i];
			toSetColors[i] = new Color(color[0],color[1],color[2],color[3]);
		}
		this.colors = toSetColors;
	}

	public void setColors(Color[] colorsInput) {
		this.colors = colorsInput;
		int[][] toInputColors = new int[colorsInput.length][4];
		for (int i = 0; i < colorsInput.length ; i++) {
			toInputColors[i] = new int[]{colorsInput[i].getRed(),colorsInput[i].getGreen(),colorsInput[i].getBlue(),colorsInput[i].getAlpha()};
		}
		this.colorsRaw = toInputColors;
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
	
	public Menu getMenuFromIndex(int i) {
		return menus[i];
	}

	public void setMenus(Menu[] menus) {
		this.menus = menus;
	}
	
	public boolean getNanoSecondPrecision() {
		return nanoSecondPrecision;
	}
	
	public int getFramesToStore() {
		return framesToStore;
	}
	
	public int getFramerate() {
		return framerate;
	}
	
	public void setFramerate(int framerate) {
		this.framerate = framerate;
		Framerate.set(framerate);
	}
	
	public boolean getShouldLimitFramerate() {
		return shouldLimitFramerate;
	}
	
	public void setShouldLimitFramerate(boolean limitFramerate) {
		this.shouldLimitFramerate = limitFramerate;
		Framerate.setShouldLimitFramerate(limitFramerate);
	}
	
	public boolean DEBUG_drawMasks() {
		return DEBUG_drawMasks;
	}
	
	public void DEBUG_drawMasks(boolean DEBUG_drawMasks) {
		this.DEBUG_drawMasks = DEBUG_drawMasks;
	}
	
	public int DEBUG_masksColorsOffset() {
		return DEBUG_masksColorsOffset;
	}
	
	public void DEBUG_masksColorsOffset(int DEBUG_masksColorsOffset) {
		this.DEBUG_masksColorsOffset = DEBUG_masksColorsOffset;
	}

	public boolean getCursorEnabled() {
		return cursorEnabled;
	}

	public void setCursorEnabled(boolean cursorEnabled) {
		this.cursorEnabled = cursorEnabled;
	}
}
