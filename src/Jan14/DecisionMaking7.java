package Jan14;

import java.util.Scanner;

public class DecisionMaking7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Ticket booking System");
        System.out.println("Enter the day of the week to check the pricing \n " +
                "Options Weekday, Saturday, Sunday: ");
        String day = sc.nextLine();
        if (day.equalsIgnoreCase("Weekday")) {
            System.out.println("Ticket Price is $10");
        } else if (day.equalsIgnoreCase("Saturday")) {
            System.out.println("Ticket Price is $15");
        } else if (day.equalsIgnoreCase("Sunday") ) {
            System.out.println("Ticket Price is $15");
        }
    }
}
