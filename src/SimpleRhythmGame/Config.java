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
	private boolean displayFramerate;
	
	private double transitionTime; // for transitioning between screens
	
	private boolean cursorEnabled;
	
	private int masterVolume;
	private int musicVolume;
	private int SFXVolume;
	
	private boolean DEBUG_drawMasks;
	private int DEBUG_masksColorsOffset;
	private int DEBUG_masksOpacity;
	
	private Controls[] controls;
	private String currentThemeChoice;
	private String currentSkinChoice;
	private Theme[] themes; // used to return faster, not included in json file
	private String[] fonts;
	private Menu[] menus;
	
	public Config() {
		// Do Nothing
	}
	
	public Config(boolean fullscreen, int sizeToForce, Controls[] controls, Theme[] themes, 
			String currentThemeChoice, String currentSkinChoice,
			String[] fonts, Menu[] menus, boolean nanoSecondPrecision, int framesToStore,
			int framerate, boolean shouldLimitFramerate, boolean displayFramerate,
			boolean cursorEnabled, double transitionTime,
			int masterVolume, int musicVolume, int SFXVolume,
			boolean DEBUG_drawMasks, int DEBUG_masksColorsOffset, int DEBUG_masksOpacity) {
		this.fullscreen = fullscreen;
		this.sizeToForce = sizeToForce;
		this.controls = controls;
		this.themes = themes;
		this.currentThemeChoice = currentThemeChoice;
		this.currentSkinChoice = currentSkinChoice;
		ShowImage.bufferSkin(currentSkinChoice);
		this.fonts = fonts;
		this.menus = menus;
		this.nanoSecondPrecision = nanoSecondPrecision;
		this.framesToStore = framesToStore;
		this.framerate = framerate;
		this.shouldLimitFramerate = shouldLimitFramerate;
		this.displayFramerate = displayFramerate;
		this.cursorEnabled = cursorEnabled;
		this.transitionTime = transitionTime;
		this.masterVolume = masterVolume;
		this.musicVolume = musicVolume;
		this.SFXVolume = SFXVolume;
		this.DEBUG_drawMasks = DEBUG_drawMasks;
		this.DEBUG_masksColorsOffset = DEBUG_masksColorsOffset;
		this.DEBUG_masksOpacity = DEBUG_masksOpacity;
	}
	
	public static int getColorsLenth() {
		return colorsLength;
	}

	public boolean getFullscreen() {
		return fullscreen;
	}

	public void setFullscreen(boolean fullscreen) {
		this.fullscreen = fullscreen;
		FileIO.currentConfigOut();
	}

	public int getSizeToForce() {
		return sizeToForce;
	}

	public void setSizeToForce(int sizeToForce) {
		this.sizeToForce = sizeToForce;
		FileIO.currentConfigOut();
	}

	public Controls[] getControls() {
		return controls;
	}

	public void setControls(Controls[] controls) {
		this.controls = controls;
		FileIO.currentConfigOut();
	}
	
	public void setThemes(Theme[] themes) {
		this.themes = themes;
		FileIO.currentConfigOut();
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
	
	public boolean importTheme(Theme theme) {
		boolean duplicate = false;
		for (int i = 0 ; i < themes.length ; i++) {
			if (themes[i].getThemeName().equals(theme.getThemeName())) {
				duplicate = true;
				break;
			}
		}
		
		if (duplicate) {
			Functions.runFunction("addPopup int 1");
			return false;
		} else {
			Theme[] toSetThemes = new Theme[themes.length + 1];
			System.arraycopy(themes, 0, toSetThemes, 0, themes.length);
			toSetThemes[toSetThemes.length - 1] = theme;
			themes = toSetThemes;
			setCurrentThemeChoice(theme.getThemeName());
			ShowImage.refreshMenu();
			FileIO.currentConfigOut();
			return true;
		}
	}
	
	public boolean addTheme() {
		boolean duplicate = true;
		int iteration = -1;
		while (duplicate == true) {
			iteration++;
			boolean stillDuplicate = false;
			for (int i = 0 ; i < themes.length ; i++) {
				if (themes[i].getThemeName().equals("NewTheme" + iteration)) {
					stillDuplicate = true;
					break;
				}
			}
			if (!stillDuplicate) {
				duplicate = false;
			}
		}
		Theme[] toSetThemes = new Theme[themes.length + 1];
		System.arraycopy(themes, 0, toSetThemes, 0, themes.length);
		toSetThemes[toSetThemes.length - 1] = new Theme(
				"NewTheme" + iteration,
				new IntColor[] {
						new IntColor (102,102,102,255), // 0. BG Color
						new IntColor (217,234,211,255), // 1. Menu Color
			    		new IntColor (207,226,243,255), // 2. Buttons Color
			    		new IntColor (255,255,255,255), // 3. Primary Selection Color
			    		new IntColor (217,217,217,255), // 4. Secondary Selection Color
			    		new IntColor (255,0,0,255), // 5. Accent Color
			    		new IntColor (0,0,0,255), // 6. Stroke Color
			    		new IntColor (0,0,0,0), // 7. Transparent Color
			    		new IntColor (255,255,255,255), // 8. Display Color
				}
				);
		themes = toSetThemes;
		setCurrentThemeChoice("NewTheme" + iteration);
		ShowImage.refreshMenu();
		FileIO.currentConfigOut();
		return true;
	}
	
	public boolean updateTheme(Theme newTheme, String themeName) {
		int index = getIndexFromThemeName(themeName);
		if (index != -1) {
			themes[index] = newTheme;
			FileIO.currentConfigOut();
			return true;
		} else {
			System.out.println("Theme \"" + themeName + "\" does not exist!");
			return false;
		}
	}
	
	public boolean removeTheme(String themeName) {
		if (themes.length > 1) {
			int index = getIndexFromThemeName(themeName);
			if (index != -1) {
				Theme[] toSetThemes = new Theme[themes.length - 1];
				if (index != 0) {
					System.arraycopy(themes, 0, toSetThemes, 0, index);
				}
				System.arraycopy(themes, index + 1, toSetThemes, index, themes.length - (index + 1));
				currentThemeChoice = index < (themes.length - 1) ? themes[index + 1].getThemeName() : themes[index - 1].getThemeName();
				themes = toSetThemes;
				ShowImage.refreshMenu();
				FileIO.currentConfigOut();
				return true;
			} else {
				System.out.println("Theme \"" + themeName + "\" does not exist!");
				return false;
			}
		} else {
			System.out.println("Cannot remove last theme!");
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
		FileIO.currentConfigOut();
	}

	public void setColorForConfigThemes(Color[][] colorsInput) {
		for (int i = 0; i < colorsInput.length ; i++) {
			themes[i].setColorsList(colorsInput[i]);
		}
		FileIO.currentConfigOut();
	}

	public String[] getFonts() {
		return fonts;
	}

	public void setFonts(String[] fonts) {
		this.fonts = fonts;
		FileIO.currentConfigOut();
	}

	public Menu[] getMenus() {
		return menus;
	}
	
	public Menu getMenuFromIndex(int i) {
		return menus[i];
	}

	public void setMenus(Menu[] menus) {
		this.menus = menus;
		FileIO.currentConfigOut();
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
		FileIO.currentConfigOut();
	}
	
	public boolean getShouldLimitFramerate() {
		return shouldLimitFramerate;
	}
	
	public void setShouldLimitFramerate(boolean limitFramerate) {
		this.shouldLimitFramerate = limitFramerate;
		Framerate.setShouldLimitFramerate(limitFramerate);
		FileIO.currentConfigOut();
	}
	
	public boolean DEBUG_drawMasks() {
		return DEBUG_drawMasks;
	}
	
	public void DEBUG_drawMasks(boolean DEBUG_drawMasks) {
		this.DEBUG_drawMasks = DEBUG_drawMasks;
		FileIO.currentConfigOut();
	}
	
	public int DEBUG_masksColorsOffset() {
		return DEBUG_masksColorsOffset;
	}
	
	public void DEBUG_masksColorsOffset(int DEBUG_masksColorsOffset) {
		this.DEBUG_masksColorsOffset = DEBUG_masksColorsOffset;
		FileIO.currentConfigOut();
	}
	
	public int DEBUG_masksOpacity() {
		return DEBUG_masksOpacity;
	}
	
	public void DEBUG_masksOpacity(int DEBUG_masksOpacity) {
		this.DEBUG_masksOpacity = DEBUG_masksOpacity;
		FileIO.currentConfigOut();
	}

	public boolean getCursorEnabled() {
		return cursorEnabled;
	}

	public void setCursorEnabled(boolean cursorEnabled) {
		this.cursorEnabled = cursorEnabled;
		FileIO.currentConfigOut();
	}

	public String getCurrentThemeChoice() {
		return currentThemeChoice;
	}
	
	public int getCurrentThemeChoiceIndex() {
		return getIndexFromThemeName(currentThemeChoice);
	}

	public void setCurrentThemeChoice(String currentColorsChoice) {
		this.currentThemeChoice = currentColorsChoice;
		updateDisplays();
		FileIO.currentConfigOut();
	}
	
	public void setCurrentThemeChoice(int indexForChoice) {
		this.currentThemeChoice = themes[indexForChoice].getThemeName();
		updateDisplays();
		FileIO.currentConfigOut();
	}
	
	public void setCurrentSkinChoice(int indexForSkin) {
		this.currentSkinChoice = getSkinName(indexForSkin);
		ShowImage.bufferCurrentSkin();
		updateDisplays();
		FileIO.currentConfigOut();
	}
	
	public void updateDisplays() {
		Menu currentMenu = ShowImage.getCurrentScaledMenu();
		for (Element element : currentMenu.getElements()) {
			if (element.isTextfield()) {
				element.getTextfield().loadCurrentDisplay();
			}
			else if (element.isTextbox()) {
				if (element.getTextbox().getRenderableObject() != null) {
					if (element.getTextbox().getRenderableObject().getImagePath().charAt(0) == '%' ||
							element.getTextbox().getRenderableObject().getImagePath().charAt(0) == '#') {
						element.getTextbox().getRenderableObject().resetImage();
					}
				}
			}
			else if (element.isRenderable()) {
				if (element.getRenderable().getImagePath().charAt(0) == '%' ||
						element.getRenderable().getImagePath().charAt(0) == '#') {
					element.getRenderable().resetImage();
				}
			}
		}
	}
	
	public String getSkinName(int index) {
		return FileIO.getSkinNames()[index];
	}
	
	public Color[] getCurrentThemeColors() {
		return getColorsFromThemeName(getCurrentThemeChoice());
	}
	
	public IntColor[] getCurrentThemeIntColors() {
		return getIntColorsFromThemeName(getCurrentThemeChoice());
	}
	
	public double getTransitionTime() {
		return transitionTime;
	}
	
	public void setTransitionTime(double transitionTime) {
		this.transitionTime = transitionTime;
		FileIO.currentConfigOut();
	}
	
	public Object[] getObjectList(String objectsName) {
		Object[] objectsToReturn = new Object[] 
				{"Objects with title \"" + objectsName + "\" not found."};
		if (objectsName.equals("%ThemeChoices")) {
			objectsToReturn = themes;
		} else if (objectsName.equals("%SkinChoices")) {
			objectsToReturn = FileIO.getSkinNames();
		}
		
		else if (true) {
			System.out.println("No code for getting " + objectsName);
		}
		
		return objectsToReturn;
	}
	
//	public String setObjectList(String objectsName, Object[] newValues) {
//		
//	}
	
	public Object getVariable(String varParentName, String varName, int index) {
		Object[] objectsList = getObjectList(varParentName);
		Object objectToReturn = null;
		if (varParentName.equals("%ThemeChoices")) {
			Theme[] toReadThemes = (Theme[]) objectsList;
			if (varName.equals("%Name")) {
				objectToReturn = toReadThemes[index].getThemeName();
			} 
			
			else {
				System.out.println("No code for getting data field \'" + varName + "\' from parent \'" + varParentName + "\'");
			}
		} else if (varParentName.equals("%SkinChoices")) {
			String[] names = (String[]) objectsList;
			if (varName.equals("%Name")) {
				objectToReturn = names[index];
			} 
			
			else {
				System.out.println("No code for getting data field \'" + varName + "\' from parent \'" + varParentName + "\'");
			}
			
		} 
		
		else {
			System.out.println("No code for getting variable from parent " + varParentName);
		}
		return objectToReturn;
	}
	
	public Object getVariable(String varName) {
		Object varToReturn = varName;
		String[] splitVariable = varName.split(" ");
		if (splitVariable[0].equals("%CurrentThemeName")) {
			varToReturn = currentThemeChoice;
		}
		else if (splitVariable[0].equals("%CurrentThemeColor")) {
			IntColor color = getCurrentTheme().getColorOfIndex(Integer.parseInt(splitVariable[1]));
			varToReturn = color.toHex();
		}
		else if (splitVariable[0].equals("%CurrentSkinName")) {
			varToReturn = currentSkinChoice;
		}
		else if (splitVariable[0].equals("%CurrentSkinPath")) {
			varToReturn = "src/textures/skins/" + currentSkinChoice;
		}
		else if (splitVariable[0].equals("%MasterVolume")) {
			varToReturn = Integer.toString(getMasterVolume());
		}
		return varToReturn;
	}
	
	public String setVariable(String varName, Object newValues) {
		String[] splitVariable = varName.split(" ");
		if (splitVariable[0].equals("%CurrentThemeName")) {
			for (Theme theme : themes) {
				if (theme.getThemeName().equals((String) newValues)) {
					System.out.println("Duplicate Theme Name!");
					return "Duplicate";
				}
			}
			getCurrentTheme().setThemeName((String) newValues);
			currentThemeChoice = (String) newValues;
			ShowImage.refreshMenu();
			FileIO.currentConfigOut();
			return "Success";
			
		} else if (splitVariable[0].equals("%CurrentThemeColor")) {
			if (((String) newValues).length() != 7){
				return "HexInvalid";
			}
			for (int i = 1 ; i < ((String) newValues).length() ; i++) {
				if (!isHex(((String) newValues).charAt(i))) {
					return "HexInvalid";
				}
			}
			getCurrentTheme().getColorOfIndex(Integer.parseInt(splitVariable[1])).setColor((String) newValues);
			ShowImage.refreshMenu();
			FileIO.currentConfigOut();
			return "Success";
		} else if (splitVariable[0].equals("MasterVolume")) {
			//TODO
			return null;
		}
		else {
			return "VariableNotFound"; // failed to find the variable
		}
	}
	
	public boolean isHex(char ch) {
		if ((ch >= '0' & ch <= '9') || (ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F')) {
			return true;
		}
		return false;
	}

	public String getCurrentSkinChoice() {
		return currentSkinChoice;
	}

	public void setCurrentSkinChoice(String currentSkinChoice) {
		this.currentSkinChoice = currentSkinChoice;
		ShowImage.bufferCurrentSkin();
		FileIO.currentConfigOut();
	}

	public boolean isDisplayFramerate() {
		return displayFramerate;
	}

	public void setDisplayFramerate(boolean displayFramerate) {
		this.displayFramerate = displayFramerate;
	}

	public int getMasterVolume() {
		return masterVolume;
	}

	public void setMasterVolume(int masterVolume) {
		this.masterVolume = masterVolume;
	}

	public int getMusicVolume() {
		return musicVolume;
	}

	public void setMusicVolume(int musicVolume) {
		this.musicVolume = musicVolume;
	}

	public int getSFXVolume() {
		return SFXVolume;
	}

	public void setSFXVolume(int sFXVolume) {
		SFXVolume = sFXVolume;
	}
}
