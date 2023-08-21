package kap.newbie.functional_programming.test.task8stream.intro;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) {
        Collection<String> upperCase = mapToUpperCase("hi", "my", "name", "is");
        upperCase.forEach(System.out::println);
    }

    private static Collection<String> mapToUpperCase(String ...names){
        return Arrays.stream(names).map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
