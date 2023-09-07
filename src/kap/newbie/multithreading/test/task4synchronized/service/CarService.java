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

    public synchronized void addCar(Car car) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " using method add");
        Thread.sleep(2000);
        cars.add(car);
    }

    public synchronized void deleteCar(String number, int year) throws InterruptedException {
        deleteCar(new CarIdentifier(number, year));
    }

    public synchronized void deleteCar(CarIdentifier identifier) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " using method delete");
        Thread.sleep(2000);
        cars = cars.stream()
                .filter(c -> c.getIdentifier() != identifier)
                .collect(Collectors.toList());
    }

    public synchronized Car search(String number, int year) throws InterruptedException {
        return search(new CarIdentifier(number, year));
    }

    public synchronized Car search(Car car) throws InterruptedException {
        CarIdentifier id = car.getIdentifier();
        return search(id);
    }

    public synchronized Car search(CarIdentifier id) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " using method search");
        Thread.sleep(2000);
        return cars.stream()
                .filter(c -> c.getIdentifier().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Car not found"));
    }

    public void changeColor(String number, int year, String color) throws InterruptedException {
        search(number, year).setColor(color);
    }

    public void changeTechnicalInspection(String number, int year, boolean inspection) throws InterruptedException {
        search(number,year).setActualTechnicalInspection(inspection);
    }

    public synchronized void printCars() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " using method print");
        Thread.sleep(2000);
        cars.forEach(System.out::println);
    }
}
