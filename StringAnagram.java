import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("Levis", "sile v"));
    }

    public static boolean isAnagram(String str1, String str2) {
        String firstStr = str1.replaceAll("\\s+", "");
        String secondStr = str2.replaceAll("\\s+", "");

        if (firstStr.length() != secondStr.length()) {
            return false;
        } else {
            char[] charOfFirstStr = firstStr.toLowerCase().toCharArray();
            char[] charOfSecondStr = secondStr.toLowerCase().toCharArray();
            Arrays.sort(charOfFirstStr);
            Arrays.sort(charOfSecondStr);
            return Arrays.equals(charOfFirstStr, charOfSecondStr);
        }
    }
}
