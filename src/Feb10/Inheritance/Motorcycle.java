package Feb10.Inheritance;

public class Motorcycle extends Vehicle{
    int cylinders;
    public Motorcycle(String make, String model, int year, int cylinders) {
        super(make, model, year);
        this.cylinders = cylinders;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Cylinders: "+cylinders);
    }
}
