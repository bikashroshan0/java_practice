public class ReverseNumber2 {
    public static void main(String[] args) {
        int number = 23047024;
        int rev = 0;
        while (number != 0) {
            rev = rev * 10 + number % 10;
            number = number / 10;
        }
        System.out.println("Reversed number is :: " + rev);

        StringBuffer sf = new StringBuffer(String.valueOf(rev)).reverse(); //
        System.out.println(sf);

    }
}
