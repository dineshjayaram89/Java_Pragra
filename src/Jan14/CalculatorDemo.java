package Jan14;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number: ");
        double x = sc.nextDouble();
        System.out.print("Enter second number: ");
        double y = sc.nextDouble();
        System.out.print("Enter the function you want to \n1. Add. \n2. Subtract. \n3. Multiply. \n4. Divide.\n5.Modulus. \nYour selection:");
        int z = sc.nextInt();
        /*
        if (z == 1)
        {
            double add = sum(x,y);
            System.out.println("The addition result:"+add);
        } else if (z ==3) {
            double product = mul(x,y);
            System.out.println("The product of two numbers is:"+product);
        }  else if (z ==2) {
            double subtract = sub(x,y);
            System.out.println("The subtraction result:"+subtract);
        }  else if (z ==4) {
            double division = div(x,y);
            System.out.println("The div result:"+division);
        }  else if (z ==5) {
            double result = mod(x,y);
            System.out.println("The mod result:"+result);
        }
        else {
            System.out.println("Invalid Selection. Please select between 1 and 5");
        }
        */
        switch (z) {
            case 1:
                double addResult = sum(x, y);
                System.out.println("The addition result: " + addResult);
                break;
            case 2:
                double subtractResult = sub(x, y);
                System.out.println("The subtraction result: " + subtractResult);
                break;
            case 3:
                double productResult = mul(x, y);
                System.out.println("The product of two numbers is: " + productResult);
                break;
            case 4:
                double divisionResult = div(x, y);
                System.out.println("The division result: " + divisionResult);
                break;
            case 5:
                double modResult = mod(x, y);
                System.out.println("The mod result: " + modResult);
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
    public static double sum(double x, double y){
        return x + y;
    }
    public static double mul(double x, double y){
        return x * y;
    }
    public static double div(double x, double y){
        return x / y;
    }
    public static double sub(double x, double y){
        return x - y;
    }
    public static double mod(double x, double y){
        return x % y;
    }



}
