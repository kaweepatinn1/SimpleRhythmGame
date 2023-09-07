package SimpleRhythmGame;

import java.awt.Color;

// A READ ONLY CLASS

public class DefaultValues {
	private final static boolean defaultFullscreen = true; // if not fullscreen will force below value
	private final static int defaultSizeToForce = 1920; // forces this screen size if above is true
	
	private final static Color[] defaultColors = new Color[] {
			new Color (0,0,0,255), // 0
    		new Color (255,0,0,255), // 1
    		new Color (0,255,0,255), // 2
    		new Color (0,0,255,255), // 3
    		new Color (255,0,0,50), // 4
    		new Color (0,255,0,50), // 5
    		new Color (0,0,255,50) // 6
	};
	
	/* Reminders for calling new classes:
	TextBox: 	function, name, text, alignX, alignY, fontColor, textSize, x, y, 
			 	xSize, ySize, offsetX, offsetY, color, opacity, bold, roundPercentage,
			 	shadowOffset, strokeWidth, strokeColor
	TextBox:	function, name, renderable, x, y, 
			 	xSize, ySize, offsetX, offsetY, color, opacity, bold, roundPercentage,
			 	shadowOffset, strokeWidth, strokeColor
	Renderable: function, name, source, x, y, xSize, ySize, opacity
	*/
	
	private final static Menu[] defaultMenus = new Menu[] {
			new Menu( // 0. Initialization (for setting up screen size, username)
					new Element[] {
						new Element(new Renderable(
								// Default Renderable
								"TestFunction String \"hi\"", // function
								"Kosbia", // name
								"src/textures/kosbia.png", // file source
								10, 50, 512, 307, // x, y, xSize, ySize
								255 // opacity (0-255)
								)),
						new Element(new TextBox(
								// TextBox with Renderable
								"setMenu int 1", // function
								"FilmBox",  // name
								new Renderable(
										// Renderable Without Function
										"Film", // name
										"src/textures/defaultcursor.png", // file source
										1865, 515, 20, 20, // x, y, xSize, ySize
										25 // opacity (0-255)
										),  // renderable
								1850, 500, 50, 50,  // x, y, xSize, ySize
								2, // box color (index of colors)
								255, // opacity (0-255)
								50, // roundPercentage
								10, // shadowOffset
								5, 1 // strokeWidth, strokeColor
								)),
						new Element(new TextBox(
								// TextBox with Text
								"setMenu int 1", // function
								"Menu2Button",  // name
								"Goto Menu 2", // text
								"center", "center", // align
								3, // text color (index of colors)
								50, // text size
								280, 500, 550, 50,  // x, y, xSize, ySize
								0, 0, // text offset (x, y)
								2, // box color (index of colors)
								255, // opacity (0-255)
								false, // bold
								50, // roundPercentage
								10, // shadowOffset
								5, 1 // strokeWidth, strokeColor
								)),
						new Element(new TextBox(
								// TextBox with Text
								"setMenu int 2", // function
								"Menu3Button",  // name
								"Goto Menu 3", // text
								"center", "center", // align
								1, // text color (index of colors)
								50, // text size
								280, 700, 550, 50,  // x, y, xSize, ySize
								0, 0, // text offset (x, y)
								3, // box color (index of colors)
								255, // opacity (0-255)
								false, 
								50, // roundPercentage
								10, // shadowOffset
								5, 1 // strokeWidth, strokeColor
								)),
						new Element(new TextBox(
								// TextBox with Text
								"setMenu int 2", // function
								"This is Menu 1",  // name
								"Menu 0 c", // text
								"center", "center", // align
								3, // text color (index of colors)
								50, // text size
								280, 900, 550, 50,  // x, y, xSize, ySize
								0, 0, // text offset (x, y)
								3, // box color (index of colors)
								255, // opacity (0-255)
								false,
								50, // roundPercentage
								10, // shadowOffset
								5, 1 // strokeWidth, strokeColor
								)),
		                new Element(new Renderable(
								// Default Renderable
								//"TestFunction", // function
								"Film", // name
								"src/textures/defaultcursor.png", // file source
								550, 100, 20, 20, // x, y, xSize, ySize
								255 // opacity (0-255)
								)),
						}
					),
			new Menu( // 1. MENU 1
				new Element[] {
					new Element(new TextBox("setMenu int 0", "Menu1Button", "Goto Menu 1", "left", "top",
							1, 50, 1280, 500, 550, 50, 0, 0, 2, 255, false, 50, 10, 5, 1)),
					new Element(new TextBox("setMenu int 2", "Menu2Button", "Goto Menu 3", "center", "center", 	
							2, 50, 200, 300, 550, 50, 0, 0, 3, 255, false, 100, 10, 5, 1)),
					new Element(new TextBox("TestFunction", "Box3", "This is Menu 2", "center", "center",
							3, 50, 300, 100, 550, 50, 0, 0, 1, 255, false, 100, 10, 5, 1))
					}
				),
			new Menu( // 2. MENU 2
				new Element[] {
					new Element(new TextBox("setMenu int 0", "Menu1Button", "Goto Menu 1", "left", "top",
							1, 50, 1280, 500, 550, 50, 0, 0, 2, 255, false, 50, 10, 5, 1)),
					new Element(new TextBox("setMenu int 1", "Menu2Button", "Goto Menu 2", "center", "center", 	
							2, 50, 200, 300, 550, 50, 0, 0, 3, 255, false, 100, 10, 5, 1)),
					new Element(new TextBox("TestFunction", "Box3", "This is Menu 3", "center", "center",
							3, 50, 300, 100, 550, 50, 0, 0, 1, 255, false, 100, 10, 5, 1))
					}
				),
	};
			
	public static boolean getDefaultFullscreen() {
		return defaultFullscreen;
	}
	
	public static int getDefaultSizeToForce() {
		return defaultSizeToForce;
	}
	
	public static Menu getMenu(int i) { // returns a list of elements for the current class
		return defaultMenus[i];
	}
	
	public static Color[] getDefaultColors(){
		return defaultColors;
	}
}