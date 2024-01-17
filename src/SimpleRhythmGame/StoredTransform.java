package SimpleRhythmGame;

public class StoredTransform {
	private double transformX;
	private double transformY;
	private double scaleX;
	private double scaleY;
	private double rotate;
	private double opacity;
	private long delayMillis;
	private long timeToTransformMillis;
	private int easeType;
	
	public StoredTransform(double transformX, double transformY, double scaleX, double scaleY, double rotate,
			double opacity, long delayMillis, long timeToTransformMillis, int easeType) {
		this.transformX = transformX;
		this.transformY = transformY;
		this.scaleX = scaleX;
		this.scaleY = scaleY;
		this.rotate = rotate;
		this.opacity = opacity;
		this.delayMillis = delayMillis;
		this.timeToTransformMillis = timeToTransformMillis;
		this.easeType = easeType;
	}
	
	public StoredTransform(StoredTransform clone) {
		this.transformX = clone.transformX;
		this.transformY = clone.transformY;
		this.scaleX = clone.scaleX;
		this.scaleY = clone.scaleY;
		this.rotate = clone.rotate;
		this.opacity = clone.opacity;
		this.delayMillis = clone.delayMillis;
		this.timeToTransformMillis = clone.timeToTransformMillis;
		this.easeType = clone.easeType;
	}
	
	public StoredTransform(StoredTransform clone, double newX, double newY) {
		transformX = newX;
		transformY = newY;
		this.scaleX = clone.scaleX;
		this.scaleY = clone.scaleY;
		this.rotate = clone.rotate;
		this.opacity = clone.opacity;
		this.delayMillis = clone.delayMillis;
		this.timeToTransformMillis = clone.timeToTransformMillis;
		this.easeType = clone.easeType;
	}
	
	public StoredTransform scaleTransform(double scale) {
		double newTransformX = transformX * scale;
		double newTransformY = transformY * scale;
		double newScaleX = Math.pow(scaleX, scale);
		double newScaleY = Math.pow(scaleY, scale);
		double newRotate = rotate * scale;
		
		return new StoredTransform(newTransformX, newTransformY, newScaleX, newScaleY, newRotate, 
				opacity, delayMillis, timeToTransformMillis, easeType);
	}
	
