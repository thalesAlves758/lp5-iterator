import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Catalog implements Iterable<Car> {
    private List<Car> cars;

    public Catalog() {
        this.cars = new ArrayList<>();
    }

    public void addCars(Car... cars) {
        this.cars.addAll(Arrays.asList(cars));
    }

    public List<Car> getCars() {
        return this.cars;
    }

    @Override
    public Iterator<Car> iterator() {
        return cars.iterator();
    }
}
