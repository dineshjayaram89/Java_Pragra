package Jan10;

public class AssignmentDemo {

    public static void main(String[] args) {

        int x = 20;
        int y = 20;
        int z = 19;
        /*z = x;
        x = y;
        y = z;
        System.out.println(x);
        System.out.println(y);*/

        System.out.println( x > y || x < y); //false
        System.out.println( x < y && y > z ); //false
        System.out.println( x == y || x > z ); //true
        System.out.println( x < y && x >= z ); //false
        System.out.println( x <= y || x > z ); //true
        System.out.println( x < y && x >= z ); //false

/*
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping:"
                           + " x = " + x + ", y = " + y);*/

    }
}