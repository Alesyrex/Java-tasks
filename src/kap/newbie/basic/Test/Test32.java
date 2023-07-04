package kap.newbie.basic.Test;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class Test32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number 1: ");
        int num1 = input.nextInt();
        System.out.print("Input number 2: ");
        int num2 = input.nextInt();

        if (isMultiplyTwo(num1) || isMultiplyThree(num2)) {
            System.out.println(num1 > num2);
        }
        if (isMultiplyTwo(num1) && isMultiplyThree(num1)) {
            double result = Math.pow(num1, num2);
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                System.out.println("Результат выражения слишком большой!");
            } else {
                System.out.println("Result = " + result);
            }
        }
    }

    static boolean isMultiplyTwo(int num) {
        return num % 2 == 0;
    }

    static boolean isMultiplyThree(int num) {
        return num % 3 == 0;
    }
}
