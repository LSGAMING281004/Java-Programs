package JavaTask;


//Write a program that uses an interface Playable with a method play(), and implement it in two classes: Video and Audio.
interface Playable{
void play();
}

class Video implements Playable{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Video is playing....");
	}
	
}

class Audio implements Playable{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Audio is playing....");
	}
	
}
public class Task4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Video video = new Video();
		Audio audio = new Audio();
		
		video.play();
		audio.play();
	}

}
