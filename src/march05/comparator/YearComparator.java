package march05.comparator;

import java.util.Comparator;

public class YearComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return 0;
    }

    @Override
    public Comparator<Car> reversed() {
        return Comparator.super.reversed();
    }
}
