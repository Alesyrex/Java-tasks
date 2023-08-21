package kap.newbie.functional_programming.test.task8stream.micro_katas.var3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Get the oldest person from the collection
 *
 * @author Alexandr Korovkin
 */
public class MaxAndComparator {
    public static void main(String[] args) {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = Arrays.asList(sara, eva, viktor);

        System.out.println(getOldestPerson(collection).getName());
    }

    private static Person getOldestPerson(List<Person> people) {
        return people.stream().max(Comparator.comparingInt(Person::getAge)).orElseThrow();
    }
}
