package Feb10.Polymorphism;

public class ScotiaBank extends CanadaBank{
    public ScotiaBank(double interestRate) {
        super(interestRate);
    }

    @Override
    public double getRateOfInterest() {
        return (interestRate+1.3);
    }
}
