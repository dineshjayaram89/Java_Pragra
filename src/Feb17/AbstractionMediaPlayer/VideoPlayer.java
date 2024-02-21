package Feb17.AbstractionMediaPlayer;

public class VideoPlayer extends MediaDevice implements Playable{
    String videoTitle;
    String duration;

    String name = "Video Player";

    @Override
    public void displayDetails() {
        super.name = name;
        super.displayDetails();
        System.out.println("Video title : "+videoTitle);
        System.out.println("Duration : "+duration);
        System.out.println();
    }

    @Override
    public void play(String videoTitle, String duration) {
        this.videoTitle = videoTitle;
        this.duration = duration;
        System.out.println("Playing the video "+videoTitle+" of duration "+duration);
        System.out.println();

    }
}
