package Feb17.AbstractionMediaPlayer;

public class MediaPlayerMain {
    public static void main(String[] args) {
        AudioPlayer a = new AudioPlayer();
        VideoPlayer v = new VideoPlayer();
        ImageDisplay i = new ImageDisplay();
        a.play("Hotel California","Eagles");
        v.play("Goku going Super Saiyan","2 Minutes");
        i.displayImage("Family Portrait","400*400");

        a.displayDetails();
        v.displayDetails();
        i.displayDetails();

    }
}
