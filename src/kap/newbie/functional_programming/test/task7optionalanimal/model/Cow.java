package kap.newbie.functional_programming.test.task7optionalanimal.model;

/**
 * @author Alexandr Korovkin
 */
public class Cow extends Animal{
    public static final String MOO = "Moo";

    @Override
    public String sound() {
        return MOO;
    }
}
