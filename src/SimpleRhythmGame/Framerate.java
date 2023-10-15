package SimpleRhythmGame;

import java.util.Arrays;

public class Framerate extends Thread {
	private static int framerate;
	private static int framesToStore;
	private static long[] frameTimeStoreMillis;
	private static long lastFrameTimeMillis;
	
	private static boolean limitFramerate;
	
	private static int currentFramerate;
	
	private static long[] frameTimeStoreNanos;
	private static long lastFrameTimeNanos;
	private static boolean nanoSecondPrecision; 
	
	private static long currentTime;
	

	// milliseconds allows up to limiting to 1000fps, while nanoseconds can allow limiting up to 1 million fps.
	// However, nanoseconds takes almost a hundred times longer to call by the cpu and can actually worsen fps.
	
	// UPDATE: archived nanoseconds as it takes too long to call.
	
	public Framerate(){
		setFramesToStore(ShowImage.getConfig().getFramesToStore());
		framerate = ShowImage.getConfig().getFramerate();
		// May not be precise. 
		// Real framerate value is actually: (1000 / Math.ceil((1000 / framerate)))
		// Consider adding a ms per frame option instead.
		limitFramerate = ShowImage.getConfig().getLimitFramerate();
		// limitFramerate will limit the framerate to one frame per ms (1000fps)
		
		setNanoPrecision(ShowImage.getConfig().getNanoSecondPrecision());
	}
	
	public static void set(int newFramerate) {
		framerate = newFramerate;
	}
	
	public static void setShouldLimitFramerate(boolean shouldLimitFramerate) {
		limitFramerate = shouldLimitFramerate;
	}
	
	public static boolean isNanoSecondPrecision() {
		return nanoSecondPrecision;
	}
	
	public static double getCurrentTime() {
		double returnTime = ShowImage.getConfig().getNanoSecondPrecision() ? currentTime / 1000000 : currentTime;
		return returnTime;
	}
	
	public static void checkCurrentTime() {
		if(!nanoSecondPrecision) {
			long milliTime = System.currentTimeMillis();
			currentTime = milliTime;
		} else {
			long nanoTime = System.nanoTime();
			currentTime = nanoTime;
		}
	}
	
	public void run() { // game render loop
		while(true) {
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// Thread Runnable
			
			// System.out.println(milliTime);
			if(!nanoSecondPrecision) {
				// Millisecond precision
				checkCurrentTime();
				long currentFrameTime =  currentTime - lastFrameTimeMillis;
				if (currentFrameTime >= 1000d / (double) framerate || !limitFramerate) { // if we've waited long enough for the frame
					// System.out.println(currentFrameTime);
					for (int i = 0 ; i < framesToStore - 1 ; i++) {
						frameTimeStoreMillis[i + 1] = frameTimeStoreMillis[i];
					}
					frameTimeStoreMillis[0] = currentFrameTime;
					
					int totalFrames = 0;
					double totalFramesTime = 0;
					for (int i = 0 ; i < framesToStore ; i++) {
						totalFrames++;
						totalFramesTime += frameTimeStoreMillis[i];
					}
					totalFramesTime = Math.max((totalFramesTime / 1000), 0.001);
					// System.out.println("frames recorded: " + totalFrames);
					// System.out.println("totaltime: " + totalFramesTime);
					currentFramerate = (int) Math.round(totalFrames / totalFramesTime);
					// System.out.println("framerate: " + currentFramerate);
					 
					lastFrameTimeMillis = currentTime;
					
					ShowImage.updateFrame();
				} else {
					// Does not render frame if the wait has not been long enough
				} 
			}
			else {
				// Nanosecond precision
				checkCurrentTime();
				long currentFrameTime = currentTime - lastFrameTimeNanos;
				// System.out.println(nanoTime);
				if (currentFrameTime >= 1000000000d / (double) framerate || !limitFramerate) { // if we've waited long enough for the frame
					// System.out.println(currentFrameTime);
					for (int i = 0 ; i < framesToStore - 1 ; i++) {
						frameTimeStoreNanos[i+1] = frameTimeStoreNanos[i];
					}
					frameTimeStoreNanos[0] = currentFrameTime;
					
					int totalFrames = 0;
					double totalFramesTime = 0;
					for (int i = 0 ; i < framesToStore ; i++) {
						totalFrames++;
						totalFramesTime += frameTimeStoreNanos[i];
					}
					// System.out.println("frames recorded: " + totalFrames);
					// System.out.println("totaltime: " + totalFramesTime / 1000000);
					currentFramerate = (int) (totalFrames / Math.max((totalFramesTime / 1000000000), 0.000000001));
					// System.out.println("framerate: " + currentFramerate);
					 
					lastFrameTimeNanos = currentTime;
					
					ShowImage.updateFrame();
				} else {
					// Does not render frame if the wait has not been long enough
					try {
						Thread.sleep(0);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}
	  }
	
	public static void setUserFramerate(int setFramerate) {
		framerate = setFramerate;
	}
	
	public static int getUserSetFramerate() {
		return framerate;
	}
	
	public static void setFramesToStore(int setFramesToStore) {
		framesToStore = setFramesToStore;
		frameTimeStoreMillis = new long[framesToStore]; 
		Arrays.fill(frameTimeStoreMillis, -1);
		
		frameTimeStoreNanos = new long[framesToStore]; 
		Arrays.fill(frameTimeStoreNanos, -1);
	}
	
	public static int getFramesToStore() {
		return framesToStore;
	}
	
	public static int getFramerate() {
		return currentFramerate;
	}
	

	public static void setNanoPrecision(boolean extraPrecision) {
		nanoSecondPrecision = extraPrecision;
		if (nanoSecondPrecision) {
			lastFrameTimeNanos = System.nanoTime();
		} else {
			lastFrameTimeMillis = System.currentTimeMillis();
		}
	}
	
	public static boolean getNanoPrecision() {
		return nanoSecondPrecision;
	}

	
	
	
}
