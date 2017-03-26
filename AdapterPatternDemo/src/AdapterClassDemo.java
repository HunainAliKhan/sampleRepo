
public class AdapterClassDemo 
{
	public static void main(String [] args)
	{
		MediaPlayer ap = new AudioPlayer();
		ap.play("vlc");
	}
	
	

}




interface AdvanceMediaPlayer
{
	void playVlc();
	void playMp4();
}

class VlcPlayer implements AdvanceMediaPlayer
{

	@Override
	public void playVlc() {
		// TODO Auto-generated method stub
		System.out.println("play vlc");
		
	}

	@Override
	public void playMp4() {
		// TODO Auto-generated method stub
		
	}
	
}
class Mp4 implements AdvanceMediaPlayer
{

	@Override
	public void playVlc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playMp4() {
		// TODO Auto-generated method stub
		System.out.println("play mp4");
	}
	
}



interface MediaPlayer
{
	void play(String type);
	
}


class MediaAdapter implements MediaPlayer
{
	 AdvanceMediaPlayer player=null;

	public MediaAdapter(String file)
	{
		if(file.equals("mp4"))
		{
			player = new  Mp4();
		}
		else if (file.equals("vlc"))
		{
			player = new VlcPlayer();
		}
	}
	
	
	@Override
	public void play(String audioType) {
		// TODO Auto-generated method stub
		if(audioType.equals("vlc"))
		{
			player.playVlc();
		}
		else if(audioType.equals("mp4"))
		{
			player.playVlc();
		}
		
	}
	
}
class AudioPlayer implements MediaPlayer
{
		MediaAdapter md=null;
	
	
	public void play(String type) {
		// TODO Auto-generated method stub
		md = new MediaAdapter(type);
		md.play(type);
	}
	
}
