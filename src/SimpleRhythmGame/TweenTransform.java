package SimpleRhythmGame;

public class TweenTransform {
	private SpecialTransform ogTransform;
	private SpecialTransform newTransform;
	private long timeToTransformMillis;
	private long initTimeNano;
	private long delayInMillis;
	private long startTimeNano;
	private long endTimeNano;
	private int easeType;
	private boolean boomerang; // instantly deanimate after completion
	
	public TweenTransform(
			SpecialTransform ogTransform,
			SpecialTransform newTransform,
			long timeToTransformMillis,
			long delayInMillis,
			int easeType
			) {
		initTimeNano = Framerate.getCurrentTime();
		// multiplies by 1000 if not already in nanoseconds.
		this.delayInMillis = delayInMillis;
		startTimeNano = initTimeNano + (delayInMillis * 1000000);
		endTimeNano = startTimeNano + (timeToTransformMillis * 1000000);
		this.ogTransform = ogTransform;
		this.newTransform = newTransform;
		this.easeType = easeType;
		boomerang = false;
	}
	
	public TweenTransform(
			SpecialTransform ogTransform,
			SpecialTransform newTransform,
			long timeToTransformMillis,
			long delayInMillis,
			int easeType,
			boolean boomerang
			) {
		initTimeNano = Framerate.getCurrentTime();
		// multiplies by 1000 if not already in nanoseconds.
		this.delayInMillis = delayInMillis;
		startTimeNano = initTimeNano + (delayInMillis * 1000000);
		endTimeNano = startTimeNano + (timeToTransformMillis * 1000000);
		this.ogTransform = ogTransform;
		this.newTransform = newTransform;
		this.easeType = easeType;
		this.boomerang = boomerang;
	}
	
	public TweenTransform(
			TweenTransform storedTransform
			) {
		initTimeNano = Framerate.getCurrentTime();
		startTimeNano = initTimeNano + (storedTransform.getDelayInMillis() * 1000000);
		endTimeNano = startTimeNano + (storedTransform.getTimeToTransformMillis() * 1000000);
		ogTransform = storedTransform.getOgTransform();
		newTransform = storedTransform.getNewTransform();
		easeType = storedTransform.getEaseType();
		boomerang = storedTransform.getBoomerang();
	}
	
	public TweenTransform(TextBox textbox) {
		ogTransform = new SpecialTransform(textbox.getRectShape());
		newTransform = null;
	}
	
	public TweenTransform(Renderable renderable) {
		ogTransform = new SpecialTransform(renderable.getX(), renderable.getY(), 
				renderable.getXSize(), renderable.getYSize());
		newTransform = null;
	}
	
	public double getCurrentTime() {
		long currentTime = Framerate.getCurrentTime();
		double timePassed = Math.max((currentTime - initTimeNano)
				, 0) 
				/ 
				(double) (endTimeNano - startTimeNano);
		return Math.min(Math.max(timePassed, 0),1);
	}
	
	public SpecialTransform getCurrentPosition() {
		SpecialTransform toReturn;
		if (newTransform != null) {
			long currentTime = Framerate.getCurrentTime();
			double timePassed = Math.max((currentTime - startTimeNano)
					, 0) 
					/ 
					(double) (endTimeNano - startTimeNano);
			if (timePassed >= 1) {
				if (boomerang) {
					toReturn = newTransform;
					
					initTimeNano = Framerate.getCurrentTime();
					// multiplies by 1000 if not already in nanoseconds.
					startTimeNano = initTimeNano + ((50 + delayInMillis) * 1000000);
					endTimeNano = startTimeNano + ((50 + timeToTransformMillis) * 1000000);
					SpecialTransform newOgTransform = new SpecialTransform(ogTransform.getAnchorX(),ogTransform.getAnchorY());
					// will always return to original after boomerang.
					SpecialTransform newNewTransform = newTransform;
					ogTransform = newNewTransform;
					newTransform = newOgTransform;
					boomerang = false;
				} else {
					toReturn = newTransform;
				}
			} else if (timePassed != 0) {
				double easeCompletion = Easing.ease(easeType, timePassed);
				
				double ogX = ogTransform.getTransformX();
				double ogY = ogTransform.getTransformY();
				double ogXScale = ogTransform.getScaleX();
				double ogYScale = ogTransform.getScaleY();
				double ogRotate = ogTransform.getRotate();
				double ogAnchorX = ogTransform.getAnchorX();
				double ogAnchorY = ogTransform.getAnchorY();
				
				double newX = newTransform.getTransformX();
				double newY = newTransform.getTransformY();
				double newXScale = newTransform.getScaleX();
				double newYScale = newTransform.getScaleY();
				double newRotate = newTransform.getRotate();
				double newAnchorX = newTransform.getAnchorX();
				double newAnchorY = newTransform.getAnchorY();
				
				toReturn = new SpecialTransform(
						ogX * (1 - easeCompletion) + newX * easeCompletion,
						ogY * (1 - easeCompletion) + newY * easeCompletion,
						ogXScale * (1 - easeCompletion) + newXScale * easeCompletion,
						ogYScale * (1 - easeCompletion) + newYScale * easeCompletion,
						ogRotate * (1 - easeCompletion) + newRotate * easeCompletion,
						ogAnchorX * (1 - easeCompletion) + newAnchorX * easeCompletion,
						ogAnchorY * (1 - easeCompletion) + newAnchorY * easeCompletion
						);
				
			} else {
				toReturn = ogTransform;
			}
		} else {
			toReturn = ogTransform;
		}
		
		return toReturn;
	}

	public SpecialTransform getOgTransform() {
		return ogTransform;
	}

	public void setOgTransform(SpecialTransform ogTransform) {
		this.ogTransform = ogTransform;
	}

	public SpecialTransform getNewTransform() {
		return newTransform;
	}

	public void setNewTransform(SpecialTransform newTransform) {
		this.newTransform = newTransform;
	}

	public long getTimeToTransformMillis() {
		return timeToTransformMillis;
	}

	public void setTimeToTransformMillis(long timeToTransformMillis) {
		this.timeToTransformMillis = timeToTransformMillis;
	}

	public int getEaseType() {
		return easeType;
	}

	public void setEaseType(int easeType) {
		this.easeType = easeType;
	}

	public long getDelayInMillis() {
		return delayInMillis;
	}

	public void setDelayInMillis(long delayInMillis) {
		this.delayInMillis = delayInMillis;
	}

	public boolean getBoomerang() {
		return boomerang;
	}

	public void setBoomerang(boolean boomerang) {
		this.boomerang = boomerang;
	}
}