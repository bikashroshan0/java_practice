import java.util.Map;
import java.util.HashMap;

public class CountCharInWord {
    public static void main(String[] args) {
        String str = "BIKASHASfdsacwA";
        Map<Character, Integer> charMap = countCharInWord(str);
        System.out.println(str + " : " + charMap);

    }

    public static Map<Character, Integer> countCharInWord(String str) {
        str = str.toLowerCase();
        Map<Character, Integer> charWord = new HashMap<Character, Integer>();

        char[] strToChar = str.toCharArray();
        for (char c : strToChar) {
            if (!charWord.containsKey(c)) {
                charWord.put(c, 1);
            } else {
                charWord.put(c, charWord.get(c) + 1);
            }
        }
        return charWord;
    }
}
