package kap.newbie.functional_programming.test.task7optionalanimal.model;

/**
 * @author Alexandr Korovkin
 */
public class Dog extends Animal{
    public static final String WOOF = "Woof";

    @Override
    public String sound() {
        return WOOF;
    }
}
