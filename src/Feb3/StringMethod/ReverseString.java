package Feb3.StringMethod;

public class ReverseString {
    public static void main(String[] args) {
        String st = "pragra";
        System.out.println(st);
        //using array
        char[] ch = st.toCharArray();
        for (int i = 0, j = ch.length - 1 ; i < j ; i++,j--) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        for (char i : ch) {
            System.out.print(i);
        }
    }
}


