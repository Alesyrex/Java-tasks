package kap.newbie.functional_programming.test.task8stream.micro_katas.var8;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a method that returns a comma separated string based on a given list of integers.
 * Each element should be preceded by the letter 'e' if the number is even,
 * and preceded by the letter 'o' if the number is odd. For example, if the input list is (3,44),
 * the output should be 'o3,e44'.
 *
 * You can write this using only one operator and one collect statement.
 *
 * @author Alexandr Korovkin
 */
public class Challenge {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);

        System.out.println(getString(list));
    }

    public static String getString(List<Integer> list) {
        return list.stream()
                .map(x -> x % 2 == 0 ? ("e" + x) : "o" + x)
                .collect(Collectors.joining(","));
    }
}
