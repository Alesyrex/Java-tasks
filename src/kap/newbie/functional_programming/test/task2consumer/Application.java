package kap.newbie.functional_programming.test.task2consumer;

import kap.newbie.functional_programming.test.task2consumer.model.Animal;
import kap.newbie.functional_programming.test.task2consumer.model.Cat;
import kap.newbie.functional_programming.test.task2consumer.model.Cow;
import kap.newbie.functional_programming.test.task2consumer.model.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Знакомимся с функциональным интерфейсом Consumer.
 * Используя реализацию задачи о полиморфизме Animal, замените массив на список,
 * а цикл for – на вызов метода forEach(), который доступен для всех наследников Iterable.
 *
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cow());

        animals.forEach(Animal::sound);
    }
}
