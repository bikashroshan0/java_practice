import java.util.*;;

public class MoveZeroToRight {
    public static void main(String[] args) {
        int numbers[] = { 2, 0, 234, 20, 0, 3, 0, 234, 1, 0, 43 };
        int[] updatedNUmbers = moveZeroToLeft(numbers);
        System.out.println(Arrays.toString(updatedNUmbers));

    }

    public static int[] moveZeroToRight(int[] numbers) {
        if (numbers.length == 1) {
            return numbers;

        }
        int count = 0;
        int updatedArray[] = new int[numbers.length];
        for (int num : numbers) {
            if (num != 0) {
                updatedArray[count] = num;
                count++;
            }
        }
        return updatedArray;
    }

    public static int[] moveZeroToLeft(int[] numbers) {
        if (numbers.length == 1) {
            return numbers;
        }
        int numberOfZero = 0;
        // int count = 0;
        int[] updatedNumbers = new int[numbers.length];
        for (int num : numbers) {
            if (num == 0) {
                numberOfZero++;
            }
        }
        for(int num : numbers){
            if(num != 0){
                updatedNumbers[numberOfZero] = num;
                numberOfZero++;
            }
        }
        return updatedNumbers;
    }
}
