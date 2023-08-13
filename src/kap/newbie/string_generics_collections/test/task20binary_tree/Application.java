package kap.newbie.string_generics_collections.test.task20binary_tree;

/**
 * Реализуйте бинарное дерево поиска. Учтите возможность использования дерева как для Comparable-сущностей,
 * так и для сортировки на основе компаратора.
 *
 * Реализуйте в рамках дерева методы, производящие обход в глубину (любой из трех рассмотренных в статье) и ширину.
 * Результатом работы этих методов должно быть перечисление элементов дерева в консоли в порядке их обхода.
 *
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) {
        BinaryTree<Integer, String> animals = new BinaryTree<>(7, "Cat");

        animals.insert(4, "Dog");
        animals.insert(6, "Hedgehog");
        animals.insert(9, "Bird");
        animals.insert(8, "Horse");

        System.out.println(animals);
        System.out.println(animals.size());

        animals.insert(3, "Mouse");
        animals.insert(1, "Cow");
        animals.insert(11, "Rat");
        animals.insert(10, "Monkey");

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
