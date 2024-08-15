import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.List;

public class DublicateWordInString22 {
    public static void main(String[] args) {
        String str = "Hey my name is bikash and bikash is a good guy";
        // dublicateWord(str);
        // dublicateWordUsingHashSet(str);
        finfDubWordUsingMap(str);
    }

    public static void dublicateWord(String str) {
        List<String> dublicatedStrings = new ArrayList<String>();
        String[] splitedStr = str.split(" ");
        for (int i = 0; i < splitedStr.length; i++) {
            for (int j = i + 1; j < splitedStr.length; j++) {
                if (splitedStr[i].equalsIgnoreCase(splitedStr[j])) {
                    dublicatedStrings.add(splitedStr[i]);
                    System.out.println(splitedStr[i] + " :: dublicate word ");

                }

            }
        }
        ;
        System.out.println(dublicatedStrings);
    }

    public static void dublicateWordUsingHashSet(String str) {
        ArrayList<String> dublicatedStrings = new ArrayList<String>();
        HashSet<String> words = new HashSet<String>();
        String[] splitedStr = str.split(" ");
        for (String element : splitedStr) {
            if (words.add(element) == false) {
                System.out.println(element + " :: dublicater word");
                dublicatedStrings.add(element);
            }
        }
        System.out.println(dublicatedStrings);

    }

    public static void finfDubWordUsingMap(String str) {
        String[] splitedWords = str.split(" ");
        Map<String, Integer> storeWord = new HashMap<String, Integer>();
        for (String word : splitedWords) {
            if (!storeWord.containsKey(word)) {
                storeWord.put(word, 1);
            } else {
                storeWord.put(word, storeWord.get(word) + 1);
            }
        }
        System.out.println(storeWord);
        Set<Map.Entry<String, Integer>> entrySet = storeWord.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println("Dublictae words is : " + entry.getKey() + " = " + entry.getValue());
            }
        }
    }

}
