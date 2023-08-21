package kap.newbie.functional_programming.test.task8stream.practice;

import java.util.stream.Stream;

/**
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) {
        int sum = getTotalNumberOfLettersLongerThanFive("Aleksandr", "Petr", "Gabriel", "Jack", "Alina");
        System.out.println(sum);
    }

    private static int getTotalNumberOfLettersLongerThanFive(String ...names){
        return Stream.of(names).filter(n -> n.length() > 5)
                .mapToInt(String::length)
                .sum();
    }
}
