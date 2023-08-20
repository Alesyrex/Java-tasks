package kap.newbie.functional_programming.test.task5optionalcarservice;

import kap.newbie.functional_programming.test.task5optionalcarservice.model.Car;
import kap.newbie.functional_programming.test.task5optionalcarservice.model.CarIdentifier;
import kap.newbie.functional_programming.test.task5optionalcarservice.service.CarService;

import java.util.Scanner;

/**
 * Реализуйте задачу сервис поиска машин,
 * тип возвращаемого значения в методе поиска должен быть Optional<Car>.
 * Если ничего не найдено – верните Optional.empty().
 *
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) {
        CarService carService = new CarService(initCars());

        carService.findCar(createCar())
                .ifPresentOrElse(System.out::println, () -> System.out.println("Car not found"));
    }

    private static CarIdentifier createCar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a car's number");
        String number = scanner.nextLine();

        System.out.println("Enter a car's year");
        int year = scanner.nextInt();

        scanner.close();

        return new CarIdentifier(number, year);
    }

    private static Car[] initCars() {
        Car car1 = new Car("RR-111-RR", 2015, "silver", true);
        Car car2 = new Car("RR-222-RR", 2016, "blue", true);
        Car car3 = new Car("RR-333-RR", 2017, "red", true);
        Car car4 = new Car("RR-444-RR", 2018, "black", true);
        Car car5 = new Car("RR-555-RR", 2018, "silver", true);
        Car car6 = new Car("RR-555-RR", 2005, "yellow", true);
        Car car7 = new Car("RR-555-RR", 2012, "black", true);
        Car car8 = new Car("RR-666-RR", 2018, "yellow", true);
        Car car9 = new Car("RR-777-RR", 2018, "white", true);
        Car car10 = new Car("RR-888-RR", 2018, "yellow", true);

        return new Car[]{car1, car2, car3, car4, car5, car6, car7, car8, car9, car10};
    }
}
