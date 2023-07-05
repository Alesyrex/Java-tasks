package kap.newbie.basic.test;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class Test33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        print("Input height: ");
        int height = input.nextInt();
        print("Input width: ");
        int width = input.nextInt();

        for (int i = 0;i < height;++i) {
            for (int j = 0; j < width; ++j) {
                if (isaBoolean(height, i)) {
                    if (isaBoolean(width, j)) {
                        print(" ");
                    } else {
                        print("--");
                    }
                } else if (isaBoolean(width, j)) {
                    print("|");
                } else {
                    print("  ");
                }
            }
            System.out.println();
        }
    }

    public static boolean isaBoolean(int edge, int iterator) {
        return iterator == 0 || iterator == edge - 1; // проверяет ребра ли прямоугольника это
    }
    static void print(String s) {
        System.out.print(s);
    }
}
