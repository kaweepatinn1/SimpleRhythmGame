package SimpleRhythmGame;

import java.awt.Color;

// A READ ONLY CLASS

public class DefaultValues {
	private final static boolean defaultFullscreen = false; // if not fullscreen will force below value
	private final static int defaultSizeToForce = 1280; // forces this screen size if above is true
	
	private final static Color[] defaultColors = new Color[] {
			new Color (102,102,102,255), // 0. BG Color
			new Color (217,234,211,255), // 1. Menu Color
    		new Color (207,226,243,255), // 2. Buttons Color
    		new Color (255,255,255,255), // 3. Primary Selection Color
    		new Color (217,217,217,255), // 4. Secondary Selection Color
    		new Color (255,0,0,255), // 5. Accent Color
    		new Color (0,0,0,255), // 6. Stroke Color
	};
	
	private final static String[] defaultFonts = new String[] {
			"src/fonts/ArchivoNarrow-Bold.ttf",
			"src/fonts/ArchivoNarrow-BoldItalic.ttf",
			"src/fonts/ArchivoNarrow-Italic.ttf",
			"src/fonts/ArchivoNarrow-Medium.ttf",
			"src/fonts/ArchivoNarrow-MediumItalic.ttf",
			"src/fonts/ArchivoNarrow-Regular.ttf",
			"src/fonts/ArchivoNarrow-SemiBold.ttf",
			"src/fonts/ArchivoNarrow-SemiBoldItalic.ttf"
	};
	
