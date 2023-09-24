package SimpleRhythmGame;

public class Controls {
	private String hotkeyFunction;
	private int hotkeyOriginalKeyCode;
	private int[] keyCodes = new int[3];
	
	public Controls(String hotkeyFunction, int hotkeyOriginalKeyCode, int[] keyCodes) {
		this.hotkeyFunction = hotkeyFunction;
		this.hotkeyOriginalKeyCode = hotkeyOriginalKeyCode;
		this.keyCodes = keyCodes;
	}
	
	public String getFunction() {
		return hotkeyFunction;
	}
	
	public int getOriginalKeyCode() {
		return hotkeyOriginalKeyCode;
	}
	
	public int[] getNewKeyCodes() {
		return keyCodes;
	}
	
	public void setCustomKeyCodes(int[] keyCodes) {
		this.keyCodes = keyCodes;
	}
}
