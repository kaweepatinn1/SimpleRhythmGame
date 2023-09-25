package SimpleRhythmGame;

import java.awt.Color;

// A READ ONLY CLASS

public class DefaultValues {
	private final static boolean defaultFullscreen = false; // if not fullscreen will force below value
	private final static int defaultSizeToForce = 1920; // forces this screen size if above is true
	
	private final static boolean defaultNanoSecondPrecision = true; // true breaks animations
	private final static int defaultFramesToStore = 10;
	private final static int defaultFramerate = 60;
	private final static boolean defaultShouldLimitFramerate = true;
	
	private final static boolean defaultCursorEnabled = true;
	
	private final static boolean defaultDEBUG_drawMasks = false; // draws all clipping masks
	private final static int defaultDEBUG_masksColorsOffset = 0; // changes the seed for drawn colors
	
	private final static Controls[] defaultControls = new Controls[] {
			new Controls(
					"Up",
					38,
					new int[]{38, -1, -1}
					),
			new Controls(
					"Down",
					40,
					new int[]{40, -1, -1}
					),
			new Controls(
					"Left",
					37,
					new int[]{37, -1, -1}
					),
			new Controls(
					"Right",
					37,
					new int[]{39, -1, -1}
					),
			new Controls(
					"Enter",
					10,
					new int[]{10, -1, -1}
					),
			new Controls(
					"Escape",
					27,
					new int[]{27, -1, -1}
					)
	};
	
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
			new Menu( // 0. Main Menu
					"Main Menu", // Menu Name
					"Main Menu", // Menu Display Name
					null, // Previous Menu Name
					0, // BG Color
					new int[][]{{-1,-1}}, // Secondary Selections
					new RoundedArea[]{ // Masks
						new RoundedArea(0, 0, 1920, 1080, 0) // 0. Full Screen
						// Insert here
					},
					new StoredTransform[] {
						new StoredTransform(
							-100, 0, // x, y transform
							1, 1, // scale transform (x, y)
							0, // rotate transform
							0, // offset (ms)
							1000, // animation time (ms)
							6 // (ease type)
						),
						new StoredTransform(
							-20, 0, // x, y transform
							0.95, 0.95, // scale transform (x, y)
							0, // rotate transform
							0, // offset (ms)
							100, // animation time (ms)
							6 // (ease type)
						),
						new StoredTransform(
							0, 0, // x, y transform
							1, 1, // scale transform (x, y)
							0, // rotate transform
							0, // offset (ms)
							1000, // animation time (ms)
							6 // (ease type)
						)
					},
					new Element[] { // Elements List
						new Element(
							new Selector(
								new int[]{0,0}, // Selector Index
								new int[][]{{0,0},{0,1},{0,0},{0,0}} // E, S, W, N to select next
								),
							-1, // mask index
							0, // hover effect
							1, // click effect
							-1, // arbritraty animation (to be used for scroll)
							new TextBox(
								// Text and Renderable
								1.5f, // scale
								"setMenu String Play_Menu", // function
								"PlaysButton",  // name
								new Text(
									"Play", // text
									"left", "center", // align
									-375, -9, // text offset (x, y)
									50, // text size
									6, // text color (index of colors)
									"Archivo Narrow", // font
									false // bold
									),
								new Renderable(
									// Renderable Without Function
									"PlayPNG", // name
									"src/textures/play.png", // file source
									40, 30, 60, 60, // x, y, xSize, ySize (relative)
									255 // opacity (0-255)
									),  // renderable
								new RoundedArea(
									1810, 325, 1000, 120, 100  // x, y, xSize, ySize
									),
								2, // box color (index of colors)
								255, // opacity (0-255)
								8, // shadowOffset
								5, 6 // strokeWidth, strokeColor
								)),
						new Element(
							new Selector(
								new int[]{0,1}, // Selector Index
								new int[][]{{0,1},{0,2},{0,1},{0,0}} // E, S, W, N to select next
								),
							-1, // Mask Index
							0, // hover effect
							1, // click effect
							-1, // arbritraty animation (to be used for scroll)
							new TextBox(
								// Text and Renderable
								1, // scale
								"setMenu String Stats_Leaderboards_Menu", // function
								"StatsLeaderboardsButton",  // name
								new Text(
									"Stats and Leaderboards", // text
									"left", "center", // align
									-375, -9, // text offset (x, y)
									50, // text size
									6, // text color (index of colors)
									"Archivo Narrow", // font
									false // bold
									),
								new Renderable(
									// Renderable Without Function
									"LeaderboardPNG", // name
									"src/textures/leaderboard.png", // file source
									40, 30, 60, 60, // x, y, xSize, ySize (relative)
									255 // opacity (0-255)
									),  // renderable
								new RoundedArea(
									1660, 510, 1000, 120,  // x, y, xSize, ySize
									100 // roundPercentage
									),
								2, // box color (index of colors)
								255, // opacity (0-255)
								8, // shadowOffset
								5, 6 // strokeWidth, strokeColor
								)),
						new Element(
							new Selector(
								new int[]{0,2}, // Selector Index
								new int[][]{{0,2},{0,3},{0,2},{0,1}} // E, S, W, N to select next
								),
							-1, // Mask Index
							0, // hover effect
							1, // click effect
							-1, // arbritraty animation (to be used for scroll)
							new TextBox(
								// Text and Renderable
								1, // scale
								"setMenu String Settings_Menu", // function
								"SettingsButton",  // name
								new Text(
									"Settings", // text
									"left", "center", // align
									-375, -9, // text offset (x, y)
									50, // text size
									6, // text color (index of colors)
									"Archivo Narrow", // font
									false // bold
									),
								new Renderable(
									// Renderable Without Function
									"CogwheelPNG", // name
									"src/textures/cog.png", // file source
									40, 30, 60, 60, // x, y, xSize, ySize (relative)
									255 // opacity (0-255)
									),  // renderable
								new RoundedArea(
									1660, 660, 1000, 120,  // x, y, xSize, ySize
									100 // roundPercentage
									),
								2, // box color (index of colors)
								255, // opacity (0-255)
								8, // shadowOffset
								5, 6 // strokeWidth, strokeColor
								)),
						new Element(
							new Selector(
								new int[]{0,3}, // Selector Index
								new int[][]{{0,3},{0,3},{0,3},{0,2}} // E, S, W, N to select next
								),
							-1, // Mask Index
							0, // hover effect
							1, // click effect
							-1, // arbritraty animation (to be used for scroll)
							new TextBox(
								// Text and Renderable
								1, // scale
								"setMenu String Customization_Main_Menu", // function
								"CustomizationButton",  // name
								new Text(
									"Customization", // text
									"left", "center", // align
									-375, -9, // text offset (x, y)
									50, // text size
									6, // text color (index of colors)
									"Archivo Narrow", // font
									false // bold
									),
								new Renderable(
									// Renderable Without Function
									"PalettePNG", // name
									"src/textures/palette.png", // file source
									40, 30, 60, 60, // x, y, xSize, ySize (relative)
									255 // opacity (0-255)
									),  // renderable
								new RoundedArea(
									1660, 810, 1000, 120,  // x, y, xSize, ySize
									100 // roundPercentage
									),
								2, // box color (index of colors)
								255, // opacity (0-255)
								8, // shadowOffset
								5, 6 // strokeWidth, strokeColor
								))
					}),
			new Menu( // 1. Customization
					"Customization Main Menu", // Menu Name
					"Customization", // Menu Display Name
					"Main Menu",
					0, // BG Color
					new int[][]{{-1,-1}}, // Secondary Selections
					new RoundedArea[]{ // Masks
							// Insert here
						},
					new StoredTransform[] {
							
					},
					new Element[] { // Elements List
						
					}
			)
	};
	
	public static Config getDefaultConfigs() {
		Config defaultConfig = new Config(
    			getDefaultFullscreen(),
    			getDefaultSizeToForce(),
    			getDefaultControls(),
    			getDefaultColors(),
    			getDefaultFonts(),
    			getAllDefaultMenus(),
    			getDefaultDEBUG_drawMasks(),
    			getDefaultDEBUG_masksColorsOffset(),
    			getDefaultNanoSecondPrecision(),
    			getDefaultFramesToStore(),
    			getDefaultFramerate(),
    			getDefaultShouldLimitFramerate(),
    			getDefaultCursorEnabled()
    			);
		return defaultConfig;
	}
	
	public static Controls[] getDefaultControls() {
		return defaultControls;
	}
			
	public static boolean getDefaultFullscreen() {
		return defaultFullscreen;
	}
	
	public static int getDefaultSizeToForce() {
		return defaultSizeToForce;
	}
	
	public static Menu[] getAllDefaultMenus() {
		return defaultMenus;
	}
	
	public static Menu getDefaultMenu(int i) {
		return defaultMenus[i];
	}
	
	public static Color[] getDefaultColors(){
		return defaultColors;
	}
	
	public static String[] getDefaultFonts() {
		return defaultFonts;
	}
	
	public static boolean getDefaultNanoSecondPrecision() {
		return defaultNanoSecondPrecision;
	}
	
	public static int getDefaultFramesToStore() {
		return defaultFramesToStore;
	}
	
	public static int getDefaultFramerate() {
		return defaultFramerate;
	}
	
	public static boolean getDefaultShouldLimitFramerate() {
		return defaultShouldLimitFramerate;
	}
	
	public static boolean getDefaultCursorEnabled() {
		return defaultCursorEnabled;
	}
	
	public static boolean getDefaultDEBUG_drawMasks() {
		return defaultDEBUG_drawMasks;
	}
	
	public static int getDefaultDEBUG_masksColorsOffset() {
		return defaultDEBUG_masksColorsOffset;
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

new Element(
	new Selector(
		new int[]{0,0}, // Selector Index
		new int[][]{{0,0},{0,0},{0,0},{0,0}} // E, S, W, N to select next
	),
	new Renderable(
		// Default Renderable
		"xx xx xx", // function 
		"xx", // name
		"src/textures/xx.png", // file source
		0, 0, 0, 0, // x, y, xSize, ySize
		255 // opacity (0-255)
	)),
	
	
	OUT OF DATE:
							
new Element(
	new Selector(
		new int[]{0,0}, // Selector Index
		new int[][]{{0,0},{0,0},{0,0},{0,0}} // E, S, W, N to select next
	),
	new TextBox(
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
							
new Element(
	new Selector(
		new int[]{0,0}, // Selector Index
		new int[][]{{0,0},{0,0},{0,0},{0,0}} // E, S, W, N to select next
	),
	new TextBox(
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
							
new Element(
	new Selector(
		new int[]{0,0}, // Selector Index
		new int[][]{{0,0},{0,0},{0,0},{0,0}} // E, S, W, N to select next
	),
	new TextBox(
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