package Jan27;

public class StudnetStaticVar {

    int id;
    String firstName;
    String lastName;
    static String companyName = "Pragra";

    public StudnetStaticVar(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;

    }
    public void print(){
        System.out.println("Student Details: "+id + " " +firstName+ " " +lastName );
        printCompany();
    }

    public static void printCompany(){
        System.out.println(companyName);
    }
}
