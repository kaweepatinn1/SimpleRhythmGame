package SimpleRhythmGame;

import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.text.DecimalFormat;
import java.awt.event.KeyEvent;

public class Config {
	private final static int colorsLength = 9;
	private static transient Level[] levelsList;
	
	private boolean fullscreen;
	private int sizeToForce;
	
	private boolean nanoSecondPrecision;
	private int framesToStore;
	private int framerate;
	private boolean limitFramerate;
	private boolean displayFramerate;
	
	private double transitionTime; // for transitioning between screens
	
	private boolean cursorEnabled;
	
	private int masterVolume;
	private int musicVolume;
	private int SFXVolume;
	
	private transient boolean FORCED_noFail;
	private transient int FORCED_millisecondLeniency;
	
	private boolean DEBUG_drawMasks;
	private int DEBUG_masksColorsOffset;
	private int DEBUG_masksOpacity;
	
	private String[] fonts;
	private Controls[] controls;
	private String currentThemeChoice;
	private String currentSkinChoice;
	private Theme[] themes; // used to return faster, not included in json file
	
	private transient Menu[] menus;
	
	public Config() {
		// Do Nothing
	}
	
	public Config(boolean fullscreen, int sizeToForce, Controls[] controls, Theme[] themes, 
			String currentThemeChoice, String currentSkinChoice,
			String[] fonts, Menu[] menus, boolean nanoSecondPrecision, int framesToStore,
			int framerate, boolean shouldLimitFramerate, boolean displayFramerate,
			boolean cursorEnabled, double transitionTime,
			int masterVolume, int musicVolume, int SFXVolume,
			boolean DEBUG_drawMasks, int DEBUG_masksColorsOffset, int DEBUG_masksOpacity,
			boolean FORCED_noFail, int FORCED_millisecondLeniency) {
		this.fullscreen = fullscreen;
		this.sizeToForce = sizeToForce;
		this.controls = controls;
		this.themes = themes;
		this.currentThemeChoice = currentThemeChoice;
		this.currentSkinChoice = currentSkinChoice;
		Main.bufferSkin(currentSkinChoice);
		this.fonts = fonts;
		this.menus = menus;
		this.nanoSecondPrecision = nanoSecondPrecision;
		this.framesToStore = framesToStore;
		this.framerate = framerate;
		this.limitFramerate = shouldLimitFramerate;
		this.displayFramerate = displayFramerate;
		this.cursorEnabled = cursorEnabled;
		this.transitionTime = transitionTime;
		this.masterVolume = masterVolume;
		this.musicVolume = musicVolume;
		this.SFXVolume = SFXVolume;
		this.DEBUG_drawMasks = DEBUG_drawMasks;
		this.DEBUG_masksColorsOffset = DEBUG_masksColorsOffset;
		this.DEBUG_masksOpacity = DEBUG_masksOpacity;
		this.FORCED_noFail = FORCED_noFail;
		this.FORCED_millisecondLeniency = FORCED_millisecondLeniency;
		levelsList = FileIO.getLevelsList();
	}
	
	public static int getColorsLenth() {
		return colorsLength;
	}

	public boolean getFullscreen() {
		return fullscreen;
	}

	public void setFullscreen(boolean fullscreen) {
		this.fullscreen = fullscreen;
		Main.setNewFrameSize(fullscreen, sizeToForce);
		Functions.setMenu("Settings_Screen_Menu");
		FileIO.currentConfigOut();
	}

	public int getSizeToForce() {
		return sizeToForce;
	}

	public void setSizeToForce(int sizeToForce) {
		this.sizeToForce = sizeToForce;
		Main.setNewFrameSize(fullscreen, sizeToForce);
		Functions.setMenu("Settings_Screen_Menu");
		FileIO.currentConfigOut();
	}

	public Controls[] getControls() {
		return controls;
	}
	
	public Controls getControlsByAction(String action) {
		for (Controls control : controls) {
			if (control.getFunction().equals(action)) {
				return control;
			}
		}
		return null;
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
			Main.refreshMenu();
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
		Main.refreshMenu();
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
				Main.refreshMenu();
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
		Main.refreshMenu();
		FileIO.currentConfigOut();
	}
	
	public boolean getLimitFramerate() {
		return limitFramerate;
	}
	
	public void setLimitFramerate(boolean limitFramerate) {
		this.limitFramerate = limitFramerate;
		Framerate.setShouldLimitFramerate(limitFramerate);
		Main.refreshMenu();
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
		Main.bufferCurrentSkin();
		updateDisplays();
		FileIO.currentConfigOut();
	}
	
