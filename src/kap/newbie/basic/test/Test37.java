package kap.newbie.basic.test;

import java.util.Scanner;

/**
 * Вычислите результат выражения, используя рекурсивный алгоритм. n — число, введенное с клавиатуры.
 * Для N < 1 — вывести соответствующее сообщение в консоль и завершить выполнение программы.
 * sqrt(1 + sqrt(2 + ... + sqrt(n)))
 * @author Alexandr Korovkin
 */
public class Test37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number N:");
        int n = input.nextInt();

        if (n < 1) {
            System.out.println("Exit");
        } else {
            System.out.println(calcExpression(n));
        }
        input.close();
    }

    public static double calcExpression(int n){
        return calcExpression(1, n);
    }

    public static double calcExpression(int n, int maxNumber){
        if (n == maxNumber) {
            return Math.sqrt(n);
        }
        return Math.sqrt(n + calcExpression(n + 1, maxNumber));
    }
}
