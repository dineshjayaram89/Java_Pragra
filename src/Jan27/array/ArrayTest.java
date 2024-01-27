package Jan27.array;

import java.util.Scanner;

public class ArrayTest {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5};
            for (int j: number) {
            if(j == 4){
            System.out.println(number[j]);}
        }
        int[] arr = new int[5];
        System.out.println("Give "+arr.length+ " values");
        for (int i = 0; i < arr.length; i++)
            {
                int value = sc.nextInt();
                arr[i] = value;
            }
        System.out.println("The values in the list are as follows:");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
