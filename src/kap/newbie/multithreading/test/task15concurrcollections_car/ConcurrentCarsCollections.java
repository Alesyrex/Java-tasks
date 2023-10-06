package kap.newbie.multithreading.test.task15concurrcollections_car;

import kap.newbie.multithreading.test.task15concurrcollections_car.model.Car;
import kap.newbie.multithreading.test.task15concurrcollections_car.model.CarIdentifier;
import kap.newbie.multithreading.test.task15concurrcollections_car.service.CarService;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Реализуйте сервис для работы с машинами.
 * Предусмотрите возможность добавления, удаления машин,
 * изменения информации о существующей машине,
 * а также поиск по доступным машинам.
 * Обеспечьте потокобезопасность разработанного сервиса.
 *
 * @author Alexandr Korovkin
 */
public class ConcurrentCarsCollections {
    public static void main(String[] args) throws InterruptedException {
        Car[] cars = createCars();

        CarService service = new CarService(cars);

        Thread one = new Thread(getRunnable(
                new Car("RR-123-RR", 2001, "blue", false), service::addCar
                ), "one");
        Thread two = new Thread(getRunnable(
                new CarIdentifier("RR-555-RR", 2018), service::deleteCar
                ), "two");
        Thread three = new Thread(
                () -> System.out.println("Finding: " + service.searchCar("RR-666-RR", 2012).orElseThrow()
                ), "three");


        service.printCars();

        startThreads(one, two, three);
        waitThreads(one, two, three);

        service.printCars();
    }

    private static <T> Runnable getRunnable(T t, Consumer<T> consumer){
        return () -> consumer.accept(t);
    }

    private static void startThreads(Thread... threads){
        Arrays.stream(threads)
                .forEach(Thread::start);
    }

    private static void waitThreads(Thread... threads){
        Arrays.stream(threads)
                .forEach(ConcurrentCarsCollections::joinThread);
    }

    private static void joinThread(Thread thread){
        try{
            thread.join();
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
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
                new Car("RR-666-RR", 2012, "yellow", true),
                new Car("RR-777-RR", 2018, "white",  true),
                new Car("RR-888-RR", 2018, "yellow", true),
                new Car("RR-999-RR", 2018, "silver", true),
        };
    }
}
