package Jan16;

import java.util.Scanner;

public class table5Loops2 {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please find the number to find its factorial: ");
        int j = sc.nextInt();
        /*while (i <= 10){
            System.out.println("5 * "+i+" = "+(j*i));
            i++;
        }*/
        int factorial = 1;
        while (i <= j){
            factorial = factorial * j;
            j--;
    }
        System.out.println("Your answer is: " +factorial);
}}

/*
5 * 1 = 5
 */