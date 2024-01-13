package SimpleRhythmGame;

// A READ ONLY CLASS

public class DefaultValues {
	private static final String defaultDatabasePasskey = "root2212"; // TODO change to null
	
	private static final boolean defaultFullscreen = true; // if not fullscreen will force below value
	private static final int defaultSizeToForce = 1920; // forces this screen size (width) if above is true
	
	private static final boolean defaultNanoSecondPrecision = true; 
	private static final int defaultFramesToStore = 20;
	private static final int defaultFramerate = 60;
	private static final boolean defaultShouldLimitFramerate = true;
	private static final boolean defaultDisplayFramerate = false;
	
	private static final double defaultTransitionTime = 500d;
	
	private static final boolean defaultCursorEnabled = true;
	
	private static final int defaultMasterVolume = 50;
	private static final int defaultMusicVolume = 50;
	private static final int defaultSFXVolume = 50;
	
	private static final boolean defaultFORCED_noFail = false;
	private static final int defaultFORCED_millisecondLeniency = 100; // amount of ms we are lenient to missed notes
	
	private static final boolean defaultDEBUG_drawMasks = false; // draws all clipping masks
	private static final int defaultDEBUG_masksColorsOffset = 10; // changes the seed for drawn colors
	private static final int defaultDEBUG_MasksOpacity = 80; // out of 255
	
	private static final Controls[] defaultControls = new Controls[] {
			new Controls(
					"Enter",
					new int[]{10, -1, -1}
					),
			new Controls(
					"Escape",
					new int[]{27, -1, -1}
					),
			new Controls(
					"Up",
					new int[]{38, -1, -1}
					),
			new Controls(
					"Down",
					new int[]{40, -1, -1}
					),
			new Controls(
					"Left",
					new int[]{37, -1, -1}
					),
			new Controls(
					"Right",
					new int[]{39, -1, -1}
					),
			new Controls(
					"HiHat", // drum 1
					new int[]{90, -1, -1}
					),
			new Controls(
					"SnareDrum", // drum 2
					new int[]{88, -1, -1}
					),
			new Controls(
					"CrashCymbal", // drum 3
					new int[]{67, -1, -1}
					),
			new Controls(
					"Tom", // drum 4
					new int[]{78, -1, -1}
					),
			new Controls(
					"KickDrum", // drum 5
					new int[]{77, -1, -1}
					),
			
	};
	
