package kap.newbie.functional_programming.test.task7optionalanimal.model;

/**
 * @author Alexandr Korovkin
 */
public class Cat extends Animal{
    public static final String MEOW = "Meow";

    @Override
    public String sound() {
        return MEOW;
    }
}
