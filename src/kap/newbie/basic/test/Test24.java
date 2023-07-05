package kap.newbie.basic.test;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class Test24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number 2: ");
        int number2 = input.nextInt();
        for (int i = 1;i <= 10; ++i) {
            if (i % 2 == 0) {
                System.out.printf("%d + %d = %d", i, number2, i + number2);
            } else {
                System.out.printf("%d - %d = %d", i, number2, i - number2);
            }
            if (i == number2) {
                System.out.print(" Числа равны!");
            }
            System.out.println();
        }
        input.close();
    }
}
