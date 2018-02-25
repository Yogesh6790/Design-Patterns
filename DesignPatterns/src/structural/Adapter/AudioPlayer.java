package structural.Adapter;

public class AudioPlayer implements MediaPlayer{
	
	private MediaAdapter mediaAdapter;
	
	AudioPlayer(String fileType) {
		if (!fileType.equals("audio")) {
			mediaAdapter = new MediaAdapter(fileType);
		}
	}

	@Override
	public void play(String fileType) {
		if(fileType.equals("audio")){
			System.out.println("audio file is played");
		}else{
			mediaAdapter.play(fileType);
		}
	}

}
