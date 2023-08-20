package kap.newbie.functional_programming.test.task6optionalhome;

import kap.newbie.functional_programming.test.task6optionalhome.model.Housing;
import kap.newbie.functional_programming.test.task6optionalhome.model.Human;
import kap.newbie.functional_programming.test.task6optionalhome.service.CarService;
import kap.newbie.functional_programming.test.task6optionalhome.model.Car;
import kap.newbie.functional_programming.test.task6optionalhome.model.CarIdentifier;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 * Реализуйте рад классов:
 * 1. Жилье, должен иметь поле «адрес»;
 * 2. Человек. Поля – «имя», «мать», «отец», «дети», «жилье», «машина», «профессия»;
 * 3. Машина. Предлагаю взять реализацию  из предыдущей задачи и добавить к ней поле «владелец» типа «Человек».
 *
 * Реализуйте поиск адреса проживания первого ребенка владельца машины с заданным номером и годом выпуска.
 * Используйте реализацию поиска машины из предыдущей задачи. Изменять ее под требования текущей задачи – недопустимо.
 *
 * Поиск должен быть прекращен, если совпало хотя бы одно из условий:
 *
 * · машина новее 2021 года;
 * · профессия владельца машины или его первого ребенка – «полицейский»;
 * · адрес проживания содержит подстроку «Рублевское шоссе».
 *
 * В таких случаях ничего не должно быть найдено.
 *
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) {
        CarService carService = new CarService(initCars());
        Human man = new Human("Perry", new Human("Rossie"), new Human("Garry"),
                List.of(new Human("Jack", new Housing("Google street"),
                        "", null)), new Housing("Rublev avenue"), "Engineer" ,
                    null);
        Car car = new Car("AA-777-AA", 2021, "blue", man,true);
        man.setCar(carService.addCar(car));

        carService.findCar(createCar())
                .filter(c -> c.getIdentifier().getYear() <= 2021)
                .map(Car::getOwner)
                .filter(h -> !h.getOccupation().equals("Police officer"))
                .map(Human::getKids)
                .filter(Predicate.not(Collection::isEmpty))
                .map(k -> k.get(0))
                .filter(h -> !h.getOccupation().equals("Police officer"))
                .map(Human::getHome)
                .filter(h -> !h.getAddress().equals("Rublev avenue"))
                .map(Housing::getAddress)
                .ifPresentOrElse(System.out::println, () -> System.out.println("not found"));
    }

    private static CarIdentifier createCar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a car's number: ");
        String number = scanner.nextLine();

        System.out.println("Enter a car's year: ");
        int year = scanner.nextInt();

        scanner.close();

        return new CarIdentifier(number, year);
    }

    private static Car[] initCars() {
        Car car1 = new Car("RR-111-RR", 2015, "silver", new Human("Tom"), true);
        Car car2 = new Car("RR-222-RR", 2016, "blue", new Human("John"),true);
        Car car3 = new Car("RR-333-RR", 2017, "red", new Human("Jack"),true);
        Car car4 = new Car("RR-444-RR", 2018, "black", new Human("Eddie"),true);
        Car car5 = new Car("RR-555-RR", 2018, "silver", new Human("Bill"),true);
        Car car6 = new Car("RR-555-RR", 2005, "yellow", new Human("Jerry"),true);
        Car car7 = new Car("RR-555-RR", 2012, "black", new Human("Bob"),true);
        Car car8 = new Car("RR-666-RR", 2018, "yellow", new Human("Turk"),true);
        Car car9 = new Car("RR-777-RR", 2018, "white", new Human("Greg"),true);
        Car car10 = new Car("RR-888-RR", 2018, "yellow", new Human("Rosaline"),true);

        return new Car[]{car1, car2, car3, car4, car5, car6, car7, car8, car9, car10};
    }
}
