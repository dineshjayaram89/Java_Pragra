package Feb10.Aggregation;

import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student name: " );
        String name = sc.nextLine();
        System.out.println("Enter the student id: " );
        String id = sc.nextLine();
        System.out.println("Enter the student age: " );
        String age = sc.nextLine();
        System.out.println("Enter the student Street no: " );
        String  stNo = sc.nextLine();
        System.out.println("Enter the student Street: " );
        String stName = sc.nextLine();
        System.out.println("Enter the student City: " );
        String stCity = sc.nextLine();
        System.out.println("Enter the student Country: " );
        String stCountry = sc.nextLine();
        System.out.println("Enter the student postal code: " );
        String stPostal = sc.nextLine();
        Address address = new Address(stNo,stName,stCity,stCountry,stPostal );
        Student student = new Student(name,id,age,address);
        System.out.println("--------------------");
        System.out.println("Student Details: ");
        System.out.println(student.name);
        System.out.println(student.id);
        System.out.println(student.age);
        System.out.println(student.address.streetNumber + ","+student.address.streetName+ ","+student.address.city+ ","+ student.address.country+ ","+ student.address.postalCode);
    }
}
