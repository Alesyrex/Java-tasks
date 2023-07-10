package kap.newbie.oop.test.task10;

/**
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{Animal.CAT,Animal.DOG,Animal.DOG,Animal.CAT,Animal.COW};

        getSoundAnimal(animals);
    }

    public static void getSoundAnimal(Animal[] animals){
        for(Animal animal : animals){
            animal.getSound();
        }
    }
}
