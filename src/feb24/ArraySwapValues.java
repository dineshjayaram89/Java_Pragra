package feb24;

import java.util.ArrayList;

public class ArraySwapValues {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1001);
        al.add(200);
        al.add(350);
        al.add(145);
        al.add(50);
        al.add(60);
        al.add(232);
        System.out.println(al);
        int firstElement = 200;
        int secondElement = 232;
        int firstIndex = -1;
        int secondIndex = -1;

        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) == firstElement) {
                firstIndex = i;
            }
            if (al.get(i) == secondElement) {
                secondIndex = i;
            }
        }
        if (firstIndex != -1 && secondIndex != -1) {
             int temp = al.get(firstIndex);
            al.set(firstIndex, al.get(secondIndex));
            al.set(secondIndex, temp);
            System.out.println("ArrayList after swapping:");
            System.out.println(al);
        } else {
            System.out.println("One or both elements not found in the ArrayList.");
        }
    }
}

