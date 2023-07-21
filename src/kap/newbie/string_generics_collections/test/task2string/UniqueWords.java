package kap.newbie.string_generics_collections.test.task2string;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 *
 * Реализуйте программу, принимающую с клавиатуры строку, содержащую слова, разделенные пробелом.
 * Выведите в консоль количество уникальных слов в строке. Учтите, что строка может начинаться с пробела.
 *
 * Для упрощения допустим, что в строке не могут использоваться символы,
 * отличные от пробела или русских/английский букв. Помните, что слово может быть введено в разных регистрах.
 *
 */
public class UniqueWords {

    public static final String SPACE = " ";
    public static final String INPUT_MENU = "Input string line to parsing and calc count uniques words:";
    public static final String OUTPUT_FORMAT = "Count unique words: %d";

    public static void main(String[] args) {
        System.out.println(INPUT_MENU);
        String line;
        try(Scanner input = new Scanner(System.in)) {
            line = input.nextLine();
        }
        line = line.trim().toLowerCase();
        String[] stringArray = line.split(SPACE);
        System.out.printf(OUTPUT_FORMAT, unique(stringArray));
    }

    private static int unique(String[] array) {
        int count = 0;
        for (String word : array) {
            if (word == word.intern()) {
                count++;
            }
        }
        return count;
    }
}
