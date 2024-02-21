package Feb17.Feb17.AnonymousInnerClass;

public class DellLaptop {
    public static void main(String[] args) {

        Computer c = new Computer() {
            @Override
            public void calculate() {
                System.out.println("calculating");
            }
        };
        Battery b = new Battery() {
            @Override
            public void charge() {
                System.out.println("Charging");
            }
        };
        c.calculate();
        c.music();
        b.charge();
    }
}
