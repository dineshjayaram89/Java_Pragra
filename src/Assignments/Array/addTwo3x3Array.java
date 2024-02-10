package Assignments.Array;

public class addTwo3x3Array {
    public static void main(String[] args) {
        int[][] arr1 = {{54, 12, 4}, {2, 36, 40}, {6, 4, 5}};
        int[][] arr2 = {{2, 9, 40}, {5, 3, 6}, {3, 5, 12}};
        char[] chars = {'a','b'};
        int[][] sum = new int[3][3];
        /*System.out.println(arr1.length+","+arr2.length);
        System.out.println(arr1[1].length);*/
       for (int i = 0; i < arr1.length ; i++) {
           for (int j = 0; j < arr1[i].length ; j++) {
               sum[i][j]=arr1[i][j]+arr2[i][j];
           }
        }
    for ( int[] a :sum){
        for (int b :a){
            System.out.print(b + " ");
        }
    }
    }
}
