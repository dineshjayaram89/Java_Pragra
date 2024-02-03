package Feb3;

import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {
        char[] chars = new char[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 char ");
        for ( int i = 0; i <chars.length; i++ ){
            chars[i] = sc.next().charAt(0);
        }

        for (char a : chars) {
            System.out.print(a);
        }
    }
}