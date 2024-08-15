import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DublicateElementInArray5 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String names[] = { "Bikash", "Akash", "Suman", "Bikash", "Rahul", "Akash", "Roshan", "Bikash" };

        // high time complexity = o^n2

        // for (int i = 0; i < names.length; i++) {
        // for (int j = i + 1; j < names.length; j++) {
        // if (names[i].equals(names[j])) {
        // System.out.println("Dublicate name is :: " + names[i]);
        // }
        // }
        // }

        // Using HashSet

        // Set<String> nameSet = new HashSet<String>();
        // for (String name : names) {
        // if (nameSet.add(name) == false) {
        // System.out.println("Dublicate name is :: " + name);
        // }
        // }

        // Using HashMap, time complexity = o(n)

        Map<String, Integer> storeMap = new HashMap<String, Integer>();
        for (String name : names) {
            if (!storeMap.containsKey(name)) {
                storeMap.put(name, 1);
            } else {
                storeMap.put(name, storeMap.get(name) + 1);
                // System.out.println("Dublicate value is :: " + name);
            }

        }

        // get Value from hashMap, time complexity = o(2n)

        Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
        for (Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() != 1) {
                System.out.println("Dublicate name is :: " + entry.getKey() + " = " + entry.getValue());
            }
        }

    }
}
