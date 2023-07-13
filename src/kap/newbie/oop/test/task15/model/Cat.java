package kap.newbie.oop.test.task15.model;

/**
 * @author Alexandr Korovkin
 */
public class Cat extends Animal {

    public static final String MEOW = "meow";

    public Cat(){
        super(MEOW);
    }

    public void meow(){
        sound();
    }
}
