package Feb10.Inheritance;

public class InheritanceDemoFeb10 {
    public static void main(String[] args) {
        Car c = new Car("Hyundai","Elantra",2020,4);
        Motorcycle m = new Motorcycle("Bajaj","Pulsar",2015,4);
        ElectricCar ev = new ElectricCar("Tesla","Model S", 2024,4,800);
        c.displayInfo();
        System.out.println();
        c.start();
        System.out.println();
        c.stop();
        System.out.println();
        m.displayInfo();
        System.out.println();
        m.start();
        System.out.println();
        m.stop();
        System.out.println();
        ev.displayInfo();
        System.out.println();
        ev.start();
        System.out.println();
        ev.stop();
        System.out.println();
        ev.chargeBattery();
    }
}
