package SimpleRhythmGame;

public class Metronome extends Thread {
	public void run() {
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread().getPriority());
		Level level = ShowImage.getGame().getCurrentLevel();
		double levelStartTime = Framerate.getCurrentTime() + 2500 + level.getMetronomeOffset();
		double timePerClick = 60000d / level.getBPM();
		
		int lastNotePlayed = (int) Math.floor((Framerate.getCurrentTime() - levelStartTime) / timePerClick);
		System.out.println(ShowImage.getState());
		int timeSignatureDiv = level.getTimeSignature()[0];
		while (!ShowImage.getState().equals("Stopped")) {
			if (ShowImage.getState().equals("Playing")) {
				int currentNote = (int) Math.floor((Framerate.getCurrentTime() + 50 - levelStartTime) / timePerClick);
				// 50ms delay is to account for the processing and play delay of the sfx.
				if (currentNote > lastNotePlayed) {
					if (((lastNotePlayed % timeSignatureDiv) + timeSignatureDiv) % timeSignatureDiv == 0) {
						Sound.playSound(Sound.SFX_metronome1[0]);
						lastNotePlayed = currentNote;
					} else {
						Sound.playSound(Sound.SFX_metronome2[0]);
						lastNotePlayed = currentNote;
					}
				}
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
