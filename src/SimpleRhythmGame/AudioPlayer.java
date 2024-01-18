package SimpleRhythmGame;

import java.io.IOException;
import java.net.URL;
import java.io.File;

import javax.sound.sampled.*;

public class AudioPlayer {
    private Clip clip;
    private Long currentFrame;
    private boolean toClose;
    
    public AudioPlayer(AudioPlayer audioPlayer) {
    	this.clip = audioPlayer.clip;
    	this.currentFrame = audioPlayer.currentFrame;
    }
    
    public AudioPlayer() {
        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    
    public Clip getClip() {
    	return clip;
    }
    
    public AudioPlayer(String filePath) {
    	try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    	loadAudio(filePath);
    }

    public void loadAudio(String filePath) {
        try {
        	filePath = "src/" + filePath;
        	URL audioSrc = new File(filePath).toURI().toURL();;
        	// System.out.println(audioSrc.getPath());
        	AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioSrc);
            clip.open(audioStream);
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            e.printStackTrace();
        }
    }
    
    public void setToClose(boolean close) {
    	toClose = close;
    }
    
    public boolean getToClose() {
    	return toClose;
    }

    public void play() {
    	clip.setFramePosition(0);
        clip.start();
    }

    public void pause() {
        currentFrame = clip.getMicrosecondPosition();
        clip.stop();
    }

    public void resume() {
        clip.setMicrosecondPosition(currentFrame);
        clip.start();
    }

    public void jump(long position) {
        clip.setMicrosecondPosition(position);
    }

    public void stop() {
        clip.stop();
        clip.close();
    }
    
    public float getVolume() {
        FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);        
        return (float) Math.pow(10f, gainControl.getValue() / 20f);
    }

    public void setVolume(float volume) {
        if (volume < 0f || volume > 1f)
            throw new IllegalArgumentException("Volume not valid: " + volume);
        FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);        
        gainControl.setValue(20f * (float) Math.log10(volume));
    }

	public void setFramePosition(int i) {
		clip.setFramePosition(i);
		// TODO Auto-generated method stub
		
	}
}