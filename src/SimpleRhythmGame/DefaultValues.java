package SimpleRhythmGame;

// A READ ONLY CLASS

public class DefaultValues {
	private final static boolean defaultFullscreen = false; // if not fullscreen will force below value
	private final static int defaultSizeToForce = 1280; // forces this screen size if above is true
	
	private final static boolean defaultNanoSecondPrecision = true; // true breaks animations
	private final static int defaultFramesToStore = 20;
	private final static int defaultFramerate = 60;
	private final static boolean defaultShouldLimitFramerate = true;
	private final static boolean defaultDisplayFramerate = false;
	
	private final static double defaultTransitionTime = 500d;
	
	private final static boolean defaultCursorEnabled = true;
	
	private final static int defaultMasterVolume = 50;
	private final static int defaultMusicVolume = 50;
	private final static int defaultSFXVolume = 50;
	
	private final static boolean defaultDEBUG_drawMasks = false; // draws all clipping masks
	private final static int defaultDEBUG_masksColorsOffset = 10; // changes the seed for drawn colors
	private final static int defaultDEBUG_MasksOpacity = 80; // out of 255
	
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
					39,
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
	
	public final static int Color_BG = 0;
	public final static int Color_MENU = 1;
	public final static int Color_BUTTONS = 2;
	public final static int Color_PRIMARYSELECTOR = 3;
	public final static int Color_SECONDARYSELECTOR = 4;
	public final static int Color_ACCENT = 5;
	public final static int Color_STROKE = 6;
	public final static int Color_TRANSPARENT = 7;
	public final static int Color_DISPLAY = 8;
	
	private final static Theme[] defaultThemes = new Theme[] {
			new Theme(
					"DefaultTheme",
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
					),
			new Theme(
					"ColorTrip",
					new IntColor[] {
							new IntColor (0,255,0,255), // 0. BG Color
							new IntColor (23,55,198,255), // 1. Menu Color
				    		new IntColor (207,95,235,255), // 2. Buttons Color
				    		new IntColor (24,255,255,255), // 3. Primary Selection Color
				    		new IntColor (217,217,217,255), // 4. Secondary Selection Color
				    		new IntColor (255,0,0,255), // 5. Accent Color
				    		new IntColor (0,0,0,255), // 6. Stroke Color
				    		new IntColor (0,0,0,0), // 7. Transparent Color
				    		new IntColor (255,255,255,255), // 8. Display Color
					}
					),
	};
	
	private final static String defaultSelectedTheme = "DefaultTheme";
	private final static String defaultSelectedSkin = "DefaultSkin.png";
	
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
	
	// StoredTransform Static Final References:
	public static final int TransformIndex_ClickScaleDown = 0;
	public static final int TransformIndex_1sLeft100 = 1;
	public static final int TransformIndex_1sRight100 = 2;
	public static final int TransformIndex_1sUp100 = 3;
	public static final int TransformIndex_1sDown100 = 4;
	public static final int TransformIndex_500msLeft100 = 5;
	public static final int TransformIndex_500msRight100 = 6;
	public static final int TransformIndex_500msUp100 = 7;
	public static final int TransformIndex_500msDown100 = 8;
	public static final int TransformIndex_1sLeft150 = 9;
	public static final int TransformIndex_1sRight150 = 10;
	public static final int TransformIndex_1sUp150 = 11;
	public static final int TransformIndex_1sDown150 = 12;
	public static final int TransformIndex_500msLeft150 = 13;
	public static final int TransformIndex_500msRight150 = 14;
	public static final int TransformIndex_500msUp150 = 15;
	public static final int TransformIndex_500msDown150 = 16;
	public static final int TransformIndex_500msScaleUp = 17;
	public static final int TransformIndex_500msScaleUpRotateLeft20 = 18;
	public static final int TransformIndex_500msScale0 = 19;
	public static final int TransformIndex_ClickScaleDownRotate20 = 20;
	
	// Popup & Element Static Final References:
	
