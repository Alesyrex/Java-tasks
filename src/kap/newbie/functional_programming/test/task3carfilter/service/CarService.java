package kap.newbie.functional_programming.test.task3carfilter.service;

import kap.newbie.functional_programming.test.task3carfilter.model.Car;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Alexandr Korovkin
 */
public class CarService {
    private final List<Car> cars;

    public CarService(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> findCars(Predicate<Car> func){
        List<Car> findingCars = new ArrayList<>();

        cars.forEach(c -> {if (func.test(c)) findingCars.add(c);});

        return findingCars;
    }
}
