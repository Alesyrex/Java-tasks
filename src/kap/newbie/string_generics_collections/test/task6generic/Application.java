package kap.newbie.string_generics_collections.test.task6generic;

import kap.newbie.string_generics_collections.test.task6generic.exception.InvalidElementException;
import kap.newbie.string_generics_collections.test.task6generic.exception.InvalidRemoveException;

/**
 * Реализовать параметризованный класс, хранящий и обрабатывающий стек.
 * Стек — структура данных, в котором каждый элемент хранит ссылку на следующий.
 * Работает по принципу LIFO (последний вошел — первый вышел).
 *
 * Реализовать следующие методы:
 *
 * Добавление элемента в стек;
 * Удаление элемента из стека. При удалении несуществующего элемента – исключение;
 * Получение глубины (количества элементов) стека;
 * Поиск по стеку, при отсутствии искомого значения – исключение;
 * Получение строкового эквивалента элементов стека, представленных в виде массива
 * ([строковое представление элемента1, ..., строковое представление элементаN]).
 *
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) throws InvalidRemoveException, InvalidElementException {
        MyStack<Integer> stack = new MyStack<>(99);

        stack.addElement(88);
        stack.addElement(77);
        stack.removeElement();
        stack.addElement(66);
        stack.addElement(55);
        stack.addElement(44);
        stack.addElement(33);

        System.out.println(stack.getStackDeep());

        System.out.println(stack.findElement(66));

        System.out.println(stack);

        MyStack<String> stackString = new MyStack<>();

        stackString.addElement("welcome");
        stackString.addElement("and");
        stackString.addElement("friend");
        stackString.addElement("new");
        stackString.addElement("my");
        stackString.addElement("Hello");

        System.out.println(stackString);

    }
}
