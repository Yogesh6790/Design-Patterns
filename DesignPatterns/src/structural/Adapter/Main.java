package structural.Adapter;

/**
 * 
 * Allows two incompatibe interfaces to work with each other.
 * A single class is responsible to join the functionalities of two incompatible interfaces
 *
 */
public class Main {

	public static void main(String[] args) {
		MediaPlayer audio = new AudioPlayer("audio");
		audio.play("audio");
		audio = new AudioPlayer("vlc");
		audio.play("vlc");
		audio = new AudioPlayer("mp4");
		audio.play("mp4");
	}

}
