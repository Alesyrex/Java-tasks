package kap.newbie.string_generics_collections.test.task23mapcar;

import kap.newbie.string_generics_collections.test.task23mapcar.model.Car;
import kap.newbie.string_generics_collections.test.task23mapcar.model.CarIdentifier;

import java.util.HashMap;
import java.util.Map;

/**
 * Реализуйте класс «Машина». Поля допустимо выбрать на свое усмотрение, но необходимо,
 * чтобы по ним можно было однозначно идентифицировать каждую машину.
 * Скажем, в рамках базы ГАИ.
 * <p>
 * Создайте массив машин. Реализуйте максимально эффективную проверку на вхождение машины в ваш массив.
 * <p>
 * Если машина найдена — выведите ее строковое представление в консоль.
 * <p>
 * Опциональное усложнение: номер машины может быть не уникальным.
 *
 * Реализуйте задачу используя Map.
 *
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) {
        Car[] arrayCars = createCars();
        Map<CarIdentifier, Car> cars = new HashMap<>();

        for (Car car : arrayCars){
            cars.put(car.getIdentifier(),car);
        }

        System.out.println(cars.get(new CarIdentifier("RR-555-RR", 2005)));
        System.out.println(cars.get(new CarIdentifier("RR-555-RR", 2015)));
        System.out.println(cars.get(new CarIdentifier("RR-555-RR", 2012)));
    }

    private static Car[] createCars(){
        return new Car[] {
            new Car("RR-111-RR", 2015, "yellow", true),
            new Car("RR-222-RR", 2016, "yellow", true),
            new Car("RR-333-RR", 2017, "yellow", true),
            new Car("RR-444-RR", 2018, "yellow", true),
            new Car("RR-555-RR", 2018, "yellow", true),
            new Car("RR-555-RR", 2005, "yellow", true),
            new Car("RR-555-RR", 2012, "yellow", true),
            new Car("RR-666-RR", 2018, "yellow", true),
            new Car("RR-777-RR", 2018, "yellow", true),
            new Car("RR-888-RR", 2018, "yellow", true),
            new Car("RR-999-RR", 2018, "yellow", true),
            new Car("RR-000-RR", 2018, "yellow", true)
        };
    }
}
