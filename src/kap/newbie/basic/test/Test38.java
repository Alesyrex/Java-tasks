package kap.newbie.basic.test;

/**
 * Вычислить из записать в массив первые 10 простых чисел.
 * Простое число – положительное целое число, которое делится без остатка лишь на себя и на 1. 1 не является простым числом.
 * Вывести в консоль сумму всех элементов полученного массива.
 * Нахождение простых чисел и вычисление суммы реализовать, используя рекурсивные методы.
 *
 * @author Alexandr Korovkin
 */
public class Test38 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int number = 2;
        for (int i = 0;i < array.length;++i) {
            while (true) {
                if (isJust(number)){
                    array[i] = number;
                    break;
                }
                number++;
            }
            number++;
        }
        for (int num : array) {
            System.out.print( num + " ");
        }
        System.out.println(sum(array));
    }

    public static boolean isJust(int number){
        return isJustAfterTwo(number, 2);
    }

    public static boolean isJustAfterTwo(int number, int divider) {
        if (number == divider) {
            return true;
        }
        if (number % divider == 0) {
            return false;
        } else {
            return isJustAfterTwo(number, divider + 1);
        }
    }

    public static int sum (int[] array){
        return sum(0, array);
    }

    public static int sum (int number, int[] array){
        if (number == array.length - 1) {
            return array[number];
        }
        return array[number] + sum(number + 1, array);
    }
}
