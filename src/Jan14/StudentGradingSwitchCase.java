package Jan14;

import java.util.Scanner;

public class StudentGradingSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Grade:");
        System.out.println("Your choices: A,B,C,D");
        String a = sc.next();
        switch (a.toUpperCase()){
            case "A":
                System.out.println("You took the top Grade! Congratulations!");
                break;
            case "B":
                System.out.println("You are above average! Congratulations!");
                break;
            case "C":
                System.out.println("You are average. Lets do better next time!");
                break;
            case "D":
                System.out.println("You are below average. Meet with your teacher!");
                break;
            default:
                System.out.println("Invalid Selection Please only choose A,B,C,D");
        }
    }
}
