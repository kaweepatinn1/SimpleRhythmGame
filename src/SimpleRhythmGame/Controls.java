package SimpleRhythmGame;

public class Controls {
	private String hotkeyFunction;
	private int[] keyCodes = new int[3];
	
	public Controls(String hotkeyFunction, int[] keyCodes) {
		this.hotkeyFunction = hotkeyFunction;
		this.keyCodes = keyCodes;
	}
	
	public String getFunction() {
		return hotkeyFunction;
	}
	
	public int getKeybindCode(int index) {
		return keyCodes[index];
	}
	
	public int[] getKeybindCodes() {
		return keyCodes;
	}
	
	public void setKeybindCode(int keyCode, int index) {
		this.keyCodes[index] = keyCode;
	}
	
	public void setKeybindCodes(int[] keyCodes) {
		this.keyCodes = keyCodes;
	}
}
