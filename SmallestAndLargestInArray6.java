
import java.util.Arrays;;

public class SmallestAndLargestInArray6 {
    public static void main(String[] args) {
        int[] arrayNumber = { -2, -10, 4, 2, 36, 25, 252, 34 };
        int smallest = arrayNumber[0];
        int largest = arrayNumber[0];
        Arrays.sort(arrayNumber);

        for (int i = 1; i < arrayNumber.length; i++) {
            if (arrayNumber[i] > largest) {
                largest = arrayNumber[i];
            } else if (arrayNumber[i] < smallest) {
                smallest = arrayNumber[i];
            }
        }

        Arrays.sort(arrayNumber);
        System.out.println("Largest number : " + arrayNumber[arrayNumber.length - 1]);
        System.out.println("Smallest number : " + arrayNumber[0]);

        System.out.println("Largest number is " + largest);
        System.out.println("Smallest number is " + smallest);

    }
}
