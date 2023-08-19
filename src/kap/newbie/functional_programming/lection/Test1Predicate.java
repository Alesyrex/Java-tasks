package kap.newbie.functional_programming.lection;

import java.util.function.Predicate;

/**
 * @author Alexandr Korovkin
 */
public class Test1Predicate {
    public static void main(String[] args) {
        Predicate<Integer> isNegative = x -> x < 0;

        System.out.println(isNegative.test(0));
        System.out.println(isNegative.test(-1));
        System.out.println(isNegative.test(1));

        Predicate<Integer> isPositive = x -> x >= 0;

        System.out.println(isPositive.test(0));
        System.out.println(isPositive.test(-1));
        System.out.println(isPositive.test(1));

        Predicate<String> nonNumbers = s -> s.matches("[a-z]+");

        System.out.println(nonNumbers.test("qwerty"));
        System.out.println(nonNumbers.test("qw3rty"));
        System.out.println(nonNumbers.test("qwedfy"));
        System.out.println(nonNumbers.test("qwert6"));

    }
}
