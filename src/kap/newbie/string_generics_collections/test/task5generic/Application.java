package kap.newbie.string_generics_collections.test.task5generic;

import kap.newbie.string_generics_collections.test.task5generic.exception.FindElementException;
import kap.newbie.string_generics_collections.test.task5generic.model.MyList;

import javax.sound.midi.Soundbank;

/**
 *
 * Реализовать класс для работы с массивом. Разработать метод, производящий поиск значения в массиве.
 * Если значение не найдено — выбрасывать исключение. Если найдено — возвращать его.
 *
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) {
        MyList<Integer> numberList = new MyList<>(new Integer[] {4,5,67,23,6,1,7,6});
        MyList<String> stringList = new MyList<>(new String[] {"One", "Two", "Three", "Four"});
        try {
            System.out.println(numberList.find(5));
            System.out.println(numberList.find(123));
        } catch (FindElementException elementException){
            System.out.println(elementException.getMessage());
        }

        try {
            System.out.println(stringList.find("Two"));
            stringList.addElement("Six");
            System.out.println(stringList.find("Six"));
            System.out.println(stringList.find("Seven"));
        } catch (FindElementException elementException){
            System.out.println(elementException.getMessage());
        }


    }
}
