package Jan27.array;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {10,30,43,54,23,543,43,32};
        int sum = add(array);
        System.out.println("Sum of the array: " +sum);
    }

    public static int add(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
                    }
        return sum;
    }


}
