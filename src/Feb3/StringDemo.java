package Feb3;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        /*String name = "Dinesh";
        System.out.println(name);
        String n = new String("Jayaram");
        System.out.println(n);*/

        String s1 = "Phone";
        String s2 = "Phone";
        String s3 = "Phone";
        String s4 = new String("Phone");
        String s5 = "Phone";

        int[] i = {1,2};
        int[] j = {1,2};
        System.out.println("Compare i and j using Arrays.equal " + (Arrays.equals(i,j)));
        System.out.println(i==j);
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s3==s1);
        System.out.println(s4==s1);
        System.out.println(s1==s5);
        System.out.println();
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s1));
        System.out.println(s3.equals(s5));
        System.out.println(s4.equals(s1));
        System.out.println(s4.equals(s5));
    }
}
