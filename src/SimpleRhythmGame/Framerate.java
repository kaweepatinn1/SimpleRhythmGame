package SimpleRhythmGame;

import java.util.Arrays;

public class Framerate extends Thread {
	private static int framerate;
	private static int framesToStore;
	private static double[] frameTimeStoreMillis;
	private static double lastFrameTimeMillis;
	
	private static boolean limitFramerate;
	
	private int currentFramerate;
	/*
	private static double[] frameTimeStoreNanos;
	private static double lastFrameTimeNanos;
	private static boolean nanoSecondPrecision; 
	*/

	// milliseconds allows up to limiting to 1000fps, while nanoseconds can allow limiting up to 1 million fps.
	// However, nanoseconds takes almost a hundred times longer to call by the cpu and can actually worsen fps.
	
	// UPDATE: archived nanoseconds as it takes too long to call.
	
	public Framerate(){
		setFramesToStore(50);
		framerate = 60;
		// May not be precise. 
		// Real framerate value is actually: (1000 / Math.ceil((1000 / framerate)))
		// Consider adding a ms per frame option instead.
		limitFramerate = true;
		// limitFramerate will limit the framerate to one frame per ms (1000fps)
		
		// setNanoPrecision(false);
	}
	
	public void run() { // game render loop
		while(true) {
			// Thread Runnable
			// Millisecond precision
			double milliTime = System.currentTimeMillis();
			double currentFrameTime =  milliTime - lastFrameTimeMillis;
			// System.out.println(milliTime);
			if (currentFrameTime >= 1000d / (double) framerate || !limitFramerate) { // if we've waited long enough for the frame
				// System.out.println(currentFrameTime);
				for (int i = 0 ; i < framesToStore - 1 ; i++) {
					frameTimeStoreMillis[i + 1] = frameTimeStoreMillis[i];
				}
				frameTimeStoreMillis[0] = currentFrameTime;
				
				int totalFrames = 0;
				double totalFramesTime = 0;
				for (int i = 0 ; i < framesToStore ; i++) {
					if (frameTimeStoreMillis[i] >= 0) {
						totalFrames++;
						totalFramesTime += frameTimeStoreMillis[i];
					}
				}
				totalFramesTime = Math.max((totalFramesTime / 1000), 0.001);
				// System.out.println("frames recorded: " + totalFrames);
				// System.out.println("totaltime: " + totalFramesTime);
				currentFramerate = (int) Math.round(totalFrames / totalFramesTime);
				// System.out.println("framerate: " + currentFramerate);
				 
				lastFrameTimeMillis = milliTime;
				
				ShowImage.updateFrame();
			} else {
				// Does not render frame if the wait has not been long enough
			} 
			/*
			else {
				// Nanosecond precision
				double nanoTime = System.nanoTime();
				double currentFrameTime = nanoTime - lastFrameTimeNanos;
				// System.out.println(nanoTime);
				if (currentFrameTime >= 1000000d / (double) framerate) { // if we've waited long enough for the frame
					lastFrameTimeNanos = nanoTime;
					// System.out.println(currentFrameTime);
					ShowImage.repaintPanel();
					for (int i = 0 ; i < framesToStore - 1 ; i++) {
						frameTimeStoreNanos[i+1] = frameTimeStoreNanos[i];
					}
					frameTimeStoreNanos[0] = currentFrameTime;
					
					int totalFrames = 0;
					double totalFramesTime = 0;
					for (int i = 0 ; i < framesToStore ; i++) {
						if (frameTimeStoreNanos[i] >= 0) {
							totalFrames++;
							totalFramesTime += frameTimeStoreNanos[i];
						}
					}
					// System.out.println("frames recorded: " + totalFrames);
					// System.out.println("totaltime: " + totalFramesTime / 1000000);
					currentFramerate = (double) (totalFrames / Math.max((totalFramesTime / 1000000), 0.000001));
					// System.out.println("framerate: " + currentFramerate);
				} else {
					// Does not render frame if the wait has not been long enough
				}
			}
			*/
		}
	  }
	
	public void setUserFramerate(int setFramerate) {
		framerate = setFramerate;
	}
	
	public int getUserSetFramerate() {
		return framerate;
	}
	
	public void setFramesToStore(int setFramesToStore) {
		framesToStore = setFramesToStore;
		frameTimeStoreMillis = new double[framesToStore]; 
		Arrays.fill(frameTimeStoreMillis, -1);
		// frameTimeStoreNanos = new double[framesToStore]; 
		// Arrays.fill(frameTimeStoreNanos, -1);
	}
	
	public int getFramesToStore() {
		return framesToStore;
	}
	
	public int getFramerate() {
		return currentFramerate;
	}
	
	/*
	public void setNanoPrecision(boolean extraPrecision) {
		nanoSecondPrecision = extraPrecision;
		if (nanoSecondPrecision) {
			lastFrameTimeNanos = System.nanoTime();
		} else {
			lastFrameTimeMillis = System.currentTimeMillis();
		}
	}
	
	public boolean getNanoPrecision() {
		return nanoSecondPrecision;
	}
	*/
	
	
	
}
