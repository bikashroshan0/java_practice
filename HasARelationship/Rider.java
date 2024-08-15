package HasARelationship;

public class Rider {
    public static void main(String[] args) {
        Bike bike = new Bike(new Engine());
        bike.engine.start();
        bike.bikeName();
        bike.bikeColour();
        bike.engine.stop();
    }
}
