package Feb6.OOPS.Inheritance.Phone;

public class Samsung extends SmartPhone{
    String brand;
    String bodyType;

    public Samsung(String model, String color, String brand, String bodyType) {
        super(model, color);
        this.brand = brand;
        this.bodyType = bodyType;
    }
    public boolean useAI(){
        System.out.println("You can use AI (This is from the child class)");
        return true;
    }
    public void printDetails(){
        System.out.println("Brand: " +brand);
        System.out.println("Body Type: "+bodyType);
        System.out.println("Model: "+model);
        System.out.println("color: "+color);
    }
}
