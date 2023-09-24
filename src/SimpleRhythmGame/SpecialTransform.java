package SimpleRhythmGame;

import java.awt.geom.AffineTransform;

public class SpecialTransform {
	private AffineTransform finalTransform;
	private double anchorX;
	private double anchorY;
	private double transformX;
	private double transformY;
	private double scaleX;
	private double scaleY;
	private double rotate;
	
	public SpecialTransform(StoredTransform storedTransform, RoundedArea inputArea) {
		anchorX = inputArea.getX();
		anchorY = inputArea.getY();
		transformX = storedTransform.getTransformX();
		transformY = storedTransform.getTransformY();
		scaleX = storedTransform.getScaleX();
		scaleY = storedTransform.getScaleY();
		rotate = storedTransform.getRotate();
		updateTransform();
	}
	
	public SpecialTransform(SpecialTransform specialTransform, RoundedArea inputArea) {
		anchorX = inputArea.getX();
		anchorY = inputArea.getY();
		transformX = specialTransform.getTransformX();
		transformY = specialTransform.getTransformY();
		scaleX = specialTransform.getScaleX();
		scaleY = specialTransform.getScaleY();
		rotate = specialTransform.getRotate();
		updateTransform();
	}
	
	public SpecialTransform(
			double transformX, double transformY, 
			double scaleX, double scaleY, 
			double rotate,
			double x, double y, double xSize, double ySize
			) {
		anchorX = x;
		anchorY = y;
		this.transformX = transformX;
		this.transformY = transformY;
		this.scaleX = scaleX;
		this.scaleY = scaleY;
		this.rotate = rotate;
		updateTransform();
	}
	
	public SpecialTransform(
			double transformX, double transformY, 
			double scaleX, double scaleY, 
			double rotate,
			double anchorX, double anchorY
			) {
		this.anchorX = anchorX;
		this.anchorY = anchorY;
		this.transformX = transformX;
		this.transformY = transformY;
		this.scaleX = scaleX;
		this.scaleY = scaleY;
		this.rotate = rotate;
		updateTransform();
	}
	
	// Cool java doc testing
	/**
	* Uses the the x, y, xSize, ySize values provided to automatically
	* calculate the anchor point for the given transform. Allows for a
	* precision of double. Has no transform values.
	* 
	* @param  x the x position of the item
	* @param  y the y position of the item
	* @param  xSize the x size of the item
	* @param  ySize the y size of the item
	* @return      void
	* @see         {@link #SpecialTransform() SpecialTransform()}
	*/
	public SpecialTransform(double x, double y, double xSize, double ySize) {
		anchorX = x;
		anchorY = y;
		transformX = 0;
		transformY = 0;
		scaleX = 1;
		scaleY = 1;
		rotate = 0;
		updateTransform();
	}
	
	/**
	* Uses the center of a RoundedArea to set the anchor point of a SpecialTransform
	* 
	* @param  RoundedArea A shape stored in RoundedArea as position and size values.
	* @return      void
	* @see         {@link #RoundedArea() RoundedArea()}
	*/
	public SpecialTransform(RoundedArea inputArea) {
		anchorX = inputArea.getX();
		anchorY = inputArea.getY();
		transformX = 0;
		transformY = 0;
		scaleX = 1;
		scaleY = 1;
		rotate = 0;
		updateTransform();
	}
	
	/**
	* Uses the center of a RoundedArea to set the anchor point of a SpecialTransform,
	* and also sets transform, scale, and rotate values.
	* 
	* @param  RoundedArea A shape stored in RoundedArea as position and size values.
	* @return      void
	* @see         {@link #RoundedArea() RoundedArea()}
	*/
	public SpecialTransform(double transformX, double transformY, 
			double scaleX, double scaleY, 
			double rotate, RoundedArea inputArea) {
		anchorX = inputArea.getX();
		anchorY = inputArea.getY();
		this.transformX = transformX;
		this.transformY = transformY;
		this.scaleX = scaleX;
		this.scaleY = scaleY;
		this.rotate = rotate;
		updateTransform();
	}
	
	public SpecialTransform(double anchorX, double anchorY) {
		this.anchorX = anchorX;
		this.anchorY = anchorY;
		transformX = 0;
		transformY = 0;
		scaleX = 1;
		scaleY = 1;
		rotate = 0;
		updateTransform();
	}
	
	public SpecialTransform() {
		anchorX = 0;
		anchorY = 0;
		transformX = 0;
		transformY = 0;
		scaleX = 1;
		scaleY = 1;
		rotate = 0;
		updateTransform();
	}
	
	public void updateTransform() {
		finalTransform = new AffineTransform();
		finalTransform.translate(
				anchorX * ShowImage.getCalculatedScreenWidth() / 1920, 
				anchorY * ShowImage.getCalculatedScreenHeight() / 1080);
		finalTransform.translate(transformX, transformY);
		finalTransform.scale(scaleX, scaleY);
		finalTransform.rotate((rotate * Math.PI) / 180);
		finalTransform.translate(
				-anchorX * ShowImage.getCalculatedScreenWidth() / 1920, 
				-anchorY * ShowImage.getCalculatedScreenHeight() / 1080
				);
	}

	public AffineTransform getFinalTransform() {
		return finalTransform;
	}

	public double getTransformX() {
		return transformX;
	}

	public void setTransformX(double transformX) {
		this.transformX = transformX;
		updateTransform();
	}

	public double getTransformY() {
		return transformY;
	}

	public void setTransformY(double transformY) {
		this.transformY = transformY;
		updateTransform();
	}

	public double getScaleX() {
		return scaleX;
	}

	public void setScaleX(double scaleX) {
		this.scaleX = scaleX;
		updateTransform();
	}

	public double getScaleY() {
		return scaleY;
	}

	public void setScaleY(double scaleY) {
		this.scaleY = scaleY;
		updateTransform();
	}

	public double getRotate() {
		return rotate;
	}

	public void setRotate(double rotate) {
		this.rotate = rotate;
		updateTransform();
	}

	public double getAnchorX() {
		return anchorX;
	}

	public void setAnchorX(double anchorX) {
		this.anchorX = anchorX;
	}

	public double getAnchorY() {
		return anchorY;
	}

	public void setAnchorY(double anchorY) {
		this.anchorY = anchorY;
	}
}