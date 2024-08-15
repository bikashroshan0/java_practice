public class ArmStrongNumber18 {
    public static void main(String[] args) {
        System.out.println(isArmstrong(407));

    }

    static {
        System.out.println("Static block");
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int eachDigit = 0;
        int SumOfcubeOfEachNUmber = 0;
        while (number != 0) {
            eachDigit = number % 10;
            SumOfcubeOfEachNUmber = SumOfcubeOfEachNUmber + (eachDigit * eachDigit * eachDigit);
            number = number / 10;
        }
        if (originalNumber == SumOfcubeOfEachNUmber) {
            return true;
        } else
            return false;
    }
}
