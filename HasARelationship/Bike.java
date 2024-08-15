package HasARelationship;

public class Bike {
    Bike(Engine engine) {
        this.engine = engine;
    }

    Engine engine;

    public void bikeColour() {
        System.out.println("Bike is of red colour");
    }

    public void bikeName() {
        System.out.println("Bike name is KTM");
    }
}
