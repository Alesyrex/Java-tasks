package kap.newbie.oop.test.task12;

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

        Car myCar = new Car(model,series,myColor,number,year);

        if (carService.findCar(myCar)){
            System.out.println(myCar);
        } else {
            System.out.println("Car not find!");
        }
    }

    public static Car[] addCars() {
        return new Car[] {new Car("BMW","RS-300",Color.RED,"A434AA62",2014),
                new Car("Audi","R-400",Color.BLACK,"A433AA62",2015),
                new Car("Lada","Granta",Color.SILVER,"A777AA62",2017)};
    }
}
