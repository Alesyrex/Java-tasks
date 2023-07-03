package kap.newbie.basic.Test;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class Test17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите сумму влада: ");
        double sum = input.nextDouble();
        System.out.print("Введите количество месяцев: ");
        int months = input.nextInt();
        int percent = 7;
        for (int i = 1; i <= months;++i) {
            sum += sum * percent / 100;
        }
        System.out.println("Итоговая сумма: " + sum);
        input.close();
    }
}