	private static final Theme[] defaultThemes = new Theme[] {
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
	
	private static final String defaultSelectedTheme = "DefaultTheme";
	private static final String defaultSelectedSkin = "DefaultSkin.png";
	
	private static final String[] defaultFonts = new String[] {
			"src/fonts/ArchivoNarrow-Bold.ttf",
			"src/fonts/ArchivoNarrow-BoldItalic.ttf",
			"src/fonts/ArchivoNarrow-Italic.ttf",
			"src/fonts/ArchivoNarrow-Medium.ttf",
			"src/fonts/ArchivoNarrow-MediumItalic.ttf",
			"src/fonts/ArchivoNarrow-Regular.ttf",
			"src/fonts/ArchivoNarrow-SemiBold.ttf",
			"src/fonts/ArchivoNarrow-SemiBoldItalic.ttf"
	};
	
	// Colors Static Final References
	public static final transient int Color_BG = 0;
	public static final transient int Color_MENU = 1;
	public static final transient int Color_BUTTONS = 2;
	public static final transient int Color_PRIMARYSELECTOR = 3;
	public static final transient int Color_SECONDARYSELECTOR = 4;
	public static final transient int Color_ACCENT = 5;
	public static final transient int Color_STROKE = 6;
	public static final transient int Color_TRANSPARENT = 7;
	public static final transient int Color_DISPLAY = 8;
	
	// StoredTransform Static Final References:
	public static final transient int TransformIndex_ClickScaleDown = 0;
	public static final transient int TransformIndex_1sLeft100 = 1;
	public static final transient int TransformIndex_1sRight100 = 2;
	public static final transient int TransformIndex_1sUp100 = 3;
	public static final transient int TransformIndex_1sDown100 = 4;
	public static final transient int TransformIndex_500msLeft100 = 5;
	public static final transient int TransformIndex_500msRight100 = 6;
	public static final transient int TransformIndex_500msUp100 = 7;
	public static final transient int TransformIndex_500msDown100 = 8;
	public static final transient int TransformIndex_1sLeft150 = 9;
	public static final transient int TransformIndex_1sRight150 = 10;
	public static final transient int TransformIndex_1sUp150 = 11;
	public static final transient int TransformIndex_1sDown150 = 12;
	public static final transient int TransformIndex_500msLeft150 = 13;
	public static final transient int TransformIndex_500msRight150 = 14;
	public static final transient int TransformIndex_500msUp150 = 15;
	public static final transient int TransformIndex_500msDown150 = 16;
	public static final transient int TransformIndex_500msScaleUp = 17;
	public static final transient int TransformIndex_500msScaleUpRotateLeft20 = 18;
	public static final transient int TransformIndex_500msScale0 = 19;
	public static final transient int TransformIndex_ClickScaleDownRotate20 = 20;
	
	// Popup & Element Static Final References:
	
	public static final StoredTransform[] StoredTransforms_DEFAULT() {
		return new StoredTransform[] {
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
				StoredTransform.Transform_ClickScaleDownRotate20};
	}
	
	/*
	Menus
	0. Game
	1. Skin Selector
	2. Theme Builder
	3. Settings
	4. Screen Settings
	5. Play Menu
	6. Init User
	7. Statistics
	8. Leaderboards
	*/
	
	public static final Menu defaultGameMenu() {
		return new Menu( // 1. Game Menu
				"Gameplay", // Menu name
				"%CurrentLevel", // Menu Display Name
				"%Pause", // Previous Menu
				DefaultValues.Color_BG, // BGColor
				new int[][]{{-1,-1}}, // Secondary Selections
				new RoundedArea[]{ // Masks
					new RoundedArea(0, 0, 1920, 1080, 0), // 0. Full Screen
					new RoundedArea(88, 163, 1746, 796, 0) // 1. Notes
					// Insert here
				},
				DefaultValues.StoredTransforms_DEFAULT(),
				new Element[] {
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{-1,-1},{-	1,-1},{-1,-1},{-1,-1}} // E, S, W, N to select next
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
										960, 560, 1750, 800,  // x, y, xSize, ySize, round%
										5 // roundPercentage
										),
									DefaultValues.Color_MENU, // box color (index of colors)
									255, // opacity (0-255)
									25, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)
								),
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{2,0},{1,0},{0,0},{1,0}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								-1, // click effect
								-1, // arbritraty animation (to be used for scroll)
								DefaultValues.TransformIndex_500msScale0, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									"null", // function
									"SpikedEnd",  // name
									new Renderable(
											// Renderable Without Function
											"SpikedEndPNG", // name
											"src/textures/spikeend.png", // file source
											0, 0, 58, 700, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										88, 612, 0, 685, 0  // x, y, xSize, ySize, round%
										),
									DefaultValues.Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									0, DefaultValues.Color_TRANSPARENT // strokeWidth, strokeColor
									)),
						new Element(
								new Selector(
									new int[]{-1,-1}, // Selector Index
									new int[][]{{2,0},{1,0},{0,0},{1,0}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								-1, // click effect
								-1, // arbritraty animation (to be used for scroll)
								DefaultValues.TransformIndex_500msScale0, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									"GameRenderLast", // function
									"Hit Line",  // name
									new RoundedArea(
										400, 612, 0, 685, 0  // x, y, xSize, ySize, round%
										),
									DefaultValues.Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
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
								-1, // click effect
								-1, // arbritraty animation (to be used for scroll)
								DefaultValues.TransformIndex_500msScale0, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									"null", // function
									"Stats Divider",  // name
									new RoundedArea(
										960, 270, 1750, 0, 0  // x, y, xSize, ySize, round%
										),
									DefaultValues.Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
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
									-1, // click effect
									-1, // arbritraty animation (to be used for scroll)
									DefaultValues.TransformIndex_500msScale0, // entry animation
								new TextBox(
									//Text
									1f, // scale
									"noFunction", // function
									"ScoreTitle", // name
									new Text(
											"Score: ", // text
											"left", "center", // align
											0, -9, // text offset (x, y)
											50, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										123, 217, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									DefaultValues.Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
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
									-1, // click effect
									-1, // arbritraty animation (to be used for scroll)
									DefaultValues.TransformIndex_500msScale0, // entry animation
								new TextBox(
									//Text
									1f, // scale
									"noFunction", // function
									"Score", // name
									new Text(
											"%ScorePercentage", // text
											"left", "center", // align
											0, -9, // text offset (x, y)
											50, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										250, 219, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									DefaultValues.Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
						new Element(
/////////////////////////////////////////////////////////////////////////////////////
								new Selector(
										new int[]{-1,-1}, // Selector Index
										new int[][]{{2,0},{1,0},{0,0},{1,0}} // E, S, W, N to select next
										),
									-1, // mask index
									false, // hover overlap
									-1, // hover effect
									-1, // click effect
									-1, // arbritraty animation (to be used for scroll)
									DefaultValues.TransformIndex_500msScale0, // entry animation
								new TextBox(
									//Text
									1f, // scale
									"noFunction", // function
									"ComboTitle", // name
									new Text(
											"Combo", // text
											"right", "center", // align
											0, -9, // text offset (x, y)
											50, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1805, 217, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									DefaultValues.Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
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
									-1, // click effect
									-1, // arbritraty animation (to be used for scroll)
									DefaultValues.TransformIndex_500msScale0, // entry animation
								new TextBox(
									//Text
									1f, // scale
									"noFunction", // function
									"Combo", // name
									new Text(
											"%Combo", // text
											"right", "center", // align
											0, -9, // text offset (x, y)
											50, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1658, 217, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									DefaultValues.Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
				}, // Elements
				new Popup[] {DefaultValues.Popup_GAMEPAUSE(),
						new Popup( // Empty Input Error
								"LevelComplete", // Popup Name
								"%CurrentLevel", // Popup Title
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
												"LevelCompleteText",  // name
												new Text(
													"Level Complete!", // text
													"center", "center", // align
													0, -180, // text offset (x, y)
													100, // text size
													DefaultValues.Color_STROKE, // text color (index of colors)
													"Archivo Narrow", // font
													true // bold
													),
												new RoundedArea(
													960, 480, 900, 550, 0  // x, y, xSize, ySize, round%
													),
												Color_MENU, // box color (index of colors)
												255, // opacity (0-255)
												15, // shadowOffset
												5, DefaultValues.Color_STROKE // strokeWidth, strokeColor
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
												"AccuracyText",  // name
												new Text(
													"Accuracy", // text
													"center", "center", // align
													0, -9, // text offset (x, y)
													45, // text size
													6, // text color (index of colors)
													"Archivo Narrow", // font
													true // bold
													),
												new RoundedArea(
													670, 455, 0, 0, 0  // x, y, xSize, ySize, round%
													),
												Color_TRANSPARENT, // box color (index of colors)
												255, // opacity (0-255)
												0, // shadowOffset
												5, DefaultValues.Color_STROKE // strokeWidth, strokeColor
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
												"Accuracy",  // name
												new Text(
													"%LevelComplete Accuracy", // text
													"center", "center", // align
													0, -9, // text offset (x, y)
													75, // text size
													6, // text color (index of colors)
													"Archivo Narrow", // font
													true // bold
													),
												new RoundedArea(
													670, 515, 0, 0, 0  // x, y, xSize, ySize, round%
													),
												Color_TRANSPARENT, // box color (index of colors)
												255, // opacity (0-255)
												0, // shadowOffset
												5, DefaultValues.Color_STROKE // strokeWidth, strokeColor
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
												"MaxComboText",  // name
												new Text(
													"Max Combo", // text
													"center", "center", // align
													0, -9, // text offset (x, y)
													45, // text size
													6, // text color (index of colors)
													"Archivo Narrow", // font
													true // bold
													),
												new RoundedArea(
													1250, 455, 0, 0, 0  // x, y, xSize, ySize, round%
													),
												Color_TRANSPARENT, // box color (index of colors)
												255, // opacity (0-255)
												0, // shadowOffset
												5, DefaultValues.Color_STROKE // strokeWidth, strokeColor
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
												"MaxCombo",  // name
												new Text(
													"%LevelComplete MaxCombo", // text
													"center", "center", // align
													0, -9, // text offset (x, y)
													75, // text size
													6, // text color (index of colors)
													"Archivo Narrow", // font
													true // bold
													),
												new RoundedArea(
													1250, 515, 0, 0, 0  // x, y, xSize, ySize, round%
													),
												Color_TRANSPARENT, // box color (index of colors)
												255, // opacity (0-255)
												0, // shadowOffset
												5, DefaultValues.Color_STROKE // strokeWidth, strokeColor
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
												"NewBestScoreText",  // name
												new Text(
													"%BoolNewHighscore Show", // text
													"center", "center", // align
													0, -9, // text offset (x, y)
													45, // text size
													DefaultValues.Color_ACCENT, // text color (index of colors)
													"Archivo Narrow", // font
													true // bold
													),
												new RoundedArea(
													960, 444, 0, 0, 0  // x, y, xSize, ySize, round%
													),
												Color_TRANSPARENT, // box color (index of colors)
												255, // opacity (0-255)
												0, // shadowOffset
												5, DefaultValues.Color_STROKE // strokeWidth, strokeColor
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
												"ScoreText",  // name
												new Text(
													"%BoolNewHighscore Hide", // text
													"center", "center", // align
													0, -9, // text offset (x, y)
													50, // text size
													DefaultValues.Color_STROKE, // text color (index of colors)
													"Archivo Narrow", // font
													true // bold
													),
												new RoundedArea(
													960, 444, 0, 0, 0  // x, y, xSize, ySize, round%
													),
												Color_TRANSPARENT, // box color (index of colors)
												255, // opacity (0-255)
												0, // shadowOffset
												5, DefaultValues.Color_STROKE // strokeWidth, strokeColor
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
												"Score",  // name
												new Text(
													"%LevelComplete Score", // text
													"center", "center", // align
													0, -9, // text offset (x, y)
													85, // text size
													6, // text color (index of colors)
													"Archivo Narrow", // font
													true // bold
													),
												new RoundedArea(
													960, 512, 0, 0, 0  // x, y, xSize, ySize, round%
													),
												Color_TRANSPARENT, // box color (index of colors)
												255, // opacity (0-255)
												0, // shadowOffset
												5, DefaultValues.Color_STROKE // strokeWidth, strokeColor
												)),
/////////////////////////////////////////////////////////////////////////////////////
									new Element(
											new Selector(
												new int[]{0,0}, // Selector Index
												new int[][]{{1,0},{0,0},{0,0},{0,0}} // E, S, W, N to select next
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
												"setMenu String Play_Menu", // function
												"Continue",  // name
												new Text(
													"Continue", // text
													"center", "center", // align
													0, -10, // text offset (x, y)
													60, // text size
													6, // text color (index of colors)
													"Archivo Narrow", // font
													true // bold
													),
												new RoundedArea(
													960, 650, 360, 100, 0  // x, y, xSize, ySize, round%
													),
												Color_BUTTONS, // box color (index of colors)
												255, // opacity (0-255)
												8, // shadowOffset
												5, 6 // strokeWidth, strokeColor
												)),
/////////////////////////////////////////////////////////////////////////////////////
								}
						),
				} // Popups
				);
	}
	
	public static final Popup Popup_GAMEPAUSE() {
		return new Popup(
				"PausedPopup", // Popup Name
				"Game Paused", // Popup Title
				new Element[] {
				}
		);
	}
	
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
		
	public static final Element Element_BACKBUTTON() { 
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
	
	private static final Menu[] defaultMenus = new Menu[] {
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
								"setMenu String Statistics_Menu", // function
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
								"setMenu String Settings_General_Menu", // function
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
										7, // Max Size
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
										7, // Max Size
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
										7, // Max Size
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
										7, // Max Size
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
										7, // Max Size
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
										7, // Max Size
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
										7, // Max Size
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
										7, // Max Size
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
										1664, 700, 120, 60, 0  // x, y, xSize, ySize, round%
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
										1664, 760, 120, 60, 0  // x, y, xSize, ySize, round%
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
					"Settings General Menu", // Menu Name
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
							new Element(
									new Selector(
										new int[]{0,2}, // Selector Index
										new int[][]{{1,0},{0,3},{0,0},{0,1}} // E, S, W, N to select next
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
										"setMenu String Settings_Controls_Menu", // function
										"ControlsButton",  // name
										new Text(
											"Controls", // text
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
							new Element(
									new Selector(
										new int[]{0,3}, // Selector Index
										new int[][]{{1,0},{0,3},{0,0},{0,2}} // E, S, W, N to select next
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
										"setMenu String Settings_Screen_Menu", // function
										"ScreenButton",  // name
										new Text(
											"Screen", // text
											"left", "center", // align
											-250, -9, // text offset (x, y)
											50, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
										new RoundedArea(
											600, 600, 600, 120, 100  // x, y, xSize, ySize, round%
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
									"SoundsSubtitle",  // name
									new Text(
										"Sounds", // text
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
/////////////////////////////////////////////////////////////////////////////////////
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
										3, // Max Size
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
									"MusicVolumeSubtext",  // name
									new Text(
										"Music Volume", // text
										"left", "center", // align
										0, -2, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										735, 415, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{1,1}, // Selector Index
									new int[][]{{1,1},{1,2},{0,1},{1,0}} // E, S, W, N to select next
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
									"enterTextField String MusicVolume", // function
									"EditMusicVolumeButton",  // name
									new Renderable(
											// Renderable Without Function
											"EditPNG", // name
											"src/textures/edit.png", // file source
											9, 8, 50, 50, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										1424, 419, 65, 65, 0  // x, y, xSize, ySize, round%
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
										3, // Max Size
										new int[] { // Error Popup Indexes
												1, // Field is duplicate!
												0, // Field is empty
											},
										TextField.Input_NUMERIC, // input type
										"MusicVolume", // Name
										new Text(
											"%MusicVolume", // text
											"right", "center", // align
											20, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1515, 419, 120, 65, 0  // x, y, xSize, ySize, round%
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
									"PercentageSign2",  // name
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
											1330, 419, 0, 0, 0  // x, y, xSize, ySize, round%
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
									"SFXVolumeSubtext",  // name
									new Text(
										"SFX Volume", // text
										"left", "center", // align
										0, -2, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										735, 495, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{1,2}, // Selector Index
									new int[][]{{1,2},{1,3},{0,1},{1,1}} // E, S, W, N to select next
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
									"enterTextField String SFXVolume", // function
									"EditSFXVolumeButton",  // name
									new Renderable(
											// Renderable Without Function
											"EditPNG", // name
											"src/textures/edit.png", // file source
											9, 8, 50, 50, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										1424, 499, 65, 65, 0  // x, y, xSize, ySize, round%
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
										3, // Max Size
										new int[] { // Error Popup Indexes
												1, // Field is duplicate!
												0, // Field is empty
											},
										TextField.Input_NUMERIC, // input type
										"SFXVolume", // Name
										new Text(
											"%SFXVolume", // text
											"right", "center", // align
											20, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1515, 499, 120, 65, 0  // x, y, xSize, ySize, round%
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
									"PercentageSign3",  // name
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
											1330, 499, 0, 0, 0  // x, y, xSize, ySize, round%
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
									"GraphicsSubtitle",  // name
									new Text(
										"Graphics", // text
										"center", "center", // align
										0, -50, // text offset (x, y)
										60, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1160, 640, 850, 0, 0  // x, y, xSize, ySize, round%
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
									"MaxFramerateSubtext",  // name
									new Text(
										"Maximum Framerate", // text
										"left", "center", // align
										0, -2, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										735, 703, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{1,3}, // Selector Index
									new int[][]{{1,3},{1,4},{0,1},{1,2}} // E, S, W, N to select next
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
									"enterTextField String MaxFramerate", // function
									"EditMaxFramerateButton",  // name
									new Renderable(
											// Renderable Without Function
											"EditPNG", // name
											"src/textures/edit.png", // file source
											9, 8, 50, 50, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										1424, 707, 65, 65, 0  // x, y, xSize, ySize, round%
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
										3, // Max Size
										new int[] { // Error Popup Indexes
												1, // Field is duplicate!
												0, // Field is empty
											},
										TextField.Input_NUMERIC, // input type
										"MaxFramerate", // Name
										new Text(
											"%MaxFramerate", // text
											"right", "center", // align
											48, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1515, 707, 120, 65, 0  // x, y, xSize, ySize, round%
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
									"LimitFramerateSubtext",  // name
									new Text(
										"Limit Framerate", // text
										"left", "center", // align
										0, -2, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										735, 783, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{1,4}, // Selector Index
									new int[][]{{1,4},{1,5},{0,1},{1,3}} // E, S, W, N to select next
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
									"enterTextField String LimitFramerate", // function
									"EditLimitFramerateButton",  // name
									new Renderable(
											// Renderable Without Function
											"EditPNG", // name
											"src/textures/edit.png", // file source
											9, 8, 50, 50, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										1424, 787, 65, 65, 0  // x, y, xSize, ySize, round%
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
										3, // Max Size
										new int[] { // Error Popup Indexes
												1, // Field is duplicate!
												0, // Field is empty
											},
										TextField.Input_BOOLEAN, // input type
										"LimitFramerate", // Name
										new Text(
											"%LimitFramerate", // text
											"right", "center", // align
											48, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1515, 787, 120, 65, 0  // x, y, xSize, ySize, round%
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
									"DisplayFramerateSubtext",  // name
									new Text(
										"Display Framerate", // text
										"left", "center", // align
										0, -2, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										735, 863, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{1,5}, // Selector Index
									new int[][]{{1,5},{1,5},{0,1},{1,4}} // E, S, W, N to select next
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
									"enterTextField String DisplayFramerate", // function
									"EditDisplayFramerateButton",  // name
									new Renderable(
											// Renderable Without Function
											"EditPNG", // name
											"src/textures/edit.png", // file source
											9, 8, 50, 50, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										1424, 867, 65, 65, 0  // x, y, xSize, ySize, round%
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
										3, // Max Size
										new int[] { // Error Popup Indexes
												1, // Field is duplicate!
												0, // Field is empty
											},
										TextField.Input_BOOLEAN, // input type
										"DisplayFramerate", // Name
										new Text(
											"%DisplayFramerate", // text
											"right", "center", // align
											48, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1515, 867, 120, 65, 0  // x, y, xSize, ySize, round%
										),
									Color_DISPLAY, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
					},
					new Popup[] { // Popups List
							DefaultValues.Popup_INPUTEMPTY(),
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
					}
			),
			new Menu( // 3. Settings
					"Settings Controls Menu", // Menu Name
					"Settings", // Menu Display Name
					"Main Menu", // Parent Menu
					0, // BG Color
					new int[][]{{0,2}}, // Secondary Selections
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
										"setMenu String Settings_General_Menu", // function
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
							new Element(
									new Selector(
										new int[]{0,2}, // Selector Index
										new int[][]{{1,0},{0,3},{0,0},{0,1}} // E, S, W, N to select next
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
										"ControlsButton",  // name
										new Text(
											"Controls", // text
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
							new Element(
									new Selector(
										new int[]{0,3}, // Selector Index
										new int[][]{{1,0},{0,3},{0,0},{0,2}} // E, S, W, N to select next
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
										"setMenu String Settings_Screen_Menu", // function
										"ScreenButton",  // name
										new Text(
											"Screen", // text
											"left", "center", // align
											-250, -9, // text offset (x, y)
											50, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
										new RoundedArea(
											600, 600, 600, 120, 100  // x, y, xSize, ySize, round%
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
									"ControlsSubtitle",  // name
									new Text(
										"Controls", // text
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
									"MenusConfirmSubtext",  // name
									new Text(
										"Menus: Confirm", // text
										"left", "center", // align
										0, -2, // text offset (x, y)
										38, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										735, 324, 0, 0, 0  // x, y, xSize, ySize, round%
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
									"editKeybind String Enter int 0 int 1", // function
									"EditControlEnter0",  // name
									new Text(
											"%Keybind Enter 0", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1075, 329, 190, 45, 0  // x, y, xSize, ySize, round%
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
									new int[][]{{3,0},{2,1},{1,0},{2,0}} // E, S, W, N to select next
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
									"editKeybind String Enter int 1 int 1", // function
									"EditControlEnter1",  // name
									new Text(
											"%Keybind Enter 1", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1280, 329, 190, 45, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{3,0}, // Selector Index
									new int[][]{{3,0},{3,1},{2,0},{3,0}} // E, S, W, N to select next
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
									"editKeybind String Enter int 2 int 1", // function
									"EditControlEnter2",  // name
									new Text(
											"%Keybind Enter 2", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1485, 329, 190, 45, 0  // x, y, xSize, ySize, round%
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
									"MenusCancelSubtext",  // name
									new Text(
										"Menus: Cancel", // text
										"left", "center", // align
										0, -2, // text offset (x, y)
										38, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										735, 380, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{1,1}, // Selector Index
									new int[][]{{2,1},{1,2},{0,2},{1,0}} // E, S, W, N to select next
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
									"editKeybind String Escape int 0 int 1", // function
									"EditControlEscape0",  // name
									new Text(
											"%Keybind Escape 0", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1075, 385, 190, 45, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{2,1}, // Selector Index
									new int[][]{{3,1},{2,2},{1,1},{2,0}} // E, S, W, N to select next
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
									"editKeybind String Escape int 1 int 1", // function
									"EditControlEscape1",  // name
									new Text(
											"%Keybind Escape 1", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1280, 385, 190, 45, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{3,1}, // Selector Index
									new int[][]{{3,1},{3,2},{2,1},{3,0}} // E, S, W, N to select next
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
									"editKeybind String Escape int 2 int 1", // function
									"EditControlEscape2",  // name
									new Text(
											"%Keybind Escape 2", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1485, 385, 190, 45, 0  // x, y, xSize, ySize, round%
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
									"MenusLeftSubtext",  // name
									new Text(
										"Menus: Left", // text
										"left", "center", // align
										0, -2, // text offset (x, y)
										38, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										735, 436, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{1,2}, // Selector Index
									new int[][]{{2,2},{1,3},{0,2},{1,1}} // E, S, W, N to select next
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
									"editKeybind String Left int 0 int 1", // function
									"EditControlLeft0",  // name
									new Text(
											"%Keybind Left 0", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1075, 441, 190, 45, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{2,2}, // Selector Index
									new int[][]{{3,2},{2,3},{1,2},{2,1}} // E, S, W, N to select next
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
									"editKeybind String Left int 1 int 1", // function
									"EditControlLeft1",  // name
									new Text(
											"%Keybind Left 1", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1280, 441, 190, 45, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{3,2}, // Selector Index
									new int[][]{{3,2},{3,3},{2,2},{3,1}} // E, S, W, N to select next
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
									"editKeybind String Left int 2 int 1", // function
									"EditControlLeft2",  // name
									new Text(
											"%Keybind Left 2", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1485, 441, 190, 45, 0  // x, y, xSize, ySize, round%
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
									"MenusRightSubtext",  // name
									new Text(
										"Menus: Right", // text
										"left", "center", // align
										0, -2, // text offset (x, y)
										38, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										735, 492, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{1,3}, // Selector Index
									new int[][]{{2,3},{1,4},{0,2},{1,2}} // E, S, W, N to select next
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
									"editKeybind String Right int 0 int 1", // function
									"EditControlRight0",  // name
									new Text(
											"%Keybind Right 0", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1075, 497, 190, 45, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{2,3}, // Selector Index
									new int[][]{{3,3},{2,4},{1,3},{2,2}} // E, S, W, N to select next
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
									"editKeybind String Right int 1 int 1", // function
									"EditControlRight1",  // name
									new Text(
											"%Keybind Right 1", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1280, 497, 190, 45, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{3,3}, // Selector Index
									new int[][]{{3,3},{3,4},{2,3},{3,2}} // E, S, W, N to select next
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
									"editKeybind String Right int 2 int 1", // function
									"EditControlRight2",  // name
									new Text(
											"%Keybind Right 2", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1485, 497, 190, 45, 0  // x, y, xSize, ySize, round%
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
									"MenusUpSubtext",  // name
									new Text(
										"Menus: Up", // text
										"Up", "center", // align
										0, -2, // text offset (x, y)
										38, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										735, 548, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{1,4}, // Selector Index
									new int[][]{{2,4},{1,5},{0,2},{1,3}} // E, S, W, N to select next
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
									"editKeybind String Up int 0 int 1", // function
									"EditControlUp0",  // name
									new Text(
											"%Keybind Up 0", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1075, 553, 190, 45, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{2,4}, // Selector Index
									new int[][]{{3,4},{2,5},{1,4},{2,3}} // E, S, W, N to select next
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
									"editKeybind String Up int 1 int 1", // function
									"EditControlUp1",  // name
									new Text(
											"%Keybind Up 1", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1280, 553, 190, 45, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{3,4}, // Selector Index
									new int[][]{{3,4},{3,5},{2,4},{3,3}} // E, S, W, N to select next
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
									"editKeybind String Up int 2 int 1", // function
									"EditControlUp2",  // name
									new Text(
											"%Keybind Up 2", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1485, 553, 190, 45, 0  // x, y, xSize, ySize, round%
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
									"MenusDownSubtext",  // name
									new Text(
										"Menus: Down", // text
										"Down", "center", // align
										0, -2, // text offset (x, y)
										38, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										735, 604, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{1,5}, // Selector Index
									new int[][]{{2,5},{1,6},{0,2},{1,4}} // E, S, W, N to select next
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
									"editKeybind String Down int 0 int 1", // function
									"EditControlDown0",  // name
									new Text(
											"%Keybind Down 0", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1075, 609, 190, 45, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{2,5}, // Selector Index
									new int[][]{{3,5},{2,6},{1,5},{2,4}} // E, S, W, N to select next
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
									"editKeybind String Down int 1 int 1", // function
									"EditControlDown1",  // name
									new Text(
											"%Keybind Down 1", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1280, 609, 190, 45, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{3,5}, // Selector Index
									new int[][]{{3,5},{3,6},{2,5},{3,4}} // E, S, W, N to select next
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
									"editKeybind String Down int 2 int 1", // function
									"EditControlDown2",  // name
									new Text(
											"%Keybind Down 2", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1485, 609, 190, 45, 0  // x, y, xSize, ySize, round%
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
									"HiHatsSubtext",  // name
									new Text(
										"Hi Hat", // text
										"Down", "center", // align
										0, -2, // text offset (x, y)
										38, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										735, 660, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{1,6}, // Selector Index
									new int[][]{{2,6},{1,7},{0,2},{1,5}} // E, S, W, N to select next
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
									"editKeybind String HiHat int 0 int 1", // function
									"EditControlHiHat0",  // name
									new Text(
											"%Keybind HiHat 0", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1075, 665, 190, 45, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{2,6}, // Selector Index
									new int[][]{{3,6},{2,7},{1,6},{2,5}} // E, S, W, N to select next
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
									"editKeybind String HiHat int 1 int 1", // function
									"EditControlHiHat1",  // name
									new Text(
											"%Keybind HiHat 1", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1280, 665, 190, 45, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{3,6}, // Selector Index
									new int[][]{{3,6},{3,7},{2,6},{3,5}} // E, S, W, N to select next
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
									"editKeybind String HiHat int 2 int 1", // function
									"EditControlHiHat2",  // name
									new Text(
											"%Keybind HiHat 2", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1485, 665, 190, 45, 0  // x, y, xSize, ySize, round%
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
									"SnareDrumsSubtext",  // name
									new Text(
										"Snare Drum", // text
										"Down", "center", // align
										0, -2, // text offset (x, y)
										38, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										735, 716, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{1,7}, // Selector Index
									new int[][]{{2,7},{1,8},{0,2},{1,6}} // E, S, W, N to select next
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
									"editKeybind String SnareDrum int 0 int 1", // function
									"EditControlSnareDrum0",  // name
									new Text(
											"%Keybind SnareDrum 0", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1075, 721, 190, 45, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{2,7}, // Selector Index
									new int[][]{{3,7},{2,8},{1,7},{2,6}} // E, S, W, N to select next
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
									"editKeybind String SnareDrum int 1 int 1", // function
									"EditControlSnareDrum1",  // name
									new Text(
											"%Keybind SnareDrum 1", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1280, 721, 190, 45, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{3,7}, // Selector Index
									new int[][]{{3,7},{3,8},{2,7},{3,6}} // E, S, W, N to select next
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
									"editKeybind String SnareDrum int 2 int 1", // function
									"EditControlSnareDrum2",  // name
									new Text(
											"%Keybind SnareDrum 2", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1485, 721, 190, 45, 0  // x, y, xSize, ySize, round%
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
									"CrashCymbalsSubtext",  // name
									new Text(
										"Crash Cymbal", // text
										"Down", "center", // align
										0, -2, // text offset (x, y)
										38, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										735, 772, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{1,8}, // Selector Index
									new int[][]{{2,8},{1,9},{0,2},{1,7}} // E, S, W, N to select next
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
									"editKeybind String CrashCymbal int 0 int 1", // function
									"EditControlCrashCymbal0",  // name
									new Text(
											"%Keybind CrashCymbal 0", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1075, 777, 190, 45, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{2,8}, // Selector Index
									new int[][]{{3,8},{2,9},{1,8},{2,7}} // E, S, W, N to select next
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
									"editKeybind String CrashCymbal int 1 int 1", // function
									"EditControlCrashCymbal1",  // name
									new Text(
											"%Keybind CrashCymbal 1", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1280, 777, 190, 45, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{3,8}, // Selector Index
									new int[][]{{3,8},{3,9},{2,8},{3,7}} // E, S, W, N to select next
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
									"editKeybind String CrashCymbal int 2 int 1", // function
									"EditControlCrashCymbal2",  // name
									new Text(
											"%Keybind CrashCymbal 2", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1485, 777, 190, 45, 0  // x, y, xSize, ySize, round%
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
									"TomSubtext",  // name
									new Text(
										"Tom", // text
										"Down", "center", // align
										0, -2, // text offset (x, y)
										38, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										735, 828, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{1,9}, // Selector Index
									new int[][]{{2,9},{1,10},{0,2},{1,8}} // E, S, W, N to select next
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
									"editKeybind String Tom int 0 int 1", // function
									"EditControlTom0",  // name
									new Text(
											"%Keybind Tom 0", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1075, 833, 190, 45, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{2,9}, // Selector Index
									new int[][]{{3,9},{2,10},{1,9},{2,8}} // E, S, W, N to select next
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
									"editKeybind String Tom int 1 int 1", // function
									"EditControlTom1",  // name
									new Text(
											"%Keybind Tom 1", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1280, 833, 190, 45, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{3,9}, // Selector Index
									new int[][]{{3,9},{3,10},{2,9},{3,8}} // E, S, W, N to select next
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
									"editKeybind String Tom int 2 int 1", // function
									"EditControlTom2",  // name
									new Text(
											"%Keybind Tom 2", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1485, 833, 190, 45, 0  // x, y, xSize, ySize, round%
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
									"KickDrumSubtext",  // name
									new Text(
										"Kick Drum", // text
										"Down", "center", // align
										0, -2, // text offset (x, y)
										38, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										735, 884, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{1,10}, // Selector Index
									new int[][]{{2,10},{1,10},{0,2},{1,9}} // E, S, W, N to select next
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
									"editKeybind String KickDrum int 0 int 1", // function
									"EditControlKickDrum0",  // name
									new Text(
											"%Keybind KickDrum 0", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1075, 889, 190, 45, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{2,10}, // Selector Index
									new int[][]{{3,10},{2,10},{1,10},{2,9}} // E, S, W, N to select next
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
									"editKeybind String KickDrum int 1 int 1", // function
									"EditControlKickDrum1",  // name
									new Text(
											"%Keybind KickDrum 1", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1280, 889, 190, 45, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{3,10}, // Selector Index
									new int[][]{{3,10},{3,10},{2,10},{3,9}} // E, S, W, N to select next
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
									"editKeybind String KickDrum int 2 int 1", // function
									"EditControlKickDrum2",  // name
									new Text(
											"%Keybind KickDrum 2", // text
											"center", "center", // align
											0, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1485, 889, 190, 45, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
					},
					new Popup[] { // Popups List
							DefaultValues.Popup_INPUTEMPTY(),
							new Popup( // Duplicate Theme Name Error
									"KeybindChange", // Popup Name
									"Change Keybind", // Popup Title
									new Element[] {
											new Element(
													new Selector(
														new int[]{1,0}, // Selector Index
														new int[][]{{1,0},{1,1},{0,2},{1,0}} // E, S, W, N to select next
														),
													-1, // mask index
													true, // hover overlap
													-1, // hover effect
													-1, // click effect
													-1, // arbritraty animation (to be used for scroll)
													-1, // entry animation
													new TextBox(
														// Text and Renderable
														1f, // scale
														"noFunction", // function
														"Text1A",  // name
														new Text(
																"Press any valid key to bind", // text
																"center", "center", // align
																0, 0, // text offset (x, y)
																120, // text size
																DefaultValues.Color_STROKE, // text color (index of colors)
																"Archivo Narrow", // font
																true // bold
																),
														new RoundedArea(
															967, 467, 0, 0, 0  // x, y, xSize, ySize, round%
															),
														Color_BUTTONS, // box color (index of colors)
														255, // opacity (0-255)
														5, // shadowOffset
														3, 6 // strokeWidth, strokeColor
														)),
/////////////////////////////////////////////////////////////////////////////////////
											new Element(
													new Selector(
														new int[]{1,0}, // Selector Index
														new int[][]{{1,0},{1,1},{0,2},{1,0}} // E, S, W, N to select next
														),
													-1, // mask index
													true, // hover overlap
													-1, // hover effect
													-1, // click effect
													-1, // arbritraty animation (to be used for scroll)
													-1, // entry animation
													new TextBox(
														// Text and Renderable
														1f, // scale
														"noFunction", // function
														"Text1B",  // name
														new Text(
																"Press any valid key to bind", // text
																"center", "center", // align
																0, 0, // text offset (x, y)
																120, // text size
																DefaultValues.Color_ACCENT, // text color (index of colors)
																"Archivo Narrow", // font
																true // bold
																),
														new RoundedArea(
															960, 460, 0, 0, 0  // x, y, xSize, ySize, round%
															),
														Color_BUTTONS, // box color (index of colors)
														255, // opacity (0-255)
														5, // shadowOffset
														3, 6 // strokeWidth, strokeColor
														)),
/////////////////////////////////////////////////////////////////////////////////////
											new Element(
													new Selector(
														new int[]{1,0}, // Selector Index
														new int[][]{{1,0},{1,1},{0,2},{1,0}} // E, S, W, N to select next
														),
													-1, // mask index
													true, // hover overlap
													-1, // hover effect
													-1, // click effect
													-1, // arbritraty animation (to be used for scroll)
													-1, // entry animation
													new TextBox(
														// Text and Renderable
														1f, // scale
														"noFunction", // function
														"Text2A",  // name
														new Text(
																"Press esc to cancel, backspace to remove", // text
																"center", "center", // align
																0, 0, // text offset (x, y)
																60, // text size
																DefaultValues.Color_STROKE, // text color (index of colors)
																"Archivo Narrow", // font
																true // bold
																),
														new RoundedArea(
															965, 585, 0, 0, 0  // x, y, xSize, ySize, round%
															),
														Color_BUTTONS, // box color (index of colors)
														255, // opacity (0-255)
														5, // shadowOffset
														3, 6 // strokeWidth, strokeColor
														)),
/////////////////////////////////////////////////////////////////////////////////////
											new Element(
													new Selector(
														new int[]{1,0}, // Selector Index
														new int[][]{{1,0},{1,1},{0,2},{1,0}} // E, S, W, N to select next
														),
													-1, // mask index
													true, // hover overlap
													-1, // hover effect
													-1, // click effect
													-1, // arbritraty animation (to be used for scroll)
													-1, // entry animation
													new TextBox(
														// Text and Renderable
														1f, // scale
														"noFunction", // function
														"Text2B",  // name
														new Text(
																"Press esc to cancel, backspace to remove", // text
																"center", "center", // align
																0, 0, // text offset (x, y)
																60, // text size
																DefaultValues.Color_ACCENT, // text color (index of colors)
																"Archivo Narrow", // font
																true // bold
																),
														new RoundedArea(
															960, 580, 0, 0, 0  // x, y, xSize, ySize, round%
															),
														Color_BUTTONS, // box color (index of colors)
														255, // opacity (0-255)
														5, // shadowOffset
														3, 6 // strokeWidth, strokeColor
														)),
/////////////////////////////////////////////////////////////////////////////////////
									}),
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
							new Popup( // Duplicate Theme Name Error
									"DuplicateKeybind", // Popup Name
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
														"Duplicate Keybind!", // text
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
														"This keybind is already used!", // text
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
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
							),
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
					}
			),
			new Menu( // 4. Screen Settings
					"Settings Screen Menu", // Menu Name
					"Settings", // Menu Display Name
					"Main Menu", // Parent Menu
					0, // BG Color
					new int[][]{{0,3}}, // Secondary Selections
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
										"setMenu String Settings_General_Menu", // function
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
							new Element(
									new Selector(
										new int[]{0,2}, // Selector Index
										new int[][]{{1,0},{0,3},{0,0},{0,1}} // E, S, W, N to select next
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
										"setMenu String Settings_Controls_Menu", // function
										"ControlsButton",  // name
										new Text(
											"Controls", // text
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
							new Element(
									new Selector(
										new int[]{0,3}, // Selector Index
										new int[][]{{1,0},{0,3},{0,0},{0,2}} // E, S, W, N to select next
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
										"ScreenButton",  // name
										new Text(
											"Screen", // text
											"left", "center", // align
											-250, -9, // text offset (x, y)
											50, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
										new RoundedArea(
											600, 600, 600, 120, 100  // x, y, xSize, ySize, round%
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
									"ScreenSubtitle",  // name
									new Text(
										"Screen", // text
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
									"WidthSubtext",  // name
									new Text(
										"Screen Width", // text
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
/////////////////////////////////////////////////////////////////////////////////////
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
									"enterTextField String ScreenWidth", // function
									"EditScreenWidthButton",  // name
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
										4, // Max Size
										new int[] { // Error Popup Indexes
												1, // Field is duplicate!
												0, // Field is empty
											},
										TextField.Input_NUMERIC, // input type
										"ScreenWidth", // Name
										new Text(
											"%ScreenWidth", // text
											"right", "center", // align
											45, -6, // text offset (x, y)
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
									"FullscreenSubtext",  // name
									new Text(
										"Fullscreen", // text
										"left", "center", // align
										0, -2, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										735, 415, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{1,4}, // Selector Index
									new int[][]{{1,4},{1,5},{0,1},{1,3}} // E, S, W, N to select next
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
									"enterTextField String Fullscreen", // function
									"EditFullscreenButton",  // name
									new Renderable(
											// Renderable Without Function
											"EditPNG", // name
											"src/textures/edit.png", // file source
											9, 8, 50, 50, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										1424, 419, 65, 65, 0  // x, y, xSize, ySize, round%
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
										3, // Max Size
										new int[] { // Error Popup Indexes
												1, // Field is duplicate!
												0, // Field is empty
											},
										TextField.Input_BOOLEAN, // input type
										"Fullscreen", // Name
										new Text(
											"%Fullscreen", // text
											"right", "center", // align
											48, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										1515, 419, 120, 65, 0  // x, y, xSize, ySize, round%
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
									"ScreenSubtitle",  // name
									new Text(
										"Note: Screen Width is overriden by the Fullscreen option%br%"
										+ "Screen Width capped at your screen's resolution (max),%br%"
										+ "and 540px (min).", // text
										"center", "center", // align
										0, 40, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1160, 490, 850, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
					},
					new Popup[] { // Popups List
							DefaultValues.Popup_INPUTEMPTY(),
							new Popup( // Duplicate Theme Name Error
									"KeybindChange", // Popup Name
									"Change Keybind", // Popup Title
									new Element[] {
											new Element(
													new Selector(
														new int[]{1,0}, // Selector Index
														new int[][]{{1,0},{1,1},{0,2},{1,0}} // E, S, W, N to select next
														),
													-1, // mask index
													true, // hover overlap
													-1, // hover effect
													-1, // click effect
													-1, // arbritraty animation (to be used for scroll)
													-1, // entry animation
													new TextBox(
														// Text and Renderable
														1f, // scale
														"noFunction", // function
														"Text1A",  // name
														new Text(
																"Press any valid key to bind", // text
																"center", "center", // align
																0, 0, // text offset (x, y)
																120, // text size
																DefaultValues.Color_STROKE, // text color (index of colors)
																"Archivo Narrow", // font
																true // bold
																),
														new RoundedArea(
															967, 467, 0, 0, 0  // x, y, xSize, ySize, round%
															),
														Color_BUTTONS, // box color (index of colors)
														255, // opacity (0-255)
														5, // shadowOffset
														3, 6 // strokeWidth, strokeColor
														)),
/////////////////////////////////////////////////////////////////////////////////////
											new Element(
													new Selector(
														new int[]{1,0}, // Selector Index
														new int[][]{{1,0},{1,1},{0,2},{1,0}} // E, S, W, N to select next
														),
													-1, // mask index
													true, // hover overlap
													-1, // hover effect
													-1, // click effect
													-1, // arbritraty animation (to be used for scroll)
													-1, // entry animation
													new TextBox(
														// Text and Renderable
														1f, // scale
														"noFunction", // function
														"Text1B",  // name
														new Text(
																"Press any valid key to bind", // text
																"center", "center", // align
																0, 0, // text offset (x, y)
																120, // text size
																DefaultValues.Color_ACCENT, // text color (index of colors)
																"Archivo Narrow", // font
																true // bold
																),
														new RoundedArea(
															960, 460, 0, 0, 0  // x, y, xSize, ySize, round%
															),
														Color_BUTTONS, // box color (index of colors)
														255, // opacity (0-255)
														5, // shadowOffset
														3, 6 // strokeWidth, strokeColor
														)),
/////////////////////////////////////////////////////////////////////////////////////
											new Element(
													new Selector(
														new int[]{1,0}, // Selector Index
														new int[][]{{1,0},{1,1},{0,2},{1,0}} // E, S, W, N to select next
														),
													-1, // mask index
													true, // hover overlap
													-1, // hover effect
													-1, // click effect
													-1, // arbritraty animation (to be used for scroll)
													-1, // entry animation
													new TextBox(
														// Text and Renderable
														1f, // scale
														"noFunction", // function
														"Text2A",  // name
														new Text(
																"Press esc to cancel, backspace to remove", // text
																"center", "center", // align
																0, 0, // text offset (x, y)
																60, // text size
																DefaultValues.Color_STROKE, // text color (index of colors)
																"Archivo Narrow", // font
																true // bold
																),
														new RoundedArea(
															965, 585, 0, 0, 0  // x, y, xSize, ySize, round%
															),
														Color_BUTTONS, // box color (index of colors)
														255, // opacity (0-255)
														5, // shadowOffset
														3, 6 // strokeWidth, strokeColor
														)),
/////////////////////////////////////////////////////////////////////////////////////
											new Element(
													new Selector(
														new int[]{1,0}, // Selector Index
														new int[][]{{1,0},{1,1},{0,2},{1,0}} // E, S, W, N to select next
														),
													-1, // mask index
													true, // hover overlap
													-1, // hover effect
													-1, // click effect
													-1, // arbritraty animation (to be used for scroll)
													-1, // entry animation
													new TextBox(
														// Text and Renderable
														1f, // scale
														"noFunction", // function
														"Text2B",  // name
														new Text(
																"Press esc to cancel, backspace to remove", // text
																"center", "center", // align
																0, 0, // text offset (x, y)
																60, // text size
																DefaultValues.Color_ACCENT, // text color (index of colors)
																"Archivo Narrow", // font
																true // bold
																),
														new RoundedArea(
															960, 580, 0, 0, 0  // x, y, xSize, ySize, round%
															),
														Color_BUTTONS, // box color (index of colors)
														255, // opacity (0-255)
														5, // shadowOffset
														3, 6 // strokeWidth, strokeColor
														)),
/////////////////////////////////////////////////////////////////////////////////////
									}),
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
							new Popup( // Duplicate Theme Name Error
									"DuplicateKeybind", // Popup Name
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
														"Duplicate Keybind!", // text
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
														"This keybind is already used!", // text
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
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
							),
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
					}
			),
			new Menu( // 5. Play Menu
					"Play Menu", // Menu Name
					"Play", // Menu Display Name
					"Main Menu", // Parent Menu
					0, // BG Color
					new int[][]{{-1,-1}}, // Secondary Selections
					new RoundedArea[]{ // Masks
							new RoundedArea(0, 0, 1920, 1080, 0), // 0. Full Screen
							new RoundedArea(600, 358, 1320, 512, 0), // 1. Skin Choices
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
										0, 85, // x, y transform
										1, 1, // scale transform (x, y)
										0, // rotate transform
										0, // offset (ms)
										400, // animation time (ms)
										6 // (ease type)
										),
						},
					new Element[] { // Elements List
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
							DefaultValues.TransformIndex_500msLeft150, // entry animation
							new TextBox(
								// No Text, No Renderable
								1, // scale
								null, // function
								"Main Box",  // name
								new RoundedArea(
									1260, 560, 1000, 800,  // x, y, xSize, ySize, round%
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
								TransformIndex_500msLeft150, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"Level Select",  // name
									new Text(
										"Level Select", // text
										"center", "center", // align
										0, -50, // text offset (x, y)
										60, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1260, 270, 650, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
										new int[]{1,1}, // Selector Index
										new int[][]{{2,0},{1,1},{0,1},{1,1}} // E, S, W, N to select next
										),
									1, // mask index
									false, // hover overlap
									-1, // hover effect
									DefaultValues.TransformIndex_ClickScaleDown, // click effect
									23, // arbritraty animation (to be used for scroll)
									TransformIndex_500msLeft150, // entry animation
									new OptionsList(
											// Text and Renderable
											1f, // scale
											"playLevel", // function
											"%!Levels", // list objects
											6, // max amount of options
											"\\!Levels",  // name
											new Text(
												"%Name", // text
												"left", "center", // align
												-430, -5, // text offset (x, y)
												40, // text size
												6, // text color (index of colors)
												"Archivo Narrow", // font
												false // bold
												),
											new RoundedArea(
												1260, 398, 900, 70, 0  // x, y, xSize, ySize, round%
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
										new int[]{1,1}, // Selector Index
										new int[][]{{2,0},{1,2},{0,1},{0,0}} // E, S, W, N to select next
										),
									1, // mask index
									false, // hover overlap
									-1, // hover effect
									DefaultValues.TransformIndex_ClickScaleDown, // click effect
									23, // arbritraty animation (to be used for scroll)
									TransformIndex_500msLeft150, // entry animation
									new OptionsList(
											// Text and Renderable
											1f, // scale
											"playLevel", // function
											"%!Levels", // list objects
											6, // max amount of options
											"\\!Levels",  // name
											new Text(
												"%Author", // text
												"right", "center", // align
												-120, -5, // text offset (x, y)
												40, // text size
												6, // text color (index of colors)
												"Archivo Narrow", // font
												false // bold
												),
											new RoundedArea(
												1810, 398, 0, 0, 0  // x, y, xSize, ySize, round%
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
									new int[]{0,1}, // Selector Index
									new int[][]{{1,1},{1,1},{0,0},{0,0}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								TransformIndex_500msLeft150, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									"scroll String \\!Levels boolean false", // function
									"LevelsScrollUp",  // name
									new Renderable(
											// Renderable Without Function
											"UpPNG", // name
											"src/textures/up.png", // file source
											15, 7, 90, 36, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										1260, 315, 120, 50, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{2,0}, // Selector Index
									new int[][]{{2,0},{2,0},{1,1},{1,1}} // E, S, W, N to select next
									),
								-1, // mask index
								false, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								TransformIndex_500msLeft150, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									"scroll String \\!Levels boolean true", // function
									"LevelsScrollDown",  // name
									new Renderable(
											// Renderable Without Function
											"DownPNG", // name
											"src/textures/down.png", // file source
											15, 7, 90, 36, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										1260, 910, 120, 50, 0  // x, y, xSize, ySize, round%
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
									new int[][]{{-1,-1},{-1,-1},{-1,-1},{-1,-1}} // E, S, W, N to select next
									),
								-1, // Mask Index
								false, // hover overlap
								-1, // hover effect
								-1, // click effect
								-1, // arbritraty animation (to be used for scroll)
								DefaultValues.TransformIndex_500msRight150, // entry animation
								new TextBox(
									// No Text, No Renderable
									1, // scale
									null, // function
									"Stats Box",  // name
									new RoundedArea(
										430, 560, 580, 800,  // x, y, xSize, ySize, round%
										10 // roundPercentage
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
								DefaultValues.TransformIndex_500msRight150, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"LevelTitleSubtext",  // name
									new Text(
										"Title", // text
										"left", "center", // align
										0, 0, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										180, 315, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
//////////////////////////////////////////////////////////////////////////////////////
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
								DefaultValues.TransformIndex_500msRight150, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"LevelTitle",  // name
									new Text(
										"%CLevel Title", // text
										"right", "center", // align
										0, 0, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										680, 315, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
//////////////////////////////////////////////////////////////////////////////////////
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
								DefaultValues.TransformIndex_500msRight150, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"LevelAuthorSubtext",  // name
									new Text(
										"Author", // text
										"left", "center", // align
										0, 0, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										180, 373, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
//////////////////////////////////////////////////////////////////////////////////////
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
								DefaultValues.TransformIndex_500msRight150, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"LevelAuthor",  // name
									new Text(
										"%CLevel Author", // text
										"right", "center", // align
										0, 0, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										680, 373, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
//////////////////////////////////////////////////////////////////////////////////////
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
								DefaultValues.TransformIndex_500msRight150, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"LevelLengthSubtext",  // name
									new Text(
										"Length", // text
										"left", "center", // align
										0, 0, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										180, 431, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
//////////////////////////////////////////////////////////////////////////////////////
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
								DefaultValues.TransformIndex_500msRight150, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"LevelLength",  // name
									new Text(
										"%CLevel Length", // text
										"right", "center", // align
										0, 0, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										680, 431, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
//////////////////////////////////////////////////////////////////////////////////////
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
								DefaultValues.TransformIndex_500msRight150, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"LevelNotesSubtext",  // name
									new Text(
										"Notes", // text
										"left", "center", // align
										0, 0, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										180, 489, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
//////////////////////////////////////////////////////////////////////////////////////
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
								DefaultValues.TransformIndex_500msRight150, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"LevelNotes",  // name
									new Text(
										"%CLevel Notes", // text
										"right", "center", // align
										0, 0, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										680, 489, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
//////////////////////////////////////////////////////////////////////////////////////
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
								DefaultValues.TransformIndex_500msRight150, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"LevelNPS",  // name
									new Text(
										"NPS", // text
										"left", "center", // align
										0, 0, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										180, 547, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
//////////////////////////////////////////////////////////////////////////////////////
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
								DefaultValues.TransformIndex_500msRight150, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"LevelNPS",  // name
									new Text(
										"%CLevel NPS", // text
										"right", "center", // align
										0, 0, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										680, 547, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
//////////////////////////////////////////////////////////////////////////////////////
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
								DefaultValues.TransformIndex_500msRight150, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"LevelBPMSubtext",  // name
									new Text(
										"BPM", // text
										"left", "center", // align
										0, 0, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										180, 605, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
//////////////////////////////////////////////////////////////////////////////////////
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
								DefaultValues.TransformIndex_500msRight150, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"LevelBPM",  // name
									new Text(
										"%CLevel BPM", // text
										"right", "center", // align
										0, 0, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										680, 605, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
//////////////////////////////////////////////////////////////////////////////////////
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
								DefaultValues.TransformIndex_500msRight150, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"LevelAttemptsSubtext",  // name
									new Text(
										"Attempts", // text
										"left", "center", // align
										0, 0, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										180, 663, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
//////////////////////////////////////////////////////////////////////////////////////
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
								DefaultValues.TransformIndex_500msRight150, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"LevelAttempts",  // name
									new Text(
										"%CLevel Attempts", // text
										"right", "center", // align
										0, 0, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										680, 663, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
//////////////////////////////////////////////////////////////////////////////////////
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
								DefaultValues.TransformIndex_500msRight150, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"LevelMaxComboSubtext",  // name
									new Text(
										"Max Combo", // text
										"left", "center", // align
										0, 0, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										180, 721, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
//////////////////////////////////////////////////////////////////////////////////////
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
								DefaultValues.TransformIndex_500msRight150, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"LevelMaxCombo",  // name
									new Text(
										"%CLevel MaxCombo", // text
										"right", "center", // align
										0, 0, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										680, 721, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
//////////////////////////////////////////////////////////////////////////////////////
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
								DefaultValues.TransformIndex_500msRight150, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"LevelHighscoreSubtext",  // name
									new Text(
										"Highscore", // text
										"left", "center", // align
										0, 0, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										180, 779, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
//////////////////////////////////////////////////////////////////////////////////////
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
								DefaultValues.TransformIndex_500msRight150, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"LevelHighscore",  // name
									new Text(
										"%CLevel Highscore", // text
										"right", "center", // align
										0, 0, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										680, 779, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
//////////////////////////////////////////////////////////////////////////////////////
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
								DefaultValues.TransformIndex_500msRight150, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"LevelBestAccuracySubtext",  // name
									new Text(
										"Best Accuracy", // text
										"left", "center", // align
										0, 0, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										180, 837, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
//////////////////////////////////////////////////////////////////////////////////////
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
								DefaultValues.TransformIndex_500msRight150, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"LevelBestAccuracy",  // name
									new Text(
										"%CLevel BestAccuracy", // text
										"right", "center", // align
										0, 0, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										680, 837, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
//////////////////////////////////////////////////////////////////////////////////////
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
								DefaultValues.TransformIndex_500msRight150, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"LevelFlawless",  // name
									new Text(
										"%CLevel Flawless", // text
										"center", "center", // align
										0, 0, // text offset (x, y)
										50, // text size
										DefaultValues.Color_ACCENT, // text color (index of colors)
										"Archivo Narrow", // font
										true // bold
										),
									new RoundedArea(
										430, 900, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
//////////////////////////////////////////////////////////////////////////////////////
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
								TransformIndex_500msRight150, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"",  // name
									new Text(
										"Level Stats", // text
										"center", "center", // align
										0, -50, // text offset (x, y)
										60, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										430, 270, 500, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
					},
					new Popup[] { // Popups List
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
					}
			),
			new Menu( // 6. Init User
					"Init User Menu", // Menu Name
					"Welcome!", // Menu Display Name
					"Init User Menu", // Parent Menu
					0, // BG Color
					new int[][]{{-1,-1}}, // Secondary Selections
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
									960, 560, 600, 380,  // x, y, xSize, ySize, round%
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
								DefaultValues.TransformIndex_500msScale0, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									null, // function
									"Username Select",  // name
									new Text(
										"Pick a Username", // text
										"center", "center", // align
										0, -50, // text offset (x, y)
										60, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										960, 470, 500, 0, 0  // x, y, xSize, ySize, round%
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
									new int[][]{{1,0},{1,1},{0,2},{1,0}} // E, S, W, N to select next
									),
								-1, // mask index
								true, // hover overlap
								-1, // hover effect
								-1, // click effect
								-1, // arbritraty animation (to be used for scroll)
								DefaultValues.TransformIndex_500msScale0, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									"noFunction", // function
									"UsernameTip",  // name
									new Text(
											"3 - 12 alphanumeric characters.", // text
											"center", "center", // align
											0, 0, // text offset (x, y)
											35, // text size
											DefaultValues.Color_STROKE, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										960, 510, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{0,0}, // Selector Index
									new int[][]{{0,0},{0,1},{0,0},{0,0}} // E, S, W, N to select next
									),
								-1, // mask index
								true, // hover overlap
								-1, // hover effect
								DefaultValues.TransformIndex_ClickScaleDown, // click effect
								-1, // arbritraty animation (to be used for scroll)
								DefaultValues.TransformIndex_500msScale0, // entry animation
								new TextBox(
									// Text and Renderable
									1f, // scale
									"enterTextField String NewUsername", // function
									"EditNewUsernameButton",  // name
									new Renderable(
											// Renderable Without Function
											"EditPNG", // name
											"src/textures/edit.png", // file source
											9, 8, 50, 50, // x, y, xSize, ySize (relative)
											255 // opacity (0-255)
											),  // renderable
									new RoundedArea(
										800, 593, 65, 65, 0  // x, y, xSize, ySize, round%
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
								DefaultValues.TransformIndex_500msScale0, // entry animation
								new TextField(
										// Textfield
										1f, // scale
										12, // Max Size
										new int[] { // Error Popup Indexes
												-1, // Field is duplicate!
												0, // Field is empty! 
												-1, // Hex invalid
												1, // Field is less than 3 characters
											},
										TextField.Input_ALPHANUMERIC, // input type
										"NewUsername", // Name
										new Text(
											"%NewUsername", // text
											"right", "center", // align
											146, -6, // text offset (x, y)
											35, // text size
											6, // text color (index of colors)
											"Archivo Narrow", // font
											false // bold
											),
									new RoundedArea(
										993, 593, 321, 65, 0  // x, y, xSize, ySize, round%
										),
									Color_DISPLAY, // box color (index of colors)
									255, // opacity (0-255)
									5, // shadowOffset
									3, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{0,1}, // Selector Index
									new int[][]{{0,1},{0,1},{0,1},{0,0}} // E, S, W, N to select next
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
									"confirmUsername", // function
									"popup",  // name
									new Text(
										"Confirm", // text
										"center", "center", // align
										0, -5, // text offset (x, y)
										35, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										960, 685, 300, 60, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
					},
					new Popup[] { // Popups List
							DefaultValues.Popup_INPUTEMPTY(),
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
														"Username must be longer!", // text
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
							),
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
					}
			),
			new Menu( // 7. Statistics Menu
					"Statistics Menu", // Menu Name
					"Statistics", // Menu Display Name
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
										"StatisticsButton",  // name
										new Text(
											"Statistics", // text
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
										"setMenu String Leaderboards_Menu", // function
										"LeaderboardsButton",  // name
										new Text(
											"Leaderboards", // text
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
									"StatisticsSubtitle",  // name
									new Text(
										"Statistics", // text
										"center", "center", // align
										0, -60, // text offset (x, y)
										75, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1160, 285, 600, 3, 0  // x, y, xSize, ySize, round%
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
									"UUIDSubtext",  // name
									new Text(
										"%UserUUID", // text
										"center", "center", // align
										0, 0, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										true // bold
										),
									new RoundedArea(
										1160, 315, 0, 0, 0  // x, y, xSize, ySize, round%
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
									"UsernameSubtext",  // name
									new Text(
										"%Username", // text
										"center", "center", // align
										0, 0, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										true // bold
										),
									new RoundedArea(
										1160, 365, 0, 0, 0  // x, y, xSize, ySize, round%
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
									"SecondLine",  // name
									new RoundedArea(
										1160, 410, 600, 3, 0  // x, y, xSize, ySize, round%
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
									"StatsTypeSubtitle",  // name
									new Text(
										"%StatsPage StatsType", // text
										"center", "center", // align
										0, 0, // text offset (x, y)
										50, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1160, 450, 0, 0, 0  // x, y, xSize, ySize, round%
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
									"TimePlayedSubtitle",  // name
									new Text(
										"%StatsPage TimePlayed", // text
										"left", "center", // align
										0, 0, // text offset (x, y)
										30, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										760, 510, 0, 0, 0  // x, y, xSize, ySize, round%
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
									"TimePlayed",  // name
									new Text(
										"%PlayerStats TimePlayed", // text
										"right", "center", // align
										0, 0, // text offset (x, y)
										30, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1560, 510, 0, 0, 0  // x, y, xSize, ySize, round%
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
									"NotesHitSubtitle",  // name
									new Text(
										"%StatsPage NotesHit", // text
										"left", "center", // align
										0, 0, // text offset (x, y)
										30, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										760, 550, 0, 0, 0  // x, y, xSize, ySize, round%
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
									"NotesHit",  // name
									new Text(
										"%PlayerStats NotesHit", // text
										"right", "center", // align
										0, 0, // text offset (x, y)
										30, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1560, 550, 0, 0, 0  // x, y, xSize, ySize, round%
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
									"NotesMissedSubtitle",  // name
									new Text(
										"%StatsPage NotesMissed", // text
										"left", "center", // align
										0, 0, // text offset (x, y)
										30, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										760, 590, 0, 0, 0  // x, y, xSize, ySize, round%
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
									"NotesMissed",  // name
									new Text(
										"%PlayerStats NotesMissed", // text
										"right", "center", // align
										0, 0, // text offset (x, y)
										30, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1560, 590, 0, 0, 0  // x, y, xSize, ySize, round%
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
									"AverageAccuracySubtitle",  // name
									new Text(
										"%StatsPage Accuracy", // text
										"left", "center", // align
										0, 0, // text offset (x, y)
										30, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										760, 630, 0, 0, 0  // x, y, xSize, ySize, round%
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
									"NotesMissed",  // name
									new Text(
										"%PlayerStats Accuracy", // text
										"right", "center", // align
										0, 0, // text offset (x, y)
										30, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1560, 630, 0, 0, 0  // x, y, xSize, ySize, round%
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
									"LongestComboSubtitle",  // name
									new Text(
										"%StatsPage LongestCombo", // text
										"left", "center", // align
										0, 0, // text offset (x, y)
										30, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										760, 670, 0, 0, 0  // x, y, xSize, ySize, round%
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
									"LongestCombo",  // name
									new Text(
										"%PlayerStats LongestCombo", // text
										"right", "center", // align
										0, 0, // text offset (x, y)
										30, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1560, 670, 0, 0, 0  // x, y, xSize, ySize, round%
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
									"SongsPlayedSubtitle",  // name
									new Text(
										"%StatsPage SongsAttempts", // text
										"left", "center", // align
										0, 0, // text offset (x, y)
										30, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										760, 710, 0, 0, 0  // x, y, xSize, ySize, round%
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
									"SongsPlayed",  // name
									new Text(
										"%PlayerStats SongsAttempts", // text
										"right", "center", // align
										0, 0, // text offset (x, y)
										30, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1560, 710, 0, 0, 0  // x, y, xSize, ySize, round%
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
									"FlawlessedSongsSubtitle",  // name
									new Text(
										"%StatsPage FlawlessedSongs", // text
										"left", "center", // align
										0, 0, // text offset (x, y)
										30, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										760, 750, 0, 0, 0  // x, y, xSize, ySize, round%
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
									"FlawlessedSongs",  // name
									new Text(
										"%PlayerStats FlawlessedSongs", // text
										"right", "center", // align
										0, 0, // text offset (x, y)
										30, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1560, 750, 0, 0, 0  // x, y, xSize, ySize, round%
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
									"TotalScoreSubtitle",  // name
									new Text(
										"%StatsPage TotalScore", // text
										"left", "center", // align
										0, 0, // text offset (x, y)
										30, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										760, 790, 0, 0, 0  // x, y, xSize, ySize, round%
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
									"TotalScore",  // name
									new Text(
										"%PlayerStats TotalScore", // text
										"right", "center", // align
										0, 0, // text offset (x, y)
										30, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1560, 790, 0, 0, 0  // x, y, xSize, ySize, round%
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
									"ThirdLine",  // name
									new RoundedArea(
										1160, 835, 600, 3, 0  // x, y, xSize, ySize, round%
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
									new int[][]{{2,0},{1,0},{0,1},{0,1}} // E, S, W, N to select next
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
									"switchStatsView", // function
									"popup",  // name
									new Text(
										"%StatsPage SwitchType", // text
										"center", "center", // align
										0, -5, // text offset (x, y)
										35, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1010, 895, 250, 65, 0  // x, y, xSize, ySize, round%
										),
									Color_BUTTONS, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
						new Element(
								new Selector(
									new int[]{2,0}, // Selector Index
									new int[][]{{2,0},{2,0},{1,0},{0,1}} // E, S, W, N to select next
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
									"addPopup int 0", // function
									"resetStats",  // name
									new Text(
										"%StatsPage Reset", // text
										"center", "center", // align
										0, -5, // text offset (x, y)
										35, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										true // bold
										),
									new RoundedArea(
										1310, 895, 250, 65, 0  // x, y, xSize, ySize, round%
										),
									Color_ACCENT, // box color (index of colors)
									255, // opacity (0-255)
									8, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
					},
					new Popup[] { // Popups List
							new Popup( // Duplicate Theme Name Error
									"DuplicateKeybind", // Popup Name
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
														"%StatsPage ConfirmDelete", // text
														"center", "center", // align
														0, -90, // text offset (x, y)
														60, // text size
														5, // text color (index of colors)
														"Archivo Narrow", // font
														true // bold
														),
													new RoundedArea(
														960, 520, 600, 280, 0  // x, y, xSize, ySize, round%
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
														"Are you sure you want to do this?", // text
														"center", "center", // align
														0, -9, // text offset (x, y)
														40, // text size
														6, // text color (index of colors)
														"Archivo Narrow", // font
														false // bold
														),
													new RoundedArea(
														960, 518, 0, 0, 0  // x, y, xSize, ySize, round%
														),
													Color_TRANSPARENT, // box color (index of colors)
													255, // opacity (0-255)
													0, // shadowOffset
													5, 6 // strokeWidth, strokeColor
													)),
/////////////////////////////////////////////////////////////////////////////////////
										new Element(
												new Selector(
													new int[]{3,0}, // Selector Index
													new int[][]{{4,0},{3,0},{3,0},{3,0}} // E, S, W, N to select next
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
													"popupCancel",  // name
													new Text(
														"Cancel", // text
														"center", "center", // align
														0, -5, // text offset (x, y)
														35, // text size
														6, // text color (index of colors)
														"Archivo Narrow", // font
														false // bold
														),
													new RoundedArea(
														840, 595, 200, 60, 0  // x, y, xSize, ySize, round%
														),
													Color_BUTTONS, // box color (index of colors)
													255, // opacity (0-255)
													8, // shadowOffset
													5, 6 // strokeWidth, strokeColor
													)),
/////////////////////////////////////////////////////////////////////////////////////
										new Element(
												new Selector(
													new int[]{4,0}, // Selector Index
													new int[][]{{4,0},{4,0},{3,0},{4,0}} // E, S, W, N to select next
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
													"confirmRemoveStats", // function
													"popupConfirm",  // name
													new Text(
														"Confirm", // text
														"center", "center", // align
														0, -5, // text offset (x, y)
														35, // text size
														6, // text color (index of colors)
														"Archivo Narrow", // font
														true // bold
														),
													new RoundedArea(
														1080, 595, 200, 60, 0  // x, y, xSize, ySize, round%
														),
													Color_ACCENT, // box color (index of colors)
													255, // opacity (0-255)
													8, // shadowOffset
													5, 6 // strokeWidth, strokeColor
													)),
/////////////////////////////////////////////////////////////////////////////////////
									}
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
							),
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
					}
			),
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
			new Menu( // 8. Leaderboards Menu
					"Leaderboards Menu", // Menu Name
					"Leaderboards", // Menu Display Name
					"Main Menu", // Parent Menu
					0, // BG Color
					new int[][]{{0,2}}, // Secondary Selections
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
										"setMenu String Statistics_Menu", // function
										"StatisticsButton",  // name
										new Text(
											"Statistics", // text
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
										"setMenu String null", // function
										"LeaderboardsButton",  // name
										new Text(
											"Leaderboards", // text
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
									"LeaderboardsSubtitle",  // name
									new Text(
										"Leaderboards", // text
										"center", "center", // align
										0, -60, // text offset (x, y)
										75, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1160, 285, 600, 3, 0  // x, y, xSize, ySize, round%
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
										911, 345, 65, 65, 0  // x, y, xSize, ySize, round%
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
									"LeaderboardSelectedLevel",  // name
									new Text(
										"%LeaderboardPage CurrentSelectedLevel", // text
										"right", "center", // align
										240, -6, // text offset (x, y)
										35, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1192, 345, 500, 65, 0  // x, y, xSize, ySize, round%
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
									"SecondLine",  // name
									new RoundedArea(
										1160, 403, 600, 3, 0  // x, y, xSize, ySize, round%
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
									"LevelInfo",  // name
									new Text(
										"%LeaderboardPage LevelInfo", // text
										"center", "center", // align
										0, 0, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1160, 440, 0, 0, 0  // x, y, xSize, ySize, round%
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
									"LevelData",  // name
									new Text(
										"%LeaderboardPage LevelData", // text
										"center", "center", // align
										0, 0, // text offset (x, y)
										40, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1160, 490, 0, 0, 0  // x, y, xSize, ySize, round%
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
									"BoxWide",  // name
									new RoundedArea(
										1160, 730, 800, 380, 0  // x, y, xSize, ySize, round%
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
									"BoxWide2",  // name
									new RoundedArea(
										1160, 755, 800, 332, 0  // x, y, xSize, ySize, round%
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
									"BoxWide3",  // name
									new RoundedArea(
										1020, 730, 300, 380, 0  // x, y, xSize, ySize, round%
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
									"BoxWide4",  // name
									new RoundedArea(
										1350, 730, 120, 380, 0  // x, y, xSize, ySize, round%
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
									"PositionSubtitle",  // name
									new Text(
										"Position", // text
										"center", "center", // align
										0, 0, // text offset (x, y)
										25, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										815, 561, 0, 0, 0  // x, y, xSize, ySize, round%
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
									"UsernameSubtitle",  // name
									new Text(
										"Username", // text
										"center", "center", // align
										0, 0, // text offset (x, y)
										25, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1018, 561, 0, 0, 0  // x, y, xSize, ySize, round%
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
									"AccuracySubtitle",  // name
									new Text(
										"Accuracy", // text
										"center", "center", // align
										0, 0, // text offset (x, y)
										25, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1230, 561, 0, 0, 0  // x, y, xSize, ySize, round%
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
									"ComboSubtitle",  // name
									new Text(
										"Combo", // text
										"center", "center", // align
										0, 0, // text offset (x, y)
										25, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1350, 561, 0, 0, 0  // x, y, xSize, ySize, round%
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
									"ScoreSubtitle",  // name
									new Text(
										"Score", // text
										"center", "center", // align
										0, 0, // text offset (x, y)
										25, // text size
										6, // text color (index of colors)
										"Archivo Narrow", // font
										false // bold
										),
									new RoundedArea(
										1484, 561, 0, 0, 0  // x, y, xSize, ySize, round%
										),
									Color_TRANSPARENT, // box color (index of colors)
									255, // opacity (0-255)
									0, // shadowOffset
									5, 6 // strokeWidth, strokeColor
									)),
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
					},
					new Popup[] { // Popups List
							new Popup(
									"LevelOptions", // Popup Name
									"Leaderboards", // Popup Title
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
														960, 560, 800, 800,  // x, y, xSize, ySize, round%
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
															"setLeaderboardLevel", // function
															"%!Levels", // list objects
															5, // max amount of options
															"LevelChoices",  // name
															new Text(
																"%NameAuthor", // text
																"center", "center", // align
																0, -5, // text offset (x, y)
																40, // text size
																6, // text color (index of colors)
																"Archivo Narrow", // font
																false // bold
																),
															new RoundedArea(
																960, 320, 700, 80, 0  // x, y, xSize, ySize, round%
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
													"scroll String LevelChoices boolean false", // function
													"LevelChoicesScrollUp",  // name
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
													"scroll String LevelChoices boolean true", // function
													"LevelChoicesScrollDown",  // name
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
							new Popup( // Empty Input Error
									"DatabaseError", // Popup Name
									"Database Error!", // Popup Title
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
														"Database Error!", // text
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
														"No access to database!", // text
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
							),
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
					}
			),
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
	};
	
	public static Config getDefaultConfigs() {
		Main.bufferSkin(defaultSelectedSkin);
		Config defaultConfig = new Config(
				getDefaultDatabasePasskey(),
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
    			getDefaultDEBUG_masksOpacity(),
    			getDefaultFORCED_noFail(),
    			getDefaultFORCED_millisecondLeniency()
    			);
		return defaultConfig;
	}
	
	public static String getDefaultDatabasePasskey() {
		return defaultDatabasePasskey;
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
	
	public static boolean getDefaultFORCED_noFail() {
		return defaultFORCED_noFail;
	}

	public static int getDefaultFORCED_millisecondLeniency() {
		return defaultFORCED_millisecondLeniency;
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