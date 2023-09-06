package kap.newbie.multithreading.test.task4synchronized.service;

import kap.newbie.multithreading.test.task4synchronized.model.Car;
import kap.newbie.multithreading.test.task4synchronized.model.CarIdentifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Alexandr Korovkin
 */
public class CarService {
    private List<Car> cars;

    public CarService (){
        cars = new ArrayList<>();
    }

    public CarService(Car[] cars){
        this.cars = Arrays.asList(cars);
    }

    public synchronized void addCar(Car car){
        cars.add(car);
    }

    public synchronized void deleteCar(String number, int year){
        deleteCar(new CarIdentifier(number, year));
    }

    public synchronized void deleteCar(CarIdentifier identifier){
        cars = cars.stream()
                .filter(c -> c.getIdentifier() != identifier)
                .collect(Collectors.toList());
    }

    public synchronized Car search(String number, int year){
        return search(new CarIdentifier(number, year));
    }

    public synchronized Car search(Car car){
        CarIdentifier id = car.getIdentifier();
        return search(id);
    }

    public synchronized Car search(CarIdentifier id){
        return cars.stream()
                .filter(c -> c.getIdentifier().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Car not found"));
    }
}
