public class VowelCheck54 {
    public static void main(String[] args) {
        vowelInString("bikasjh");

    }

    public static boolean isVowel(char ch) {
        char ch1 = Character.toLowerCase(ch);
        return ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u';

    }

    public static void vowelInString(String str) {
        int count = 0;
        char[] ch = str.toCharArray();
        for (char ch1 : ch) {
            if (isVowel(ch1) == true) {
                System.out.println(ch1 + " is vowel");
                count++;
            }
        }
        System.out.println("Total number of the vowel is :: " + count);
    }
}
