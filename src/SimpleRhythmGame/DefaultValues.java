package SimpleRhythmGame;

import java.awt.Color;

// A READ ONLY CLASS

public class DefaultValues {
	private final static Color[] defaultColors = new Color[] {
			new Color (0,0,0,255), // 0
    		new Color (255,0,0,255), // 1
    		new Color (0,255,0,255), // 2
    		new Color (0,0,255,255), // 3
    		new Color (255,0,0,50), // 4
    		new Color (0,255,0,50), // 5
    		new Color (0,0,255,50) // 6
	};
	
	private final static Menu[] defaultMenus = new Menu[] {
			new Menu( // 0. Initialization (for setting up screen size, username)
					new Element[] {
						new Element(new TextBox("Box1", "Menu 0", "left", "top",
								4, 50, 1280, 500, 550, 50, 0, 0, 2, 255, false, 50, 10, 5, 1)),
						new Element(new TextBox("Box2", "Test2", "center", "center", 	
								2, 50, 200, 300, 550, 50, 0, 0, 3, 255, false, 100, 10, 5, 1)),
						new Element(new TextBox("Box3", "Test3", "right", "bottom",
								1, 50, 300, 100, 550, 50, 0, 0, 1, 255, false, 100, 10, 5, 1))
						}
					),
			new Menu( // 1. MENU 1
				new Element[] {
					new Element(new TextBox("Box1", "Menu1", "left", "top",
							4, 50, 1280, 500, 550, 50, 0, 0, 2, 255, false, 50, 10, 5, 1)),
					new Element(new TextBox("Box2", "Test2", "center", "center", 	
							2, 50, 200, 300, 550, 50, 0, 0, 3, 255, false, 100, 10, 5, 1)),
					new Element(new TextBox("Box3", "Test3", "right", "bottom",
							1, 50, 300, 100, 550, 50, 0, 0, 1, 255, false, 100, 10, 5, 1))
					}
				),
			new Menu( // 2. MENU 2
				new Element[] {
					new Element(new TextBox("Box1", "Menu2", "left", "top",
							4, 50, 1280, 500, 550, 50, 0, 0, 2, 255, false, 50, 10, 5, 1)),
					new Element(new TextBox("Box2", "Test2", "center", "center", 	
							2, 50, 200, 300, 550, 50, 0, 0, 3, 255, false, 100, 10, 5, 1)),
					new Element(new TextBox("Box3", "Test3", "right", "bottom",
							1, 50, 300, 100, 550, 50, 0, 0, 1, 255, false, 100, 10, 5, 1))
					}
				),
	};
			
	
	public static Menu getMenu(int i) { // returns a list of elements for the current class
		return defaultMenus[i];
	}
	
	public static Color[] getDefaultColors(){
		return defaultColors;
	}
}