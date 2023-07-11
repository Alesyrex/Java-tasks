package kap.newbie.oop.test.task12;

/**
 * @author Alexandr Korovkin
 */
public class CarService {
    private final Car[] cars;

    public CarService(Car[] cars) {
        this.cars = cars;
    }

    public boolean findCar(Car searchCar) {
        for (Car car : cars) {
            if (car.hashCode() == searchCar.hashCode() && car.equals(searchCar)) {
                return true;
            }
        }
        return false;
    }
}
