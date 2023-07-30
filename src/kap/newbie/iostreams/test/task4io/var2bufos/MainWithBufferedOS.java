package kap.newbie.iostreams.test.task4io.var2bufos;

import kap.newbie.iostreams.test.task4io.model.Car;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Alexandr Korovkin
 */
public class MainWithBufferedOS {
    public static final File CAR_CATALOG = new File("./resources/iostreams/test/task4/carCatalog.txt");

    public static void main(String[] args) {
        Car[] cars = addCars();

        long before = System.currentTimeMillis();

        try (FileOutputStream outStream = new FileOutputStream(CAR_CATALOG);
             BufferedOutputStream bufOS = new BufferedOutputStream(outStream)){

            byte[] buffer;
            for (Car car : cars){
                buffer = (car.toString() + "\n").getBytes();
                bufOS.write(buffer, 0, buffer.length);
            }
        } catch (IOException exception){
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