	public double getTransformX() {
		return transformX;
	}
	public void setTransformX(double transformX) {
		this.transformX = transformX;
	}
	public double getTransformY() {
		return transformY;
	}
	public void setTransformY(double transformY) {
		this.transformY = transformY;
	}
	public double getScaleX() {
		return scaleX;
	}
	public void setScaleX(double scaleX) {
		this.scaleX = scaleX;
	}
	public double getScaleY() {
		return scaleY;
	}
	public void setScaleY(double scaleY) {
		this.scaleY = scaleY;
	}
	public double getRotate() {
		return rotate;
	}
	public void setRotate(double rotate) {
		this.rotate = rotate;
	}
	public long getDelayMillis() {
		return delayMillis;
	}
	public void setDelayMillis(long delayMillis) {
		this.delayMillis = delayMillis;
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
	public double getOpacity() {
		return opacity;
	}
	public void setOpacity(int opacity) {
		this.opacity = opacity;
	}
	
	public static final StoredTransform Transform_ClickScaleDown = 
			new StoredTransform(
					0, 0, // x, y transform
					0.95, 0.95, // scale transform (x, y)
					0, // rotate transform
					1, // opacity multi
					0, // offset (ms)
					100, // animation time (ms)
					6 // (ease type)
				);
	
	public static final StoredTransform Transform_1sLeft100 = 
			new StoredTransform(
					-100, 0, // x, y transform
					1, 1, // scale transform (x, y)
					0, // rotate transform
					1, // opacity multi
					0, // offset (ms)
					1000, // animation time (ms)
					6 // (ease type)
				);
			
	public static final StoredTransform Transform_1sRight100 = 
			new StoredTransform(
					100, 0, // x, y transform
					1, 1, // scale transform (x, y)
					0, // rotate transform
					1, // opacity multi
					0, // offset (ms)
					1000, // animation time (ms)
					6 // (ease type)
				);
	
	public static final StoredTransform Transform_1sUp100 = 
			new StoredTransform(
					0, -100, // x, y transform
					1, 1, // scale transform (x, y)
					0, // rotate transform
					1, // opacity multi
					0, // offset (ms)
					1000, // animation time (ms)
					6 // (ease type)
				);
	
	public static final StoredTransform Transform_1sDown100 =
			new StoredTransform(
					0, 100, // x, y transform
					1, 1, // scale transform (x, y)
					0, // rotate transform
					1, // opacity multi
					0, // offset (ms)
					1000, // animation time (ms)
					6 // (ease type)
				);
	
	public static final StoredTransform Transform_500msLeft100 = 
			new StoredTransform(
					-100, 0, // x, y transform
					1, 1, // scale transform (x, y)
					0, // rotate transform
					1, // opacity multi
					0, // offset (ms)
					500, // animation time (ms)
					6 // (ease type)
				);
			
	public static final StoredTransform Transform_500msRight100 = 
			new StoredTransform(
					100, 0, // x, y transform
					1, 1, // scale transform (x, y)
					0, // rotate transform
					1, // opacity multi
					0, // offset (ms)
					500, // animation time (ms)
					6 // (ease type)
				);
	
	public static final StoredTransform Transform_500msUp100 = 
			new StoredTransform(
					0, -100, // x, y transform
					1, 1, // scale transform (x, y)
					0, // rotate transform
					1, // opacity multi
					0, // offset (ms)
					500, // animation time (ms)
					6 // (ease type)
				);
	
	public static final StoredTransform Transform_500msDown100 =
			new StoredTransform(
					0, 100, // x, y transform
					1, 1, // scale transform (x, y)
					0, // rotate transform
					1, // opacity multi
					0, // offset (ms)
					500, // animation time (ms)
					6 // (ease type)
				);
	
	public static final StoredTransform Transform_1sLeft150 = 
			new StoredTransform(
					-150, 0, // x, y transform
					1, 1, // scale transform (x, y)
					0, // rotate transform
					1, // opacity multi
					0, // offset (ms)
					1000, // animation time (ms)
					6 // (ease type)
				);
			
	public static final StoredTransform Transform_1sRight150 = 
			new StoredTransform(
					150, 0, // x, y transform
					1, 1, // scale transform (x, y)
					0, // rotate transform
					1, // opacity multi
					0, // offset (ms)
					1000, // animation time (ms)
					6 // (ease type)
				);
	
	public static final StoredTransform Transform_1sUp150 = 
			new StoredTransform(
					0, -150, // x, y transform
					1, 1, // scale transform (x, y)
					0, // rotate transform
					1, // opacity multi
					0, // offset (ms)
					1000, // animation time (ms)
					6 // (ease type)
				);
	
	public static final StoredTransform Transform_1sDown150 =
			new StoredTransform(
					0, 150, // x, y transform
					1, 1, // scale transform (x, y)
					0, // rotate transform
					1, // opacity multi
					0, // offset (ms)
					1000, // animation time (ms)
					6 // (ease type)
				);
	
	public static final StoredTransform Transform_500msLeft150 = 
			new StoredTransform(
					-150, 0, // x, y transform
					1, 1, // scale transform (x, y)
					0, // rotate transform
					1, // opacity multi
					0, // offset (ms)
					500, // animation time (ms)
					6 // (ease type)
				);
			
	public static final StoredTransform Transform_500msRight150 = 
			new StoredTransform(
					150, 0, // x, y transform
					1, 1, // scale transform (x, y)
					0, // rotate transform
					1, // opacity multi
					0, // offset (ms)
					500, // animation time (ms)
					6 // (ease type)
				);
	
	public static final StoredTransform Transform_500msUp150 = 
			new StoredTransform(
					0, -150, // x, y transform
					1, 1, // scale transform (x, y)
					0, // rotate transform
					1, // opacity multi
					0, // offset (ms)
					500, // animation time (ms)
					6 // (ease type)
				);
	
	public static final StoredTransform Transform_500msDown150 =
			new StoredTransform(
					0, 150, // x, y transform
					1, 1, // scale transform (x, y)
					0, // rotate transform
					1, // opacity multi
					0, // offset (ms)
					500, // animation time (ms)
					6 // (ease type)
				);
	
	public static final StoredTransform Transform_500msScaleUp = 
			new StoredTransform(
					0, 0, // x, y transform
					1.05, 1.05, // scale transform (x, y)
					20, // rotate transform
					1, // opacity multi
					0, // offset (ms)
					500, // animation time (ms)
					6 // (ease type)
				);
	
	public static final StoredTransform Transform_500msScaleUpRotateLeft20 = 
			new StoredTransform(
					0, 0, // x, y transform
					1.05, 1.05, // scale transform (x, y)
					-20, // rotate transform
					1, // opacity multi
					0, // offset (ms)
					500, // animation time (ms)
					6 // (ease type)
				);
	
	public static final StoredTransform Transform_500msScale0 = 
			new StoredTransform(
					0, 0, // x, y transform
					0, 0, // scale transform (x, y)
					0, // rotate transform
					1, // opacity multi
					0, // offset (ms)
					500, // animation time (ms)
					6 // (ease type)
				);
	
	public static final StoredTransform Transform_ClickScaleDownRotate20 = 
			new StoredTransform(
					0, 0, // x, y transform
					0.95, 0.95, // scale transform (x, y)
					20, // rotate transform
					1, // opacity multi
					0, // offset (ms)
					100, // animation time (ms)
					6 // (ease type)
				);
	
}
