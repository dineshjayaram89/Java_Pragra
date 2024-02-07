package Feb6.OOPS.Inheritance.Phone;

public class Phone {
    String model;

    public Phone(String model) {
        this.model = model;
    }

    public void makeCall(){
        System.out.println("You can make Phone calls (This is from the grandparent class)");
    }

    public void makeText(){
        System.out.println("You can make text other phones (This is from the grandparent class)");
    }

}
