package Jan30;

public class ArraySmallest {
    public static void main(String[] args) {
        int[] arr = {51, 17, 111, 921, 12333, 1122};
        int small = 0;
        System.out.print("The example array is: ");
        for (int a : arr) {
            System.out.println(a);
        }
        int i = 0;
        int j = 1;
        while (j < arr.length) {
            int k = arr[i];
            int l = arr[j];
            if (k < l) {
                if (k < small) {
                    small = k;
                }
            } else if (k > l) {
                if (l < small) {
                    small = l;
                }
            }
            i += 2;
            j += 2;
        }
        System.out.println("The biggest number in the array is: " + small);
    }
}
