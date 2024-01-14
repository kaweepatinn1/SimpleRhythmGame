package SimpleRhythmGame;

public class Metronome extends Thread {
	public void run() {
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread().getPriority());
		Level level = Main.getGame().getCurrentLevel();
		double levelStartTime = Framerate.getCurrentTime() + 2500 + level.getMetronomeOffset() - (1000 * Game.getDebugStartTime());
		double timePerClick = 60000d / level.getBPM();
		
		int lastNotePlayed = (int) Math.floor((Framerate.getCurrentTime() - levelStartTime) / timePerClick);
		// System.out.println(Main.getState());
		int timeSignatureDiv = level.getTimeSignature()[0];
		while (!Main.getState().equals("Stopped")) {
			// System.out.println(Main.getState());
			if (Main.getState().equals("Playing")) {
				int currentNote = (int) Math.floor((Framerate.getCurrentTime() - levelStartTime) / timePerClick);
				
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
