package kap.newbie.string_generics_collections.test.task1string;

import java.util.Scanner;

/**
 * Попробуйте нарисовать прямоугольник, используя "==" для каждой единицы длины и "||" – для каждой единицы ширины.
 *
 * @author Alexandr Korovkin
 */
public class SquareBuilder {

    public static final String WIDTH = "==";
    public static final String HEIGHT = "||";
    public static final String CORNER = "  ";
    public static final String INPUT_HEIGHT = "Input height: ";
    public static final String INPUT_WIDTH = "Input width: ";
    public static final String INNER_SPACE = "  ";
    public static final Scanner input = new Scanner(System.in);
    public static final String LINE_SEPARATOR = "\n";

    public static void main(String[] args) {
        StringBuilder squareBuild = new StringBuilder();
        print(INPUT_HEIGHT);
        int height = input.nextInt();
        print(INPUT_WIDTH);
        int width = input.nextInt();

        for (int i = 0;i < height;++i) {
            for (int j = 0; j < width; ++j) {
                if (isaBoolean(height, i)) {
                    if (isaBoolean(width, j)) {
                        squareBuild.append(CORNER);
                    } else {
                        squareBuild.append(WIDTH);
                    }
                } else if (isaBoolean(width, j)) {
                    squareBuild.append(HEIGHT);
                } else {
                    squareBuild.append(INNER_SPACE);
                }
            }
            squareBuild.append(LINE_SEPARATOR);
        }
        print(squareBuild.toString());
        input.close();
    }

    public static boolean isaBoolean(int edge, int iterator) {
        return iterator == 0 || iterator == edge - 1; // проверяет ребра ли прямоугольника это
    }
    static void print(String s) {
        System.out.print(s);
    }
}
