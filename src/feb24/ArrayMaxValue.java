package feb24;

import java.util.ArrayList;

public class ArrayMaxValue {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1001);
        al.add(200);
        al.add(350);
        al.add(145);
        al.add(50);
        al.add(60);
        al.add(232);
        int max = al.get(0);
        for (int i = 1; i < al.size(); i++) {
            int current = al.get(i);
            if (current > max) {
                max = current;
            }
        }
    }
}
