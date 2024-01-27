package Jan27.array;

import java.util.Scanner;

public class fruitArray {
    public static void main(String[] args) {
        String[] str = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Give "+str.length+ " fruit names");
        for (int i = 0; i < str.length; i++)
        {
            String value = sc.next();
            str[i] = value;
        }
        System.out.println("The values in the list are as follows:");
        for (String s : str) {
            System.out.println(s);
        }
    }
}
