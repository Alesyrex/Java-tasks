package kap.newbie.iostreams.test.task5in.var2bufis;

import kap.newbie.iostreams.test.task5in.model.Car;
import kap.newbie.iostreams.test.task5in.service.ParseCar;

import java.io.*;

/**
 * @author Alexandr Korovkin
 */
public class MainWithBufInputStream {
    public static final File CAR_CATALOG = new File("./resources/iostreams/test/task4/carCatalog.txt");

    public static void main(String[] args) {
        long before = System.currentTimeMillis();

        StringBuilder inputData = new StringBuilder();

        try(BufferedInputStream input = new BufferedInputStream(new FileInputStream(CAR_CATALOG))) {
            inputData.append(new String(input.readAllBytes()));
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
