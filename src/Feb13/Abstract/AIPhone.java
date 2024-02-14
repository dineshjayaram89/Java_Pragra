package Feb13.Abstract;

public class AIPhone extends SmartPhone{
    @Override
    public void cordless() {
        System.out.println("Call is made on a Cordless Mobile Phone");
    }

    @Override
    public void call() {
        System.out.println("Call is made on a phone");

    }

    @Override
    public void Internet() {
        System.out.println("Surfing the internet");
    }
    public void generate(){
        System.out.println("An image was generated for the given prompt");
    }
}
