package kap.newbie.functional_programming.test.task8stream.micro_katas.var2;

import java.util.Arrays;
import java.util.List;

/**
 * Sum all elements of a collection, try to use the reduce operator with identity parameter instead of an IntStream
 *
 * @author Alexandr Korovkin
 */
public class SumAndReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        System.out.println(calculate(numbers));
    }

    private static int calculate(List<Integer> numbers) {
        return numbers.stream().reduce(0, Integer::sum);
    }

}
