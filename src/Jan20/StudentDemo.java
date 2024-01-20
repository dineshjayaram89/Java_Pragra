package Jan20;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to Student logs");
        System.out.println(("Choose an option 1. Select a student 2. Exit"));
        int a = sc.nextInt();

        while (a != 2) {
            System.out.println(("Choose a student 1. Dinesh 2.Suganya 3. Exit"));
            int b = sc.nextInt();
            if (b == 1) {
                Student Dineh = new Student();
                Dineh.firstName = "Dinesh";
                Dineh.lastName = "Jayaram";
                Dineh.id = 12345;
                Dineh.email = "dinesh.jayaram89@gmail.com";

                System.out.println("Student name: " + Dineh.firstName + " " + Dineh.lastName);
                System.out.println("Choose what you want to do 1. Study, 2.Eat, 3. Sleep");
                int c = sc.nextInt();

                if (c == 1) {
                    Dineh.study();
                } else if (c == 2) {
                    Dineh.eat();
                } else if (c == 3) {
                    Dineh.sleep();
                } else {
                    System.out.println("Wrong selection going back to main screen");
                    continue;
                }
                System.out.println();

            } else if (b == 2) {

                Student Suganya = new Student();

                Suganya.firstName = "Suganya";
                Suganya.lastName = "Krish";
                Suganya.id = 54321;
                Suganya.email = "sugan.krish@gmail.com";

                System.out.println("Student name: " + Suganya.firstName + " " + Suganya.lastName);

                System.out.println("Choose what you want to do 1. Study, 2.Eat, 3. Sleep");
                int c = sc.nextInt();

                if (c == 1) {
                    Suganya.study();
                } else if (c == 2) {
                    Suganya.eat();
                } else if (c == 3) {
                    Suganya.sleep();
                } else {
                    System.out.println("Wrong selection going back to main screen");
                    continue;
                }

            }
            else if (b == 3) {
                break;
            } else {
                System.out.println("Wrong selection exiting");
                break;

            }

        }
    }
}