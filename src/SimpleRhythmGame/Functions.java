package SimpleRhythmGame;

public class Functions {
	
	public static boolean runFunction(String function){
		boolean ranFunction = false;
		
		if (function == null) {
			// Do nothing?
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
			
			if (methodName.equals("setMenuIndex")) {
				setMenuIndex((int) parameters[0]);
			} else if (methodName.equals("setMenu")) {
				setMenu((String) parameters[0]);
			}
			
			//System.out.println((int) objects[0] + 1);

			ranFunction = true;
		}
		
		return ranFunction;
	}
	
	private static void setMenuIndex(int menu) {
		ShowImage.setMenu(menu);
		// System.out.println("set menu to " + menu);
	}
	
	public static void setMenu(String menuName) {
		int menuNumber = 0;
		boolean foundMenu = false;
		for (Menu menu : DefaultValues.getAllDefaultMenus()) {
			if (menu.getMenuName().equals(menuName)) {
				System.out.println("hi");
				setMenuIndex(menuNumber);
				foundMenu = true;
				break;
			}
			menuNumber++;
		}
		if (!foundMenu) {
			System.out.println("Could not find a menu of name \'" + menuName + "\'");
		}
	}
}
