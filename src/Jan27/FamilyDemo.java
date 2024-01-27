package Jan27;

public class FamilyDemo {
    public static void main(String[] args) {
        System.out.println("Family Ledger");
        System.out.println("Father");
        Family f1 = new Family("Dinesh",33);
        f1.print();
        System.out.println("Mother");
        Family f2 = new Family("Suganya",32);
        f2.print();
        System.out.println("Child");
        Family f3 = new Family("Negi",6);
        f3.print();
    }
}
