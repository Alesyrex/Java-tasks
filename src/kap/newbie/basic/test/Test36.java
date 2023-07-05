package kap.newbie.basic.test;

/**
 * Вычислите факториал введенного с клавиатуры целого числа, используя рекурсивный алгоритм.
 *
 * @author Alexandr Korovkin
 */
public class Test36 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int x) {
        if (x == 1) {
            return x;
        }
        return x * factorial(x - 1);
    }
}
