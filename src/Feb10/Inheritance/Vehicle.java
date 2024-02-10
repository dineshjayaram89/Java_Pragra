package Feb10.Inheritance;

public class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start(){
        System.out.println("The " + this.model + " is starting");
    }
    public void stop(){
        System.out.println("The " + this.model + " is stopping");
    }
    public void displayInfo(){
        System.out.println("Make: "+make);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
    }
}
