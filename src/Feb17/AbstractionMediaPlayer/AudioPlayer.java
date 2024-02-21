package Feb17.AbstractionMediaPlayer;

public class AudioPlayer extends MediaDevice implements Playable{
    String songName;
    String artist;

    String name = "Audio Player";

    @Override
    public void displayDetails() {
        super.name = name;
        super.displayDetails();
        System.out.println("Song Name : "+songName);
        System.out.println("Artist Name : "+artist);
        System.out.println();
    }
    public void play(String songName, String artist){
        this.songName = songName;
        this.artist = artist;
        System.out.println("Playing the song "+songName+" by the artist "+artist);
        System.out.println();

    }
}
