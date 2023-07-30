package kap.newbie.iostreams.test.task4out.var1fwriter;

import kap.newbie.iostreams.test.task4out.model.Car;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Alexandr Korovkin
 */
public class MainWithFileWriter {
    public static final File CAR_CATALOG = new File("./resources/iostreams/test/task4/carCatalog.txt");

    public static void main(String[] args) {
        Car[] cars = addCars();

        long before = System.currentTimeMillis();

        try(FileWriter writer = new FileWriter(CAR_CATALOG)){
            for (Car car : cars){
                writer.append(car.toString()).append("\n");
            }
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }

        long after = System.currentTimeMillis();
        System.out.println(after - before + " ms");
    }

    public static Car[] addCars() {
        return new Car[] {new Car("BMW","RS-300", "red","A434AA62",2014),
                new Car("Audi","R-400","black","A433AA62",2015),
                new Car("Lada","Granta","silver","A777AA62",2017)};
    }
}
