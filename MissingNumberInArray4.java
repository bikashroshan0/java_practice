public class MissingNumberInArray4 {
    public static void main(String[] args) {
        int num[] = { -2, -1, 0, 1, 2, 3, 5, 6, 7 };
        int sumOfActual = 0;
        for (int i = 0; i < num.length; i++) {
            sumOfActual = sumOfActual + num[i];
        }
        System.out.println(sumOfActual);
        int sumOfExpected = 0;
        for (int j = num[0]; j <= 7; j++) {
            sumOfExpected = sumOfExpected + j;
        }
        System.out.println(sumOfExpected);
        System.out.println("Mssing number in the array is :: " + (sumOfExpected - sumOfActual));
    }
}
