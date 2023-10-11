package SimpleRhythmGame;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.*;

public class AudioPlayer {
    private Clip clip;
    private Long currentFrame;
    
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
        clip.addLineListener(new LineListener() {
    	    @Override
    	    public void update(LineEvent event) {
    	        if (event.getType() == LineEvent.Type.STOP) {
    	            clip.close();
    	        }
    	    }
    	}); // auto close on complete
    }
    
    public AudioPlayer(String filePath) {
    	try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    	clip.addLineListener(new LineListener() {
    	    @Override
    	    public void update(LineEvent event) {
    	        if (event.getType() == LineEvent.Type.STOP) {
    	            clip.close();
    	        }
    	    }
    	}); // auto close on complete
    	loadAudio(filePath);
    }

    public void loadAudio(String filePath) {
        try {
        	System.out.println(AudioPlayer.class.getResource("/sfx").getPath());
        	InputStream audioSrc = getClass().getResourceAsStream(filePath);
        	//add buffer for mark/reset support
        	InputStream bufferedIn = new BufferedInputStream(audioSrc);
        	AudioInputStream audioStream = AudioSystem.getAudioInputStream(bufferedIn);
            clip.open(audioStream);
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            e.printStackTrace();
        }
    }

    public void play() {
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
}