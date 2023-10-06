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
			if (!ShowImage.getTransitioning()) {
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
					String menuToEnter = ShowImage.getCurrentScaledMenu().getPreviousMenuName();
                	if (menuToEnter != null){
                		String functionToRun = "setMenu String " + menuToEnter.replace(" ", "_");
            			Functions.runFunction(functionToRun);
                	} else {
                		System.out.println("No Previous Menu");
                	}
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
				} else if (methodName.equals("scroll")) {
					scrollOptionsList((String) parameters[0], (boolean) parameters[1]);
				} else if (methodName.equals("addTheme")) {
					addTheme();
				} else if (methodName.equals("deleteTheme")) {
					deleteTheme();
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
	
	private static void addPopup(int popup) {
		ShowImage.addPopup(popup);
	}
	
	private static void removePopup(int popup) {
		ShowImage.removePopup(popup);
	}
	
	private static void removeThisPopup() {
		ShowImage.removePopup(ShowImage.getCurrentPopupIndex());
	}
	
	private static void setMenuIndex(int menu) {
		ShowImage.setMenuFromAnIndex(menu);
		// System.out.println("set menu to " + menu);
	}
	
	public static void setMenu(String menuName) {
		int menuNumber = 0;
		boolean foundMenu = false;
		String checkMenu = menuName.replace("_", " ");
		// convert menu name in function from "_" to " ", 
		// as space bar is the delimiter in the function definition
		for (Menu menu : DefaultValues.getAllDefaultMenus()) {
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
			ShowImage.getConfig().importTheme(newTheme);
		} else {
			addPopup(4);
		}
	}
	
	public static void enterTextField(String textField) {
		ShowImage.setSelectedElement(textField);
	}
	
	public static void setTheme(int index) {
		ShowImage.getConfig().setCurrentThemeChoice(index);
		removeThisPopup();
	}
	
	public static void scrollOptionsList(String listName, boolean down) {
		ShowImage.scrollOptionsList(listName, down);
	}
	
	public static void addTheme() {
		ShowImage.getConfig().addTheme();
	}
	
	public static void deleteTheme() {
		ShowImage.getConfig().removeTheme(ShowImage.getConfig().getCurrentThemeChoice());
	}
}
