package kap.newbie.oop.test.task11;

import kap.newbie.oop.test.task11.model.Animal;
import kap.newbie.oop.test.task11.model.Cat;
import kap.newbie.oop.test.task11.model.Cow;
import kap.newbie.oop.test.task11.model.Dog;

/**
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Cat(), new Dog(),new Cow()};

        soundAll(animals);
    }

    private static void soundAll(Animal[] animals) {
        for (Animal animal : animals) {
            sound(animal);
        }

        for (Animal animal : animals) {
            soundTwo(animal);
        }
    }

    private static void sound(Animal animal){
        if (animal.getClass().equals(Cat.class)){
                ((Cat)animal).meow();
        } else if(animal.getClass().equals(Dog.class)) {
            ((Dog)animal).woof();
        } else {
            ((Cow)animal).moo();
        }
    }

    private static void soundTwo(Animal animal){
        if (animal instanceof Cat){
            ((Cat)animal).meow();
        } else if(animal instanceof Dog) {
            ((Dog)animal).woof();
        } else {
            ((Cow)animal).moo();
        }
    }
}
