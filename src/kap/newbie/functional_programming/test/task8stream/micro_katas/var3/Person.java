package kap.newbie.functional_programming.test.task8stream.micro_katas.var3;

/**
 * @author Alexandr Korovkin
 */
public class Person {
    private final String name;
    private final int age;
    private final String nationality;

    public Person(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public Person(String name, int age) {
        this(name, age, "");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }
}
