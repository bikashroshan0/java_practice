package Abstract;

public class BMW implements Car {

    @Override
    public void start() {
        System.out.println("Start BMW CAR");
    }

    @Override
    public void stop() {
        System.out.println("Stop BMW CAR");

    }

    @Override
    public void refuel() {
        System.out.println("Refeul BMW CAR");

    }

    public void bmwOwnMethod() {
        System.out.println("Own method of BMW");
    }
    
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.carRule();

    }

}
