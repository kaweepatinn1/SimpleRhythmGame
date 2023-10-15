package SimpleRhythmGame;

public class Metronome extends Thread {
	public void run() {
		Level level = ShowImage.getGame().getCurrentLevel();
		try {
			Thread.sleep((long) level.getMetronomeOffset());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double timePerClick = 60000d / level.getBPM();
		try {
			Thread.sleep((long) (2300 % timePerClick));
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double extraDelay = (2500 % timePerClick) % 1;
		int hardNote = ((int) (2500 - level.getMetronomeOffset()/ timePerClick) % level.getTimeSignature()[0]);
		while (ShowImage.getState() == "Playing") {
			if (hardNote == 0) {
				Sound.playSound(Sound.SFX_metronome1[0]);
				hardNote = level.getTimeSignature()[0] - 1;
			} else {
				Sound.playSound(Sound.SFX_metronome2[0]);
				hardNote--;
			}
			try {
				Thread.sleep((long) timePerClick);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			extraDelay = extraDelay + (timePerClick % 1);
			if (extraDelay > 1) {
				try {
					Thread.sleep((long) extraDelay);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				extraDelay = extraDelay % 1;
			}
		}
	}
}
