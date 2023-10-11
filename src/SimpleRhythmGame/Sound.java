package SimpleRhythmGame;

public class Sound {
	private static final String[] sfxNames = {
//			"Hit",
//			"Miss",
//			"HiHat",
//			"SnareDrum",
//			"CrashCymbal",
//			"HighTom",
//			"MediumTom",
//			"FloorTom",
//			"RideCymbal"
	};
	private static AudioPlayer[] sfx;
	public static final int SFX_hit = 0;
	public static final int SFX_miss = 1;
	public static final int SFX_hiHat = 2;
	public static final int SFX_snareDrum = 3;
	public static final int SFX_crashCymbal = 4;
	public static final int SFX_highTom = 5;
	public static final int SFX_mediumTom = 6;
	public static final int SFX_floorTom = 7;
	public static final int SFX_rideCymbal = 8;
	
	public static void initSFX(){
		sfx = new AudioPlayer[sfxNames.length];
		for (int i = 0 ; i < sfxNames.length ; i++) {
			String sfxName = sfxNames[i];
			AudioPlayer newPlayer = new AudioPlayer("/sfx/" + sfxName + ".wav");
			newPlayer.setVolume(ShowImage.getConfig().getFinalSFXVolume());
			sfx[i] = newPlayer;
		}
	}
	
	public static void updateVolume() {
		for (AudioPlayer audio : sfx) {
			audio.setVolume(ShowImage.getConfig().getFinalSFXVolume());
		}
	}
	
	public static void playSound(int index) {
		AudioPlayer soundToPlay = new AudioPlayer(sfx[index]);
		soundToPlay.play();
	}
}
