package Feb10.Encapsulation;

public class encapsulationDemo {
    public static void main(String[] args) {
        ReadOnlyClass r = new ReadOnlyClass("Dinesh","33");
        WriteOnlyClass w = new WriteOnlyClass("Suganya","32");
        ReadAndWriteClass rw = new ReadAndWriteClass("Negi","6");

        System.out.println("Read only Class demo:");
        System.out.println(r.getName());
        System.out.println(r.getAge());
        System.out.println();
        System.out.println("Trying to set the details of read only class will not work since there is no setter method");
        System.out.println();
        System.out.println("Write only Class demo:");
        System.out.println("Trying to get the details of write only class will not work since there is no getter method");
        System.out.println("\nChanging initial details of Write only Class details using setter");
        w.setName("Sugan");
        w.setAge("Thirty Two");
        System.out.println();
        System.out.println("Read and write class demo:");
        System.out.println("\nInitial details of rw class: ");
        System.out.println("Name: " +rw.getName());
        System.out.println("Age: " +rw.getAge());
        System.out.println("\nChanging initial details of RW Class details using setter");
        rw.setAge("Six");
        rw.setName("Naegizhan");
        System.out.println("New details of rw class: ");
        System.out.println("Name: " +rw.getName());
        System.out.println("Age: " +rw.getAge());



    }

}
