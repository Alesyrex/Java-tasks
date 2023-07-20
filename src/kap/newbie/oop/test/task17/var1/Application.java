package kap.newbie.oop.test.task17.var1;

import java.util.Scanner;

/**
 * Реализуйте класс «Правильная фигура». Для него создайте классы-наследники «Треугольник» и «Квадрат».
 *
 * Пользователь должен иметь возможность ввести длину стороны и выбрать тип фигуры.
 * Программа должна нарисовать в консоли выбранную пользователем фигуру, используя символы '-', '|', '/', '\'.
 *
 * Вариант 1: Используя анонимные классы.
 * @author Alexandr Korovkin
 */
public class Application {
    public static final Scanner input = new Scanner(System.in);
    public static final String INPUT_EDGE = "Input edge: ";
    public static final String INPUT_FIGURE = "Input name of Figure: ";
    public static final String WRONG_FIGURE = "Wrong figure!";
    public static final String WIDTH = "---";
    public static final String HEIGHT = "|";
    public static final String CORNER = " ";
    public static final String INNER_SPACE_SQUARE = "   ";
    public static final String SQUARE = "Square";
    public static final String TRIANGLE = "Triangle";
    public static final String WIDTH_LINE = "_";
    public static final String HEIGHT_RIGHT = "/";
    public static final String HEIGHT_LEFT = "\\";
    public static final String INNER_SPACE_TRIANGLE = " ";
    public static final String LINE_SEPARATOR = "\n";

    public static void main(String[] args) {
        System.out.println(INPUT_FIGURE);
        String nameFigure = input.nextLine();
        System.out.println(INPUT_EDGE);
        int edge = input.nextInt();

        CorrectFigure figure;

        if(nameFigure.equals(SQUARE)) {
            figure = new CorrectFigure(){
                @Override
                protected void printFigure() {
                    for (int i = 0;i < edge;++i) {
                        for (int j = 0; j < edge; ++j) {
                            if (isaBoolean(edge, i)) {
                                if (isaBoolean(edge, j)) {
                                    System.out.print(CORNER);
                                } else {
                                    System.out.print(WIDTH);
                                }
                            } else if (isaBoolean(edge, j)) {
                                System.out.print(HEIGHT);
                            } else {
                                System.out.print(INNER_SPACE_SQUARE);
                            }
                        }
                        System.out.println();
                    }
                }

                private boolean isaBoolean(int edge, int iterator) {
                    return iterator == 0 || iterator == edge - 1; // проверяет ребра ли прямоугольника это
                }
            };
            figure.printFigure();
        } else if (nameFigure.equals(TRIANGLE)) {
            figure = new CorrectFigure() {
                @Override
                protected void printFigure() {
                    String figure = "";

                    for (int i = 0; i < edge; ++i) {
                        if (i != edge - 1) {
                            figure += doLine(edge - i, (edge + 1) + i, INNER_SPACE_TRIANGLE);
                        } else {
                            figure += doLine(edge - i, (edge + 1) + i, WIDTH_LINE);
                        }
                    }
                    System.out.println(figure);
                }

                private String doLine(int right, int left, String space){
                    String line = "";
                    for(int i = 1;i <= edge * 2;++i){
                        if(i == right){
                            line += HEIGHT_RIGHT;
                        } else if (i == left){
                            line += HEIGHT_LEFT;
                        } else {
                            line += space;
                        }
                    }
                    return line + LINE_SEPARATOR;
                }
            };
            figure.printFigure();
        } else {
            System.out.println(WRONG_FIGURE);
        }
    }
}
