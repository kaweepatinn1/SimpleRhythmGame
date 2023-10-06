package SimpleRhythmGame;

// A READ ONLY CLASS

public class DefaultValues {
	private final static boolean defaultFullscreen = false; // if not fullscreen will force below value
	private final static int defaultSizeToForce = 1280; // forces this screen size if above is true
	
	private final static boolean defaultNanoSecondPrecision = true; // true breaks animations
	private final static int defaultFramesToStore = 20;
	private final static int defaultFramerate = 60;
	private final static boolean defaultShouldLimitFramerate = true;
	private final static double defaultTransitionTime = 500d;
	
	private final static boolean defaultCursorEnabled = true;
	
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
			new Theme(
					"ColorTrip1",
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
			new Theme(
					"ColorTrip2",
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
			new Theme(
					"ColorTrip3",
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
			new Theme(
					"ColorTrip4",
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
			
			new Theme(
					"ColorTrip5",
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
			new Theme(
					"ColorTrip6",
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
			new Theme(
					"ColorTrip7",
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
			new Theme(
					"ColorTrip8",
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
			new Theme(
					"ColorTrip9",
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
			new Theme(
					"ColorTrip10",
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
	
	// Default Popups:
	
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
							0, // hover effect
							1, // click effect
							-1, // arbritraty animation (to be used for scroll)
							2, // entry animation
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
									1810, 325, 1000, 120, 100  // x, y, xSize, ySize, round%
									),
								2, // box color (index of colors)
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
							0, // hover effect
							1, // click effect
							-1, // arbritraty animation (to be used for scroll)
							2, // entry animation
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
								2, // box color (index of colors)
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
							0, // hover effect
							1, // click effect
							-1, // arbritraty animation (to be used for scroll)
							2, // entry animation
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
								2, // box color (index of colors)
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
							0, // hover effect
							1, // click effect
							-1, // arbritraty animation (to be used for scroll)
							2, // entry animation
							new TextBox(
								// Text and Renderable
								1, // scale
								"setMenu String Customization_Theme_Builder", // function
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
								2, // box color (index of colors)
								255, // opacity (0-255)
								15, // shadowOffset
								5, 6 // strokeWidth, strokeColor
								))
					},
					new Popup[] {
/////////////////////////////////////////////////////////////////////////////////////
						new Popup(
							"TestPopup",
							"Test",
							new Element[] {
								new Element(
										new Selector(
											new int[]{0,0}, // Selector Index
											new int[][]{{1,0},{0,2},{0,0},{0,0}} // E, S, W, N to select next
											),
										-1, // mask index
										false, // hover overlap
										3, // hover effect
										1, // click effect
										-1, // arbritraty animation (to be used for scroll)
										-1, // entry animation
										new TextBox(
											// Text and Renderable
											1f, // scale
											"removePopup int 0", // function
											"popup",  // name
											new Text(
												"SUP", // text
												"left", "center", // align
												-250, -9, // text offset (x, y)
												500, // text size
												6, // text color (index of colors)
												"Archivo Narrow", // font
												false // bold
												),
											new RoundedArea(
												1000, 300, 600, 200, 100  // x, y, xSize, ySize, round%
												),
											2, // box color (index of colors)
											255, // opacity (0-255)
											15, // shadowOffset
											5, 6 // strokeWidth, strokeColor
											))
							}
						)
/////////////////////////////////////////////////////////////////////////////////////
					}
					),
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
			new Menu( // 1. Customization
					"Customization Theme Builder", // Menu Name
					"Customization", // Menu Display Name
					"Main Menu",
					0, // BG Color
					new int[][]{{0,2}}, // Secondary Selections
					new RoundedArea[]{ // Masks
							new RoundedArea(0, 0, 1920, 1080, 0), // 0. Full Screen
							new RoundedArea(800, 250, 320, 625, 0), // 1. Full Screen
							// Insert here
						},
						new StoredTransform[] {
							new StoredTransform( // 0. hover move left 100
								-100, 0, // x, y transform
								1, 1, // scale transform (x, y)
								0, // rotate transform
								0, // offset (ms)
								1000, // animation time (ms)
								6 // (ease type)
							),
							new StoredTransform( // 1. click animation (scale down)
								0, 0, // x, y transform
								0.95, 0.95, // scale transform (x, y)
								0, // rotate transform
								0, // offset (ms)
								100, // animation time (ms)
								6 // (ease type)
							),
							new StoredTransform( // 2. hover expand
								0, 0, // x, y transform
								1.05, 1.05, // scale transform (x, y)
								-20, // rotate transform
								0, // offset (ms)
								500, // animation time (ms)
								6 // (ease type)
							),
							new StoredTransform( // 3. hover expand (no rotate)
								-200, 0, // x, y transform
								1, 1, // scale transform (x, y)
								0, // rotate transform
								0, // offset (ms)
								750, // animation time (ms)
								6 // (ease type)
							),
							new StoredTransform( // 4. click animation (scale down and rotate back)
								0, 0, // x, y transform
								0.95, 0.95, // scale transform (x, y)
								20, // rotate transform
								0, // offset (ms)
								100, // animation time (ms)
								6 // (ease type)
							),
							new StoredTransform( // 5. hover move right 150
								150, 0, // x, y transform
								1, 1, // scale transform (x, y)
								0, // rotate transform
								0, // offset (ms)
								500, // animation time (ms)
								6 // (ease type)
								),
							new StoredTransform( // 6. hover move up 100
								0, -100, // x, y transform
								1, 1, // scale transform (x, y)
								0, // rotate transform
								0, // offset (ms)
								500, // animation time (ms)
								6 // (ease type)
								),
							new StoredTransform( // 7. hover move down 100
								0, 100, // x, y transform
								1, 1, // scale transform (x, y)
								0, // rotate transform
								0, // offset (ms)
								500, // animation time (ms)
								6 // (ease type)
								),
							new StoredTransform( // 8. 0 scale
								0, 0, // x, y transform
								0, 0, // scale transform (x, y)
								0, // rotate transform
								0, // offset (ms)
								500, // animation time (ms)
								6 // (ease type)
								),
							new StoredTransform( // 9. 0 scale, centered up 75
								0, -75, // x, y transform
								0, 0, // scale transform (x, y)
								0, // rotate transform
								0, // offset (ms)
								500, // animation time (ms)
								6 // (ease type)
								),
							new StoredTransform( // 10. -200 x (f box to center)
								-200, 0, // x, y transform
								1, 1, // scale transform (x, y)
								0, // rotate transform
								0, // offset (ms)
								500, // animation time (ms)
								6 // (ease type)
								),
							new StoredTransform( // 11. 120 y (optionsList)
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
									3, // hover effect
									1, // click effect
									-1, // arbritraty animation (to be used for scroll)
									5, // entry animation
									new TextBox(
										// Text and Renderable
										1f, // scale
										"setMenu String skinSelector", // function
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
										2, // box color (index of colors)
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
									3, // hover effect
									1, // click effect
									-1, // arbritraty animation (to be used for scroll)
									5, // entry animation
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
										2, // box color (index of colors)
										255, // opacity (0-255)
										15, // shadowOffset
										5, 6 // strokeWidth, strokeColor
										)),
/////////////////////////////////////////////////////////////////////////////////////
							new Element(
									new Selector(
										new int[]{0,0}, // Selector Index
										new int[][]{{0,1},{0,1},{0,0},{0,0}} // E, S, W, N to select next
										),
									-1, // Mask Index
									false, // hover overlap
									2, // hover effect
									4, // click effect
									-1, // arbritraty animation (to be used for scroll)
									8, // entry animation
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
										2, // box color (index of colors)
										255, // opacity (0-255)
										5, // shadowOffset
										5, 6 // strokeWidth, strokeColor
										)
									),
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
							10, // entry animation
							new TextBox(
								// No Text, No Renderable
								1, // scale
								null, // function
								"Green Background",  // name
								new RoundedArea(
									1160, 560, 1200, 800,  // x, y, xSize, ySize, round%
									5 // roundPercentage
									),
								1, // box color (index of colors)
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
								10, // entry animation
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
										1160, 290, 850, 0, 0  // x, y, xSize, ySize, round%
										),
									7, // box color (index of colors)
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
								10, // entry animation
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
										1160, 575, 850, 0, 0  // x, y, xSize, ySize, round%
										),
									7, // box color (index of colors)
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
								10, // entry animation
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
										735, 345, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									7, // box color (index of colors)
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
								1, // click effect
								-1, // arbritraty animation (to be used for scroll)
								10, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"AddTheme",  // name
									new Renderable(
											// Renderable Without Function
											"PlusButtonPNG", // name
											"src/textures/plus.png", // file source
											8, 7, 50, 50, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										991, 350, 65, 65, 0  // x, y, xSize, ySize, round%
										),
									2, // box color (index of colors)
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
								1, // click effect
								-1, // arbritraty animation (to be used for scroll)
								10, // entry animation
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
										1054, 350, 65, 65, 0  // x, y, xSize, ySize, round%
										),
									2, // box color (index of colors)
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
								10, // entry animation
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
										1335, 350, 500, 65, 0  // x, y, xSize, ySize, round%
										),
									8, // box color (index of colors)
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
								1, // click effect
								-1, // arbritraty animation (to be used for scroll)
								10, // entry animation
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
										1160, 445, 300, 65, 0  // x, y, xSize, ySize, round%
										),
									2, // box color (index of colors)
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
								10, // entry animation
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
										735, 630, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									7, // box color (index of colors)
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
								1, // click effect
								-1, // arbritraty animation (to be used for scroll)
								10, // entry animation
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
										1054, 634, 65, 65, 0  // x, y, xSize, ySize, round%
										),
									2, // box color (index of colors)
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
								1, // click effect
								-1, // arbritraty animation (to be used for scroll)
								10, // entry animation
								new TextField(
										// Textfield
										1f, // scale
										16, // Max Size
										new int[] { // Error Popup Indexes
												1, // Field is duplicate!
												0, // Field is empty
											},
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
										1335, 634, 500, 65, 0  // x, y, xSize, ySize, round%
										),
									8, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
//						new Element(
//								new Selector(
//									new int[]{2,0}, // Selector Index
//									new int[][]{{2,0},{2,0},{0,0},{0,0}} // E, S, W, N to select next
//									),
//								-1, // mask index
//								false, // hover overlap
//								-1, // hover effect
//								1, // click effect
//								-1, // arbritraty animation (to be used for scroll)
//								8, // entry animation
//								new TextBox(
//									// Text and Renderable
//									1f, // scale
//									"editColor int 0", // function
//									"EditColor1",  // name
//									new RoundedArea(
//										860, 910, 120, 50, 0  // x, y, xSize, ySize, round%
//										),
//									2, // box color (index of colors)
//									255, // opacity (0-255)
//									8, // shadowOffset
//									5, 6 // strokeWidth, strokeColor
//									)),
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
					},
					new Popup[] { // Popups List
							new Popup( // Empty Input Error
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
												1, // click effect
												-1, // arbritraty animation (to be used for scroll)
												8, // entry animation
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
													1, // box color (index of colors)
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
												1, // click effect
												-1, // arbritraty animation (to be used for scroll)
												8, // entry animation
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
													7, // box color (index of colors)
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
												1, // click effect
												-1, // arbritraty animation (to be used for scroll)
												9, // entry animation
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
													2, // box color (index of colors)
													255, // opacity (0-255)
													8, // shadowOffset
													5, 6 // strokeWidth, strokeColor
													)),
									}
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
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
												1, // click effect
												-1, // arbritraty animation (to be used for scroll)
												8, // entry animation
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
													1, // box color (index of colors)
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
												1, // click effect
												-1, // arbritraty animation (to be used for scroll)
												8, // entry animation
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
													7, // box color (index of colors)
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
												1, // click effect
												-1, // arbritraty animation (to be used for scroll)
												9, // entry animation
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
													2, // box color (index of colors)
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
											8, // entry animation
											new TextBox(
												// No Text, No Renderable
												1, // scale
												null, // function
												"Green Background",  // name
												new RoundedArea(
													960, 560, 400, 800,  // x, y, xSize, ySize, round%
													5 // roundPercentage
													),
												1, // box color (index of colors)
												255, // opacity (0-255)
												25, // shadowOffset
												5, 6 // strokeWidth, strokeColor
												)
											),
