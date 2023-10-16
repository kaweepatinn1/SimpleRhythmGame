package SimpleRhythmGame;

public class Metronome extends Thread {
	public void run() {
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread().getPriority());
		Level level = ShowImage.getGame().getCurrentLevel();
		double levelStartTime = Framerate.getCurrentTime() + 2500;
		double timePerClick = 60000d / level.getBPM();
		
		int lastNotePlayed = (int) Math.floor((Framerate.getCurrentTime() - levelStartTime) / timePerClick);
		
		while (ShowImage.getState() == "Playing") {
			int currentNote = (int) Math.floor((Framerate.getCurrentTime() - levelStartTime) / timePerClick);
			if (currentNote > lastNotePlayed) {
				if ((lastNotePlayed % level.getTimeSignature()[0]) == (level.getTimeSignature()[0] - 1)) {
					Sound.playSound(Sound.SFX_metronome1[0]);
					lastNotePlayed = currentNote;
				} else {
					Sound.playSound(Sound.SFX_metronome2[0]);
					lastNotePlayed = currentNote;
				}
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
