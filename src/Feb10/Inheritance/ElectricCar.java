package Feb10.Inheritance;

public class ElectricCar extends Car{
    int batteryCapacity;

    public ElectricCar(String make, String model, int year, int doors, int batteryCapacity) {
        super(make, model, year, doors);
        this.batteryCapacity = batteryCapacity;
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: "+batteryCapacity + " Watts");
    }
    public void chargeBattery(){
        System.out.println("Battery is charging");
    }
}
