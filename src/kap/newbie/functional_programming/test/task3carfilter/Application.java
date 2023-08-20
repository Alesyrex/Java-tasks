package kap.newbie.functional_programming.test.task3carfilter;

import kap.newbie.functional_programming.test.task3carfilter.model.Car;
import kap.newbie.functional_programming.test.task3carfilter.service.CarService;
import kap.newbie.functional_programming.test.task3carfilter.view.ConsoleView;
import kap.newbie.functional_programming.test.task3carfilter.view.MainMenuView;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Реализуйте Car service, с использованием списка (или другой коллекции на ваш выбор).
 * Дайте возможность искать машины по гибкому фильтру – возвращайте коллекцию машин, подходящих под конкретный фильтр
 * (можете расширить на свой вкус):
 *
 * · Номер совпадает с введенным пользователем;
 * · Номер содержит подстроку, указанную пользователем;
 * · Цвет совпадает с указанным пользователем;
 * · Год выпуска машины находится в диапазоне, указанном пользователем.
 *
 * При этом CarService должен содержать лишь один публичный метод поиска.
 * Можете использовать Predicate или собственный функциональный интерфейс.
 *
 * Также реализуйте интерактивное меню в рамках консоли,
 * позволяющее производить несколько поисков в рамках одного запуска программы.
 * Предусмотрите возможность завершения программы с помощью пользовательского ввода.
 *
 * @author Alexandr Korovkin
 */
public class Application {
    private static final ConsoleView console = new ConsoleView();

    public static void main(String[] args) {


        List<Car> cars = new ArrayList<>();
        cars.add( new Car("RR-111-RR", 2015, "silver", true));
        cars.add( new Car("RR-222-RR", 2016, "blue", true));
        cars.add( new Car("RR-333-RR", 2017, "red", true));
        cars.add( new Car("RR-444-RR", 2018, "black", true));
        cars.add( new Car("RR-555-RR", 2018, "silver", true));
        cars.add( new Car("RR-555-RR", 2005, "yellow", true));
        cars.add( new Car("RR-555-RR", 2012, "black", true));
        cars.add( new Car("RR-666-RR", 2018, "yellow", true));
        cars.add( new Car("RR-777-RR", 2018, "white", true));
        cars.add( new Car("RR-888-RR", 2018, "yellow", true));
        cars.add( new Car("RR-999-RR", 2018, "silver", true));

        CarService service = new CarService(cars);

        int menuItem;
        List<Car> findingCars;

        do{
            console.print(MainMenuView.menu());
            menuItem = console.selectOption(MainMenuView.MIN_MENU, MainMenuView.MAX_MENU);
            if (menuItem != MainMenuView.MAX_MENU){
                findingCars = service.findCars(predicate(menuItem));
                findingCars.forEach(System.out::println);
            } else {
                console.print(MainMenuView.bye());
            }
        } while (menuItem != MainMenuView.MAX_MENU);
    }

    public static Predicate<Car> predicate(int item){
        String inputData;
        switch (item){
            case 1 :
                console.print(MainMenuView.numberSearch());
                inputData = console.inputData();
                return car -> car.getIdentifier().getNumber().equals(inputData);
            case 2 :
                console.print(MainMenuView.subNumberSearch());
                inputData = console.inputData();
                return car -> car.getIdentifier().getNumber().contains(inputData);
            case 3 :
                console.print(MainMenuView.colorSearch());
                inputData = console.inputData();
                return car -> car.getColor().equals(inputData);
            case 4 :
                console.print(MainMenuView.yearSearch());
                inputData = console.inputData();
                return car -> car.getIdentifier().getYear() == Integer.parseInt(inputData);
            default :
                return null;
        }
    }
}
