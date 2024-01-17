package SimpleRhythmGame;

public class Easing {
	
	public static final int easeInSine = 1;
	public static final int easeOutSine = 2;
	public static final int easeInOutSine = 3;
	public static final int easeInQuad = 4;
	public static final int easeOutQuad = 5;
	public static final int easeInOutQuad = 6;
	
	public static double ease(int type, double x) {
		boolean valid = false;
		double easeValue = -1;
		switch(type) {
		  case 1:
			  easeValue = easeInSine(x);
			  valid = true;
			  break;
		  case 2:
			  easeValue = easeOutSine(x);
			  valid = true;
			  break;
		  case 3:
			  easeValue = easeInOutSine(x);
			  valid = true;
			  break;
		  case 4:
			  easeValue = easeInQuad(x);
			  valid = true;
			  break;
		  case 5:
			  easeValue = easeOutQuad(x);
			  valid = true;
			  break;
		  case 6:
			  easeValue = easeInOutQuad(x);
			  valid = true;
			  break;
		}
		if (!valid) {
			throw new IllegalArgumentException(type + " is not an easing type!");
		}
		return easeValue;
	}
	
	public static double easeInSine(double x) {
	    return 1 - Math.cos((x * Math.PI) / 2);
	}
	
	public static double easeOutSine(double x) {
	    return Math.sin((x * Math.PI) / 2);
	}
	
	public static double easeInOutSine(double x) {
	    return -(Math.cos(Math.PI * x) - 1) / 2;
	}
	
	public static double easeInQuad(double x) {
	    return x * x;
	}
	
	public static double easeOutQuad(double x) {
	    return 1 - (1 - x) * (1 - x);
	}
	
	public static double easeInOutQuad(double x) {
	    return x < 0.5 ? 2 * x * x : 1 - Math.pow(-2 * x + 2, 2) / 2;
	}
	
}