	private final static Menu[] defaultMenus = new Menu[] {
			new Menu( // 0. Initialization (for setting up screen size, username)
					"Main Menu", // Menu Name
					0, // BG Color
					new Element[] {
						new Element(
							new Selector(
									new int[]{0,0},
									new int[][]{{1,0},{0,1},{0,0},{0,0}},
									false,
									false
								),
							new TextBox(
								// TextBox with Renderable
								"setMenu String Play_Menu", // function
								"PlaysButton",  // name
								new Renderable(
										// Renderable Without Function
										"PlayPNG", // name
										"src/textures/play.png", // file source
										40, 30, 60, 60, // x, y, xSize, ySize (relative)
										255 // opacity (0-255)
										),  // renderable
								"Play", // text
								"left", "center", // align
								"Archivo Narrow", // font
								6, // text color (index of colors)
								50, // text size
								1260, 240, 1000, 120,  // x, y, xSize, ySize
								-375, -9, // text offset (x, y)
								2, // box color (index of colors)
								255, // opacity (0-255)
								false, // bold
								100, // roundPercentage
								8, // shadowOffset
								5, 6 // strokeWidth, strokeColor
								)),
						new Element(new TextBox(
								// TextBox with Renderable
								"setMenu String Stats_Leaderboards_Menu", // function
								"StatsLeaderboardsButton",  // name
								new Renderable(
										// Renderable Without Function
										"LeaderboardPNG", // name
										"src/textures/leaderboard.png", // file source
										40, 30, 60, 60, // x, y, xSize, ySize (relative)
										255 // opacity (0-255)
										),  // renderable
								"Stats and Leaderboards", // text
								"left", "center", // align
								"Archivo Narrow", // font
								6, // text color (index of colors)
								50, // text size
								1260, 390, 1000, 120,  // x, y, xSize, ySize
								-375, -9, // text offset (x, y)
								2, // box color (index of colors)
								255, // opacity (0-255)
								false, // bold
								100, // roundPercentage
								8, // shadowOffset
								5, 6 // strokeWidth, strokeColor
								)),
						new Element(new TextBox(
								// TextBox with Renderable
								"setMenu String Settings_Menu", // function
								"SettingsButton",  // name
								new Renderable(
										// Renderable Without Function
										"CogwheelPNG", // name
										"src/textures/cog.png", // file source
										40, 30, 60, 60, // x, y, xSize, ySize (relative)
										255 // opacity (0-255)
										),  // renderable
								"Settings", // text
								"left", "center", // align
								"Archivo Narrow", // font
								6, // text color (index of colors)
								50, // text size
								1260, 540, 1000, 120,  // x, y, xSize, ySize
								-375, -9, // text offset (x, y)
								2, // box color (index of colors)
								255, // opacity (0-255)
								false, // bold
								100, // roundPercentage
								8, // shadowOffset
								5, 6 // strokeWidth, strokeColor
								)),
						new Element(new TextBox(
								// TextBox with Renderable
								"setMenu String Customization_Menu", // function
								"CustomizationButton",  // name
								new Renderable(
										// Renderable Without Function
										"PalettePNG", // name
										"src/textures/palette.png", // file source
										40, 30, 60, 60, // x, y, xSize, ySize (relative)
										255 // opacity (0-255)
										),  // renderable
								"Customization", // text
								"left", "center", // align
								"Archivo Narrow", // font
								6, // text color (index of colors)
								50, // text size
								1260, 690, 1000, 120,  // x, y, xSize, ySize
								-375, -9, // text offset (x, y)
								2, // box color (index of colors)
								255, // opacity (0-255)
								false, // bold
								100, // roundPercentage
								8, // shadowOffset
								5, 6 // strokeWidth, strokeColor
								))
					}),
			new Menu( // 1. MENU 1
					"Settings", // Menu Name
					new int[] {0,1}, // Selector Index
					0, // BG Color
				new Element[] {
					new Element(new TextBox("setMenu int 0", "Menu1Button", "Goto Menu 1", "left", "top", "Roboto",
							1, 50, 1280, 500, 550, 50, 0, 0, 2, 255, false, 50, 10, 5, 1)),
					new Element(new TextBox("setMenu int 2", "Menu2Button", "Goto Menu 3", "center", "center", "Roboto", 	
							2, 50, 200, 300, 550, 50, 0, 0, 3, 255, false, 100, 10, 5, 1)),
					new Element(new TextBox("TestFunction", "Box3", "This is Menu 2", "center", "center", "Roboto",
							3, 50, 300, 100, 550, 50, 0, 0, 1, 255, false, 100, 10, 5, 1))
					}
				),
			new Menu( // 2. MENU 2
					"TestMenu2", // Menu Name
					new int[] {0,2}, // Selector Index
					0, // BG Color
				new Element[] {
					new Element(new TextBox("setMenu int 0", "Menu1Button", "Goto Menu 1", "left", "top", "Roboto",
							1, 50, 1280, 500, 550, 50, 0, 0, 2, 255, false, 50, 10, 5, 1)),
					new Element(new TextBox("setMenu int 1", "Menu2Button", "Goto Menu 2", "center", "center", "Roboto", 	
							2, 50, 200, 300, 550, 50, 0, 0, 3, 255, false, 100, 10, 5, 1)),
					new Element(new TextBox("TestFunction", "Box3", "This is Menu 3", "center", "center", "Roboto",
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
	
	public static Menu[] getAllDefaultMenus() {
		return defaultMenus;
	}
	
	public static Menu getDefaultMenu(int i) { // returns a list of elements for the current class
		return defaultMenus[i];
	}
	
	public static Color[] getDefaultColors(){
		return defaultColors;
	}
	
	public static String[] getDefaultFonts() {
		return defaultFonts;
	}
}

/* 
Reminders for calling new classes:

TextBox: 	function, name, text, alignX, alignY, fontColor, textSize, x, y, 
		 	xSize, ySize, offsetX, offsetY, color, opacity, bold, roundPercentage,
		 	shadowOffset, strokeWidth, strokeColor
TextBox:	function, name, renderable, x, y, 
		 	xSize, ySize, offsetX, offsetY, color, opacity, bold, roundPercentage,
		 	shadowOffset, strokeWidth, strokeColor
Renderable: function (optional), name, source, x, y, xSize, ySize, opacity

Element Templates:

for functions: (functionName, and then limitless type and object pairs)

new Element(new Renderable(
							// Default Renderable
							"xx xx xx", // function 
							"xx", // name
							"src/textures/xx.png", // file source
							0, 0, 0, 0, // x, y, xSize, ySize
							255 // opacity (0-255)
							)),
							
new Element(new TextBox(
							// TextBox with Text and Renderable
							"xx xx xx", // function
							"xx",  // name
							"xx", // text
							new Renderable(
									// Renderable Without Function
									"xx", // name
									"src/textures/xx.png", // file source
									0, 0, 0, 0, // x, y, xSize, ySize (relative)
									255 // opacity (0-255)
									),  // renderable
							"center", "center", // align
							"Archivo Narrow", // font style
							0, // text color (index of colors)
							24, // text size
							0, 0, 0, 0,  // x, y, xSize, ySize
							0, 0, // text offset (x, y)
							1, // box color (index of colors)
							255, // opacity (0-255)
							false, 
							50, // roundPercentage
							8, // shadowOffset
							5, 2 // strokeWidth, strokeColor
							)),
							
new Element(new TextBox(
							// TextBox with Text
							"xx xx xx", // function
							"xx",  // name
							"xx", // text
							"center", "center", // align
							"Archivo Narrow", // font style
							0, // text color (index of colors)
							24, // text size
							0, 0, 0, 0,  // x, y, xSize, ySize
							0, 0, // text offset (x, y)
							1, // box color (index of colors)
							255, // opacity (0-255)
							false, 
							50, // roundPercentage
							8, // shadowOffset
							5, 2 // strokeWidth, strokeColor
							)),
							
new Element(new TextBox(
							// TextBox with Renderable
							"xx", // function
							"xx",  // name
							new Renderable(
									// Renderable Without Function
									"xx", // name
									"src/textures/xx.png", // file source
									0, 0, 0, 0, // x, y, xSize, ySize (relative)
									255 // opacity (0-255)
									),  // renderable
							0, 0, 0, 0,  // x, y, xSize, ySize
							1, // box color (index of colors)
							255, // opacity (0-255)
							50, // roundPercentage
							8, // shadowOffset
							5, 2 // strokeWidth, strokeColor
							)),
							
*/