import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DigitFrequency {
    public static void main(String[] args) {
        digitFrequency(2983482);
    }

    public static void digitFrequency(int number) {
        Map<Integer, Integer> stroreNum = new HashMap<Integer, Integer>();
        while (number > 0) {
            int lastDigit = number % 10;
            if (stroreNum.containsKey(lastDigit)) {
                stroreNum.put(lastDigit, stroreNum.get(lastDigit) + 1);
            } else {
                stroreNum.put(lastDigit, 1);
            }
            number = number / 10;
        }

        Set<Integer> keySet = stroreNum.keySet();
        for (int temp : keySet) {
        System.out.println("Number of frequecy of " + temp + " is : " +
        stroreNum.get(temp));
        }
        // stroreNum.entrySet().forEach(
        //         entry -> System.out.println("Number of frequecy of " + entry.getKey() + " is : " + stroreNum.get(entry.getValue())));
    }

}
