package kap.newbie.functional_programming.test.task8stream.micro_katas.var5;

import kap.newbie.functional_programming.test.task8stream.micro_katas.var3.Person;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Partition these people into adults and kids, you'll need a special collector for this one
 *
 * @author Alexandr Korovkin
 */
public class PartitionBy {
    public static void main(String[] args) {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = Arrays.asList(sara, eva, viktor);
        Map<Boolean, List<Person>> result = partitionAdults(collection);

        for(Map.Entry<Boolean, List<Person>> person : result.entrySet()) {
            System.out.println(person.getKey());
            person.getValue().forEach(p -> System.out.println(p.getName()));
        }
    }

    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
        return people.stream().collect(Collectors.partitioningBy(p -> p.getAge() >= 18));
    }
}
