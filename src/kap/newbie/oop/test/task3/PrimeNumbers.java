package kap.newbie.oop.test.task3;

import java.util.Scanner;

/**
 * Вычислить из записать в массив первые 10 простых чисел.
 *
 * Простое число – положительное целое число,
 * которое делится без остатка лишь на себя и на 1.
 * 1 не является простым числом.
 *
 * Вывести в консоль сумму всех элементов полученного массива.
 *
 * Нахождение простых чисел и вычисление суммы реализовать, используя рекурсивные методы.
 *
 * 1. Вынесите поиск простых чисел в отдельный класс.
 *
 * 2. Реализуйте возможность вывода на экран суммы N первых простых чисел, где N – число,
 * введенное пользователем с клавиатуры;
 *
 * 3. Вынесите нужные вам переменные в поля класса.
 * Если необходимо – сделайте их константами уровня класса или объекта.
 * Помните, константа ссылочного типа гарантирует неизменность ссылки, а не содержимого объекта.
 * Массив – ссылочный тип.
 *
 * @author Alexandr Korovkin
 */
public class PrimeNumbers {
    public static final Scanner input = new Scanner(System.in);
    public static final int INDEX_ZERO = 2;
    public static final int ODD_NUMBERS = 2;
    public static final String INPUT_NUMBERS = "Input amount of prime numbers: ";
    public static final String FORMAT_OUTPUT = "%d ";

    private int[] primeArray;

    public void setLengthArrayPrimeNumbers (int length){
        if (length > 0) {
            primeArray = new int[length];
        }
    }

    public int[] getArray() {
        return primeArray;
    }

    public void printArray(){
        for (int number : primeArray) {
            System.out.printf(FORMAT_OUTPUT,number);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        PrimeNumbersCheck check = new PrimeNumbersCheck();
        RecursionSum recursionSum = new RecursionSum();

        System.out.print(INPUT_NUMBERS);
        primeNumbers.setLengthArrayPrimeNumbers(input.nextInt());

        for (int i = 0; i < primeNumbers.getArray().length; i++) {
            if (i == 0) {
                primeNumbers.getArray()[i] = INDEX_ZERO;
            } else {
                int addingValue = i == 1 ? 1 : ODD_NUMBERS;
                int number = primeNumbers.getArray()[i - 1] + addingValue;
                primeNumbers.getArray()[i] = check.findNextPrimeNumber(number, primeNumbers.getArray(), i);
            }
        }
        primeNumbers.printArray();
        System.out.println(recursionSum.sum(primeNumbers.getArray()));
    }

}
