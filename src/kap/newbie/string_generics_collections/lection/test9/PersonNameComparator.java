package kap.newbie.string_generics_collections.lection.test9;

import java.util.Comparator;

/**
 * @author Alexandr Korovkin
 */
public class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
