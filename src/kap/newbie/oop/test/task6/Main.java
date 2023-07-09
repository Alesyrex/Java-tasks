package kap.newbie.oop.test.task6;

import java.util.Scanner;

/**
 * Реализуйте класс «Правильная фигура». Для него создайте классы-наследники «Треугольник» и «Квадрат».
 *
 * Пользователь должен иметь возможность ввести длину стороны и выбрать тип фигуры.
 * Программа должна нарисовать в консоли выбранную пользователем фигуру, используя символы '-', '|', '/', '\'.
 *
 * @author Alexandr Korovkin
 */
public class Main {
    public static final Scanner input = new Scanner(System.in);
    public static final String INPUT_EDGE = "Input edge: ";
    public static final String INPUT_FIGURE = "Input name of Figure: ";
    public static final String WRONG_FIGURE = "Wrong figure!";

    public static void main(String[] args) {
        System.out.println(INPUT_FIGURE);
        String nameFigure = input.nextLine();
        System.out.println(INPUT_EDGE);
        int edge = input.nextInt();

        CorrectFigure figure;

        if(nameFigure.equals(Square.class.getSimpleName())){
            figure = new Square(edge);
            figure.printFigure();
        } else if (nameFigure.equals(Triangle.class.getSimpleName())) {
            figure = new Triangle(edge);
            figure.printFigure();
        } else {
            System.out.println(WRONG_FIGURE);
        }
    }
}
