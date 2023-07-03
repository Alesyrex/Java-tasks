package kap.newbie.basic.Test;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class Test11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number 1: ");
        int num1 = input.nextInt();
        System.out.print("Input number 2: ");
        int num2 = input.nextInt();

        if (num1 % 2 == 0) {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        } else {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }
        if (num1 == num2) {
            System.out.println("Числа равны!");
        }
        input.close();
    }
}
