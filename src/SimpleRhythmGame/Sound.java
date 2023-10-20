package SimpleRhythmGame;

import java.util.ArrayList;

public class Sound {
	private static final String[] sfxNames = {
			"HiHat1",
			"HiHat2",
			"SnareDrum1",
			"CrashCymbal1",
			"Tom1",
			"Tom2",
			"Tom3",
			"KickDrum1",
			"Metronome1",
			"Metronome2",
	};
	private static AudioPlayer[] sfx;
	public static final int[] SFX_hiHat1 = {0,0,0};
	public static final int[] SFX_hiHat2 = {1,0,1};
	public static final int[] SFX_snareDrum1 = {2,1,0};
	public static final int[] SFX_crashCymbal1 = {3,2,0};
	public static final int[] SFX_tom1 = {4,3,0};
	public static final int[] SFX_tom2 = {5,3,1};
	public static final int[] SFX_tom3 = {6,3,2};
	public static final int[] SFX_kickDrum1 = {7,4,0};
	public static final int[] SFX_metronome1 = {8,5,0};
	public static final int[] SFX_metronome2 = {9,5,1};
	private static final int[][] allNotesIndexes = 
				{SFX_hiHat1,
				SFX_hiHat2,
				SFX_snareDrum1,
				SFX_crashCymbal1,
				SFX_tom1,
				SFX_tom2,
				SFX_tom3,
				SFX_kickDrum1,
				SFX_metronome1,
				SFX_metronome2};
	
	private static int[][] getAllNotesIndexesOfType(int indexToMatch){
		ArrayList<int[]> indexes = new ArrayList<int[]>();;
		for (int[] currentIndex : allNotesIndexes) {
			if (currentIndex[1] == indexToMatch) {
				indexes.add(currentIndex);
			}
		}
		int[][] result = new int[indexes.size()][];
	    for (int i = 0; i < indexes.size(); i++) {
	        result[i] = indexes.get(i);
	    }
	    return result;
	}
	
	public static void initSFX(){
		sfx = new AudioPlayer[sfxNames.length];
		for (int i = 0 ; i < sfxNames.length ; i++) {
			String sfxName = sfxNames[i];
			AudioPlayer newPlayer = new AudioPlayer("/sfx/" + sfxName + ".wav");
			newPlayer.setVolume(ShowImage.getConfig().getFinalSFXVolume());
			sfx[i] = newPlayer;
		}
	}
	
	public static AudioPlayer[] sfx() {
		return sfx;
	}
	
	public static void updateVolume() {
		for (AudioPlayer audio : sfx) {
			audio.setVolume(ShowImage.getConfig().getFinalSFXVolume());
		}
	}
	
	public static void playSound(int index) {
		AudioPlayer soundToPlay = sfx[index];
		soundToPlay.setFramePosition(0);
		soundToPlay.getClip().start();;
	}
	
	public static void playRandomSoundOfType(int indexes) {
		int[][] allIndexesOfType = getAllNotesIndexesOfType(allNotesIndexes[indexes][1]);
		int noteToPlay = allIndexesOfType[(int) Math.floor(Math.random() * allIndexesOfType.length)][0];
		playSound(noteToPlay);
	}
	
	public static int getSoundIndex(int type, int subtype) {
		for (int[] index : allNotesIndexes) {
			if (index[1] == type && index[2] == subtype) {
				return index[0];
			}
		}
		return -1;
	}
}
