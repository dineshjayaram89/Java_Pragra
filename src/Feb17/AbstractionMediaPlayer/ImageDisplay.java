package Feb17.AbstractionMediaPlayer;

public class ImageDisplay extends MediaDevice {
    String imageName;
    String imageResolution;

    String name = "Image Player";
    @Override
    public void displayDetails() {
        super.name = name;
        super.displayDetails();
        System.out.println("Image name : "+imageName);
        System.out.println("Image resolution : "+imageResolution);
        System.out.println();
    }
    public void displayImage(String imageName, String imageResolution){
        this.imageName = imageName;
        this.imageResolution = imageResolution;
        System.out.println("Displaying Image "+imageName+" resolution "+imageResolution);
        System.out.println();
    }
}
