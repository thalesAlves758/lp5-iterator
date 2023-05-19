import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Catalog implements Iterable<Car> {
    private List<Car> cars;

    public Catalog() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    @Override
    public Iterator<Car> iterator() {
        return cars.iterator();
    }
}
