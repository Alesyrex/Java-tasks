package kap.newbie.multithreading.test.task4synchronized;

import kap.newbie.multithreading.test.task4synchronized.model.Car;
import kap.newbie.multithreading.test.task4synchronized.service.CarService;

/**
 * @author Alexandr Korovkin
 */
public class SynchMain {
    public static void main(String[] args) {
        Car[] arrayCars = createCars();

        CarService service = new CarService(arrayCars);

        System.out.println(service.search("RR-666-RR", 2012));
    }

    private static Car[] createCars() {
        return new Car[]{
                new Car("RR-111-RR", 2015, "silver", true),
                new Car("RR-222-RR", 2016, "blue", true),
                new Car("RR-333-RR", 2017, "red",  true),
                new Car("RR-444-RR", 2018, "black",  true),
                new Car("RR-555-RR", 2018, "silver", true),
                new Car("RR-555-RR", 2005, "yellow", true),
                new Car("RR-555-RR", 2012, "black",  true),
                new Car("RR-666-RR", 2018, "yellow", true),
                new Car("RR-777-RR", 2018, "white",  true),
                new Car("RR-888-RR", 2018, "yellow", true),
                new Car("RR-999-RR", 2018, "silver", true),
        };
    }
}

