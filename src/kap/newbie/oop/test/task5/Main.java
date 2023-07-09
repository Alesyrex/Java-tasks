package kap.newbie.oop.test.task5;

/**
 * Реализуйте класс Animal. Реализуйте его наследников: Dog, Cat, Cow.
 * Каждый из наследников должен содержать свой метод: woof(), meow() и moo() соответственно.
 * Остальные поля и методы суперкласса и наследников реализовать по своему усмотрению, если они необходимы.
 * <p>
 * Каждый из методов должен выводить в консоль соответствующую ему строку: "woof ", "meow " или "moo".
 * <p>
 * В main() создать и наполнить в произвольном порядке объектами разных классов-наследников массив типа Animal.
 * Реализовать метод, принимающий массив Animal и вызывающий метод, характерный для конкретного животного.
 * <p>
 * Использовать при решении instanceof, getClass() или другие неизвестные нам механики – недопустимо.
 * <p>
 * Дополнительное условие (необязательно): решить задачу, при условии,
 * что woof(), meow() и moo() внутри себя выполняют только вызов protected-метода sound(), который определен в Animal.
 *
 * @author Alexandr Korovkin
 */
public class Main {
    private final Animal[] animals;

    public Main(){
        animals = new Animal[0];
    }

    public Main(Animal ...animals){
        this.animals = animals;
    }

    public void getSoundAnimal(){
        for(Animal animal : animals){
            animal.sound();
        }
    }

    public static void main(String[] args) {
        Main application = new Main(new Cat(), new Cow(), new Cow(), new Dog(), new Cat(), new Cat());
        application.getSoundAnimal();
    }
}
