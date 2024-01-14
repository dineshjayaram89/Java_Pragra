package Jan14;

import java.util.Scanner;

public class DecisionMaking4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //System.out.println("***Welcome to the voting booth***");
        System.out.println("Enter the Age:");
        int age = sc.nextInt();

        if(age > 0 && age < 13) {
            System.out.println("You are a Child");
        }
        else if (age <= 19) {
            System.out.println("You are a teenager");
        }
        else if (age <= 59) {
            System.out.println("You are a Adult");
        }
        else {
            System.out.println("You are a Senior Citizen");
        }


        }
    }


