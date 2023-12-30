package SimpleRhythmGame;

import java.io.FileWriter;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ClassToJSON extends FileIO {
	public static void levelOut() {
		String path = "./leveloutDEBUG.json";
		Level toOut = new Level(
				"Tutorial", // name
				"nano", // author
				0d, // ms offset
				200, // ms metronome offset (200 here)
				75, // bpm
				1f, // pps
				10, // total time
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
	        System.out.println("hi");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		levelOut();
	}

}
