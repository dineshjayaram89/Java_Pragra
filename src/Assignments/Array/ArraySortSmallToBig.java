package Assignments.Array;

public class ArraySortSmallToBig {
    public static void main(String[] args) {
        int[] arr = {51, 17, 111, 921, 12333, 1122};
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int k : arr) {
            System.out.println(k);
        }
    }
}
