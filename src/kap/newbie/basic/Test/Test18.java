package kap.newbie.basic.Test;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class Test18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите сумму влада: ");
        double sum = input.nextDouble();
        System.out.print("Введите количество месяцев: ");
        int months = input.nextInt();
        int percent = 7;
        while (months != 0){
            sum += sum * percent / 100;
            --months;
        }
        System.out.println("Итоговая сумма: " + sum);
        input.close();
    }
}
