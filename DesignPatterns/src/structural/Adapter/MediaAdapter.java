package structural.Adapter;

public class MediaAdapter implements MediaPlayer{
	
	private AdvancedMediaPlayer player;
	
	MediaAdapter(String fileType){
		if(fileType.equals("vlc")){
			player = new VLCPlayer();
		}else{
			player = new MP4Player();
		}
	}

	@Override
	public void play(String audioType) {
		player.play();
		
	}
	
	

}
