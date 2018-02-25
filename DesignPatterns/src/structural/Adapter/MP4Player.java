package structural.Adapter;

public class MP4Player implements AdvancedMediaPlayer {

	@Override
	public void play() {
		System.out.println("MP4 file is played");
	}

}
