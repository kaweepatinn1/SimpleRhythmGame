package SimpleRhythmGame;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException; 

public class FileIO {
	public static void currentConfigOut(Config config) {
		String path = "./options.json";
		try (PrintWriter out = new PrintWriter(new FileWriter(path))) {
	        Gson gson = new GsonBuilder().setPrettyPrinting().create();
	        String jsonString = gson.toJson(config);
	        out.write(jsonString);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public static Config currentConfigIn() throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		Gson gson = new Gson();
		Config config = gson.fromJson(new FileReader("./options.json"), Config.class);
		config.setIntToColors(); 
		// since colors are a transient property they are 
		// written to config after reading from json.
		
		// VALIDATE CONFIG
		boolean controlsValid = true;
		
		if (config.getControls() != null) {
			if (config.getControls() instanceof Controls[]) {
				Controls[] controls = config.getControls();
				Controls[] defaultControls = DefaultValues.getDefaultControls();
				for (int i = 0 ; i < controls.length ; i++) {
					
					if (!(controls[i].getOriginalKeyCode() == defaultControls[i].getOriginalKeyCode()
							&& controls[i].getFunction().equals(defaultControls[i].getFunction()))) {
						
						System.out.println("Validated control setting for " + defaultControls[i].getFunction() + " ");
						controls[i] = defaultControls[i]; // validate the config
					
					}
				}
			} else {
				controlsValid = false;
			}
		} else {
			controlsValid = false;
		}
		
		if (!controlsValid) {
			config.setControls(DefaultValues.getDefaultControls());
			System.out.println("RESET INVALID CONTROLS");
		}
		
		boolean colorsValid = true;
		
		if (config.getColors() != null){
			if (config.getColors() instanceof Color[]) {
				Color[] colors = config.getColors();
				
				if (colors.length == Config.getColorsLenth()) {
					for (Color color : colors) {
						if (!(color.getRed() >= 0 && color.getRed() <= 255)) {
							colorsValid = false;
							break;
						} else if (!(color.getBlue() >= 0 && color.getBlue() <= 255)) {
							colorsValid = false;
							break;
						} else if (!(color.getGreen() >= 0 && color.getGreen() <= 255)) {
							colorsValid = false;
							break;
						} else if (!(color.getAlpha() >= 0 && color.getAlpha() <= 255)) {
							colorsValid = false;
							break;
						}
					}
				} else {
					colorsValid = false;
				}
			} else {
				colorsValid = false;
			}
		} else {
			colorsValid = false;
		}

		if (!colorsValid) {
			config.setColors(DefaultValues.getDefaultColors());
			System.out.println("RESET INVALID COLORS");
		}
		
		boolean menusValid = true;
		
		if (config.getMenus() != null){
			if (config.getMenus() instanceof Menu[]) {
				// All that needs to be verified
			} else {
				menusValid = false;
			}
		} else {
			menusValid = false;
		}
		
		if (!menusValid) {
			config.setMenus(DefaultValues.getAllDefaultMenus());
			System.out.println("RESET INVALID MENUS");
		}
		
		currentConfigOut(config);
		return config;
	}
}
