package Jan20;

public class car {
    int topspeed;
    int totalseats;
    int fuelcap;
    String manufacturer;

    public void refuel(){
        System.out.println("Refuel - Total Capacity: " +fuelcap);
    }
    public void park(){
        System.out.println("Park your made by " +manufacturer);

    }
    public void drive(){
        System.out.println("Drive - top speed: " +topspeed);

    }


}
