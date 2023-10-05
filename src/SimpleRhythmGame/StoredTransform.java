package SimpleRhythmGame;

public class StoredTransform {
	private double transformX;
	private double transformY;
	private double scaleX;
	private double scaleY;
	private double rotate;
	private long delayMillis;
	private long timeToTransformMillis;
	private int easeType;
	
	public StoredTransform(double transformX, double transformY, double scaleX, double scaleY, double rotate,
			long delayMillis, long timeToTransformMillis, int easeType) {
		this.transformX = transformX;
		this.transformY = transformY;
		this.scaleX = scaleX;
		this.scaleY = scaleY;
		this.rotate = rotate;
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
				delayMillis, timeToTransformMillis, easeType);
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
}