	public void updateDisplays() {
		Menu currentMenu = Main.getCurrentScaledMenu();
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
		} else if (objectsName.equals("%Levels")){
			objectsToReturn = FileIO.getLevelsList();
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
			} else {
				System.out.println("No code for getting data field \'" + varName + "\' from parent \'" + varParentName + "\'");
			}
			
		} else if (varParentName.equals("%Levels")) {
			Level[] levelsList = (Level[]) objectsList;
			if (varName.equals("%Name")) {
				objectToReturn = levelsList[index].getName();
			} else if (varName.equals("%Author")) {
				objectToReturn = levelsList[index].getAuthor();
			} else if (varName.equals("%BPM")) {
				objectToReturn = levelsList[index].getBPM();
			} else if (varName.equals("%TimeSeconds")) {
				objectToReturn = levelsList[index].getTotalTimeSeconds();
			} else if (varName.equals("%NotesPerSecond")) {
				objectToReturn = levelsList[index].getNotesPerSecond();
			} else if (varName.equals("%PixelsPerSecond")) {
				objectToReturn = levelsList[index].getPPS();
			} else if (varName.equals("%TotalNotes")) {
				objectToReturn = levelsList[index].getTotalNotes();
			} 
			
			else {
				System.out.println("No code for getting data field \'" + varName + "\' from parent \'" + varParentName + "\'");
			}
		} else {
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
		else if (splitVariable[0].equals("%MusicVolume")) {
			varToReturn = Integer.toString(getMusicVolume());
		}
		else if (splitVariable[0].equals("%SFXVolume")) {
			varToReturn = Integer.toString(getSFXVolume());
		}
		else if (splitVariable[0].equals("%MaxFramerate")) {
			varToReturn = Integer.toString(getFramerate());
		}
		else if (splitVariable[0].equals("%LimitFramerate")) {
			varToReturn = Boolean.toString(getLimitFramerate());
		}
		else if (splitVariable[0].equals("%DisplayFramerate")) {
			varToReturn = Boolean.toString(getDisplayFramerate());
		}
		
		else if (splitVariable[0].equals("%Keybind")) {
			Controls control = getControlsByAction(splitVariable[1]);
			if (control != null) {
				int keyNumber =
						(control.getKeybindCode(Integer.parseInt(splitVariable[2])));
				if (keyNumber == -1) {
					varToReturn = "";
				} else {
					String keyName =  KeyEvent.getKeyText(keyNumber);

					if (keyName.equals("Enter")) {
						varToReturn = "Enter";
					} else if (keyName.equals("Escape")) {
						varToReturn = "Esc";
					} else if (keyName.equals("Left")) {
						varToReturn = "←";
					} else if (keyName.equals("Right")) {
						varToReturn = "→";
					} else if (keyName.equals("Up")) {
						varToReturn = "↑";
					} else if (keyName.equals("Down")) {
						varToReturn = "↓";
					} else {
						varToReturn = keyName;
					}
				}
			} else {
				varToReturn = "No Control";
			}
			
		} else if (splitVariable[0].equals("%ScorePercentage")) {
			DecimalFormat formatter = new DecimalFormat("#,###.00");
			String percentage = formatter.format(Main.getGame().getAccuracy()).equals("100.0") ? "100" : Double.toString(Main.getGame().getAccuracy());
			varToReturn = Integer.toString(Main.getGame().getScore()) 
					+ " // " + percentage + "%";
		} else if (splitVariable[0].equals("%Combo")) {
			varToReturn = Integer.toString(Main.getGame().getCombo());
		} else if (splitVariable[0].equals("%ScreenWidth")) {
			varToReturn = Integer.toString(getSizeToForce());
		} else if (splitVariable[0].equals("%Fullscreen")) {
			varToReturn = Boolean.toString(getFullscreen());
		} else if (splitVariable[0].equals("%CurrentLevel")) {
			varToReturn = Main.getGame().getCurrentLevelName();
		} else if (splitVariable[0].equals("%BoolNewHighscore")){
			if (splitVariable[1].equals("Show")) {
				if (Main.getGame().checkIfGotNewHighscore()) {
					varToReturn = "New Highscore!";
				} else {
					varToReturn = "";
				}
			} else if (splitVariable[1].equals("Hide")) {
				if (Main.getGame().checkIfGotNewHighscore()) {
					varToReturn = "";
				} else {
					varToReturn = "Score";
				}
			}
		}
		
		else {
			// System.out.println("Could not find variable with name " + splitVariable[0]);
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
			Main.refreshMenu();
			FileIO.currentConfigOut();
			return "Success";
			
		} else if (splitVariable[0].equals("%CurrentThemeColor")) {
			if (((String) newValues).length() != 7 && ((String) newValues).length() != 6){
				return "HexInvalid";
			}
			if (!(((String) newValues).charAt(0) == '#') && ((String) newValues).length() == 7){
				return "HexInvalid";
			}
			if ((((String) newValues).charAt(0) == '#') && ((String) newValues).length() == 6){
				return "HexInvalid";
			}
			String hexCode;
			if (((String) newValues).length() == 6) {
				hexCode = "#" + (String) newValues;
			} else {
				hexCode = (String) newValues;
			}
			for (int i = 1 ; i < (hexCode).length() ; i++) {
				if (!isHex((hexCode).charAt(i))) {
					System.out.println("3");
					return "HexInvalid";
				}
			}
			getCurrentTheme().getColorOfIndex(Integer.parseInt(splitVariable[1])).setColor(hexCode);
			Main.refreshMenu();
			FileIO.currentConfigOut();
			return "Success";
		} else if (splitVariable[0].equals("%MasterVolume")) {
			setMasterVolume(Math.min(Integer.parseInt((String) newValues), 100));
			return "Success";
		} else if (splitVariable[0].equals("%MusicVolume")) {
			setMusicVolume(Math.min(Integer.parseInt((String) newValues), 100));
			return "Success";
		} else if (splitVariable[0].equals("%SFXVolume")) {
			setSFXVolume(Math.min(Integer.parseInt((String) newValues), 100));
			return "Success";
		} else if (splitVariable[0].equals("%MaxFramerate")) {
			setFramerate(Math.max(Math.min(Integer.parseInt((String) newValues), 250), 10));
			return "Success";
		} else if (splitVariable[0].equals("%LimitFramerate")) {
			setLimitFramerate(!getLimitFramerate());
			return "Success";
		} else if (splitVariable[0].equals("%DisplayFramerate")) {
			setDisplayFramerate(!getDisplayFramerate());
			return "Success";
		} else if (splitVariable[0].equals("%Keybind")) {
			Controls control = getControlsByAction(splitVariable[1]);
			if (control != null) {
				if (KeyEvent.getKeyText((int) newValues).equals("Backspace")) {
					control.setKeybindCode(-1, Integer.parseInt(splitVariable[2]));
				} else {
					control.setKeybindCode((int) newValues, Integer.parseInt(splitVariable[2]));
				}
				FileIO.currentConfigOut();
				return "Success";
			} else {
				System.out.println("No control called " + splitVariable[1]);
				return "Fail";
			}
		} else if (splitVariable[0].equals("%ScreenWidth")) {
			GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
			setSizeToForce(Math.max(Math.min(Integer.parseInt((String) newValues), gd.getDisplayMode().getWidth()), 540));
			return "Success";
		} else if (splitVariable[0].equals("%Fullscreen")) {
			setFullscreen(!getFullscreen());
			return "Success";
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
		Main.bufferCurrentSkin();
		FileIO.currentConfigOut();
	}

	public boolean getDisplayFramerate() {
		return displayFramerate;
	}

	public void setDisplayFramerate(boolean displayFramerate) {
		this.displayFramerate = displayFramerate;
		Main.refreshMenu();
		FileIO.currentConfigOut();
	}

	public int getMasterVolume() {
		return masterVolume;
	}

	public void setMasterVolume(int masterVolume) {
		this.masterVolume = masterVolume;
		Main.refreshMenu();
		FileIO.currentConfigOut();
		Sound.updateVolume();
	}

	public int getMusicVolume() {
		return musicVolume;
	}

	public void setMusicVolume(int musicVolume) {
		this.musicVolume = musicVolume;
		Main.refreshMenu();
		FileIO.currentConfigOut();
		Sound.updateVolume();
	}

	public int getSFXVolume() {
		return SFXVolume;
	}

	public void setSFXVolume(int sFXVolume) {
		SFXVolume = sFXVolume;
		Main.refreshMenu();
		FileIO.currentConfigOut();
		Sound.updateVolume();
	}
	
	public float getFinalSFXVolume() {
		float volMaster = getMasterVolume();
		float volSFX = getSFXVolume();
		return Math.max(Math.min(((volMaster * volSFX) / 10000f),1),0);
	}
	
	public float getFinalMusicVolume() { // returns a value from 0-1.
		float volMaster = getMasterVolume();
		float volMusic = getMusicVolume();
		return Math.max(Math.min(((volMaster * volMusic) / 10000f),1),0);
	}
	
	public boolean getFORCED_noFail() {
		return FORCED_noFail;
	}
	
	public void setFORCED_noFail(boolean FORCED_noFail) {
		this.FORCED_noFail = FORCED_noFail;
		Main.refreshMenu();
		FileIO.currentConfigOut();
	}

	public int getFORCED_millisecondLeniency() {
		return FORCED_millisecondLeniency;
	}

	public void setFORCED_millisecondLeniency(int FORCED_millisecondLeniency) {
		this.FORCED_millisecondLeniency = FORCED_millisecondLeniency;
	}

	public static Level[] getLevelsList() {
		return levelsList;
	}
}
