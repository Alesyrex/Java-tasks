package kap.newbie.functional_programming.test.task1lambda_car;

import kap.newbie.functional_programming.test.task1lambda_car.model.Car;
import kap.newbie.functional_programming.test.task1lambda_car.model.CarIdentifier;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Используя классы-сущности Car реализуйте сортировку машин по:
 * · Номеру;
 * · Цвету;
 * · Году;
 * · Номеру и году.
 * описывая компараторы как лямбда-выражения.
 * <p>
 * Используйте список для хранения и сортировки коллекции машин.

 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add( new Car("RR-111-RR", 2015, "yellow", true));
        cars.add( new Car("RR-222-RR", 2016, "yellow", true));
        cars.add( new Car("RR-333-RR", 2017, "yellow", true));
        cars.add( new Car("RR-444-RR", 2018, "yellow", true));
        cars.add( new Car("RR-555-RR", 2018, "yellow", true));
        cars.add( new Car("RR-555-RR", 2005, "yellow", true));
        cars.add( new Car("RR-555-RR", 2012, "yellow", true));
        cars.add( new Car("RR-666-RR", 2018, "yellow", true));
        cars.add( new Car("RR-777-RR", 2018, "yellow", true));
        cars.add( new Car("RR-888-RR", 2018, "yellow", true));
        cars.add( new Car("RR-999-RR", 2018, "yellow", true));

        for (Car car : cars){
            System.out.println(car);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~number sort~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Comparator<Car> comp = (c1, c2) -> c1.getIdentifier().getNumber()
                                .compareTo(c2.getIdentifier().getNumber());
        cars.sort(comp); // number sort

        for (Car car : cars){
            System.out.println(car);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~year sort~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        cars.sort((c1, c2) -> Integer.compare(c1.getIdentifier().getYear(), c2.getIdentifier().getYear())); // year sort

        for (Car car : cars){
            System.out.println(car);
        }
    }
}
