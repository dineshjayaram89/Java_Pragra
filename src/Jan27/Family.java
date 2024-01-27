package Jan27;

public class Family {
    String firstName;
    static String lastName = "Jayaram";
    int age;
    static int houseNumber = 748;

    public Family(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public void print(){
        System.out.println("First Name: " +firstName+ " Last Name: "+lastName+ " Age: "+age+" House Number: "+houseNumber);
    }

}


