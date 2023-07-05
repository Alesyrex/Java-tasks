package kap.newbie.basic.test;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class Test23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input height: ");
        int height = input.nextInt();
        System.out.print("Input width: ");
        int width = input.nextInt();

        for (int i = 0;i < height;++i) {
            for (int j = 0; j < width; ++j) {
                if (i == 0 || i == height - 1) {
                    if (j == 0 || j == width -1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("--");
                    }
                } else if (j == 0 || j == width -1) {
                    System.out.print("|");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
