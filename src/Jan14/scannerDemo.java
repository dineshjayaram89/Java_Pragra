package Jan14;

import java.util.Scanner;

public class scannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number- ");
        double x = sc.nextDouble();
        System.out.print("Enter second number- ");
        double y = sc.nextDouble();
        System.out.println("The X + Y :"+(x+y));
        System.out.println("The X - Y :"+(x-y));
        System.out.println("The X * Y :"+(x*y));
        System.out.println("The x / Y :"+(x/y));

    }
}
