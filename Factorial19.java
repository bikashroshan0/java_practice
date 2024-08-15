public class Factorial19 {
    public static void main(String[] args) {
        int number = 4;
        factorialOfNumber(4);
        System.out.println("Factorial of " + number + " is = " + factorialNum(number));
    }

    public static void factorialOfNumber(int number) {
        int factorialOfNumber = 1;
        for (int i = 1; i <= number; i++) {
            factorialOfNumber = (factorialOfNumber * i);
        }
        System.out.println("Factorial of " + number + " is = " + factorialOfNumber);
    }

    // Factorial by rucurrsion method : Recursion method is the type of method which
    // call itself in the method body.

    public static int factorialNum(int num) {
        if (num == 0) {
            return 1;
        } else
            return (num * factorialNum(num - 1));
    }
}
