package kap.newbie.iostreams.test.task5in.var1freader;

import kap.newbie.iostreams.test.task5in.model.Car;
import kap.newbie.iostreams.test.task5in.service.ParseCar;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Alexandr Korovkin
 */
public class MainWithFileReader {
    public static final File CAR_CATALOG = new File("./resources/iostreams/test/task4/carCatalog.txt");

    public static void main(String[] args) {

        long before = System.currentTimeMillis();

        StringBuilder inputData = new StringBuilder();
        try(FileReader reader = new FileReader(CAR_CATALOG)) {
            char[] buffer = new char[256];

            int c;
            while ((c = reader.read(buffer)) > 0){
                System.out.println(c);
                if(c < 256){
                    buffer = Arrays.copyOf(buffer, c);
                }
                inputData.append(buffer);
            }
        }catch (IOException exception) {
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
