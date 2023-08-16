package kap.newbie.string_generics_collections.test.task21avltree;

/**
 * Реализуйте АВЛ-дерево. Сопроводите действия по добавлению (и последующей балансировке)
 * и удалению элементов выводом соответствующих сообщений в консоль.
 *
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) {
        AVLTree<Integer, String> animals = new AVLTree<>();

        animals.insert(1, "Cat");
        animals.insert(2, "Dog");
        animals.insert(6, "Hedgehog");
        animals.insert(5, "Bird");
        animals.insert(7, "Horse");
        animals.insert(8, "Mouse");
        animals.insert(9, "Cow");
        animals.insert(11, "Rat");
        animals.insert(10, "Monkey");

        System.out.println("Width walk:");
        System.out.println(animals.widthWalk());

        System.out.println("\n");

        System.out.println(animals);
        System.out.println(animals.size());

        animals.remove(6);

        System.out.println(animals);
        System.out.println(animals.size());

        System.out.println(animals.search(11));

        animals.remove(9);

        System.out.println(animals);
        System.out.println(animals.size());
    }
}
