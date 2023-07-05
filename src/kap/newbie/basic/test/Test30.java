package kap.newbie.basic.test;

/**
 *
 * Вычислить и записать в массив первые 10 простых чисел.
 * Простое число – положительное целое число, которое делится
 * без остатка лишь на себя и на 1. 1 не является простым числом.
 * Вывести в консоль сумму всех элементов полученного массива.
 *
 * @author Alexandr Korovkin
 */
public class Test30 {
    public static void main(String[] args) {
        int[] justNumbers = new int[10];
        int number = 2;
        boolean isJustNumber = true;
        for (int i = 0;i < justNumbers.length;++number) {
            for (int j = 2;j < number; ++j) {
                if (number % j == 0) {
                    isJustNumber = false;
                    break;
                }
                if (j == number - 1){
                    isJustNumber = true;
                }
            }
            if (isJustNumber) {
                justNumbers[i] = number;
                ++i;
            }
        }
        for (int numb : justNumbers) {
            System.out.print(numb + " ");
        }
    }
}
