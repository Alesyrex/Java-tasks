package kap.newbie.functional_programming.lection;

import java.util.function.UnaryOperator;

/**
 * @author Alexandr Korovkin
 */
public class Test3UnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<Integer> inc = x -> ++x;

        System.out.println(inc.apply(7));
    }
}
