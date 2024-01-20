package Jan20;

import java.util.Scanner;

public class AreOfShapesDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
        System.out.println("Choose a shape 1.Circle, 2.Square, 3.Rectange");
        int a = sc.nextInt();
        FindAreaOfShape area = new FindAreaOfShape();
        switch (a){
            case 1:
                System.out.println("Enter the Radius of the circle: ");
                area.a = sc.nextDouble();
                System.out.println("Area of the circle with the radius "+area.a+ ": "+ area.circle(area.a));
                break;
            case 2:
                System.out.println("Enter the length of the Square side: ");
                area.a = sc.nextDouble();
                System.out.println("Area of the square with the side length of  "+area.a+ ": "+ area.square(area.a));
                break;
            case 3:
                System.out.println("Enter the length of the rectangle: ");
                area.a = sc.nextDouble();
                System.out.println("Enter the height of the rectangle: ");
                area.b = sc.nextDouble();
                System.out.println("Area of the square with the length of  "+area.a+ " and height of "+area.b+": "+ area.rectangle(area.a, area.b));
                break;
            }
            System.out.println();
            System.out.println("Do you to continue 1.Yes 2.No");
            choice = sc.nextInt();
        }while (choice == 1);
    }
}

