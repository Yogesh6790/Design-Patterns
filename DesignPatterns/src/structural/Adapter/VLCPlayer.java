package structural.Adapter;

public class VLCPlayer implements AdvancedMediaPlayer {

	@Override
	public void play() {
		System.out.println("VLC file is played");
	}

}
