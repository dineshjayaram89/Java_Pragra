package Feb10.Polymorphism;

public class BMO extends CanadaBank{
    public BMO(double interestRate) {
        super(interestRate);
    }

    @Override
    public double getRateOfInterest() {
        return (interestRate+2.0);
    }
}
