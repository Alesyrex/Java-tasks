package kap.newbie.iostreams.test.task4out.service;

import kap.newbie.iostreams.test.task4out.model.Car;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Alexandr Korovkin
 */
public class ParseCar {
    private static final Pattern pattern = Pattern.compile("Car\\{model='(\\w+?)', series='(.+?)', color=(\\w+?), number='(\\w+?)', issueYear=(\\d+?)}");

    private ParseCar() {}

    private static Car[] cars = new Car[0];

    public static Car[] parsingCars(String readCars) {
        Matcher matcher = pattern.matcher(readCars);
        while (matcher.find()){
            addCar(new Car(matcher.group(1),
                            matcher.group(2),
                            matcher.group(3),
                            matcher.group(4),
                            Integer.parseInt(matcher.group(5))));
        }
        return cars;
    }

    private static void addCar(Car car){
        Car[] newCars = Arrays.copyOf(cars,cars.length + 1);
        newCars[cars.length] = car;
        cars = newCars;
    }
}
