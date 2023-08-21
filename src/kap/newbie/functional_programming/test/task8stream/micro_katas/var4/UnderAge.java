package kap.newbie.functional_programming.test.task8stream.micro_katas.var4;

import kap.newbie.functional_programming.test.task8stream.micro_katas.var3.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Alexandr Korovkin
 */
public class UnderAge {
    public static void main(String[] args) {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        Person anna = new Person("Anna", 5);
        List<Person> collection = Arrays.asList(sara, eva, viktor, anna);

        Set<String> setNames = getKidNames(collection);
        setNames.forEach(System.out::println);
    }

    private static Set<String> getKidNames(List<Person> people) {
        return people.stream().filter(p -> p.getAge() < 18)
                .map(Person::getName)
                .collect(Collectors.toSet());
    }
}
