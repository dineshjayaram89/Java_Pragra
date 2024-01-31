package Jan30;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] twoDArray = {{1, 2}, {3, 4}, {5, 6}};
        for(int[] i : twoDArray){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
