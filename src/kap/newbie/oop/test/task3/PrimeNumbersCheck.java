package kap.newbie.oop.test.task3;

/**
 * @author Alexandr Korovkin
 */
public class PrimeNumbersCheck {

    public static final int ODD_NUMBER = 2;

    public int findNextPrimeNumber(int number, int[] primeNumbers, int currentIndex) {
        boolean isPrime = isPrime(number, primeNumbers, currentIndex);

        if (isPrime) {
            return number;
        }

        number += ODD_NUMBER;

        return findNextPrimeNumber(number, primeNumbers, currentIndex);
    }

    //    Метод проверки конкретного числа на то, является ли оно простым
    private boolean isPrime(int number, int[] primeNumbers, int currentIndex) {
        int j = 0;
        boolean isPrime = true;

        while (isPrime && j < currentIndex && number / primeNumbers[j] > 1) {
            if (number % primeNumbers[j] == 0) {
                isPrime = false;
            } else {
                j++;
            }
        }
        return isPrime;
    }
}
