public class RevNumberUsingRecurssion {
    public static void main(String[] args) {
        revNum(2174);
        revNumWithRecursion(297342);
    }

    public static void revNum(int num) {
        while (num > 0) {
            int rev = num % 10;
            System.out.print(rev);
            num = num / 10;
        }
        System.out.println();
    }

    public static void revNumWithRecursion(int num) {
        if (num < 10) {
            System.out.print(num);
            return;
        }
        int rev = num % 10;
        System.out.print(rev);
        revNumWithRecursion(num / 10);
    }
}
