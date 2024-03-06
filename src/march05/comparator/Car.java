package march05.comparator;

public class Car {
    String brand;
    int makeYear;

    public Car(String brand, int makeYear) {
        this.brand = brand;
        this.makeYear = makeYear;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", makeYear=" + makeYear +
                '}';
    }
}
