package SimpleRhythmGame;

import java.awt.HeadlessException;

import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.imageio.ImageIO;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException; 

public class FileIO {
	public static void currentConfigOut() {
		String path = "./options.json";
		try (PrintWriter out = new PrintWriter(new FileWriter(path))) {
	        Gson gson = new GsonBuilder().setPrettyPrinting().create();
	        String jsonString = gson.toJson(Main.getConfig());
	        out.write(jsonString);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public static void configOut(Config thisConfig) {
		String path = "./options.json";
		try (PrintWriter out = new PrintWriter(new FileWriter(path))) {
	        Gson gson = new GsonBuilder().setPrettyPrinting().create();
	        String jsonString = gson.toJson(thisConfig);
	        out.write(jsonString);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public static Config currentConfigIn() throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		Gson gson = new Gson();
		Config config = gson.fromJson(new FileReader("./options.json"), Config.class);
		// since colors are a transient property they are 
		// written to config after reading from json.
		
		// VALIDATE CONFIG
		
		boolean colorsValid = true;
		
		if (config.getThemes() != null){
			if (config.getThemes() instanceof Theme[]) {
				Theme[] themesList = config.getThemes();
					for (Theme theme : themesList) {
						if (theme.getColorsList().length == Config.getColorsLenth()) {
						for (IntColor color : theme.getColorsList())
							if (color.getRed() < 0 || color.getRed() > 255) {
								colorsValid = false;
								break;
							} else if (color.getGreen() < 0 || color.getGreen() > 255) {
								colorsValid = false;
								break;
							} else if (color.getBlue() < 0 || color.getBlue() > 255) {
								colorsValid = false;
								break;
							} else if (color.getAlpha() < 0 || color.getAlpha() > 255) {
								colorsValid = false;
								break;
							}
						} else {
							colorsValid = false;
					
						}
				}
			} else {
				colorsValid = false;
			}
		} else {
			colorsValid = false;
		}

		if (!colorsValid) {
			config.setThemes(DefaultValues.getDefaultThemes());
			System.out.println("RESET INVALID COLORS");
		}
		config.setMenus(DefaultValues.getAllDefaultMenus());
		
		config.setFORCED_noFail(DefaultValues.getDefaultFORCED_noFail());
		config.setFORCED_millisecondLeniency(DefaultValues.getDefaultFORCED_millisecondLeniency());
		
		configOut(config);
		return config;
	}
	
	public static void playerDataOut(PlayerData playerData) {
		String path = "./playerdata.json";
		try (PrintWriter out = new PrintWriter(new FileWriter(path))) {
	        Gson gson = new GsonBuilder().setPrettyPrinting().create();
	        String jsonString = gson.toJson(playerData);
	        out.write(jsonString);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public static void currentPlayerDataOut() {
		System.out.println("hiee");
		String path = "./playerdata.json";
		try (PrintWriter out = new PrintWriter(new FileWriter(path))) {
	        Gson gson = new GsonBuilder().setPrettyPrinting().create();
	        String jsonString = gson.toJson(Main.getPlayerData());
	        out.write(jsonString);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public static PlayerData playerDataIn() throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		Gson gson = new Gson();
		PlayerData playerData = gson.fromJson(new FileReader("./playerdata.json"), PlayerData.class);
		return playerData;
	}
	
	public static String getCurrentTheme() {
		String toReturn = null;
		
		Config config = Main.getConfig();
		
		Theme theme = config.getCurrentTheme();
		Gson gson = new Gson();
        toReturn = gson.toJson(theme);
        
        return toReturn;
	}
	
	public static Theme JSONtoTheme(String input) {
		Gson gson = new Gson();
		Theme toReturn = null;
		try {
			toReturn = gson.fromJson(input, Theme.class);
		} catch (Throwable throwable) {
			System.out.println(throwable);
		}
		
		return toReturn;
	}
	
	public static void writeClipboard(String string) {
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(string),null);
	}
	
	public static String readClipboard() {
	    try {
			return (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (UnsupportedFlavorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static BufferedImage readImageFile(String filePath) {
		BufferedImage returnImage = null;
		try {
        	returnImage = ImageIO.read(new File(filePath));
        } catch(IOException e){
            System.out.println (e.toString());
            System.out.println("Could not find file: " + filePath);
        }
		return returnImage;
	}
	
	public static String[] getSkinNames() {
		File directory = new File("src/textures/skins");
		File[] listOfFiles = directory.listFiles();
		String[] fileNames = new String[listOfFiles.length];
		int files = 0;
		
		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
			    if (listOfFiles[i].getName().substring(listOfFiles[i].getName().length() - 4).toLowerCase().equals(".png")) {
				    try {
					    BufferedImage image = ImageIO.read(listOfFiles[i]);
					    if (image.getWidth() == 150 && image.getHeight() == 100) {
					    	// must be 150x100 to cache
						    fileNames[files] = listOfFiles[i].getName();
						    files++;
						    // System.out.println(fileNames[files - 1]);
					    }
				    } catch (IOException e) {
					    e.printStackTrace();
			  	  }
			    }
		    } else if (listOfFiles[i].isDirectory()) {
		    	// Do nothing, not useful. Only record images.
		    }
		}
		
		String[] finalNames = new String[files];
		System.arraycopy(fileNames, 0, finalNames, 0, files);
		return finalNames;
	}
	
	public static Level[] getLevelsList() {
		File directory = new File("src/levels"); // this is the top directory
		File[] listOfLevels = directory.listFiles(); // list of actual files in the directory
		Level[] levels = new Level[listOfLevels.length]; // list of file names in the directory
		int files = 0; // counts and indexes valid files
		
		for (int i = 0; i < listOfLevels.length; i++) {
			File currentLevel = listOfLevels[i];
		    if (currentLevel.isDirectory()) { // must be a dir to be a level
			    	String levelName = currentLevel.getName();
				    File[] listOfLevelFiles = listOfLevels[i].listFiles();
		    	if (listOfLevelFiles.length == 2) { // levels should only have a track and JSON data
				    boolean foundWav = false; // whether we have found the track for the level
				    Level levelData = null; // stores level's JSON data, if found
				    for (File file : listOfLevelFiles) {
					    String fileName = file.getName();
					    // System.out.println(fileName);
					    String[] fileNameSplit = fileName.split("\\.");
					    if (levelName.equals(fileNameSplit[0])){
					    	if (fileNameSplit[1].toLowerCase().equals("wav")) {
					    		foundWav = true;
					    	} else if (fileNameSplit[1].toLowerCase().equals("json")) {
					    		Gson gson = new Gson();
					    		try {
									levelData = gson.fromJson(new FileReader(file), Level.class);
								} catch (JsonSyntaxException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (JsonIOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (FileNotFoundException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
					    	}
					    }
				    }
				    if (foundWav && levelData != null) {
				    	
				    	levels[files] = levelData;
				    	files++;
				    }
		    	}
		  } else if (listOfLevels[i].isFile()) {
		  }
		}
		
		Level[] finalLevels = new Level[files];
		System.arraycopy(levels, 0, finalLevels, 0, files);
		return finalLevels;
	}
}
