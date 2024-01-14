package Jan14;

import java.util.Scanner;

public class DecisionMaking5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //System.out.println("***Welcome to the voting booth***");

        System.out.println("Enter the first:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second:");
        int num2 = sc.nextInt();
        System.out.println("Enter the second:");
        int num3 = sc.nextInt();
        int largest;
//num 1 = 11, num 2 = 11, num 3 = 11
        if (num1 > num2 && num1 > num3) {
            largest = num1;
        } else if (num2 > num3) {
            largest = num2;
        } else {
            largest = num3;

        }
        System.out.println("The largest number is: " + largest);
    }}
