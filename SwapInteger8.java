public class SwapInteger8 {
    public static void main(String[] args) {
        // Swap two variable using third variable.

        int a = 29;
        int b = 34;
        int c = a;
        a = b;
        b = c;
        System.out.println("Swaped vaue of a(29)" + a);
        System.out.println("Swaped vaue of b(34)" + b);

        // using + & - operator
        int firstInt = 14;
        int secondInt = 25;

        firstInt = firstInt + secondInt;
        secondInt = firstInt - secondInt;
        firstInt = firstInt - secondInt;
        System.out.println("First (14) swaped number = " + firstInt);
        System.out.println("Second (25) swaped number = " + secondInt);

        // using * & / operator
        int x = 20;
        int y = 40;

        x = x * y;
        y = x / y;
        x = x / y;

        System.out.println("First (20) swaped number = " + x);
        System.out.println("Second (40) swaped number = " + y);
    }
}
