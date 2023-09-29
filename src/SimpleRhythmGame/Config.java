package SimpleRhythmGame;

import java.awt.Color;

public class Config {
	private final static int colorsLength = 9;
	
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
	private String currentThemeChoice;
	private Theme[] themes; // used to return faster, not included in json file
	private String[] fonts;
	private Menu[] menus;
	
	public Config() {
		// Do Nothing
	}
	
	public Config(boolean fullscreen, int sizeToForce, Controls[] controls, Theme[] themes, 
			String currentThemeChoice, String[] fonts, Menu[] menus,
			boolean DEBUG_drawMasks, int DEBUG_masksColorsOffset, boolean nanoSecondPrecision, int framesToStore,
			int framerate, boolean shouldLimitFramerate, boolean cursorEnabled) {
		this.fullscreen = fullscreen;
		this.sizeToForce = sizeToForce;
		this.controls = controls;
		this.themes = themes;
		this.currentThemeChoice = currentThemeChoice;
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
	
	public void setThemes(Theme[] themes) {
		this.themes = themes;
	}

	public Theme[] getThemes() {
		return themes;
//		Color[] toOutputColors = new Color[colorsRaw.length];
//		for (int i = 0 ; i < colorsRaw.length ; i++) {
//			int[] color = colorsRaw[i];
//			toOutputColors[i] = new Color(color[0],color[1],color[2],color[3]);
//		}
	}
	
	public Theme getThemeOfIndex(int index) {
		return themes[index];
	}
	
	public Theme getCurrentTheme() {
		return themes[getCurrentThemeChoiceIndex()];
	}
	
	public boolean addTheme(Theme newTheme) {
		boolean duplicate = false;
		for (int i = 0 ; i < themes.length ; i++) {
			if (themes[i].getThemeName().equals(newTheme.getThemeName())) {
				duplicate = true;
			}
		}
		if (!duplicate) {
			Theme[] toSetThemes = new Theme[themes.length + 1];
			System.arraycopy(themes, 0, toSetThemes, 0, themes.length);
			toSetThemes[toSetThemes.length - 1] = newTheme;
			themes = toSetThemes;
			return true;
		} else {
			System.out.println("Theme with name \""+ newTheme.getThemeName() +"\" already exists!");
			return false;
		}
	}
	
	public boolean updateTheme(Theme newTheme, String themeName) {
		int index = getIndexFromThemeName(themeName);
		if (index != -1) {
			themes[index] = newTheme;
			return true;
		} else {
			System.out.println("Theme \"" + themeName + "\" does not exist!");
			return false;
		}
	}
	
	public boolean removeTheme(String themeName) {
		int index = getIndexFromThemeName(themeName);
		if (index != -1) {
			Theme[] toSetThemes = new Theme[themes.length - 1];
			if (index != 0) {
				System.arraycopy(themes, 0, toSetThemes, 0, index);
			}
			System.arraycopy(themes, index + 1, toSetThemes, index, themes.length - (index + 1));
			themes = toSetThemes;
			return true;
		} else {
			System.out.println("Theme \"" + themeName + "\" does not exist!");
			return false;
		}
	}
	
	public int getIndexFromThemeName(String name) {
		for (int i = 0 ; i < themes.length ; i++) {
			Theme theme = themes[i];
			if (theme.getThemeName().equals(name)) {
				return i;
			}
		}
		// if search fails
		return -1;
	}
	
	public Color[] getColorsFromThemeName (String name) {
		Color[] toSetColors = new Color[colorsLength];
		Theme theme = themes[getIndexFromThemeName(name)];
		for (int i = 0 ; i < colorsLength ; i++) {
			IntColor color = theme.getColorOfIndex(i);
			toSetColors[i] = color.toColor();
		}
		return toSetColors;
	}
	
	public IntColor[] getIntColorsFromThemeName (String name) {
		IntColor[] toSetColors = new IntColor[colorsLength];
		Theme theme = themes[getIndexFromThemeName(name)];
		for (int i = 0 ; i < colorsLength ; i++) {
			toSetColors[i] = theme.getColorOfIndex(i);
		}
		return toSetColors;
	}
	
	public void setColorsForTheme(Color[] colorsInput, String name) {
		themes[getIndexFromThemeName(name)].setColorsList(colorsInput);
	}

	public void setColorForConfigThemes(Color[][] colorsInput) {
		for (int i = 0; i < colorsInput.length ; i++) {
			themes[i].setColorsList(colorsInput[i]);
		}
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

	public String getCurrentThemeChoice() {
		return currentThemeChoice;
	}
	
	public int getCurrentThemeChoiceIndex() {
		return getIndexFromThemeName(currentThemeChoice);
	}

	public void setCurrentThemeChoice(String currentColorsChoice) {
		this.currentThemeChoice = currentColorsChoice;
	}
	
	public Color[] getCurrentThemeColors() {
		return getColorsFromThemeName(getCurrentThemeChoice());
	}
	
	public IntColor[] getCurrentThemeIntColors() {
		return getIntColorsFromThemeName(getCurrentThemeChoice());
	}
}
