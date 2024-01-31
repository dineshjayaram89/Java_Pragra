package Assignments;

import java.util.Scanner;

public class AverageOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {10,30,43,54,23,543,43,32};
        double avg = average(array);
        System.out.println("Sum of the array: " +avg);
    }

    public static double average(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum/arr.length;
        return avg;
    }

}
