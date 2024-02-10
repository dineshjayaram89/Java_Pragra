package Assignments.Array;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {5,7,10,9,3,2};
        for(int a : arr){
            System.out.println(a);
        }
        System.out.println("The revered array is ");
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int k = arr[i];
            arr[i] = arr[j];
            arr[j] = k;
            i++;
            j--;
        }
        for(int b:arr){
            System.out.println(b);
        }
    }
}
