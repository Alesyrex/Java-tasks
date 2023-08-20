package kap.newbie.functional_programming.lection;

import java.util.Optional;

/**
 * @author Alexandr Korovkin
 */
public class Test8Optional {
    public static void main(String[] args) {
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElseGet(() -> "Boris");

        System.out.println(name);
    }
}
