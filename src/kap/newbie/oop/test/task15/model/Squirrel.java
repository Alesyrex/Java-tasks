package kap.newbie.oop.test.task15.model;

/**
 * @author Alexandr Korovkin
 */
public class Squirrel extends Animal{

    public static final String HRUM_HRUM = "Hrum-hrum";

    public Squirrel() {
        super(HRUM_HRUM);
    }

    public void hrum() {
        sound();
    }
}
