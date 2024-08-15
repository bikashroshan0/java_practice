package Abstract;

public interface CarRule {
    default void carRule() {
        System.out.println("Everyone have to follow the traffic rule for diving car");
    }
}
