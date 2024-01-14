package Jan7;

import java.util.Scanner;

public class MyFirstJavaCode {
    /* main method (function)
    JVM - will look for main function
    Starting point of execution of code
     */

    public static void main(String[] args){
        System.out.println("Hello, World!");
        System.out.println("My name is Dinesh. This is my first Java Code");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number- ");
        double x = sc.nextDouble();
        System.out.print("Enter second number- ");
        double y = sc.nextDouble();
        System.out.print("Enter the function number you want to \n1. Add. \n2. Subtract. \n3. Multiply. \n4. Divide.\nYour selection:");
        int z = sc.nextInt();

        if (z == 1)
        {
            double add = sum(x,y);
            System.out.println("The addition result:"+add);
        } else if (z ==3) {
            double product = mul(x,y);
            System.out.println("The product of two numbers is:"+product);
        }
        else if (z ==2) {
            double subtract = sub(x,y);
            System.out.println("The subtraction result:"+subtract);
        }
        else if (z ==4) {
            double division = div(x,y);
            System.out.println("The subtraction result:"+division);
        }
    }
    public static double sum(double x, double y){
        double i = x + y;
        return i;
    }
    public static double mul(double x, double y){
        double i = x * y;
        return i;
    }
    public static double div(double x, double y){
        double i = x / y;
        return i;
    }
    public static double sub(double x, double y){
        double i = x - y;
        return i;
    }

}
