package kap.newbie.string_generics_collections.test.task15comparable;

import kap.newbie.string_generics_collections.test.task15comparable.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("RR-111-RR", 2015, "yellow", true));
        cars.add(new Car("RR-222-RR", 2016, "yellow", true));
        cars.add(new Car("RR-333-RR", 2017, "yellow", true));
        cars.add(new Car("RR-444-RR", 2018, "yellow", true));
        cars.add(new Car("RR-555-RR", 2018, "yellow", true));
        cars.add(new Car("RR-555-RR", 2005, "yellow", true));
        cars.add(new Car("RR-555-RR", 2012, "yellow", true));
        cars.add(new Car("RR-666-RR", 2018, "yellow", true));
        cars.add(new Car("RR-777-RR", 2018, "yellow", true));
        cars.add(new Car("RR-888-RR", 2018, "yellow", true));
        cars.add(new Car("RR-999-RR", 2018, "yellow", true));
        cars.add(new Car("RR-000-RR", 2018, "yellow", true));

        cars.sort(Comparator.naturalOrder());

        System.out.println("~~~~~~~~~~~~~~~~~~~~natural sort~~~~~~~~~~~~~~~~~~~~~");
        for (Car car : cars){
            System.out.println(car);
        }

        cars.sort(Comparator.reverseOrder());

        System.out.println("~~~~~~~~~~~~~~~~~~~~reverse sort~~~~~~~~~~~~~~~~~~~~~");
        for (Car car : cars){
            System.out.println(car);
        }
    }
}
