package kap.newbie.functional_programming.lection;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Alexandr Korovkin
 */
public class Test9Stream {
    public static void main(String[] args) {
        long count = IntStream.of(-1,3,4,6,-3,0,6,7,-10)
                .filter(x -> x > 0)
                .count();
        System.out.println(count);


        ArrayList<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Paris", "London", "Moscow");

        cities.stream().filter(s -> s.length() > 5)
                .forEach(System.out::println);

        Stream<String> newCitiesStream = Arrays.stream(new String[]{"Vena", "Berlin", "Helsinki"});
        newCitiesStream.filter(s -> s.length() < 7)
                .forEach(System.out::println);
    }
}
