package kap.newbie.functional_programming.lection;

import java.util.function.Function;

/**
 * @author Alexandr Korovkin
 */
public class Test4Function {
    public static void main(String[] args) {
        Function<Integer, String> convert = x -> String.valueOf(x) + " dollars";

        System.out.println(convert.apply(8));
    }
}
