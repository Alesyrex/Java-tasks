package kap.newbie.functional_programming.test.task8stream.micro_katas.var1;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Flatten this multidimensional collection
 *
 * @author Alexandr Korovkin
 */
public class FlatMap {
    public static void main(String[] args) {
        List<String> one = List.of("One", "Two", "Three");
        List<String> two = List.of("Four", "Five", "Six");
        List<String> three = List.of("Seven", "Eight", "Nine");

        List<String> list = transform(List.of(one, two, three));

        list.forEach(System.out::println);
    }

    private static List<String> transform(List<List<String>> collection){
        return collection.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toUnmodifiableList());
    }
}
