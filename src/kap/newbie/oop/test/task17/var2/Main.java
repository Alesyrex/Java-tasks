package kap.newbie.oop.test.task17.var2;

import java.util.Scanner;

/**
 * Реализуйте класс «Правильная фигура». Для него создайте классы-наследники «Треугольник» и «Квадрат».
 *
 * Пользователь должен иметь возможность ввести длину стороны и выбрать тип фигуры.
 * Программа должна нарисовать в консоли выбранную пользователем фигуру, используя символы '-', '|', '/', '\'.
 *
 * Вариант 2: используя внутренние классы.
 *
 * @author Alexandr Korovkin
 */
public class Main {
    public static final Scanner input = new Scanner(System.in);
    public static final String INPUT_EDGE = "Input edge: ";
    public static final String INPUT_FIGURE = "Input name of Figure: ";
    public static final String WRONG_FIGURE = "Wrong figure!";
    public static final String SQUARE = "Square";
    public static final String TRIANGLE = "Triangle";

    public static void main(String[] args) {
        System.out.println(INPUT_FIGURE);
        String nameFigure = input.nextLine();
        System.out.println(INPUT_EDGE);
        int edge = input.nextInt();

        CorrectFigure figure = new CorrectFigure();

        if(nameFigure.equals(SQUARE)){
            figure.new Square(edge).printFigure();
        } else if (nameFigure.equals(TRIANGLE)) {
            figure.new Triangle(edge).printFigure();
        } else {
            System.out.println(WRONG_FIGURE);
        }
    }
}
