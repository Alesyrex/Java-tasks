package kap.newbie.basic.Test;

import java.util.Scanner;

/**
 * Создать массив int’ов из 5 элементов.
 * Заполнить его значениями, введенными с клавиатуры.
 * Вывести на экран сумму каждого значения с предыдущим.
 * Предыдущим значением для 0-го (нулевого) элемента считать последнее значение массива.
 *
 * @author Alexandr Korovkin
 */
public class Test29 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0;i < array.length;++i) {
            System.out.print("Введите значение " + i + "-го эемента массива: ");
            array[i] = input.nextInt();
        }

        for (int i = 0;i < array.length;++i) {
            if (i == 0) {
                System.out.println(array[i] + " - " + (array[i] + array[array.length - 1]));
            } else {
                System.out.println(array[i] + " - " + (array[i] + array[i - 1]));
            }
        }
    }
}
