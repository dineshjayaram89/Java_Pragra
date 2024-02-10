package Assignments.String;

import java.util.Scanner;

public class StringReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine(); //Hello World
        String[] s = st.split(" ");
        for (int start = 0, end = s.length -1 ; start < end ; start++, end --) {
            String temp = s[start];
            s[start] = s[end];
            s[end] = temp;
        }
        for (String str : s){
            System.out.print(str+" ");
        }
        }
}





