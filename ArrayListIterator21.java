
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIterator21 {
    public static void main(String[] args) {
        List<String> carName = new ArrayList<String>();
        carName.add("Mahindra");
        carName.add("Toyota");
        carName.add("Honda");
        carName.add("Ford");

        // print through lemda function
        System.out.println("----Itereate through lemda function-----");
        carName.forEach(shows -> {
            System.out.println(shows);
        });

        System.out.println("----Itereate through Iterator-----");

        Iterator<String> it = carName.iterator();
        while (it.hasNext()) {
            String car = it.next();
            System.out.println(car);
        }

        System.out.println("----Itereate through Iterator and forEachRemaning-----");
        it = carName.iterator();
        it.forEachRemaining(cars -> {
            System.out.println(cars);
        });

    }

}
