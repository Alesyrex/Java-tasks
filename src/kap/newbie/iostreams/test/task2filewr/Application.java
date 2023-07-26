package kap.newbie.iostreams.test.task2filewr;

import kap.newbie.oop.test.task12.Car;
import kap.newbie.oop.test.task12.Color;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Используя класс Car (или создав новый класс для сущности «машина», на ваше усмотрение)
 * Реализуйте сохранение массива машин в файл carCatalog.txt
 *
 * @author Alexandr Korovkin
 */
public class Application {

    public static final String CAR_CATALOG_TXT = "./resources/iostreams/test/task2/carCatalog.txt";

    public static void main(String[] args) {
        Car[] cars = addCars();

        try(FileOutputStream writeFile = new FileOutputStream(CAR_CATALOG_TXT)){
            for(Car car : cars){
                writeFile.write(car.toString().getBytes());
                writeFile.write("\n".getBytes());
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static Car[] addCars() {
        return new Car[] {new Car("BMW","RS-300", Color.RED,"A434AA62",2014),
                new Car("Audi","R-400",Color.BLACK,"A433AA62",2015),
                new Car("Lada","Granta",Color.SILVER,"A777AA62",2017)};
    }
}
