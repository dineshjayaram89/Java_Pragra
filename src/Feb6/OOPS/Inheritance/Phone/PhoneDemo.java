package Feb6.OOPS.Inheritance.Phone;

public class PhoneDemo {
    public static void main(String[] args) {
        Samsung p = new Samsung("S24","Black", "Samsung", "fold");
        p.printDetails();
        System.out.println("Features:");
        System.out.println("---------");
        p.makeCall();
        p.makeText();
        p.surfInternet();
        p.takePicture();
        p.useAI();

    }
}
