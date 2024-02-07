package Feb6.OOPS.Inheritance.Phone;

public class SmartPhone extends Phone {
    String color;

    public SmartPhone(String model, String color) {
        super(model);
        this.color = color;
    }

    public void surfInternet(){
        System.out.println("You can surf the internet (This is from the parent class)");
    }
    public void takePicture(){
        System.out.println("You can take a picture (This is from the parent class)");
    }

}
