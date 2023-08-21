package kap.newbie.functional_programming.test.task7optionalanimal;

import kap.newbie.functional_programming.test.task7optionalanimal.model.Animal;
import kap.newbie.functional_programming.test.task7optionalanimal.model.Cat;
import kap.newbie.functional_programming.test.task7optionalanimal.model.Cow;
import kap.newbie.functional_programming.test.task7optionalanimal.model.Dog;

import java.util.AbstractMap;
import java.util.List;
import java.util.Optional;

/**
 * Реализуйте абстрактный класс «Животное», содержащий абстрактный метод sound().
 * Также реализуйте трех наследников: кота, собаку и корову.
 *
 * Реализуйте метод, выводящий в консоль сообщение вида
 *
 * «Это %тип животного%, он (она) говорит %результат метода sound()%»
 * Использование условных конструкций (if-else, switch-case, тернарный оператор)
 * и хранение типа наследника в виде поля недопустимо.
 *
 * @author Alexandr Korovkin
 */
public class Application {
    public static final String OUT_FORMAT = "Это %s, он (она) говорит %s\n";
    public static void main(String[] args) {
        List<Animal> animals = List.of(new Cat(), new Dog(), new Cow());

        animals.forEach(Application::getSound);
    }

    private static void getSound(Animal animal){
        Optional.ofNullable(animal).filter(Cat.class::isInstance)
                .map(c -> new AbstractMap.SimpleEntry<>("cat", c))
                .or(() -> Optional.ofNullable(animal).filter(Dog.class::isInstance)
                        .map(d -> new AbstractMap.SimpleEntry<>("dog", d)))
                .or(() -> Optional.ofNullable(animal).filter(Cow.class::isInstance)
                        .map(c -> new AbstractMap.SimpleEntry<>("cow", c)))
                .ifPresentOrElse(m -> System.out.printf(OUT_FORMAT, m.getKey(), m.getValue().sound()),
                                System.out::println);
    }
}
