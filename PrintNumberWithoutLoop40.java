public class PrintNumberWithoutLoop40 {
    public static void main(String[] args) {
        printNumber(5, 100);
    }

    // Using recursion method.

    public static void printNumber(int number, int printUpto) {
        if (number < printUpto) {
            System.out.println(number);
            number = number + 5;
            printNumber(number, printUpto);
        }
    }
}
