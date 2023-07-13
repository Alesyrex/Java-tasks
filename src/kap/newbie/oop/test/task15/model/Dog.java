package kap.newbie.oop.test.task15.model;

/**
 * @author Alexandr Korovkin
 */
public class Dog extends Animal {

    public static final String WOOF = "woof";

    public Dog(){
        super(WOOF);
    }

    public void woof(){
        sound();
    }
}
