package kap.newbie.functional_programming.test.task6optionalhome.service;

import kap.newbie.functional_programming.test.task6optionalhome.model.Car;
import kap.newbie.functional_programming.test.task6optionalhome.model.CarIdentifier;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author Alexandr Korovkin
 */
public class CarService {
    private final Map<CarIdentifier, Car> cars = new HashMap<>();

    public CarService(Car[] cars) {
        for (Car car : cars) {
            this.cars.put(car.getIdentifier(), car);
        }
    }

    public Car addCar(Car car){
        return cars.put(car.getIdentifier(), car);
    }

    public Optional<Car> findCar(CarIdentifier identifier) {
        return Optional.ofNullable(cars.get(identifier));
    }
}
