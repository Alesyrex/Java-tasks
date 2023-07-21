package kap.newbie.string_generics_collections.test.task4generic;

/**
 *
 * Создать класс-обертку над объектом любого типа.
 * Предусмотреть boolean-метод, проверяющий значение объекта на null.
 *
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) {
        Integer number = null;
        SomethingWrapperClass<Integer> wrapNumber = new SomethingWrapperClass<>(number);

        System.out.println(wrapNumber.isEmpty());
    }
}
