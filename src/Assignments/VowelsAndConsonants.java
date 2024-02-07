package Assignments;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        String st = "Hello My Name is Dinesh";
        char[] chars = st.toCharArray();
        int vowels = 0;
        int consonant = 0;
        for (char a :chars){
            if (a == 'a' || a == 'e'|| a == 'i' || a == 'o' || a == 'u') {
                vowels++;
            }
            else {
                consonant++;
            }
        }
        System.out.println("Vowels : " +vowels);
        System.out.println("Consonants: "+consonant);
    }
}
