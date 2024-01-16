package SimpleRhythmGame;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ClassToJSON extends FileIO {
	public static void tutorialOut() {
		String path = "./src/levels/beginning/beginning.json";
		Level toOut = new Level(
				"Beginning", // name
				"Kai_Tobashi", // author
				1, // version
				UUID.fromString("bf858823-58fe-4273-86b9-143f61ada1f6"), // UUID
				0d, // ms offset
				200, // ms metronome offset (200 here)
				75, // bpm
				1f, // pps
				29, // total time
				new int[] {4,4}, // time signature
				new Note[] {
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								1, // bar
								1, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								1, // bar
								2, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								1, // bar
								3, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								1, // bar
								4, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								2, // bar
								1, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								2, // bar
								2, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								2, // bar
								3, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								2, // bar
								4, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								3, // bar
								1, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								0, // note subtype
								3, // bar
								1, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								3, // bar
								2, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								0, // note subtype
								3, // bar
								2, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								3, // bar
								3, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								0, // note subtype
								3, // bar
								3, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								3, // bar
								4, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								0, // note subtype
								3, // bar
								4, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								4, // bar
								1, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								0, // note subtype
								4, // bar
								1, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								4, // bar
								2, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								0, // note subtype
								4, // bar
								2, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								4, // bar
								3, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								0, // note subtype
								4, // bar
								3, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								4, // bar
								4, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								0, // note subtype
								4, // bar
								4, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								5, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								5, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								5, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								5, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								5, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								5, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_CRASHCYMBAL, // note type
								0, // note subtype
								5, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								5, // bar
								3, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								0, // note subtype
								5, // bar
								3, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								5, // bar
								4, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								0, // note subtype
								5, // bar
								4, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								0, // note subtype
								6, // bar
								1, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								6, // bar
								1, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								6, // bar
								2, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								0, // note subtype
								6, // bar
								2, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								6, // bar
								3, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								0, // note subtype
								6, // bar
								3, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								6, // bar
								4, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								0, // note subtype
								6, // bar
								4, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								7, // bar
								1, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								7, // bar
								1, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								7, // bar
								2, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								0, // note subtype
								7, // bar
								2, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								7, // bar
								3, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								0, // note subtype
								7, // bar
								3, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								7, // bar
								4, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								0, // note subtype
								7, // bar
								4, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								0, // note subtype
								8, // bar
								1, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								8, // bar
								1, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								8, // bar
								2, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								0, // note subtype
								8, // bar
								2, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								8, // bar
								3, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								0, // note subtype
								8, // bar
								3, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								8, // bar
								4, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								0, // note subtype
								8, // bar
								4, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								9, // bar
								1, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								9, // bar
								1, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								9, // bar
								2, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								0, // note subtype
								9, // bar
								2, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								9, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								9, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								9, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								9, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								9, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								9, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_CRASHCYMBAL, // note type
								0, // note subtype
								9, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
				} // notes
				);
		try (PrintWriter out = new PrintWriter(new FileWriter(path))) {
	        Gson gson = new GsonBuilder().setPrettyPrinting().create();
	        String jsonString = gson.toJson(toOut);
	        out.write(jsonString);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public static void indieLevelOut() {
		String path = "./src/levels/a new day/a new day.json";
		Level toOut = new Level(
				"A New Day", // name
				"Kai_Tobashi", // author
				1, // version
				UUID.fromString("53affdf8-a1c2-48f2-8514-adf7dc8c0690"), // UUID
				-20d, // ms offset
				620, // ms metronome offset
				180, // bpm
				1f, // pps
				117, // total time
				new int[] {4,4}, // time signature
				new Note[] {
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								1, // bar
								1, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								1, // bar
								2, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								1, // bar
								3, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								1, // bar
								4, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								2, // bar
								1, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								2, // bar
								2, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								2, // bar
								3, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								2, // bar
								4, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								3, // bar
								1, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								3, // bar
								2, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								3, // bar
								3, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								3, // bar
								4, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								4, // bar
								1, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								4, // bar
								2, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								4, // bar
								3, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								4, // bar
								4, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								5, // bar
								1, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								5, // bar
								2, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								5, // bar
								3, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								5, // bar
								4, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								6, // bar
								1, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								6, // bar
								2, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								6, // bar
								3, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								6, // bar
								4, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								7, // bar
								1, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								7, // bar
								2, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								7, // bar
								3, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								7, // bar
								4, // beat
								new int[] {0,0}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								8, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								8, // bar
								1, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								8, // bar
								2, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								8, // bar
								2, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								8, // bar
								3, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								8, // bar
								3, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_CRASHCYMBAL, // note type
								0, // note subtype
								8, // bar
								4, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								9, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								9, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								9, // bar
								2, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								9, // bar
								2, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								9, // bar
								3, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								9, // bar
								3, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								9, // bar
								3, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								9, // bar
								4, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								9, // bar
								4, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								10, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								10, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								10, // bar
								2, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								10, // bar
								2, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								10, // bar
								3, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								10, // bar
								3, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								10, // bar
								3, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								10, // bar
								4, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								10, // bar
								4, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								11, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								11, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								11, // bar
								2, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								11, // bar
								2, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								11, // bar
								3, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								11, // bar
								3, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								11, // bar
								3, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								11, // bar
								4, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								11, // bar
								4, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								12, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								12, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								12, // bar
								2, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								12, // bar
								2, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_MEDIUM, // note subtype
								12, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_MEDIUM, // note subtype
								12, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_MEDIUM, // note subtype
								12, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_LOW, // note subtype
								12, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_LOW, // note subtype
								12, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_LOW, // note subtype
								12, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								12, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								13, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								13, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								13, // bar
								2, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								13, // bar
								2, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								13, // bar
								3, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								13, // bar
								3, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								13, // bar
								3, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								13, // bar
								4, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								13, // bar
								4, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								14, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								14, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								14, // bar
								2, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								14, // bar
								2, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								14, // bar
								3, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								14, // bar
								3, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								14, // bar
								3, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								14, // bar
								4, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								14, // bar
								4, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								15, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								15, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								15, // bar
								2, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								15, // bar
								2, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								15, // bar
								3, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								15, // bar
								3, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								15, // bar
								3, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								15, // bar
								4, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								15, // bar
								4, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								16, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								16, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								16, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								16, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_LOW, // note subtype
								16, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_LOW, // note subtype
								16, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								16, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								16, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_LOW, // note subtype
								16, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_LOW, // note subtype
								16, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								16, // bar
								4, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								17, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								17, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								17, // bar
								2, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								17, // bar
								2, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								17, // bar
								3, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								17, // bar
								3, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								17, // bar
								3, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								17, // bar
								4, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								17, // bar
								4, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								18, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								18, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								18, // bar
								2, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								18, // bar
								2, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								18, // bar
								3, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								18, // bar
								3, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								18, // bar
								3, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								18, // bar
								4, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								18, // bar
								4, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								19, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								19, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								19, // bar
								2, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								19, // bar
								2, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								19, // bar
								3, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								19, // bar
								3, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								19, // bar
								3, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								19, // bar
								4, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								19, // bar
								4, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								20, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								20, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								20, // bar
								2, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								20, // bar
								2, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								20, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								20, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								20, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								20, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								20, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								21, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								21, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								21, // bar
								2, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								21, // bar
								2, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								21, // bar
								3, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								21, // bar
								3, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								21, // bar
								3, // beat
								new int[] {1,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								21, // bar
								4, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								21, // bar
								4, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								22, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								22, // bar
								1, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								22, // bar
								2, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								22, // bar
								2, // beat
								new int[] {0,2}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								22, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								22, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								22, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								22, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								22, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								22, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								22, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								22, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_CRASHCYMBAL, // note type
								0, // note subtype
								23, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								23, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								23, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								23, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								23, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								23, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_CRASHCYMBAL, // note type
								0, // note subtype
								23, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								23, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								23, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								23, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								23, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								23, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_CRASHCYMBAL, // note type
								0, // note subtype
								23, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								23, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								25, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								25, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								25, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								25, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								25, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								25, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								25, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								25, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								25, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								26, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								26, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								26, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								26, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								26, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								26, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								26, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								26, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								26, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								27, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								27, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								27, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								27, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								27, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								27, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								27, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								27, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								27, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								28, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								28, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								28, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								28, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								28, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								28, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								28, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								28, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								28, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								29, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								29, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								29, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								29, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								29, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								29, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								29, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								29, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								29, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								30, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								30, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								30, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								30, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								30, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								30, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								30, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								30, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								30, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								31, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								31, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								31, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								31, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								31, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								31, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								31, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								31, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								31, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								32, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								32, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								32, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								32, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								32, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_MEDIUM, // note subtype
								32, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_MEDIUM, // note subtype
								32, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_LOW, // note subtype
								32, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_LOW, // note subtype
								32, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_CRASHCYMBAL, // note type
								0, // note subtype
								32, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								33, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								33, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								33, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								33, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								33, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								33, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								33, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								33, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								33, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								34, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								34, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								34, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								34, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								34, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								34, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								34, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								34, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								34, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								35, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								35, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								35, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								35, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								35, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								35, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								35, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								35, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								35, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								36, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								36, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								36, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								36, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								36, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								36, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								36, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								36, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								36, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								37, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								37, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								37, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								37, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								37, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								37, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								37, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								37, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								37, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								38, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								38, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								38, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								38, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								38, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								38, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								38, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								38, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								38, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								39, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								39, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								39, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								39, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								39, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								39, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								39, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								39, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								39, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								40, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								40, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								40, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								40, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								40, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								40, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								40, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								40, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								40, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								40, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_CRASHCYMBAL, // note type
								0, // note subtype
								40, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								41, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								41, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								41, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								41, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								41, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								41, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								41, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								41, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								41, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								42, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								42, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								42, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								42, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								42, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								42, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								42, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								42, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								42, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								43, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								43, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								43, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								43, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								43, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								43, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								43, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								43, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								43, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								44, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								44, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								44, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								44, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								44, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								44, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								44, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								44, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								44, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								45, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								45, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								45, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								45, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								45, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								45, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								45, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								45, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								45, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								46, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								46, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								46, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								46, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								46, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								46, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								46, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								46, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								46, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								47, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								47, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								47, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								47, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								47, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								47, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								47, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								47, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								47, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								48, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								48, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_MEDIUM, // note subtype
								48, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								48, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_MEDIUM, // note subtype
								48, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								48, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_MEDIUM, // note subtype
								48, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								48, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_MEDIUM, // note subtype
								48, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								48, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_MEDIUM, // note subtype
								48, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								48, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_MEDIUM, // note subtype
								48, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								48, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								49, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								49, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								49, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								49, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								49, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								49, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								50, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								50, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								50, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								50, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								50, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								50, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								51, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								51, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								51, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								51, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								51, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								51, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								52, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_HIGH, // note subtype
								52, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_HIGH, // note subtype
								52, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_MEDIUM, // note subtype
								52, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_MEDIUM, // note subtype
								52, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_LOW, // note subtype
								52, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_LOW, // note subtype
								52, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_LOW, // note subtype
								52, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_LOW, // note subtype
								52, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								52, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								52, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								52, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								52, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								52, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								52, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_CRASHCYMBAL, // note type
								0, // note subtype
								52, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								53, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								53, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								53, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								53, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								53, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								53, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								54, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								54, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								54, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								54, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								54, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								54, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								55, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								55, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								55, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								55, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								55, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								55, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								55, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								55, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								55, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								55, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								56, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								56, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								56, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								56, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								56, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								56, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								56, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								56, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								56, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								56, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								56, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								56, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								56, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								56, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								56, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_CRASHCYMBAL, // note type
								0, // note subtype
								56, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								57, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								57, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								57, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								57, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								57, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								57, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								57, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								57, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								57, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								58, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								58, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								58, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								58, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								58, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								58, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								58, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								58, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								58, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								59, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								59, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								59, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								59, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								59, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								59, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								59, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								59, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								59, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								60, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								60, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								60, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								60, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_MEDIUM, // note subtype
								60, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_MEDIUM, // note subtype
								60, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_MEDIUM, // note subtype
								60, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_LOW, // note subtype
								60, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_LOW, // note subtype
								60, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_LOW, // note subtype
								60, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_CRASHCYMBAL, // note type
								0, // note subtype
								60, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								61, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								61, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								61, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								61, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								61, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								61, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								61, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								61, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								61, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								62, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								62, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								62, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								62, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								62, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								62, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								62, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								62, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								62, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								63, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								63, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								63, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								63, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								63, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								63, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								63, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								63, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								63, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								64, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								64, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								64, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								64, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_LOW, // note subtype
								64, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_LOW, // note subtype
								64, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								64, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								64, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_LOW, // note subtype
								64, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_LOW, // note subtype
								64, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_CRASHCYMBAL, // note type
								0, // note subtype
								64, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								65, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								65, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								65, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								65, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								65, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								65, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								65, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								65, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								65, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								65, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								65, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								65, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								66, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								66, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								66, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								66, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								66, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								66, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								66, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								66, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								66, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								66, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								66, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								66, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								67, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								67, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								67, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								67, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								67, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								67, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								67, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								67, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								67, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								67, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								67, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								67, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								68, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								68, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								68, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								68, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								68, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								68, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								68, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								68, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_HIGH, // note subtype
								68, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								68, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_HIGH, // note subtype
								68, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								68, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								68, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_HIGH, // note subtype
								68, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								69, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								69, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								69, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								69, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								69, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								69, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								69, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								69, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								69, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								69, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								69, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								69, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								70, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								70, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								70, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								70, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								70, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								70, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								70, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								70, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								70, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								70, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								70, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								70, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_CRASHCYMBAL, // note type
								0, // note subtype
								71, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								71, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								71, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								71, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								71, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								71, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_CRASHCYMBAL, // note type
								0, // note subtype
								71, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								71, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								71, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								71, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								71, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								71, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_CRASHCYMBAL, // note type
								0, // note subtype
								71, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								71, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_HIGH, // note subtype
								72, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_HIGH, // note subtype
								72, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_HIGH, // note subtype
								72, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_HIGH, // note subtype
								72, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_MEDIUM, // note subtype
								72, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_MEDIUM, // note subtype
								72, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_MEDIUM, // note subtype
								72, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_MEDIUM, // note subtype
								72, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_CRASHCYMBAL, // note type
								0, // note subtype
								72, // bar
								4, // beat
								new int[] {4,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								73, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								73, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								73, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								73, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								73, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								73, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								73, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								73, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								73, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								74, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								74, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								74, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								74, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								74, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								74, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								74, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								74, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								74, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								75, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								75, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								75, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								75, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								75, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								75, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								75, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								75, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								75, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								76, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								76, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								76, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								76, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								76, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								76, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								76, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								76, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								76, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								77, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								77, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								77, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								77, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								77, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								77, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								77, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								77, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								77, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								78, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								78, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								78, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								78, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								78, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								78, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								78, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								78, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								78, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								79, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								79, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								79, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								79, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								79, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								79, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								79, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								79, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								79, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								80, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								80, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								80, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								80, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_LOW, // note subtype
								80, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_LOW, // note subtype
								80, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								80, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								80, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_LOW, // note subtype
								80, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_LOW, // note subtype
								80, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_CRASHCYMBAL, // note type
								0, // note subtype
								80, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								81, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								81, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								81, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								81, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								81, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								81, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								81, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								81, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								81, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								82, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								82, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								82, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								82, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								82, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								82, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								82, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								82, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								82, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								83, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								83, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								83, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								83, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								83, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								83, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								83, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								83, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								83, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								84, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								84, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								84, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								84, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								84, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								84, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								84, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								84, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								84, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								85, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								85, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								85, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								85, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								85, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								85, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								85, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								85, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								85, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								86, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								86, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								86, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								86, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								86, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								86, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								86, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								86, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								86, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								86, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								86, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								86, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_CRASHCYMBAL, // note type
								0, // note subtype
								87, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								87, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								87, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								87, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								87, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								87, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_CRASHCYMBAL, // note type
								0, // note subtype
								87, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								87, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								87, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								87, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								87, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								87, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_CRASHCYMBAL, // note type
								0, // note subtype
								87, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_OPEN, // note subtype
								87, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
				} // notes
				);
		try (PrintWriter out = new PrintWriter(new FileWriter(path))) {
	        Gson gson = new GsonBuilder().setPrettyPrinting().create();
	        String jsonString = gson.toJson(toOut);
	        out.write(jsonString);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public static void jPopOut() {
		String path = "./src/levels/evening tea/evening tea.json";
		Level toOut = new Level(
				"Evening Tea", // name
				"Kai_Tobashi", // author
				1, // version
				UUID.fromString("ca25c1d6-321c-420a-bcd1-3a1642c48957"), // UUID
				0d, // ms offset
				480, // ms metronome offset
				120, // bpm
				1f, // pps
				155, // total time
				new int[] {4,4}, // time signature
				new Note[] {
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								4, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								4, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								4, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								4, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								5, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								5, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								5, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								5, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								5, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								5, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								6, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								6, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								6, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								6, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								6, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								6, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								7, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								7, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								7, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								7, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								7, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								7, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								7, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								7, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								7, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								7, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								8, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								8, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								8, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								8, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								8, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								8, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								8, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								8, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								8, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								8, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								9, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								9, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								9, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								9, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								9, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								9, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								10, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								10, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								10, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								10, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								10, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								10, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								11, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								11, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								11, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								11, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								11, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								11, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								11, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								11, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								12, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								12, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								12, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								12, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								12, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								12, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								12, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								12, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								13, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								13, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								13, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								13, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								13, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								13, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								14, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								14, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								14, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								14, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								14, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								14, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								15, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								15, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								15, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								15, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								15, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								15, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								15, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								15, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								16, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								16, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								16, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								16, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								16, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								16, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								16, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								16, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								17, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								17, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								17, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								17, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								17, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								17, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								18, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								18, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								18, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								18, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								18, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								18, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								19, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								19, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								19, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								19, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								19, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								19, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								20, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								20, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								20, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								20, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								20, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								20, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								21, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								21, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								21, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								21, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								21, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								21, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								21, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								21, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								21, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								21, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								21, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								21, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								21, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								21, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								21, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								21, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								21, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								21, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								21, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								22, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								22, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								22, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								22, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								22, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								22, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								22, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								22, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								22, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								22, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								22, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								22, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								22, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								22, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								22, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								22, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								22, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								22, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								23, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								23, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								23, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								23, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								23, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								23, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								23, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								23, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								23, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								23, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								23, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								23, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								23, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								23, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								23, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								23, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								23, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								23, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								24, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								24, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								24, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								24, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								24, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								24, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								24, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								24, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								24, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								24, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								24, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								24, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								24, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								24, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								24, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								24, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								24, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								24, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								24, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								24, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								24, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								25, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								25, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								25, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								25, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								25, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								25, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								25, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								25, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								25, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								25, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								25, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								25, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								25, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								25, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								25, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								25, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								25, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								25, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								26, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								26, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								26, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								26, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								26, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								26, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								26, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								26, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								26, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								26, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								26, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								26, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								26, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								26, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								26, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								26, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								26, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								26, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								27, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								27, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								27, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								27, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								27, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								27, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								27, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								27, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								27, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								27, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								27, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								27, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								27, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								27, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								27, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								27, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								27, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								27, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								27, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								27, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								27, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								27, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								28, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								28, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								28, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								28, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								28, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								28, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								28, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								28, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								28, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								28, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								28, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								28, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								28, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								28, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_MEDIUM, // note subtype
								28, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								28, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								28, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								28, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_MEDIUM, // note subtype
								28, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								28, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								28, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								28, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								29, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								29, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								29, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								29, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								29, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								29, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								29, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								29, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								29, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								29, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								29, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								29, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								29, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								29, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								29, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								29, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								29, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								29, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								30, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								30, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								30, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								30, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								30, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								30, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								30, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								30, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								30, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								30, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								30, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								30, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								30, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								30, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								30, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								30, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								30, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								30, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								31, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								31, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								31, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								31, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								31, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								31, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								31, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								31, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								31, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								31, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								31, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								31, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								31, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								31, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								31, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								31, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								31, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								31, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								32, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								32, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								32, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								32, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								32, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								32, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								32, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								32, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								32, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								32, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								32, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								32, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								32, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								32, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								32, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								32, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								32, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								32, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								32, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								32, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								32, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								32, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								33, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								33, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								33, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								33, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								33, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								33, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								33, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								33, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								33, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								33, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								33, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								33, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								33, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								33, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								33, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								33, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								33, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								33, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								34, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								34, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								34, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								34, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								34, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								34, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								34, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								34, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								34, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								34, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								34, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								34, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								34, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								34, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								34, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								34, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								34, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								34, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								35, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								35, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								35, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								35, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								35, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								35, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								35, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								35, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								35, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								35, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								35, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								35, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								35, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								35, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								35, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								35, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								35, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								35, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								35, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								35, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								35, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								35, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								36, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								36, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								36, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								36, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								36, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								36, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								36, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								36, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								36, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								36, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								36, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								36, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								36, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								36, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_MEDIUM, // note subtype
								36, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								36, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								36, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								36, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_MEDIUM, // note subtype
								36, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								36, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								36, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								36, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								37, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								37, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								37, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								37, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								37, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								37, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								38, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								38, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								38, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								38, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								38, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								38, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								39, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								39, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								39, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								39, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								39, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								39, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								39, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								39, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								40, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								40, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								40, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								40, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								40, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								40, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								40, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								40, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								40, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								40, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								41, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								41, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								41, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								41, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								41, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								41, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								42, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								42, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								42, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								42, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								42, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								42, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								43, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								43, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								43, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								43, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								43, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								43, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								43, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								43, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								44, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								44, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								44, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								44, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								44, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								44, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								44, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								44, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								44, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								44, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								45, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								45, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								45, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								45, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								45, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								45, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								45, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								45, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								45, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								45, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								45, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								45, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								45, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								45, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								46, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								46, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								46, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								46, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								46, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								46, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								46, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								46, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								46, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								46, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								46, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								46, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								46, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								46, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								46, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								47, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								47, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								47, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								47, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								47, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								47, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								47, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								47, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								47, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								47, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								47, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								47, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								47, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								47, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								47, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								47, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								48, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								48, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								48, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								48, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								48, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								48, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								48, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								48, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								48, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								48, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								48, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								48, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								48, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								48, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								48, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								48, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								48, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								48, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								48, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								49, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								49, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								49, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								49, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								49, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								49, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								49, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								49, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								49, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								49, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								49, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								49, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								49, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								49, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								50, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								50, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								50, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								50, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								50, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								50, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								50, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								50, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								50, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								50, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								50, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								50, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								50, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								50, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								50, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								51, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								51, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								51, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								51, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								51, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								51, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								51, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								51, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								51, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								51, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								51, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								51, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								51, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								51, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								52, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								52, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								52, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								52, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								52, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								52, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								52, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								52, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								52, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								52, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								52, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								52, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								52, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								52, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								52, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								58, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								58, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								58, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								58, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								59, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								59, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								59, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								59, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								59, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								59, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								60, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								60, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								60, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								60, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								61, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								61, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								61, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								61, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								61, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								61, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								61, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								61, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								61, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								61, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								61, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								61, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								63, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								63, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								63, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								63, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								63, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								63, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								63, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								63, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								63, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								63, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								63, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								63, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								63, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								63, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								63, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								63, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								63, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								63, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								63, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								64, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								64, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								64, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								64, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								64, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								64, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								64, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								64, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								64, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								64, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								64, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								64, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								64, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								64, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								64, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								64, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								64, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								64, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								65, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								65, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								65, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								65, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								65, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								65, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								65, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								65, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								65, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								65, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								65, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								65, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								65, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								65, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								65, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								65, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								65, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								65, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								65, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								65, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								65, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								65, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								66, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								66, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								66, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								66, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								66, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								66, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								66, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								66, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								66, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								66, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								66, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								66, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								66, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								66, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								66, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								66, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								66, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								66, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								67, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								67, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								67, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								67, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								67, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								67, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								67, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								67, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								67, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								67, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								67, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								67, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								67, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								67, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								67, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								67, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								67, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								67, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								68, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								68, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								68, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								68, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								68, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								68, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								68, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								68, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								68, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								68, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								68, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								68, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								68, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								68, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								68, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								68, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								68, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								68, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								68, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								68, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								68, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								68, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								69, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								69, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								69, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								69, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								69, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								69, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								69, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								69, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								69, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								69, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								69, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								69, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								69, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								69, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_MEDIUM, // note subtype
								69, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								69, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								69, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								69, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_MEDIUM, // note subtype
								69, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								69, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								69, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								69, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								70, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								70, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								70, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								70, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								70, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								70, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								70, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								70, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								70, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								70, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								70, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								70, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								70, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								70, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								70, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								70, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								70, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								70, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								71, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								71, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								71, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								71, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								71, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								71, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								71, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								71, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								71, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								71, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								71, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								71, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								71, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								71, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								71, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								71, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								71, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								71, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								72, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								72, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								72, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								72, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								72, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								72, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								72, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								72, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								72, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								72, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								72, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								72, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								72, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								72, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								72, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								72, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								72, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								72, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								73, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								73, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								73, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								73, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								73, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								73, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								73, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								73, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								73, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								73, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								73, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								73, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								73, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								73, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								73, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								73, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								73, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								73, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								73, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								73, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								73, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								73, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								74, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								74, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								74, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								74, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								74, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								74, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								74, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								74, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								74, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								74, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								74, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								74, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								74, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								74, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								74, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								74, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								74, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								74, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								75, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								75, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								75, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								75, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								75, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								75, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								75, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								75, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								75, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								75, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								75, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								75, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								75, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								75, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								75, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								75, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								75, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								75, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								76, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								76, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								76, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								76, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								76, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								76, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								76, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								76, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								76, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								76, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								76, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								76, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								76, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								76, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								76, // bar
								3, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								76, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								76, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								76, // bar
								4, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								76, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								76, // bar
								4, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								76, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								76, // bar
								4, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								77, // bar
								1, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								77, // bar
								1, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								77, // bar
								1, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								77, // bar
								1, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								77, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								77, // bar
								2, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								77, // bar
								2, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								77, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								77, // bar
								2, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								77, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_SNAREDRUM, // note type
								0, // note subtype
								77, // bar
								2, // beat
								new int[] {3,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_KICKDRUM, // note type
								0, // note subtype
								77, // bar
								3, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_HIHAT, // note type
								Note.HiHat_CLOSED, // note subtype
								77, // bar
								3, // beat
								new int[] {1,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_MEDIUM, // note subtype
								77, // bar
								3, // beat
								new int[] {2,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
						new Note(
								Note.Note_TOM, // note type
								Note.Tom_MEDIUM, // note subtype
								77, // bar
								4, // beat
								new int[] {0,4}, // subbeat
								1f, // speed
								0 // ms offset
								),
				} // notes
				);
		try (PrintWriter out = new PrintWriter(new FileWriter(path))) {
	        Gson gson = new GsonBuilder().setPrettyPrinting().create();
	        String jsonString = gson.toJson(toOut);
	        out.write(jsonString);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