/////////////////////////////////////////////////////////////////////////////////////
									new Element(
											new Selector(
													new int[]{1,0}, // Selector Index
													new int[][]{{2,0},{1,0},{0,0},{1,0}} // E, S, W, N to select next
													),
												1, // mask index
												false, // hover overlap
												-1, // hover effect
												1, // click effect
												11, // arbritraty animation (to be used for scroll)
												8, // entry animation
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
														2, // box color (index of colors)
														255, // opacity (0-255)
														8, // shadowOffset
														5, 6 // strokeWidth, strokeColor
														)
												),
/////////////////////////////////////////////////////////////////////////////////////
									new Element(
											new Selector(
												new int[]{0,0}, // Selector Index
												new int[][]{{2,0},{2,0},{0,0},{0,0}} // E, S, W, N to select next
												),
											-1, // mask index
											false, // hover overlap
											-1, // hover effect
											1, // click effect
											-1, // arbritraty animation (to be used for scroll)
											8, // entry animation
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
												2, // box color (index of colors)
												255, // opacity (0-255)
												8, // shadowOffset
												5, 6 // strokeWidth, strokeColor
												)),
/////////////////////////////////////////////////////////////////////////////////////
									new Element(
											new Selector(
												new int[]{2,0}, // Selector Index
												new int[][]{{2,0},{2,0},{0,0},{0,0}} // E, S, W, N to select next
												),
											-1, // mask index
											false, // hover overlap
											-1, // hover effect
											1, // click effect
											-1, // arbritraty animation (to be used for scroll)
											8, // entry animation
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
												2, // box color (index of colors)
												255, // opacity (0-255)
												8, // shadowOffset
												5, 6 // strokeWidth, strokeColor
												)),
/////////////////////////////////////////////////////////////////////////////////////
									
								}
							),
					}
			)
	};
	
	public static Config getDefaultConfigs() {
		Config defaultConfig = new Config(
    			getDefaultFullscreen(),
    			getDefaultSizeToForce(),
    			getDefaultControls(),
    			getDefaultThemes(),
    			getDefaultSelectedTheme(),
    			getDefaultFonts(),
    			getAllDefaultMenus(),
    			getDefaultNanoSecondPrecision(),
    			getDefaultFramesToStore(),
    			getDefaultFramerate(),
    			getDefaultShouldLimitFramerate(),
    			getDefaultCursorEnabled(),
    			getDefaultTransitionTime(),
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

	public static double getDefaultTransitionTime() {
		return defaultTransitionTime;
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