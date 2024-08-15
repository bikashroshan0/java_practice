public class PrimeNumber16 {
    public static void main(String[] args) {
        System.out.println(isPrime(9));
        int startNum = 6;
        int endNUm = 49;

        System.out.println(
                "Total prime number betweeen " + startNum + " & " + endNUm + "  = "
                        + primeNumberInRange(startNum, endNUm));

    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        System.out.println(number + " is a prime number");

        return true;

    }

    public static int primeNumberInRange(int startNumber, int endNumber) {
        int totalPrimeNumber = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            if (isPrime(i)) {
                totalPrimeNumber++;
            }

        }
        return totalPrimeNumber;

    }
}
