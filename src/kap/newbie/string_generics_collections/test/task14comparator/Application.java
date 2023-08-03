package kap.newbie.string_generics_collections.test.task14comparator;

import kap.newbie.string_generics_collections.test.task14comparator.model.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW","RS-300", "red","A434AA62",2014));
        cars.add(new Car("Lada","Granta","silver","A777AA62",2018));
        cars.add(new Car("Lada","Granta","white","A777AA62",2016));
        cars.add(new Car("Lada","Granta","silver","A555AA62",2005));
        cars.add(new Car("Audi","R-400","black","A433AA62",2015));

        for (Car car : cars){
            System.out.println(car);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~number sort~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Comparator<Car> comp = Comparator.comparing(Car::getNumber);
        cars.sort(comp); // number sort

        for (Car car : cars){
            System.out.println(car);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~year sort~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        comp = Comparator.comparingInt(Car::getIssueYear);
        cars.sort(comp); // year sort

        for (Car car : cars){
            System.out.println(car);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~color sort~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        comp = Comparator.comparing(Car::getColor);
        cars.sort(comp); // color sort

        for (Car car : cars){
            System.out.println(car);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~number/year sort~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        comp = Comparator.comparing(Car::getNumber).thenComparingInt(Car::getIssueYear);
        cars.sort(comp); // number/year sort

        for (Car car : cars){
            System.out.println(car);
        }
    }
}
