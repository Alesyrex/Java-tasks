package kap.newbie.multithreading.test.task15concurrcollections_car.service;

import kap.newbie.multithreading.test.task15concurrcollections_car.model.Car;
import kap.newbie.multithreading.test.task15concurrcollections_car.model.CarIdentifier;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * @author Alexandr Korovkin
 */
public class CarService {
    private final Map<CarIdentifier, Car> cars = new ConcurrentHashMap<>();

    public CarService(){}

    public CarService(Car... cars) {
        this.cars.putAll(Map.copyOf(Arrays.stream(cars).collect(Collectors.toMap(Car::getIdentifier, c -> c))));
    }

    public void addCar(Car car){
        cars.put(car.getIdentifier(), car);
    }

    public void deleteCar(String number, int year){
        deleteCar(new CarIdentifier(number, year));
    }

    public void deleteCar(CarIdentifier idCar){
        cars.remove(idCar);
    }

    public Optional<Car> searchCar(String number, int year){
        return searchCar(new CarIdentifier(number, year));
    }

    public Optional<Car> searchCar(CarIdentifier idCar){
        return Optional.ofNullable(cars.get(idCar));
    }

    public void changeColor(String number, int year, String color){
        searchCar(number, year).orElseThrow().setColor(color);
    }

    public void changeTechnicalInspection(String number, int year, boolean inspection)  {
        searchCar(number,year).orElseThrow().setActualTechnicalInspection(inspection);
    }

    public void printCars() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " using method print");
        Thread.sleep(2000);
        cars.values().forEach(System.out::println);
    }

}
