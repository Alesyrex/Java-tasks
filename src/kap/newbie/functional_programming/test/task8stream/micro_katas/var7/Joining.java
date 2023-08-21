package kap.newbie.functional_programming.test.task8stream.micro_katas.var7;

import kap.newbie.functional_programming.test.task8stream.micro_katas.var3.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Return a comma-separated string of all these people's names
 *
 * @author Alexandr Korovkin
 */
public class Joining {
    public static void main(String[] args) {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = Arrays.asList(sara, viktor, eva);

        System.out.println(namesToString(collection));
    }

    private static String namesToString(List<Person> people) {
        return people.stream().map(Person::getName)
                .collect(Collectors.joining(", ", "Names: ", "."));
    }
}
