package kap.newbie.oop.test.task16;

import kap.newbie.oop.test.task16.control.CarService;
import kap.newbie.oop.test.task16.model.Car;
import kap.newbie.oop.test.task16.model.Color;
import kap.newbie.oop.test.task16.model.Company;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class Application {

    public static void main(String[] args) {
        Car[] cars = addCars();
        CarService carService = new CarService(cars);

        Scanner input = new Scanner(System.in);

        String model = input.nextLine();
        String series = input.nextLine();
        String color = input.nextLine();
        String number = input.nextLine();
        int year = input.nextInt();
        Color myColor = null;

        for (Color color1 : Color.values()) {
            if (color1.getColour().equals(color)) {
                myColor = color1;
            }
        }

        if (myColor == null) {
            myColor = Color.RED;
        }

        Car myCar = new Car(new Company(model,series,year),myColor,number);

        if (carService.findCar(myCar)){
            System.out.println(myCar);
        } else {
            System.out.println("Car not find!");
        }
    }

    public static Car[] addCars() {
        return new Car[] {new Car(new Company("BMW","RS-300",2014), Color.RED,"A434AA62"),
                new Car(new Company("Audi","R-400",2015), Color.BLACK,"A433AA62"),
                new Car(new Company("Lada","Granta",2017), Color.SILVER,"A777AA62")};
    }
}
