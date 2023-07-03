package kap.newbie.basic.Test;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class Test10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number 1: ");
        int num1 = input.nextInt();
        System.out.print("Input number 2: ");
        int num2 = input.nextInt();
        System.out.println("Введите номер операции:\n1.Сложение\n2.Вычитание\n3.Умножение");
        int operand = input.nextInt();
        switch (operand) {
            case 1 :
                System.out.println("Сложение, result = " + (num1 + num2));
                break;
            case 2 :
                System.out.println("Вычитание, result = " + (num1 - num2));
                break;
            case 3 :
                System.out.println("Умножение, result = " + (num1 * num2));
                break;
            default:
                System.out.println("Operation not found");
        }
        input.close();
    }
}
