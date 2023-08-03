package kap.newbie.string_generics_collections.lection.test9;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author Alexandr Korovkin
 */
public class Main {
    public static void main(String[] args) {
        PersonNameComparator pComp = new PersonNameComparator();
        Comparator<Person> aComp = (o1, o2) -> Integer.compare(o1.getAge(), o2.getAge());

        TreeSet<Person> people = new TreeSet<>(pComp.thenComparing(aComp));
        people.add(new Person("Tom", 23));
        people.add(new Person("Nick", 34));
        people.add(new Person("Tom", 10));
        people.add(new Person("Bill", 14));

        for(Person person : people){
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}
