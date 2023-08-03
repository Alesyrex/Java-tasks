package kap.newbie.string_generics_collections.lection.test9;

/**
 * @author Alexandr Korovkin
 */
public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
       return name.length() - o.getName().length();
    }
}
