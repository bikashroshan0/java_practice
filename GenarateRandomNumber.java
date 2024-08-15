import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenarateRandomNumber {

  public static void main(String[] args) {
    System.out.println(genrateRandomNumber());
    System.out.println(genrateRandom2());
    System.out.println(genrateRandomWithRange());
  }

  public static int genrateRandomNumber() {
    Random random = new Random();
    int randomNumber = random.nextInt(10099);
    return randomNumber;
  }

  public static double genrateRandom2() {
    double randomNumber = Math.random();
    return randomNumber;
  }

  public static int genrateRandomWithRange() {
    int randomNumber = ThreadLocalRandom.current().nextInt(200, 23874);
    return randomNumber;
  }

}
