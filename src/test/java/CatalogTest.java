import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CatalogTest {
    @Test
    void iterateCatalogAndShowCars() {
        Car car1 = new Car("Nissan", "GT-R R32");
        Car car2 = new Car("Honda", "NSX");
        Car car3 = new Car("Mazda", "RX-7");

        Catalog catalog = new Catalog();

        catalog.addCars(car1, car2, car3);

        List<Car> cars = new ArrayList<>();
        cars.addAll(Arrays.asList(car1, car2, car3));

        Iterator<Car> iterator = catalog.iterator();
        while(iterator.hasNext()) {
            Car car = iterator.next();
            assertTrue(cars.contains(car));
        }
    }
}
