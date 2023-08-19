package kap.newbie.functional_programming.lection;

import java.util.function.Consumer;

/**
 * @author Alexandr Korovkin
 */
public class Test5Consumer {
    public static void main(String[] args) {
        Consumer<String> printer = s -> System.out.println(s + " - word");

        printer.accept("Hello");
    }
}
