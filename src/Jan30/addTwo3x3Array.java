package Jan30;

public class addTwo3x3Array {
    public static void main(String[] args) {
        int[][] arr1 = {{54, 12, 4}, {2, 36, 40}, {6, 4, 5}};
        int[][] arr2 = {{2, 9, 40}, {5, 3, 6}, {3, 5, 12}};
        char[] chars = {'a','b'};
        int sum = 0;
        for (int[] row1 : arr1) {
            for (int value1 : row1) {
                sum += value1;
            }
            System.out.println(sum);
            for (int[] row2 : arr2) {
                for (int value2 : row2) {
                    sum += value2;
                }
                System.out.println(sum);
            }
        }
        System.out.println("Sum: " + sum);
    }
}
