package kap.newbie.oop.test.task11.model;

/**
 * @author Alexandr Korovkin
 */
public class Cow extends Animal {

    public static final String MOO = "moo";

    public Cow(){
        super(MOO);
    }

    public void moo(){
        sound();
    }
}
