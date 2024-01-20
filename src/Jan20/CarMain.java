package Jan20;

public class CarMain {
    public static void main(String[] args) {
        car elantra = new car();
        elantra.fuelcap = 100;
        elantra.manufacturer = "Hundai";
        elantra.totalseats = 5;
        elantra.topspeed = 180;

        elantra.refuel();
        elantra.park();
        elantra.drive();
        System.out.println();
        car r8 = new car();
        r8.fuelcap = 100;
        r8.manufacturer = "Audi";
        r8.totalseats = 2;
        r8.topspeed = 240;

        r8.refuel();
        r8.park();
        r8.drive();

    }
}
