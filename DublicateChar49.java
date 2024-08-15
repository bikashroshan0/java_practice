import java.util.HashMap;
import java.util.Map;
import java.util.Set;;

public class DublicateChar49 {
    public static void main(String[] args) {

        dublicateArray("bikiashi");
    }

    public static void dublicateArray(String str) {
        char[] storeChar = str.toCharArray();
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for (int i = 0; i < storeChar.length; i++) {
            if (charMap.containsKey(storeChar[i])) {
                charMap.put(storeChar[i], charMap.get(storeChar[i]) + 1);
            } else {
                charMap.put(storeChar[i], 1);
            }
        }

        Set<Map.Entry<Character, Integer>> enterySet = charMap.entrySet();
        for (Map.Entry<Character, Integer> entery : enterySet) {
            if (entery.getValue() > 1) {
                System.out.println("Dublicate char is :: " + entery.getKey()+ " = " + entery.getValue());
            }
        }

    }

}
