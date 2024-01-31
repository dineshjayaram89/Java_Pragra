package Jan30;

public class ArraySecondBiggest {
    public static void main(String[] args) {
        int[] array = {10,30,43,54,23,543,43,32};
        int j = 0;
        int k = 1;
        int big = 0;
        int secondBig = 0;
        while ( k < array.length){
            if (array[j] > array[k]){
                if (array[j] > big){
                    big = array[j];
                }else if (array[j] > secondBig){ secondBig = array[j];}
            }
            else if (array[k] > array[j]){
                if (array[k] > big){
                    big = array[k];
                }else if (array[k] > secondBig){ secondBig = array[k];}
            }
            j += 2;
            k += 2;
        }
        System.out.println("The second Biggest: "+secondBig);
    }
}
