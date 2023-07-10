package kap.newbie.oop.test.task10;

/**
 * @author Alexandr Korovkin
 */
public enum Animal {
    CAT("Meow"),
    DOG("Woof"),
    COW("Moo");

    private final String sound;

    private Animal (String sound){
        this.sound = sound;
    }

    public void getSound(){
        System.out.println(sound);
    }
}
