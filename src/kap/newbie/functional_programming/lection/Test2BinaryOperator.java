package kap.newbie.functional_programming.lection;

import java.util.function.BinaryOperator;

/**
 * @author Alexandr Korovkin
 */
public class Test2BinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply= (t1, t2) -> t1 * t2;

        System.out.println(multiply.apply(4,7));
        System.out.println(multiply.apply(-17,3));
    }
}
