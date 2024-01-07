package SimpleRhythmGame;

public class Functions {
	
	public static boolean runFunction(String function){
		boolean ranFunction = false;
		
		if (function == null) {
			// Do nothing.
		} else {
			// TODO
			String[] splitFunction = function.split(" ");
			String methodName = splitFunction[0];
			Object[] parameters = new Object[(splitFunction.length - 1) / 2];
			// System.out.println(splitFunction.length);
			for (int i = 1; i < splitFunction.length; i = i + 2) {
				// System.out.println(i);
				
				// Can edit below to accept more datatypes
				// Currently accepts:
				// int, String, boolean
				
				if (splitFunction[i].equals("int")) {
					parameters[(i - 1) / 2] = (int) Integer.parseInt(splitFunction[i + 1]);
				} else if (splitFunction[i].equals("String")) {
					parameters[(i - 1) / 2] = (String) splitFunction[i + 1];
				} else if (splitFunction[i].equals("boolean")) {
					parameters[(i - 1) / 2] = splitFunction[i + 1].equals("true");
				} else {
					System.out.println("Error: Unsupported class of object passing through class Functions"
							+ "in method runFunction, or incorrect naming for an object.");
				}
			}
			if (!Main.getTransitioning()) {
				if (methodName.equals("setMenuIndex")) {
					setMenuIndex((int) parameters[0]);
				} else if (methodName.equals("setMenu")) {
					setMenu((String) parameters[0]);
				} else if (methodName.equals("addPopup")) {
					addPopup((int) parameters[0]);
				} else if (methodName.equals("removePopup")) {
					removePopup((int) parameters[0]);
				} else if (methodName.equals("removeThisPopup")) {
					removeThisPopup();
				} else if (methodName.equals("escapeMenu")) {
					escapeMenu();
				} else if (methodName.equals("exportTheme")) {
					exportThemeToClipboard();
				} else if (methodName.equals("importTheme")) {
					importThemeFromClipboard();
				} else if (methodName.equals("noFunction")){
					System.out.println("Valid no function");
				} else if (methodName.equals("enterTextField")) {
					enterTextField((String) parameters[0]);
				} else if (methodName.equals("setTheme")) {
					setTheme((int) parameters[0]);
				} else if (methodName.equals("setSkin")) {
					setSkin((int) parameters[0]);
				} else if (methodName.equals("scroll")) {
					scrollOptionsList((String) parameters[0], (boolean) parameters[1]);
				} else if (methodName.equals("addTheme")) {
					addTheme();
				} else if (methodName.equals("deleteTheme")) {
					deleteTheme();
				} else if (methodName.equals("editKeybind")) {
					editKeybind((String) parameters[0], (int) parameters[1], (int) parameters[2]);
				} else if (methodName.equals("playLevel")) {
					playLevel((int) parameters[0]);
				} else if (methodName.equals("confirmUsername")) {
					confirmUsername();
				}
				
				
				else {
					System.out.println("No method with name " + methodName + "!");
					for (int i = 0 ; i < parameters.length ; i++) {
						System.out.println("Parameter \'" + i + "\' was " + parameters[i].toString());
					}
				}
			}

			ranFunction = true;
		}
		
		return ranFunction;
	}
	
	private static void playLevel(int levelIndex) {
		Level level = Config.getLevelsList()[levelIndex];
		//Level level = FileIO.getLevel(levelName);
		Main.startGame(level);
	}

	private static void addPopup(int popup) {
		Main.addPopup(popup);
	}
	
	private static void removePopup(int popup) {
		Main.removePopup(popup);
	}
	
	private static void removeThisPopup() {
		Main.removePopup(Main.getCurrentPopupIndex());
	}
	
	private static void escapeMenu() {
		if (Main.getCurrentPopupIndex() == -1) {
			String menuToEnter = Main.getCurrentScaledMenu().getPreviousMenuName();
        	if (menuToEnter != null){
        		String functionToRun = "setMenu String " + menuToEnter.replace(" ", "_");
    			Functions.runFunction(functionToRun);
        	} else {
        		System.out.println("No Previous Menu");
        	}
		} else {
			removeThisPopup();
		}
	}
	
	private static void setMenuIndex(int menu) {
		Main.setMenuFromAnIndex(menu);
		// System.out.println("set menu to " + menu);
	}
	
	public static void setMenu(String menuName) {
		int menuNumber = 0;
		boolean foundMenu = false;
		String checkMenu = menuName.replace("_", " ");
		// convert menu name in function from "_" to " ", 
		// as space bar is the delimiter in the function definition
		for (Menu menu : Main.getConfig().getMenus()) {
			if (menu.getMenuName().equals(checkMenu)) {
				setMenuIndex(menuNumber);
				foundMenu = true;
				break;
			}
			menuNumber++;
		}
		if (!foundMenu) {
			System.out.println("Could not find a menu of name \'" + checkMenu + "\'");
		}
	}
	
	public static void exportThemeToClipboard() {
		String toExport = FileIO.getCurrentTheme();
		
		FileIO.writeClipboard(toExport);
	}
	
	public static void importThemeFromClipboard() {
		Theme newTheme = FileIO.JSONtoTheme(FileIO.readClipboard());
		if (newTheme != null) {
			Main.getConfig().importTheme(newTheme);
		} else {
			addPopup(4);
		}
	}
	
	public static void enterTextField(String textField) {
		Main.setSelectedElement(textField);
	}
	
	public static void setTheme(int index) {
		Main.getConfig().setCurrentThemeChoice(index);
		removeThisPopup();
	}
	
	public static void setSkin(int index) {
		Main.getConfig().setCurrentSkinChoice(index);
		removeThisPopup();
	}
	
	public static void scrollOptionsList(String listName, boolean down) {
		Main.scrollOptionsList(listName, down);
	}
	
	public static void addTheme() {
		Main.getConfig().addTheme();
	}
	
	public static void deleteTheme() {
		Main.getConfig().removeTheme(Main.getConfig().getCurrentThemeChoice());
	}
	
	public static void editKeybind(String keybind, int index, int popupToOpen) {
		Main.setSelectedElement("EditControl" + keybind + index);
		addPopup(popupToOpen);
		
	}
	
	public static void confirmUsername() {
		if (!RandomAccess.usernameToSet.equals("")) {
			Main.createUser(RandomAccess.usernameToSet);
		} else {
			addPopup(0); // empty error
		}
	}
	
	public static String intToTime(int seconds) {
		String time = null;
		int minutes = seconds / 60;
		int secondsMod = seconds % 60;
		String secondsString = Integer.toString(secondsMod);
		if (secondsString.length() == 1) {
			secondsString = "0" + secondsString;
		}
		time = minutes + ":" + secondsString;
		return time;
	}
}
