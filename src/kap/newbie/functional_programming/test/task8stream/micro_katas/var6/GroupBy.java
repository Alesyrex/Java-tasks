package kap.newbie.functional_programming.test.task8stream.micro_katas.var6;

import kap.newbie.functional_programming.test.task8stream.micro_katas.var3.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Group these people by nationality, same kind as the previous exercise
 *
 * @author Alexandr Korovkin
 */
public class GroupBy {
    public static void main(String[] args) {
        Person sara = new Person("Sara", 4, "Norwegian");
        Person viktor = new Person("Viktor", 40, "Serbian");
        Person eva = new Person("Eva", 42, "Norwegian");
        List<Person> collection = Arrays.asList(sara, eva, viktor);
        Map<String, List<Person>> result = groupByNationality(collection);
        System.out.println(Integer.toBinaryString(collection.spliterator().characteristics()));

        result.forEach((k,v) -> System.out.println(k + " " + v.stream().findFirst().get().getName()));
//        for(Map.Entry<String, List<Person>> person : result.entrySet()) {
//            System.out.println(person.getKey());
//            person.getValue().forEach(p -> System.out.println(p.getName()));
//        }

    }

    private static Map<String, List<Person>> groupByNationality(List<Person> people) {
        return StreamSupport.stream(people.spliterator(), false)
                .collect(Collectors.groupingBy(Person::getNationality));
    }
}
