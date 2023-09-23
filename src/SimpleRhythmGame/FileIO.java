package SimpleRhythmGame;

import java.io.FileWriter;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder; 

public class FileIO {
	public static void currentConfigOut() {
		String path = "./options.json";
		try (PrintWriter out = new PrintWriter(new FileWriter(path))) {
	        Gson gson = new GsonBuilder().setPrettyPrinting().create();
	        String jsonString = gson.toJson(ShowImage.getConfig());
	        out.write(jsonString);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public static void currentConfigIn() {
		
	}
	
	public static void resetConfigOut() {
		
	}
	
}
