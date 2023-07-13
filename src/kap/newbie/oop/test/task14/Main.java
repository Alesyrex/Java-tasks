package kap.newbie.oop.test.task14;

import kap.newbie.oop.test.task14.exception.InputValidationException;
import kap.newbie.oop.test.task14.model.FigurePrintable;
import kap.newbie.oop.test.task14.model.Square;
import kap.newbie.oop.test.task14.model.Triangle;

import java.util.Scanner;

/**
 * Реализуйте интерфейс «Правильная фигура». Для него создайте классы-наследники «Треугольник» и «Квадрат».
 *
 * Пользователь должен иметь возможность ввести длину стороны и выбрать тип фигуры.
 * Программа должна нарисовать в консоли выбранную пользователем фигуру, используя символы '-', '|', '/', '\'.
 *
 * При некорректном вводе с клавиатуры выбрасывайте собственное исключение InputValidationException.
 * Не забудьте указать в описании, какой именно из вводов был некорректен -
 * message исключения должен быть информативным. Предка исключения определите самостоятельно.
 *
 * @author Alexandr Korovkin
 */
public class Main {
    public static final Scanner input = new Scanner(System.in);
    public static final String INPUT_EDGE = "Input edge: ";
    public static final String INPUT_FIGURE = "Input name of Figure: ";
    public static final String WRONG_FIGURE = "Wrong figure!";
    public static final String WRONG_LENGTH = "Wrong length of figure!";

    public static void main(String[] args) {
        System.out.println(INPUT_FIGURE);
        String nameFigure = input.nextLine();
        System.out.println(INPUT_EDGE);
        int edge = input.nextInt();

        if (edge < 1) {
            throw new InputValidationException(WRONG_LENGTH);
        }

        FigurePrintable figure;

        if(nameFigure.equals(Square.class.getSimpleName())){
            figure = new Square(edge);
            figure.printFigure();
        } else if (nameFigure.equals(Triangle.class.getSimpleName())) {
            figure = new Triangle(edge);
            figure.printFigure();
        } else {
            throw new InputValidationException(WRONG_FIGURE);
        }
    }
}