	public static final Popup Popup_INPUTEMPTY() { 
			return new Popup( // Empty Input Error
					"EmptyInputTheme", // Popup Name
					"Input Error!", // Popup Title
					new Element[] {
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{2,0},{1,0},{0,0},{1,0}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								DefaultValues.TransformIndex_500msScale0, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									"noFunction", // function
									"ErrorMessage",  // name
									new Text(
										"Input Error!", // text
										"center", "center", // align
										0, -100, // text offset (x, y)
										80, // text size
										5, // text color (index of colors)
										"Archivo Narrow", // font
										true // bold
										),
									new RoundedArea(
										960, 500, 600, 300, 0  // x, y, xSize, ySize, round%
										),
									Color_MENU, // box color (index of colors)
									255, // opacity (0-255)
									15, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{2,0},{1,0},{0,0},{1,0}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								DefaultValues.TransformIndex_500msScale0, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									"noFunction", // function
									"ErrorMessage",  // name
									new Text(
										"Input cannot be empty!", // text
										"center", "center", // align
										0, -9, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										960, 495, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{0,0}, // Selector Index
									new int[][]{{1,0},{0,2},{0,0},{0,0}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								DefaultValues.TransformIndex_500msScale0, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									"removeThisPopup", // function
									"popup",  // name
									new Text(
										"Confirm", // text
										"center", "center", // align
										0, -5, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										960, 580, 300, 80, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
					}
			);
	}
		
	public final static Element Element_BACKBUTTON() { 
			return new Element(
					new Selector(
						new int[]{0,0}, // Selector Index
						new int[][]{{0,1},{0,1},{0,0},{0,0}} // E, S, W, N to select next
						),
					-1, // Mask Index
					false, // hover overlap
					DefaultValues.TransformIndex_500msScaleUpRotateLeft20, // hover effect
					DefaultValues.TransformIndex_ClickScaleDownRotate20, // click effect
					-1, // arbritraty animation (to be used for scroll)
					DefaultValues.TransformIndex_500msScale0, // entry animation
					new TextBox(
						// Text and Renderable
						1, // scale
						"escapeMenu", // function
						"BackButton",  // name
						new Renderable(
							// Renderable Without Function
							"BackPNG", // name
							"src/textures/back.png", // file source
							30, 30, 60, 60, // x, y, xSize, ySize (relative)
							255 // opacity (0-255)
							),  // renderable
						new RoundedArea(
							90, 90, 120, 120,  // x, y, xSize, ySize, round%
							100 // roundPercentage
							),
						Color_BUTTONS, // box color (index of colors)
						255, // opacity (0-255)
						5, // shadowOffset
						5, 6 // strokeWidth, strokeColor
						)
					);
	}
	
	private final static Menu[] defaultMenus = new Menu[] {
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
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
						StoredTransform.Transform_ClickScaleDown,
						StoredTransform.Transform_1sLeft100,
						StoredTransform.Transform_1sRight100,
						StoredTransform.Transform_1sUp100,
						StoredTransform.Transform_1sDown100,
						StoredTransform.Transform_500msLeft100,
						StoredTransform.Transform_500msRight100,
						StoredTransform.Transform_500msUp100,
						StoredTransform.Transform_500msDown100,
						StoredTransform.Transform_1sLeft150,
						StoredTransform.Transform_1sRight150,
						StoredTransform.Transform_1sUp150,
						StoredTransform.Transform_1sDown150,
						StoredTransform.Transform_500msLeft150,
						StoredTransform.Transform_500msRight150,
						StoredTransform.Transform_500msUp150,
						StoredTransform.Transform_500msDown150,
						StoredTransform.Transform_500msScaleUp,
						StoredTransform.Transform_500msScaleUpRotateLeft20,
						StoredTransform.Transform_500msScale0,
						StoredTransform.Transform_ClickScaleDownRotate20,
						new StoredTransform(
							-20, 0, // x, y transform
							0.95, 0.95, // scale transform (x, y)
							0, // rotate transform
							0, // offset (ms)
							100, // animation time (ms)
							6 // (ease type)
						),
						new StoredTransform(
							75, 0, // x, y transform
							1, 1, // scale transform (x, y)
							0, // rotate transform
							0, // offset (ms)
							500, // animation time (ms)
							6 // (ease type)
						)
					},
					new Element[] { // Elements List
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
							new Selector(
								new int[]{0,0}, // Selector Index
								new int[][]{{0,0},{0,1},{0,0},{0,0}} // E, S, W, N to select next
								),
							-1, // mask index
							false, // hover overlap
							DefaultValues.TransformIndex_1sLeft100, // hover effect
							21, // click effect
							-1, // arbritraty animation (to be used for scroll)
							22, // entry animation
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
									55, 45, 90, 90, // x, y, xSize, ySize (relative)
									255 // opacity (0-255)
									),  // renderable
								new RoundedArea(
									1810, 325, 1000, 120, 100  // x, y, xSize, ySize, round%
									),
								Color_BUTTONS, // box color (index of colors)
								255, // opacity (0-255)
								12, // shadowOffset
								5, 6 // strokeWidth, strokeColor
								)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
							new Selector(
								new int[]{0,1}, // Selector Index
								new int[][]{{0,1},{0,2},{0,1},{0,0}} // E, S, W, N to select next
								),
							-1, // Mask Index
							false, // hover overlap
							DefaultValues.TransformIndex_1sLeft100, // hover effect
							21, // click effect
							-1, // arbritraty animation (to be used for scroll)
							22, // entry animation
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
									1660, 510, 1000, 120,  // x, y, xSize, ySize, round%
									100 // roundPercentage
									),
								Color_BUTTONS, // box color (index of colors)
								255, // opacity (0-255)
								15, // shadowOffset
								5, 6 // strokeWidth, strokeColor
								)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
							new Selector(
								new int[]{0,2}, // Selector Index
								new int[][]{{0,2},{0,3},{0,2},{0,1}} // E, S, W, N to select next
								),
							-1, // Mask Index
							false, // hover overlap
							DefaultValues.TransformIndex_1sLeft100, // hover effect
							21, // click effect
							-1, // arbritraty animation (to be used for scroll)
							22, // entry animation
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
									1660, 660, 1000, 120,  // x, y, xSize, ySize, round%
									100 // roundPercentage
									),
								Color_BUTTONS, // box color (index of colors)
								255, // opacity (0-255)
								15, // shadowOffset
								5, 6 // strokeWidth, strokeColor
								)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
							new Selector(
								new int[]{0,3}, // Selector Index
								new int[][]{{0,3},{0,3},{0,3},{0,2}} // E, S, W, N to select next
								),
							-1, // Mask Index
							false, // hover overlap
							DefaultValues.TransformIndex_1sLeft100, // hover effect
							21, // click effect
							-1, // arbritraty animation (to be used for scroll)
							22, // entry animation
							new TextBox(
								// Text and Renderable
								1, // scale
								"setMenu String Customization_Skin_Selector", // function
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
									1660, 810, 1000, 120,  // x, y, xSize, ySize, round%
									100 // roundPercentage
									),
								Color_BUTTONS, // box color (index of colors)
								255, // opacity (0-255)
								15, // shadowOffset
								5, 6 // strokeWidth, strokeColor
								))
					},
					new Popup[] {
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
					}
				),
			new Menu( // 1. Skin Selector
					"Customization Skin Selector", // Menu Name
					"Customization", // Menu Display Name
					"Main Menu", // Parent Menu
					0, // BG Color
					new int[][]{{0,1}}, // Secondary Selections
					new RoundedArea[]{ // Masks
							new RoundedArea(0, 0, 1920, 1080, 0), // 0. Full Screen
							new RoundedArea(400, 250, 1120, 625, 0), // 1. Skin Choices
							// Insert here
						},
						new StoredTransform[] {
							StoredTransform.Transform_ClickScaleDown,
							StoredTransform.Transform_1sLeft100,
							StoredTransform.Transform_1sRight100,
							StoredTransform.Transform_1sUp100,
							StoredTransform.Transform_1sDown100,
							StoredTransform.Transform_500msLeft100,
							StoredTransform.Transform_500msRight100,
							StoredTransform.Transform_500msUp100,
							StoredTransform.Transform_500msDown100,
							StoredTransform.Transform_1sLeft150,
							StoredTransform.Transform_1sRight150,
							StoredTransform.Transform_1sUp150,
							StoredTransform.Transform_1sDown150,
							StoredTransform.Transform_500msLeft150,
							StoredTransform.Transform_500msRight150,
							StoredTransform.Transform_500msUp150,
							StoredTransform.Transform_500msDown150,
							StoredTransform.Transform_500msScaleUp,
							StoredTransform.Transform_500msScaleUpRotateLeft20,
							StoredTransform.Transform_500msScale0,
							StoredTransform.Transform_ClickScaleDownRotate20, // 20
							new StoredTransform( // 3 --> 21. hover (no rotate)
									-200, 0, // x, y transform
									1, 1, // scale transform (x, y)
									0, // rotate transform
									0, // offset (ms)
									750, // animation time (ms)
									6 // (ease type)
								),
							new StoredTransform( // 10 --> 22. -200 x (f box to center)
									-200, 0, // x, y transform
									1, 1, // scale transform (x, y)
									0, // rotate transform
									0, // offset (ms)
									500, // animation time (ms)
									6 // (ease type)
									),
							new StoredTransform( // 11 --> 23. 120 y (optionsList)
									0, 120, // x, y transform
									1, 1, // scale transform (x, y)
									0, // rotate transform
									0, // offset (ms)
									400, // animation time (ms)
									6 // (ease type)
									),
						},
					new Element[] { // Elements List
/////////////////////////////////////////////////////////////////////////////////////
							new Element(
									new Selector(
										new int[]{0,1}, // Selector Index
										new int[][]{{1,0},{0,2},{0,0},{0,0}} // E, S, W, N to select next
										),
									-1, // mask index
									false, // hover overlap
									21, // hover effect
									DefaultValues.TransformIndex_ClickScaleDown, // click effect
									-1, // arbritraty animation (to be used for scroll)
									DefaultValues.TransformIndex_500msRight150, // entry animation
									new TextBox(
										// Text and Renderable
										1f, // scale
										"setMenu String null", // function
										"SkinSelectorButton",  // name
										new Text(
											"Skin Selector", // text
											"left", "center", // align
											-250, -9, // text offset (x, y)
											50, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
										new RoundedArea(
											600, 300, 600, 120, 100  // x, y, xSize, ySize, round%
											),
										Color_BUTTONS, // box color (index of colors)
										255, // opacity (0-255)
										15, // shadowOffset
										5, 6 // strokeWidth, strokeColor
										)),
/////////////////////////////////////////////////////////////////////////////////////
							new Element(
									new Selector(
										new int[]{0,2}, // Selector Index
										new int[][]{{1,0},{0,2},{0,0},{0,1}} // E, S, W, N to select next
										),
									-1, // mask index
									false, // hover overlap
									21, // hover effect
									DefaultValues.TransformIndex_ClickScaleDown, // click effect
									-1, // arbritraty animation (to be used for scroll)
									DefaultValues.TransformIndex_500msRight150, // entry animation
									new TextBox(
										// Text and Renderable
										1f, // scale
										"setMenu String Customization_Theme_Builder", // function
										"ThemeBuilderButton",  // name
										new Text(
											"Theme Builder", // text
											"left", "center", // align
											-250, -9, // text offset (x, y)
											50, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
										new RoundedArea(
											600, 450, 600, 120, 100  // x, y, xSize, ySize, round%
											),
										Color_BUTTONS, // box color (index of colors)
										255, // opacity (0-255)
										15, // shadowOffset
										5, 6 // strokeWidth, strokeColor
										)),
/////////////////////////////////////////////////////////////////////////////////////
							DefaultValues.Element_BACKBUTTON(),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
							new Selector(
								new int[]{-1,-1}, // Selector Index
								new int[][]{{-1,-1},{-1,-1},{-1,-1},{-1,-1}} // E, S, W, N to select next
								),
							-1, // Mask Index
							false, // hover overlap
							-1, // hover effect
							-1, // click effect
							-1, // arbritraty animation (to be used for scroll)
							22, // entry animation
							new TextBox(
								// No Text, No Renderable
								1, // scale
								null, // function
								"Green Background",  // name
								new RoundedArea(
									1160, 560, 1200, 800,  // x, y, xSize, ySize, round%
									5 // roundPercentage
									),
								Color_MENU, // box color (index of colors)
								255, // opacity (0-255)
								25, // shadowOffset
								5, 6 // strokeWidth, strokeColor
								)
							),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{0,0},{0,0},{0,0},{0,0}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								-1, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"SkinSelectorSubtitle",  // name
									new Text(
										"Skin Select", // text
										"center", "center", // align
										0, -50, // text offset (x, y)
										60, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1160, 270, 850, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{0,0},{0,0},{0,0},{0,0}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								-1, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"SkinSubtext",  // name
									new Text(
										"Skin", // text
										"left", "center", // align
										0, -2, // text offset (x, y)
										50, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										735, 325, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{2,0}, // Selector Index
									new int[][]{{2,0},{1,1},{1,0},{0,0}} // E, S, W, N to select next
									),
								-1, // mask index
								true, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									"addPopup int 0", // function
									"DropDownThemes",  // name
									new Renderable(
											// Renderable Without Function
											"DropDownPNG", // name
											"src/textures/dropdown.png", // file source
											8, 7, 50, 50, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										1054, 330, 65, 65, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{0,0},{0,0},{0,0},{0,0}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								-1, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"SkinName",  // name
									new Text(
										"%CurrentSkinName", // text
										"right", "center", // align
										240, -6, // text offset (x, y)
										35, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1335, 330, 500, 65, 0  // x, y, xSize, ySize, round%
										),
									Color_DISPLAY, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{0,0},{0,0},{0,0},{0,0}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								-1, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"CurrentSkinSubitle",  // name
									new Text(
										"Current Skin", // text
										"center", "center", // align
										0, -50, // text offset (x, y)
										60, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1160, 645, 850, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									15, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{0,0},{0,0},{0,0},{0,0}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								-1, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"Description",  // name
									new Text(
										"Tip:", // text
										"left", "center", // align
										28, -70, // text offset (x, y)
										45, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1035, 472, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									15, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{0,0},{0,0},{0,0},{0,0}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								-1, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"Description",  // name
									new Text(
										"Custom skins must be 150px by 100px%br%and in the png format to be registered%br%by the system", // text
										"left", "center", // align
										28, -12, // text offset (x, y)
										35, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1035, 472, 5, 180, 50  // x, y, xSize, ySize, round%
										),
									Color_STROKE, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{3,3},{1,4},{1,3},{1,2}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									//Text
									1f, // scale
									"noFunction", // function
									"CurrentSkin", // name
									new Text(
											"Current Skin", // text
											"center", "center", // align
											0, -9, // text offset (x, y)
											50, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new Renderable(
											// Renderable Without Function
											"CurrentSkin", // name
											"%CurrentSkinPath", // image "path"
											0, 0, 270, 180, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										872, 472, 270, 180, 0  // x, y, xSize, ySize, round%
										),
									Color_DISPLAY, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{3,3},{1,4},{1,3},{1,2}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									//Text
									1f, // scale
									"noFunction", // function
									"Texture1", // name
									new Text(
											"Texture 1", // text
											"center", "center", // align
											0, 125, // text offset (x, y)
											50, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new Renderable(
											// Renderable Without Function
											"Texture1", // name
											1, // note
											0, 0, 180, 180, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										700, 770, 180, 180, 0  // x, y, xSize, ySize, round%
										),
									Color_MENU, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{3,3},{1,4},{1,3},{1,2}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									//Text
									1f, // scale
									"noFunction", // function
									"Texture2", // name
									new Text(
											"Texture 2", // text
											"center", "center", // align
											0, 125, // text offset (x, y)
											50, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new Renderable(
											// Renderable Without Function
											"Texture2", // name
											2, // note
											0, 0, 180, 180, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										930, 770, 180, 180, 0  // x, y, xSize, ySize, round%
										),
									Color_MENU, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{3,3},{1,4},{1,3},{1,2}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									//Text
									1f, // scale
									"noFunction", // function
									"Texture3", // name
									new Text(
											"Texture 3", // text
											"center", "center", // align
											0, 125, // text offset (x, y)
											50, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new Renderable(
											// Renderable Without Function
											"Texture3", // name
											3, // note
											0, 0, 180, 180, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										1160, 770, 180, 180, 0  // x, y, xSize, ySize, round%
										),
									Color_MENU, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{3,3},{1,4},{1,3},{1,2}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									//Text
									1f, // scale
									"noFunction", // function
									"Texture4", // name
									new Text(
											"Texture 4", // text
											"center", "center", // align
											0, 125, // text offset (x, y)
											50, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new Renderable(
											// Renderable Without Function
											"Texture4", // name
											4, // note
											0, 0, 180, 180, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										1390, 770, 180, 180, 0  // x, y, xSize, ySize, round%
										),
									Color_MENU, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{3,3},{1,4},{1,3},{1,2}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									//Text
									1f, // scale
									"noFunction", // function
									"Texture5", // name
									new Text(
											"Texture 5", // text
											"center", "center", // align
											0, 125, // text offset (x, y)
											50, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new Renderable(
											// Renderable Without Function
											"Texture5", // name
											5, // note
											0, 0, 180, 180, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										1620, 770, 180, 180, 0  // x, y, xSize, ySize, round%
										),
									Color_MENU, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
					},
					new Popup[] { // Popups List
							new Popup(
								"ThemeOptions", // Popup Name
								"Theme Options", // Popup Title
								new Element[] {
									new Element(
											new Selector(
												new int[]{-1,-1}, // Selector Index
												new int[][]{{-1,-1},{-1,-1},{-1,-1},{-1,-1}} // E, S, W, N to select next
												),
											-1, // Mask Index
											false, // hover overlap
											-1, // hover effect
											-1, // click effect
											-1, // arbritraty animation (to be used for scroll)
											DefaultValues.TransformIndex_500msScale0, // entry animation
											new TextBox(
												// No Text, No Renderable
												1, // scale
												null, // function
												"Green Background",  // name
												new RoundedArea(
													960, 560, 1200, 800,  // x, y, xSize, ySize, round%
													5 // roundPercentage
													),
												Color_MENU, // box color (index of colors)
												255, // opacity (0-255)
												25, // shadowOffset
												5, 6 // strokeWidth, strokeColor
												)
											),
/////////////////////////////////////////////////////////////////////////////////////
									new Element(
											new Selector(
													new int[]{2,0}, // Selector Index
													new int[][]{{3,0},{2,0},{1,0},{2,0}} // E, S, W, N to select next
													),
												1, // mask index
												false, // hover overlap
												-1, // hover effect
												DefaultValues.TransformIndex_ClickScaleDown, // click effect
												23, // arbritraty animation (to be used for scroll)
												DefaultValues.TransformIndex_500msScale0, // entry animation
												new OptionsList(
														// Text and Renderable
														1f, // scale
														"setSkin", // function
														"%SkinChoices", // list objects
														5, // max amount of options
														"SkinChoices",  // name
														new Text(
															"%Name", // text
															"center", "center", // align
															0, -5, // text offset (x, y)
															40, // text size
															6, // text color (index of colors)
															"Archivo Narrow", // font
															false // bold
															),
														new RoundedArea(
															960, 320, 1100, 80, 0  // x, y, xSize, ySize, round%
															),
														Color_BUTTONS, // box color (index of colors)
														255, // opacity (0-255)
														8, // shadowOffset
														5, 6 // strokeWidth, strokeColor
														)
												),
/////////////////////////////////////////////////////////////////////////////////////
									new Element(
											new Selector(
												new int[]{1,0}, // Selector Index
												new int[][]{{2,0},{2,0},{0,0},{0,0}} // E, S, W, N to select next
												),
											-1, // mask index
											false, // hover overlap
											-1, // hover effect
											DefaultValues.TransformIndex_ClickScaleDown, // click effect
											-1, // arbritraty animation (to be used for scroll)
											DefaultValues.TransformIndex_500msScale0, // entry animation
											new TextBox(
												// Text and Renderable
												1f, // scale
												"scroll String SkinChoices boolean false", // function
												"ThemeChoicesScrollUp",  // name
												new Renderable(
														// Renderable Without Function
														"UpPNG", // name
														"src/textures/up.png", // file source
														15, 7, 90, 36, // x, y, xSize, ySize (relative)
														255 // opacity (0-255)
														),  // renderable
												new RoundedArea(
													960, 210, 120, 50, 0  // x, y, xSize, ySize, round%
													),
												Color_BUTTONS, // box color (index of colors)
												255, // opacity (0-255)
												8, // shadowOffset
												5, 6 // strokeWidth, strokeColor
												)),
/////////////////////////////////////////////////////////////////////////////////////
									new Element(
											new Selector(
												new int[]{3,0}, // Selector Index
												new int[][]{{3,0},{3,0},{2,0},{2,0}} // E, S, W, N to select next
												),
											-1, // mask index
											false, // hover overlap
											-1, // hover effect
											DefaultValues.TransformIndex_ClickScaleDown, // click effect
											-1, // arbritraty animation (to be used for scroll)
											DefaultValues.TransformIndex_500msScale0, // entry animation
											new TextBox(
												// Text and Renderable
												1f, // scale
												"scroll String SkinChoices boolean true", // function
												"ThemeChoicesScrollDown",  // name
												new Renderable(
														// Renderable Without Function
														"DownPNG", // name
														"src/textures/down.png", // file source
														15, 7, 90, 36, // x, y, xSize, ySize (relative)
														255 // opacity (0-255)
														),  // renderable
												new RoundedArea(
													960, 910, 120, 50, 0  // x, y, xSize, ySize, round%
													),
												Color_BUTTONS, // box color (index of colors)
												255, // opacity (0-255)
												8, // shadowOffset
												5, 6 // strokeWidth, strokeColor
												)),
/////////////////////////////////////////////////////////////////////////////////////
									DefaultValues.Element_BACKBUTTON(),
		/////////////////////////////////////////////////////////////////////////////////////
								}
							)
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
					}
			),
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
			new Menu( // 2. Theme Builder
					"Customization Theme Builder", // Menu Name
					"Customization", // Menu Display Name
					"Main Menu", // Parent Menu
					0, // BG Color
					new int[][]{{0,2}}, // Secondary Selections
					new RoundedArea[]{ // Masks
							new RoundedArea(0, 0, 1920, 1080, 0), // 0. Full Screen
							new RoundedArea(800, 250, 320, 625, 0), // 1. Theme Choices
							// Insert here
						},
						new StoredTransform[] {
								StoredTransform.Transform_ClickScaleDown,
								StoredTransform.Transform_1sLeft100,
								StoredTransform.Transform_1sRight100,
								StoredTransform.Transform_1sUp100,
								StoredTransform.Transform_1sDown100,
								StoredTransform.Transform_500msLeft100,
								StoredTransform.Transform_500msRight100,
								StoredTransform.Transform_500msUp100,
								StoredTransform.Transform_500msDown100,
								StoredTransform.Transform_1sLeft150,
								StoredTransform.Transform_1sRight150,
								StoredTransform.Transform_1sUp150,
								StoredTransform.Transform_1sDown150,
								StoredTransform.Transform_500msLeft150,
								StoredTransform.Transform_500msRight150,
								StoredTransform.Transform_500msUp150,
								StoredTransform.Transform_500msDown150,
								StoredTransform.Transform_500msScaleUp,
								StoredTransform.Transform_500msScaleUpRotateLeft20,
								StoredTransform.Transform_500msScale0,
								StoredTransform.Transform_ClickScaleDownRotate20, // 20
								new StoredTransform( // 3 --> 21. hover expand (no rotate)
										-200, 0, // x, y transform
										1, 1, // scale transform (x, y)
										0, // rotate transform
										0, // offset (ms)
										750, // animation time (ms)
										6 // (ease type)
									),
								new StoredTransform( // 10 --> 22. -200 x (f box to center)
										-200, 0, // x, y transform
										1, 1, // scale transform (x, y)
										0, // rotate transform
										0, // offset (ms)
										500, // animation time (ms)
										6 // (ease type)
										),
								new StoredTransform( // 11 --> 23. 120 y (optionsList)
										0, 120, // x, y transform
										1, 1, // scale transform (x, y)
										0, // rotate transform
										0, // offset (ms)
										400, // animation time (ms)
										6 // (ease type)
										)
						},
					new Element[] { // Elements List
/////////////////////////////////////////////////////////////////////////////////////
							new Element(
									new Selector(
										new int[]{0,1}, // Selector Index
										new int[][]{{1,0},{0,2},{0,0},{0,0}} // E, S, W, N to select next
										),
									-1, // mask index
									false, // hover overlap
									21, // hover effect
									1, // click effect
									-1, // arbritraty animation (to be used for scroll)
									DefaultValues.TransformIndex_500msRight150, // entry animation
									new TextBox(
										// Text and Renderable
										1f, // scale
										"setMenu String Customization_Skin_Selector", // function
										"SkinSelectorButton",  // name
										new Text(
											"Skin Selector", // text
											"left", "center", // align
											-250, -9, // text offset (x, y)
											50, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
										new RoundedArea(
											600, 300, 600, 120, 100  // x, y, xSize, ySize, round%
											),
										Color_BUTTONS, // box color (index of colors)
										255, // opacity (0-255)
										15, // shadowOffset
										5, 6 // strokeWidth, strokeColor
										)),
/////////////////////////////////////////////////////////////////////////////////////
							new Element(
									new Selector(
										new int[]{0,2}, // Selector Index
										new int[][]{{1,0},{0,2},{0,0},{0,1}} // E, S, W, N to select next
										),
									-1, // mask index
									false, // hover overlap
									21, // hover effect
									1, // click effect
									-1, // arbritraty animation (to be used for scroll)
									DefaultValues.TransformIndex_500msRight150, // entry animation
									new TextBox(
										// Text and Renderable
										1f, // scale
										"setMenu String null", // function
										"ThemeBuilderButton",  // name
										new Text(
											"Theme Builder", // text
											"left", "center", // align
											-250, -9, // text offset (x, y)
											50, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
										new RoundedArea(
											600, 450, 600, 120, 100  // x, y, xSize, ySize, round%
											),
										Color_BUTTONS, // box color (index of colors)
										255, // opacity (0-255)
										15, // shadowOffset
										5, 6 // strokeWidth, strokeColor
										)),
/////////////////////////////////////////////////////////////////////////////////////
							DefaultValues.Element_BACKBUTTON(),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
							new Selector(
								new int[]{-1,-1}, // Selector Index
								new int[][]{{-1,-1},{-1,-1},{-1,-1},{-1,-1}} // E, S, W, N to select next
								),
							-1, // Mask Index
							false, // hover overlap
							-1, // hover effect
							-1, // click effect
							-1, // arbritraty animation (to be used for scroll)
							22, // entry animation
							new TextBox(
								// No Text, No Renderable
								1, // scale
								null, // function
								"Green Background",  // name
								new RoundedArea(
									1160, 560, 1200, 800,  // x, y, xSize, ySize, round%
									5 // roundPercentage
									),
								Color_MENU, // box color (index of colors)
								255, // opacity (0-255)
								25, // shadowOffset
								5, 6 // strokeWidth, strokeColor
								)
							),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{0,0},{0,0},{0,0},{0,0}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								-1, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"ThemeSelectorSubtitle",  // name
									new Text(
										"Theme Select", // text
										"center", "center", // align
										0, -50, // text offset (x, y)
										60, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1160, 270, 850, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{0,0},{0,0},{0,0},{0,0}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								-1, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"ThemeBuilderSubitle",  // name
									new Text(
										"Theme Builder", // text
										"center", "center", // align
										0, -50, // text offset (x, y)
										60, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1160, 555, 850, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									15, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{0,0},{0,0},{0,0},{0,0}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								-1, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"ThemeSubtext",  // name
									new Text(
										"Theme", // text
										"left", "center", // align
										0, -2, // text offset (x, y)
										50, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										735, 325, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{1,0}, // Selector Index
									new int[][]{{2,0},{1,1},{0,2},{1,0}} // E, S, W, N to select next
									),
								-1, // mask index
								true, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									"addTheme", // function
									"AddTheme",  // name
									new Renderable(
											// Renderable Without Function
											"PlusButtonPNG", // name
											"src/textures/plus.png", // file source
											8, 7, 50, 50, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										991, 330, 65, 65, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{2,0}, // Selector Index
									new int[][]{{2,0},{1,1},{1,0},{0,0}} // E, S, W, N to select next
									),
								-1, // mask index
								true, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									"addPopup int 2", // function
									"DropDownThemes",  // name
									new Renderable(
											// Renderable Without Function
											"DropDownPNG", // name
											"src/textures/dropdown.png", // file source
											8, 7, 50, 50, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										1054, 330, 65, 65, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{0,0},{0,0},{0,0},{0,0}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								-1, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"ThemeText",  // name
									new Text(
										"%CurrentThemeName", // text
										"right", "center", // align
										240, -6, // text offset (x, y)
										35, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1335, 330, 500, 65, 0  // x, y, xSize, ySize, round%
										),
									Color_DISPLAY, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{1,1}, // Selector Index
									new int[][]{{1,1},{1,2},{0,2},{1,0}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									"exportTheme", // function
									"ExportThemeButton",  // name
									new Text(
										"Export Theme", // text
										"center", "center", // align
										0, -6, // text offset (x, y)
										35, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1160, 425, 300, 65, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									10, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{0,0},{0,0},{0,0},{0,0}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								-1, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"ThemeNameSubtext",  // name
									new Text(
										"Theme Name", // text
										"left", "center", // align
										0, -2, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										735, 610, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
///////////////////////////////////////,//////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{1,2}, // Selector Index
									new int[][]{{1,2},{1,3},{0,2},{1,1}} // E, S, W, N to select next
									),
								-1, // mask index
								true, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									"enterTextField String ThemeName", // function
									"EditThemeNameButton",  // name
									new Renderable(
											// Renderable Without Function
											"EditPNG", // name
											"src/textures/edit.png", // file source
											9, 8, 50, 50, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										1054, 614, 65, 65, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{0,0},{0,0},{0,0},{0,0}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextField(
										// Textfield
										1f, // scale
										16, // Max Size
										new int[] { // Error Popup Indexes
												1, // Field is duplicate!
												0, // Field is empty
											},
										TextField.Input_ALPHANUMERIC, // input type
										"ThemeName", // Name
										new Text(
											"%CurrentThemeName", // text
											"right", "center", // align
											240, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1335, 614, 500, 65, 0  // x, y, xSize, ySize, round%
										),
									Color_DISPLAY, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{2,3},{1,4},{0,2},{1,2}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextField(
										// Textfield
										1f, // scale
										16, // Max Size
										new int[] { // Error Popup Indexes
												1, // Field is duplicate!
												0, // Field is empty
												3, // Not a valid input
											},
										TextField.Input_HEXADECIMAL, // input type
										"Color0", // Name
										new Text(
											"%CurrentThemeColor 0", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											25, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
										
									new RoundedArea(
										672, 700, 120, 60, 0  // x, y, xSize, ySize, round%
										),
									Color_DISPLAY, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{1,3}, // Selector Index
									new int[][]{{2,3},{1,4},{0,2},{1,2}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									//Text
									1f, // scale
									"enterTextField String Color0", // function
									"EditColor0Button", // name
									new Text(
											"Background%br%Color", // text
											"center", "center", // align
											0, 50, // text offset (x, y)
											25, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new Renderable(
											// Renderable Without Function
											"EditPNG", // name
											"src/textures/edit.png", // file source
											36, 6, 50, 50, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										672, 760, 120, 60, 0  // x, y, xSize, ySize, round%
										),
									Color_BG, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{2,3},{1,4},{0,2},{1,2}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextField(
										// Textfield
										1f, // scale
										16, // Max Size
										new int[] { // Error Popup Indexes
												1, // Field is duplicate!
												0, // Field is empty
												3, // Not a valid input
											},
										TextField.Input_HEXADECIMAL, // input type
										"Color1", // Name
										new Text(
											"%CurrentThemeColor 1", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											25, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
										
									new RoundedArea(
										812, 700, 120, 60, 0  // x, y, xSize, ySize, round%
										),
									Color_DISPLAY, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{2,3}, // Selector Index
									new int[][]{{3,3},{1,4},{1,3},{1,2}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									//Text
									1f, // scale
									"enterTextField String Color1", // function
									"EditColor1Button", // name
									new Text(
											"Menu%br%Color", // text
											"center", "center", // align
											0, 50, // text offset (x, y)
											25, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new Renderable(
											// Renderable Without Function
											"EditPNG", // name
											"src/textures/edit.png", // file source
											36, 6, 50, 50, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										812, 760, 120, 60, 0  // x, y, xSize, ySize, round%
										),
									Color_MENU, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{2,3},{1,4},{0,2},{1,2}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextField(
										// Textfield
										1f, // scale
										16, // Max Size
										new int[] { // Error Popup Indexes
												1, // Field is duplicate!
												0, // Field is empty
												3, // Not a valid input
											},
										TextField.Input_HEXADECIMAL, // input type
										"Color2", // Name
										new Text(
											"%CurrentThemeColor 2", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											25, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
										
									new RoundedArea(
										952, 700, 120, 60, 0  // x, y, xSize, ySize, round%
										),
									Color_DISPLAY, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{3,3}, // Selector Index
									new int[][]{{4,3},{1,4},{2,3},{1,2}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									//Text
									1f, // scale
									"enterTextField String Color2", // function
									"EditColor2Button", // name
									new Text(
											"Buttons%br%Color", // text
											"center", "center", // align
											0, 50, // text offset (x, y)
											25, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new Renderable(
											// Renderable Without Function
											"EditPNG", // name
											"src/textures/edit.png", // file source
											36, 6, 50, 50, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										952, 760, 120, 60, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{2,3},{1,4},{0,2},{1,2}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextField(
										// Textfield
										1f, // scale
										16, // Max Size
										new int[] { // Error Popup Indexes
												1, // Field is duplicate!
												0, // Field is empty
												3, // Not a valid input
											},
										TextField.Input_HEXADECIMAL, // input type
										"Color3", // Name
										new Text(
											"%CurrentThemeColor 3", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											25, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
										
									new RoundedArea(
										1092, 700, 120, 60, 0  // x, y, xSize, ySize, round%
										),
									Color_DISPLAY, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{4,3}, // Selector Index
									new int[][]{{5,3},{1,4},{3,3},{1,2}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									//Text
									1f, // scale
									"enterTextField String Color3", // function
									"EditColor3Button", // name
									new Text(
											"Selector%br%Color", // text
											"center", "center", // align
											0, 50, // text offset (x, y)
											25, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new Renderable(
											// Renderable Without Function
											"EditPNG", // name
											"src/textures/edit.png", // file source
											36, 6, 50, 50, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										1092, 760, 120, 60, 0  // x, y, xSize, ySize, round%
										),
									Color_PRIMARYSELECTOR, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{2,3},{1,4},{0,2},{1,2}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextField(
										// Textfield
										1f, // scale
										16, // Max Size
										new int[] { // Error Popup Indexes
												1, // Field is duplicate!
												0, // Field is empty
												3, // Not a valid input
											},
										TextField.Input_HEXADECIMAL, // input type
										"Color4", // Name
										new Text(
											"%CurrentThemeColor 4", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											25, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
										
									new RoundedArea(
										1232, 700, 120, 60, 0  // x, y, xSize, ySize, round%
										),
									Color_DISPLAY, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{5,3}, // Selector Index
									new int[][]{{6,3},{1,4},{4,3},{1,2}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									//Text
									1f, // scale
									"enterTextField String Color4", // function
									"EditColor4Button", // name
									new Text(
											"Selector%br%Color 2", // text
											"center", "center", // align
											0, 50, // text offset (x, y)
											25, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new Renderable(
											// Renderable Without Function
											"EditPNG", // name
											"src/textures/edit.png", // file source
											36, 6, 50, 50, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										1232, 760, 120, 60, 0  // x, y, xSize, ySize, round%
										),
									Color_SECONDARYSELECTOR, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{2,3},{1,4},{0,2},{1,2}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextField(
										// Textfield
										1f, // scale
										16, // Max Size
										new int[] { // Error Popup Indexes
												1, // Field is duplicate!
												0, // Field is empty
												3, // Not a valid input
											},
										TextField.Input_HEXADECIMAL, // input type
										"Color5", // Name
										new Text(
											"%CurrentThemeColor 5", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											25, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
										
									new RoundedArea(
										1372, 700, 120, 60, 0  // x, y, xSize, ySize, round%
										),
									Color_DISPLAY, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{6,3}, // Selector Index
									new int[][]{{7,3},{1,4},{5,3},{1,2}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									//Text
									1f, // scale
									"enterTextField String Color5", // function
									"EditColor5Button", // name
									new Text(
											"Accent%br%Color", // text
											"center", "center", // align
											0, 50, // text offset (x, y)
											25, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new Renderable(
											// Renderable Without Function
											"EditPNG", // name
											"src/textures/edit.png", // file source
											36, 6, 50, 50, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										1372, 760, 120, 60, 0  // x, y, xSize, ySize, round%
										),
									Color_ACCENT, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{2,3},{1,4},{0,2},{1,2}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextField(
										// Textfield
										1f, // scale
										16, // Max Size
										new int[] { // Error Popup Indexes
												1, // Field is duplicate!
												0, // Field is empty
												3, // Not a valid input
											},
										TextField.Input_HEXADECIMAL, // input type
										"Color6", // Name
										new Text(
											"%CurrentThemeColor 6", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											25, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
										
									new RoundedArea(
										1518, 700, 120, 60, 0  // x, y, xSize, ySize, round%
										),
									Color_DISPLAY, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{7,3}, // Selector Index
									new int[][]{{8,3},{1,4},{6,3},{1,2}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									//Text
									1f, // scale
									"enterTextField String Color6", // function
									"EditColor6Button", // name
									new Text(
											"Stroke%br%Color", // text
											"center", "center", // align
											0, 50, // text offset (x, y)
											25, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new Renderable(
											// Renderable Without Function
											"EditPNG", // name
											"src/textures/edit.png", // file source
											36, 6, 50, 50, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										1518, 760, 120, 60, 0  // x, y, xSize, ySize, round%
										),
									Color_STROKE, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
						
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{2,3},{1,4},{0,2},{1,2}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextField(
										// Textfield
										1f, // scale
										16, // Max Size
										new int[] { // Error Popup Indexes
												1, // Field is duplicate!
												0, // Field is empty
												3, // Not a valid input
											},
										TextField.Input_HEXADECIMAL, // input type
										"Color8", // Name
										new Text(
											"%CurrentThemeColor 8", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											25, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
										
									new RoundedArea(
										1652, 700, 120, 60, 0  // x, y, xSize, ySize, round%
										),
									Color_DISPLAY, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{8,3}, // Selector Index
									new int[][]{{8,3},{1,4},{7,3},{1,2}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									//Text
									1f, // scale
									"enterTextField String Color8", // function
									"EditColor8Button", // name
									new Text(
											"Display%br%Color", // text
											"center", "center", // align
											0, 50, // text offset (x, y)
											25, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new Renderable(
											// Renderable Without Function
											"EditPNG", // name
											"src/textures/edit.png", // file source
											36, 6, 50, 50, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										1652, 760, 120, 60, 0  // x, y, xSize, ySize, round%
										),
									Color_DISPLAY, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
						
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{1,4}, // Selector Index
									new int[][]{{2,4},{1,4},{0,2},{1,3}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									"importTheme", // function
									"ImportThemeButton",  // name
									new Text(
										"Import Theme", // text
										"center", "center", // align
										0, -6, // text offset (x, y)
										35, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1002, 900, 300, 65, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									10, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{2,4}, // Selector Index
									new int[][]{{2,4},{2,4},{1,4},{1,3}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									"deleteTheme", // function
									"DeleteThemeButton",  // name
									new Text(
										"Delete Theme", // text
										"center", "center", // align
										0, -6, // text offset (x, y)
										35, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										true // bold
										),
									new RoundedArea(
										1322, 900, 300, 65, 0  // x, y, xSize, ySize, round%
										),
									Color_ACCENT, // box color (index of colors)
									255, // opacity (0-255)
									10, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
					},
					new Popup[] { // Popups List
							DefaultValues.Popup_INPUTEMPTY(),
							new Popup( // Duplicate Theme Name Error
									"DuplicateThemeName", // Popup Name
									"Input Error!", // Popup Title
									new Element[] {
										new Element(
												new Selector(
													new int[]{-1,-1}, // Selector Index
													new int[][]{{2,0},{1,0},{0,0},{1,0}} // E, S, W, N to select next
													),
												-1, // mask index
												false, // hover overlap
												-1, // hover effect
												DefaultValues.TransformIndex_ClickScaleDown, // click effect
												-1, // arbritraty animation (to be used for scroll)
												DefaultValues.TransformIndex_500msScale0, // entry animation
												new TextBox(
													// Text and Renderable
													1f, // scale
													"noFunction", // function
													"ErrorMessage",  // name
													new Text(
														"Input Error!", // text
														"center", "center", // align
														0, -100, // text offset (x, y)
														80, // text size
														5, // text color (index of colors)
														"Archivo Narrow", // font
														true // bold
														),
													new RoundedArea(
														960, 500, 600, 300, 0  // x, y, xSize, ySize, round%
														),
													Color_MENU, // box color (index of colors)
													255, // opacity (0-255)
													15, // shadowOffset
													5, 6 // strokeWidth, strokeColor
													)),
/////////////////////////////////////////////////////////////////////////////////////
										new Element(
												new Selector(
													new int[]{-1,-1}, // Selector Index
													new int[][]{{2,0},{1,0},{0,0},{1,0}} // E, S, W, N to select next
													),
												-1, // mask index
												false, // hover overlap
												-1, // hover effect
												DefaultValues.TransformIndex_ClickScaleDown, // click effect
												-1, // arbritraty animation (to be used for scroll)
												DefaultValues.TransformIndex_500msScale0, // entry animation
												new TextBox(
													// Text and Renderable
													1f, // scale
													"noFunction", // function
													"ErrorMessage",  // name
													new Text(
														"This theme name is taken!", // text
														"center", "center", // align
														0, -9, // text offset (x, y)
														40, // text size
														6, // text color (index of colors)
														"Archivo Narrow", // font
														false // bold
														),
													new RoundedArea(
														960, 495, 0, 0, 0  // x, y, xSize, ySize, round%
														),
													Color_TRANSPARENT, // box color (index of colors)
													255, // opacity (0-255)
													0, // shadowOffset
													5, 6 // strokeWidth, strokeColor
													)),
/////////////////////////////////////////////////////////////////////////////////////
										new Element(
												new Selector(
													new int[]{0,0}, // Selector Index
													new int[][]{{1,0},{0,2},{0,0},{0,0}} // E, S, W, N to select next
													),
												-1, // mask index
												false, // hover overlap
												-1, // hover effect
												DefaultValues.TransformIndex_ClickScaleDown, // click effect
												-1, // arbritraty animation (to be used for scroll)
												DefaultValues.TransformIndex_500msScale0, // entry animation
												new TextBox(
													// Text and Renderable
													1f, // scale
													"removeThisPopup", // function
													"popup",  // name
													new Text(
														"Confirm", // text
														"center", "center", // align
														0, -5, // text offset (x, y)
														40, // text size
														6, // text color (index of colors)
														"Archivo Narrow", // font
														false // bold
														),
													new RoundedArea(
														960, 580, 300, 80, 0  // x, y, xSize, ySize, round%
														),
													Color_BUTTONS, // box color (index of colors)
													255, // opacity (0-255)
													8, // shadowOffset
													5, 6 // strokeWidth, strokeColor
													))
									}
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
							),
							new Popup(
								"ThemeOptions", // Popup Name
								"Theme Options", // Popup Title
								new Element[] {
									new Element(
											new Selector(
												new int[]{-1,-1}, // Selector Index
												new int[][]{{-1,-1},{-1,-1},{-1,-1},{-1,-1}} // E, S, W, N to select next
												),
											-1, // Mask Index
											false, // hover overlap
											-1, // hover effect
											-1, // click effect
											-1, // arbritraty animation (to be used for scroll)
											DefaultValues.TransformIndex_500msScale0, // entry animation
											new TextBox(
												// No Text, No Renderable
												1, // scale
												null, // function
												"Green Background",  // name
												new RoundedArea(
													960, 560, 400, 800,  // x, y, xSize, ySize, round%
													5 // roundPercentage
													),
												Color_MENU, // box color (index of colors)
												255, // opacity (0-255)
												25, // shadowOffset
												5, 6 // strokeWidth, strokeColor
												)
											),
/////////////////////////////////////////////////////////////////////////////////////
									new Element(
											new Selector(
													new int[]{2,0}, // Selector Index
													new int[][]{{3,0},{2,0},{1,0},{2,0}} // E, S, W, N to select next
													),
												1, // mask index
												false, // hover overlap
												-1, // hover effect
												DefaultValues.TransformIndex_ClickScaleDown, // click effect
												23, // arbritraty animation (to be used for scroll)
												DefaultValues.TransformIndex_500msScale0, // entry animation
												new OptionsList(
														// Text and Renderable
														1f, // scale
														"setTheme", // function
														"%ThemeChoices", // list objects
														5, // max amount of options
														"ThemeChoices",  // name
														new Text(
															"%Name", // text
															"center", "center", // align
															0, -5, // text offset (x, y)
															40, // text size
															6, // text color (index of colors)
															"Archivo Narrow", // font
															false // bold
															),
														new RoundedArea(
															960, 320, 300, 80, 0  // x, y, xSize, ySize, round%
															),
														Color_BUTTONS, // box color (index of colors)
														255, // opacity (0-255)
														8, // shadowOffset
														5, 6 // strokeWidth, strokeColor
														)
												),
/////////////////////////////////////////////////////////////////////////////////////
									new Element(
											new Selector(
												new int[]{1,0}, // Selector Index
												new int[][]{{2,0},{2,0},{0,0},{0,0}} // E, S, W, N to select next
												),
											-1, // mask index
											false, // hover overlap
											-1, // hover effect
											DefaultValues.TransformIndex_ClickScaleDown, // click effect
											-1, // arbritraty animation (to be used for scroll)
											DefaultValues.TransformIndex_500msScale0, // entry animation
											new TextBox(
												// Text and Renderable
												1f, // scale
												"scroll String ThemeChoices boolean false", // function
												"ThemeChoicesScrollUp",  // name
												new Renderable(
														// Renderable Without Function
														"UpPNG", // name
														"src/textures/up.png", // file source
														15, 7, 90, 36, // x, y, xSize, ySize (relative)
														255 // opacity (0-255)
														),  // renderable
												new RoundedArea(
													960, 210, 120, 50, 0  // x, y, xSize, ySize, round%
													),
												Color_BUTTONS, // box color (index of colors)
												255, // opacity (0-255)
												8, // shadowOffset
												5, 6 // strokeWidth, strokeColor
												)),
/////////////////////////////////////////////////////////////////////////////////////
									new Element(
											new Selector(
												new int[]{3,0}, // Selector Index
												new int[][]{{3,0},{3,0},{2,0},{2,0}} // E, S, W, N to select next
												),
											-1, // mask index
											false, // hover overlap
											-1, // hover effect
											DefaultValues.TransformIndex_ClickScaleDown, // click effect
											-1, // arbritraty animation (to be used for scroll)
											DefaultValues.TransformIndex_500msScale0, // entry animation
											new TextBox(
												// Text and Renderable
												1f, // scale
												"scroll String ThemeChoices boolean true", // function
												"ThemeChoicesScrollDown",  // name
												new Renderable(
														// Renderable Without Function
														"DownPNG", // name
														"src/textures/down.png", // file source
														15, 7, 90, 36, // x, y, xSize, ySize (relative)
														255 // opacity (0-255)
														),  // renderable
												new RoundedArea(
													960, 910, 120, 50, 0  // x, y, xSize, ySize, round%
													),
												Color_BUTTONS, // box color (index of colors)
												255, // opacity (0-255)
												8, // shadowOffset
												5, 6 // strokeWidth, strokeColor
												)),
/////////////////////////////////////////////////////////////////////////////////////
									DefaultValues.Element_BACKBUTTON(),
		/////////////////////////////////////////////////////////////////////////////////////
									
									
								}
							),
							new Popup( // Duplicate Theme Name Error
									"DuplicateThemeName", // Popup Name
									"Input Error!", // Popup Title
									new Element[] {
										new Element(
												new Selector(
													new int[]{-1,-1}, // Selector Index
													new int[][]{{2,0},{1,0},{0,0},{1,0}} // E, S, W, N to select next
													),
												-1, // mask index
												false, // hover overlap
												-1, // hover effect
												DefaultValues.TransformIndex_ClickScaleDown, // click effect
												-1, // arbritraty animation (to be used for scroll)
												DefaultValues.TransformIndex_500msScale0, // entry animation
												new TextBox(
													// Text and Renderable
													1f, // scale
													"noFunction", // function
													"ErrorMessage",  // name
													new Text(
														"Invalid Entry!", // text
														"center", "center", // align
														0, -100, // text offset (x, y)
														80, // text size
														5, // text color (index of colors)
														"Archivo Narrow", // font
														true // bold
														),
													new RoundedArea(
														960, 500, 600, 300, 0  // x, y, xSize, ySize, round%
														),
													Color_MENU, // box color (index of colors)
													255, // opacity (0-255)
													15, // shadowOffset
													5, 6 // strokeWidth, strokeColor
													)),
/////////////////////////////////////////////////////////////////////////////////////
										new Element(
												new Selector(
													new int[]{-1,-1}, // Selector Index
													new int[][]{{2,0},{1,0},{0,0},{1,0}} // E, S, W, N to select next
													),
												-1, // mask index
												false, // hover overlap
												-1, // hover effect
												DefaultValues.TransformIndex_ClickScaleDown, // click effect
												-1, // arbritraty animation (to be used for scroll)
												DefaultValues.TransformIndex_500msScale0, // entry animation
												new TextBox(
													// Text and Renderable
													1f, // scale
													"noFunction", // function
													"ErrorMessage",  // name
													new Text(
														"Must be 6 hexadecimal digits!", // text
														"center", "center", // align
														0, -9, // text offset (x, y)
														40, // text size
														6, // text color (index of colors)
														"Archivo Narrow", // font
														false // bold
														),
													new RoundedArea(
														960, 495, 0, 0, 0  // x, y, xSize, ySize, round%
														),
													Color_TRANSPARENT, // box color (index of colors)
													255, // opacity (0-255)
													0, // shadowOffset
													5, 6 // strokeWidth, strokeColor
													)),
/////////////////////////////////////////////////////////////////////////////////////
										new Element(
												new Selector(
													new int[]{0,0}, // Selector Index
													new int[][]{{1,0},{0,2},{0,0},{0,0}} // E, S, W, N to select next
													),
												-1, // mask index
												false, // hover overlap
												-1, // hover effect
												DefaultValues.TransformIndex_ClickScaleDown, // click effect
												-1, // arbritraty animation (to be used for scroll)
												DefaultValues.TransformIndex_500msScale0, // entry animation
												new TextBox(
													// Text and Renderable
													1f, // scale
													"removeThisPopup", // function
													"popup",  // name
													new Text(
														"Confirm", // text
														"center", "center", // align
														0, -5, // text offset (x, y)
														40, // text size
														6, // text color (index of colors)
														"Archivo Narrow", // font
														false // bold
														),
													new RoundedArea(
														960, 580, 300, 80, 0  // x, y, xSize, ySize, round%
														),
													Color_BUTTONS, // box color (index of colors)
													255, // opacity (0-255)
													8, // shadowOffset
													5, 6 // strokeWidth, strokeColor
													))
									}
									),
/////////////////////////////////////////////////////////////////////////////////////
							new Popup( // Duplicate Theme Name Error
									"InvalidClipboard", // Popup Name
									"Input Error!", // Popup Title
									new Element[] {
										new Element(
												new Selector(
													new int[]{-1,-1}, // Selector Index
													new int[][]{{2,0},{1,0},{0,0},{1,0}} // E, S, W, N to select next
													),
												-1, // mask index
												false, // hover overlap
												-1, // hover effect
												DefaultValues.TransformIndex_ClickScaleDown, // click effect
												-1, // arbritraty animation (to be used for scroll)
												DefaultValues.TransformIndex_500msScale0, // entry animation
												new TextBox(
													// Text and Renderable
													1f, // scale
													"noFunction", // function
													"ErrorMessage",  // name
													new Text(
														"Invalid Import!", // text
														"center", "center", // align
														0, -100, // text offset (x, y)
														80, // text size
														5, // text color (index of colors)
														"Archivo Narrow", // font
														true // bold
														),
													new RoundedArea(
														960, 500, 600, 300, 0  // x, y, xSize, ySize, round%
														),
													Color_MENU, // box color (index of colors)
													255, // opacity (0-255)
													15, // shadowOffset
													5, 6 // strokeWidth, strokeColor
													)),
/////////////////////////////////////////////////////////////////////////////////////
										new Element(
												new Selector(
													new int[]{-1,-1}, // Selector Index
													new int[][]{{2,0},{1,0},{0,0},{1,0}} // E, S, W, N to select next
													),
												-1, // mask index
												false, // hover overlap
												-1, // hover effect
												DefaultValues.TransformIndex_ClickScaleDown, // click effect
												-1, // arbritraty animation (to be used for scroll)
												DefaultValues.TransformIndex_500msScale0, // entry animation
												new TextBox(
													// Text and Renderable
													1f, // scale
													"noFunction", // function
													"ErrorMessage",  // name
													new Text(
														"Clipboard does not contain a theme!", // text
														"center", "center", // align
														0, -9, // text offset (x, y)
														40, // text size
														6, // text color (index of colors)
														"Archivo Narrow", // font
														false // bold
														),
													new RoundedArea(
														960, 495, 0, 0, 0  // x, y, xSize, ySize, round%
														),
													Color_TRANSPARENT, // box color (index of colors)
													255, // opacity (0-255)
													0, // shadowOffset
													5, 6 // strokeWidth, strokeColor
													)),
/////////////////////////////////////////////////////////////////////////////////////
										new Element(
												new Selector(
													new int[]{0,0}, // Selector Index
													new int[][]{{1,0},{0,2},{0,0},{0,0}} // E, S, W, N to select next
													),
												-1, // mask index
												false, // hover overlap
												-1, // hover effect
												DefaultValues.TransformIndex_ClickScaleDown, // click effect
												-1, // arbritraty animation (to be used for scroll)
												DefaultValues.TransformIndex_500msScale0, // entry animation
												new TextBox(
													// Text and Renderable
													1f, // scale
													"removeThisPopup", // function
													"popup",  // name
													new Text(
														"Confirm", // text
														"center", "center", // align
														0, -5, // text offset (x, y)
														40, // text size
														6, // text color (index of colors)
														"Archivo Narrow", // font
														false // bold
														),
													new RoundedArea(
														960, 580, 300, 80, 0  // x, y, xSize, ySize, round%
														),
													Color_BUTTONS, // box color (index of colors)
													255, // opacity (0-255)
													8, // shadowOffset
													5, 6 // strokeWidth, strokeColor
													))
											}
									)
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
					
					}
			),
			new Menu( // 3. Settings
					"Settings Menu", // Menu Name
					"Settings", // Menu Display Name
					"Main Menu", // Parent Menu
					0, // BG Color
					new int[][]{{0,1}}, // Secondary Selections
					new RoundedArea[]{ // Masks
							new RoundedArea(0, 0, 1920, 1080, 0), // 0. Full Screen
							new RoundedArea(400, 250, 1120, 625, 0), // 1. Skin Choices
							// Insert here
						},
						new StoredTransform[] {
								StoredTransform.Transform_ClickScaleDown,
								StoredTransform.Transform_1sLeft100,
								StoredTransform.Transform_1sRight100,
								StoredTransform.Transform_1sUp100,
								StoredTransform.Transform_1sDown100,
								StoredTransform.Transform_500msLeft100,
								StoredTransform.Transform_500msRight100,
								StoredTransform.Transform_500msUp100,
								StoredTransform.Transform_500msDown100,
								StoredTransform.Transform_1sLeft150,
								StoredTransform.Transform_1sRight150,
								StoredTransform.Transform_1sUp150,
								StoredTransform.Transform_1sDown150,
								StoredTransform.Transform_500msLeft150,
								StoredTransform.Transform_500msRight150,
								StoredTransform.Transform_500msUp150,
								StoredTransform.Transform_500msDown150,
								StoredTransform.Transform_500msScaleUp,
								StoredTransform.Transform_500msScaleUpRotateLeft20,
								StoredTransform.Transform_500msScale0,
								StoredTransform.Transform_ClickScaleDownRotate20, // 20
								new StoredTransform( // 3 --> 21. hover expand (no rotate)
										-200, 0, // x, y transform
										1, 1, // scale transform (x, y)
										0, // rotate transform
										0, // offset (ms)
										750, // animation time (ms)
										6 // (ease type)
									),
								new StoredTransform( // 10 --> 22. -200 x (f box to center)
										-200, 0, // x, y transform
										1, 1, // scale transform (x, y)
										0, // rotate transform
										0, // offset (ms)
										500, // animation time (ms)
										6 // (ease type)
										),
						},
					new Element[] { // Elements List
/////////////////////////////////////////////////////////////////////////////////////
							new Element(
									new Selector(
										new int[]{0,1}, // Selector Index
										new int[][]{{1,0},{0,1},{0,0},{0,0}} // E, S, W, N to select next
										),
									-1, // mask index
									false, // hover overlap
									21, // hover effect
									DefaultValues.TransformIndex_ClickScaleDown, // click effect
									-1, // arbritraty animation (to be used for scroll)
									DefaultValues.TransformIndex_500msRight150, // entry animation
									new TextBox(
										// Text and Renderable
										1f, // scale
										"setMenu String null", // function
										"SettingsButton",  // name
										new Text(
											"Settings", // text
											"left", "center", // align
											-250, -9, // text offset (x, y)
											50, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
										new RoundedArea(
											600, 300, 600, 120, 100  // x, y, xSize, ySize, round%
											),
										Color_BUTTONS, // box color (index of colors)
										255, // opacity (0-255)
										15, // shadowOffset
										5, 6 // strokeWidth, strokeColor
										)),
/////////////////////////////////////////////////////////////////////////////////////
							DefaultValues.Element_BACKBUTTON(),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
							new Selector(
								new int[]{-1,-1}, // Selector Index
								new int[][]{{-1,-1},{-1,-1},{-1,-1},{-1,-1}} // E, S, W, N to select next
								),
							-1, // Mask Index
							false, // hover overlap
							-1, // hover effect
							-1, // click effect
							-1, // arbritraty animation (to be used for scroll)
							22, // entry animation
							new TextBox(
								// No Text, No Renderable
								1, // scale
								null, // function
								"Green Background",  // name
								new RoundedArea(
									1160, 560, 1200, 800,  // x, y, xSize, ySize, round%
									5 // roundPercentage
									),
								Color_MENU, // box color (index of colors)
								255, // opacity (0-255)
								25, // shadowOffset
								5, 6 // strokeWidth, strokeColor
								)
							),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{0,0},{0,0},{0,0},{0,0}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								-1, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"SettingsSubtitle",  // name
									new Text(
										"Settings", // text
										"center", "center", // align
										0, -50, // text offset (x, y)
										60, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1160, 270, 850, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
						
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{0,0},{0,0},{0,0},{0,0}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								-1, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"MasterVolumeSubtext",  // name
									new Text(
										"Master Volume", // text
										"left", "center", // align
										0, -2, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										735, 335, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
///////////////////////////////////////,//////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{1,0}, // Selector Index
									new int[][]{{1,0},{1,1},{0,1},{1,0}} // E, S, W, N to select next
									),
								-1, // mask index
								true, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									"enterTextField String MasterVolume", // function
									"EditMasterVolumeButton",  // name
									new Renderable(
											// Renderable Without Function
											"EditPNG", // name
											"src/textures/edit.png", // file source
											9, 8, 50, 50, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										1424, 339, 65, 65, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{0,0},{0,0},{0,0},{0,0}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextField(
										// Textfield
										1f, // scale
										16, // Max Size
										new int[] { // Error Popup Indexes
												1, // Field is duplicate!
												0, // Field is empty
											},
										TextField.Input_NUMERIC, // input type
										"MasterVolume", // Name
										new Text(
											"%MasterVolume", // text
											"right", "center", // align
											20, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1515, 339, 120, 65, 0  // x, y, xSize, ySize, round%
										),
									Color_DISPLAY, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{0,0},{0,0},{0,0},{0,0}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								-1, // click effect
								-1, // arbritraty animation (to be used for scroll)
								22, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"PercentageSign1",  // name
									new Text(
											"%", // text
											"right", "center", // align
											232, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
											1330, 339, 0, 0, 0  // x, y, xSize, ySize, round%
											),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
///////////////////////////////////////,//////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
					},
					new Popup[] { // Popups List
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
					}
			),
	};
	
	public static Config getDefaultConfigs() {
		ShowImage.bufferSkin(defaultSelectedSkin);
		Config defaultConfig = new Config(
    			getDefaultFullscreen(),
    			getDefaultSizeToForce(),
    			getDefaultControls(),
    			getDefaultThemes(),
    			getDefaultSelectedTheme(),
    			getDefaultSelectedSkin(),
    			getDefaultFonts(),
    			getAllDefaultMenus(),
    			getDefaultNanoSecondPrecision(),
    			getDefaultFramesToStore(),
    			getDefaultFramerate(),
    			getDefaultShouldLimitFramerate(),
    			getDefaultDisplayFramerate(),
    			getDefaultCursorEnabled(),
    			getDefaultTransitionTime(),
    			getDefaultMasterVolume(),
    			getDefaultMusicVolume(),
    			getDefaultSFXVolume(),
    			getDefaultDEBUG_drawMasks(),
    			getDefaultDEBUG_masksColorsOffset(),
    			getDefaultDEBUG_masksOpacity()
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
	
	public static Theme[] getDefaultThemes(){
		return defaultThemes;
	}
	
	public static String getDefaultSelectedTheme() {
		return defaultSelectedTheme;
	}
	
	public static String getDefaultSelectedSkin() {
		return defaultSelectedSkin;
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
	
	public static boolean getDefaultDisplayFramerate() {
		return defaultDisplayFramerate;
	}
	
	public static boolean getDefaultCursorEnabled() {
		return defaultCursorEnabled;
	}

	public static double getDefaultTransitionTime() {
		return defaultTransitionTime;
	}
	
	public static int getDefaultMasterVolume() {
		return defaultMasterVolume;
	}
	
	public static int getDefaultMusicVolume() {
		return defaultMusicVolume;
	}
	
	public static int getDefaultSFXVolume() {
		return defaultSFXVolume;
	}
	
	public static boolean getDefaultDEBUG_drawMasks() {
		return defaultDEBUG_drawMasks;
	}
	
	public static int getDefaultDEBUG_masksColorsOffset() {
		return defaultDEBUG_masksColorsOffset;
	}

	public static int getDefaultDEBUG_masksOpacity() {
		return defaultDEBUG_MasksOpacity;
	}
	
}