package kap.newbie.iostreams.test.task3filerd;

import kap.newbie.iostreams.test.task3filerd.model.Car;
import kap.newbie.iostreams.test.task3filerd.model.Color;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Alexandr Korovkin
 */
public class Application {
    public static final String CAR_CATALOG_TXT = "./resources/iostreams/test/task2/carCatalog.txt";

    public static void main(String[] args) {
        Car[] cars = new Car[0];

        try(FileInputStream readFile = new FileInputStream(CAR_CATALOG_TXT)) {
            
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
