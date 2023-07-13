package kap.newbie.oop.test.task15.model;

/**
 * @author Alexandr Korovkin
 */
public class Animal {
    private final String sound;

    protected Animal(String sound){
        this.sound = sound;
    }

    protected void sound(){
        System.out.println(sound);
    }
}
