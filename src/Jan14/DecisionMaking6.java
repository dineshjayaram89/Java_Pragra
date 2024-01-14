package Jan14;

import java.util.Scanner;

public class DecisionMaking6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        double marks = sc.nextDouble();
        if (marks >= 90){
            System.out.println("Your Grade is A. Congratulations!");
        } else if (marks >=80 && marks <=89) {
            System.out.println("Your Grade is B. Congratulations!");
        } else if (marks >= 70 && marks <=79) {
            System.out.println("Your Grade is C. Passing grade!");
        }
        else {
            System.out.println("Your Grade is D.");
        }
    }}
