package kap.newbie.basic.test;

/**
 * Создать массив char, заполненный буквами своего имени в верном порядке.
 * Используя этот массив, вывести свое имя в консоль, не используя переменную типа String;
 *
 * @author Alexandr Korovkin
 */
public class Test27 {
    public static void main(String[] args) {
        char[] name = {'A','l','e','x'};
        for (char symbol : name) {
            System.out.print(symbol);
        }
    }
}
