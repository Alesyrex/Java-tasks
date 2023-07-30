package kap.newbie.iostreams.test.task5in.var3bufreader;

import kap.newbie.iostreams.test.task5in.model.Car;
import kap.newbie.iostreams.test.task5in.service.ParseCar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Alexandr Korovkin
 */
public class MainWithBufferedReader {
    public static final File CAR_CATALOG = new File("./resources/iostreams/test/task4/carCatalog.txt");

    public static void main(String[] args) {
        long before = System.currentTimeMillis();

        StringBuilder inputData = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(CAR_CATALOG))) {
            String in;
            while ((in = reader.readLine()) != null){
                inputData.append(in);
            }
        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }

        Car[] cars = ParseCar.parsingCars(inputData.toString());

        for (Car car : cars){
            System.out.println(car);
        }

        long after = System.currentTimeMillis();
        System.out.println(after - before + " ms");
    }
}
