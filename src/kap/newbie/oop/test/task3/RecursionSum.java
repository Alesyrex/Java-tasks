package kap.newbie.oop.test.task3;

/**
 * @author Alexandr Korovkin
 */
public class RecursionSum {

    public int sum(int[] numbers) {
        return sum(numbers, 0);
    }

    private int sum(int[] numbers, int i) {
        if (i == numbers.length - 1) {
            return numbers[i];
        }

        return numbers[i] + sum(numbers, i + 1);
    }
}
