package Feb10.Inheritance;

public class Car extends Vehicle{
    int doors;

    public Car(String make, String model, int year, int doors) {
        super(make, model, year);
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: "+doors);
    }
}
