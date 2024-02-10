package Feb10.Polymorphism;

public class RBC extends  CanadaBank{
    public RBC(double interestRate) {
        super(interestRate);
    }

    @Override
    public double getRateOfInterest() {
        return (interestRate+1.2);
    }
}
