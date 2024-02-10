package Feb10.Polymorphism;

public class InterestRateDemo {
    public static void main(String[] args) {
        BMO b = new BMO(6.5);
        RBC r = new RBC(6.5);
        ScotiaBank s = new ScotiaBank(6.5);
        System.out.println("BMO Interest Rate: " + b.getRateOfInterest());
        System.out.println("RBC Interest Rate: " + r.getRateOfInterest());
        System.out.println("Scotia Interest Rate: " + s.getRateOfInterest());
    }
}
