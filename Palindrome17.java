public class Palindrome17 {
    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(121));
        System.out.println(isPalindromeString("iii iii"));

    }

    public static boolean isPalindromeNumber(int number) {
        if (reverseNUmber(number) == number) {
            return true;
        } else
            return false;

    }

    public static int reverseNUmber(int number) {
        int rev = 0;
        while (number != 0) {
            rev = rev * 10 + number % 10;
            number = number / 10;
        }
        return rev;
    }

    public static String revString(String str) {
        String reverseString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString = reverseString + str.charAt(i);
        }
        return reverseString;
    }

    public static boolean isPalindromeString(String str) {
        if (str.equalsIgnoreCase(revString(str))) {
            return true;
        } else
            return false;
    }

}
