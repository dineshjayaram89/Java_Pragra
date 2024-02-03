package Feb3.StringMethod;

import java.util.stream.IntStream;

public class StringTest {
    public static void main(String[] args) {
        String name = "Dinesh";
        String lastN = "DiNeSh";
        char charAt = name.charAt(2);
        System.out.println(charAt);
        boolean equals = name.equals(lastN);
        System.out.println(equals);
        String upperCase = name.toUpperCase();
        System.out.println(upperCase);
        boolean equalsIgnoreCase = name.equalsIgnoreCase(lastN);
        System.out.println(equalsIgnoreCase);
        boolean i = name.contains("i");
        System.out.println(i);
        System.out.println();
        int i1 = name.compareTo(lastN);
        System.out.println(i1);
        int indexOf = name.indexOf("s");
        System.out.println(indexOf);
        boolean endsWith = name.endsWith("inesh");
        System.out.println(endsWith);
        boolean startsWith = name.startsWith("Dine");
        System.out.println(startsWith);
        String substring = name.substring(1, 4);
        System.out.println(substring);

    }
}
