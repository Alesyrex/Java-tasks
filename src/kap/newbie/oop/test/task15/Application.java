package kap.newbie.oop.test.task15;

import kap.newbie.oop.test.task15.exception.ArrayValidationException;
import kap.newbie.oop.test.task15.exception.UnknownAnimalException;
import kap.newbie.oop.test.task15.model.*;

/**
 * Для ситуации, когда тип животного неизвестен, выбрасывайте собственное исключение UnknownAnimalException.
 * Предка исключения определите самостоятельно.
 *
 * Также предусмотрите валидацию массива животных на содержание пустых элементов.
 * Если таковые существуют – бросьте кастомное исключение ArrayValidationException,
 * которое содержит информацию об индексе массива, содержащем содержит null.
 *
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Cat(), new Dog(),new Cow(), null, new Squirrel()};

        try {
            soundAll(animals);
        } catch (ArrayValidationException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void soundAll(Animal[] animals) {
        for (Animal animal : animals) {
            sound(animal);
        }
    }

    private static void sound(Animal animal) {

        if (animal.getClass().equals(Cat.class)) {
            ((Cat) animal).meow();
        } else if (animal.getClass().equals(Dog.class)) {
            ((Dog) animal).woof();
        } else if (animal.getClass().equals(Cow.class)) {
            ((Cow) animal).moo();
        } else {
            throw new UnknownAnimalException("Unknown animal!");
        }
    }

/*    private static void soundTwo(Animal animal){
        if (animal instanceof Cat){
            ((Cat)animal).meow();
        } else if(animal instanceof Dog) {
            ((Dog)animal).woof();
        } else {
            ((Cow)animal).moo();
        }
    }*/
}
