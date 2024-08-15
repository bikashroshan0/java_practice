package Abstract;

public interface Car extends CarRule{

    public abstract void start(); // abstract method

    public abstract void stop();// abstract method

    public abstract void refuel();// abstract method

    public static void carEngine() {
        System.out.println("I have a moto GP engine");
    }

    default void carRule() {
        System.out.println("I have to drive left side of tghe rode");
    }

}
