package Jan14;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        CalculatorClass cal = new CalculatorClass();
        int c = 1 ;
        int z;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the function you want to \n1. Add. \n2. Subtract. \n3. Multiply. \n4. Divide.\n5.Modulus. \n6.Exit \nYour selection:");
            z = sc.nextInt();
            while (c == 1 ){
                switch (z) {
                    case 1:
                        System.out.println("How many values you want to add 1. Two. 2. Three 3. Four");
                        int ch = sc.nextInt();
                        if (ch == 1) {
                            System.out.print("Enter first number: ");
                            cal.x = sc.nextDouble();
                            System.out.print("Enter second number: ");
                            cal.y = sc.nextDouble();
                            System.out.println("The addition result: " + cal.sum(cal.x, cal.y));
                        } else if (ch == 2) {
                            System.out.print("Enter first number: ");
                            cal.x = sc.nextDouble();
                            System.out.print("Enter second number: ");
                            cal.y = sc.nextDouble();
                            System.out.print("Enter third number: ");
                            cal.z = sc.nextDouble();
                            System.out.println("The addition result: " + cal.sum(cal.x, cal.y, cal.z));
                        } else if (ch == 3) {
                            System.out.print("Enter first number: ");
                            cal.x = sc.nextDouble();
                            System.out.print("Enter second number: ");
                            cal.y = sc.nextDouble();
                            System.out.print("Enter third number: ");
                            cal.z = sc.nextDouble();
                            System.out.print("Enter fourth number: ");
                            cal.x1 = sc.nextDouble();
                            System.out.println("The addition result: " + cal.sum(cal.x, cal.y, cal.z, cal.x1));
                        } else {
                            System.out.println("Wrong selection");
                            break;
                        }
                        break;
                    case 2:
                        System.out.println("The subtraction result: " + cal.sub(cal.x, cal.y));
                        break;
                    case 3:
                        System.out.println("How many values you want to add 1. Two. 2. Three 3. Four");
                        int ch1 = sc.nextInt();
                        if (ch1 == 1) {
                            System.out.print("Enter first number: ");
                            cal.x = sc.nextDouble();
                            System.out.print("Enter second number: ");
                            cal.y = sc.nextDouble();
                            System.out.println("The addition result: " + cal.mul(cal.x, cal.y));
                        } else if (ch1 == 2) {
                            System.out.print("Enter first number: ");
                            cal.x = sc.nextDouble();
                            System.out.print("Enter second number: ");
                            cal.y = sc.nextDouble();
                            System.out.print("Enter third number: ");
                            cal.z = sc.nextDouble();
                            System.out.println("The addition result: " + cal.mul(cal.x, cal.y, cal.z));
                        } else if (ch1 == 3) {
                            System.out.print("Enter first number: ");
                            cal.x = sc.nextDouble();
                            System.out.print("Enter second number: ");
                            cal.y = sc.nextDouble();
                            System.out.print("Enter third number: ");
                            cal.z = sc.nextDouble();
                            System.out.print("Enter fourth number: ");
                            cal.x1 = sc.nextDouble();
                            System.out.println("The addition result: " + cal.mul(cal.x, cal.y, cal.z, cal.x1));
                        } else {
                            System.out.println("Wrong selection");
                            break;
                        }
                        break;
                    case 4:
                        System.out.print("Enter first number: ");
                        cal.x = sc.nextDouble();
                        System.out.print("Enter second number: ");
                        cal.y = sc.nextDouble();
                        System.out.println("The division result: " + cal.div(cal.x, cal.y));
                        break;
                    case 5:
                        System.out.print("Enter first number: ");
                        cal.x = sc.nextDouble();
                        System.out.print("Enter second number: ");
                        cal.y = sc.nextDouble();
                        System.out.println("The mod result: " + cal.mod(cal.x, cal.y));
                        break;
                    case 6:
                        c = 2;
                        break;
                    default:
                        System.out.println("Invalid choice");
                }

                if( z != 6 ) {
                    System.out.println("Do you still want to continue 1. Yes or 2. No");
                c = sc.nextInt();
                }
            } ;
        }while (z != 6);

    }
}


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
        */