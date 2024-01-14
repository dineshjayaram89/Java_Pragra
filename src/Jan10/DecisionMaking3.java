package Jan10;

import java.util.Scanner;

public class DecisionMaking3 {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("!LEAP YEAR CHECK!");
        System.out.print("\nEnter the year you want to check number: ");
        int year = sc.nextInt();
        if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ){
            System.out.println(year+" is a Leap year");
        }
        else{
            System.out.println(year+ " is not a leap year");
        }
}}
