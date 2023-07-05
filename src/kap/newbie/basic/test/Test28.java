package kap.newbie.basic.test;

/**
 * Создать массив char, заполненный буквами своего имени в верном порядке.
 * Используя этот массив, вывести свое имя в консоль, предварительно собрав значения массива в переменную типа String.
 *
 * @author Alexandr Korovkin
 */
public class Test28 {
    public static void main(String[] args) {
        char[] name = {'A','l','e','x'};
        String s = "";
        for (char symbol : name) {
            s += symbol;
        }
        System.out.println(s);
    }
}
