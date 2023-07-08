package kap.newbie.oop.test.task2;

import java.util.Scanner;

/**
 * Попробуйте нарисовать прямоугольник, используя "==" для каждой единицы длины и "||" – для каждой единицы ширины.
 *
 * @author Alexandr Korovkin
 */
public class Test {

    public static final String WIDTH = "==";
    public static final String HEIGHT = "||";
    public static final String CORNER = "  ";
    public static final String INPUT_HEIGHT = "Input height: ";
    public static final String INPUT_WIDTH = "Input width: ";
    public static final String INNER_SPACE = "  ";
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        print(INPUT_HEIGHT);
        int height = input.nextInt();
        print(INPUT_WIDTH);
        int width = input.nextInt();

        for (int i = 0;i < height;++i) {
            for (int j = 0; j < width; ++j) {
                if (isaBoolean(height, i)) {
                    if (isaBoolean(width, j)) {
                        print(CORNER);
                    } else {
                        print(WIDTH);
                    }
                } else if (isaBoolean(width, j)) {
                    print(HEIGHT);
                } else {
                    print(INNER_SPACE);
                }
            }
            System.out.println();
        }
        input.close();
    }

    public static boolean isaBoolean(int edge, int iterator) {
        return iterator == 0 || iterator == edge - 1; // проверяет ребра ли прямоугольника это
    }
    static void print(String s) {
        System.out.print(s);
    }
}
