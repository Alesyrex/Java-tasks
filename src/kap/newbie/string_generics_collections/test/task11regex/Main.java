package kap.newbie.string_generics_collections.test.task11regex;

import java.util.Scanner;

/**
 * Реализуйте программу, принимающую с клавиатуры строку, содержащую слова, разделенные пробелом.
 * Выведите в консоль количество уникальных слов в строке. Учтите, что строка может начинаться с пробела.
 *
 * Теперь слова в исходном массиве могут быть разделены несколькими пробелами,
 * а также знаками табуляции и иными пробельными символами.
 * Словами считаются лишь подстроки, состоящие из буквенных символов или
 * содержащие в середине слова один или несколько дефисов, но не более одного подряд.
 * При наличии в исходной строке невалидных символов или некорректном использовании допустимых,
 * должно быть выброшено исключение.
 *
 * @author Alexandr Korovkin
 */
public class Main {
    public static final String SPACE = " ";
    public static final String INPUT_MENU = "Input string line to parsing and calc count uniques words:";
    public static final String OUTPUT_FORMAT = "Count unique words: %d";

    public static void main(String[] args) {
        System.out.println(INPUT_MENU);
        String stringLine;

        try(Scanner input = new Scanner(System.in)) {
            stringLine = input.nextLine()
                    .toLowerCase();
        }
        String[] stringArray = Parser.parseLine(stringLine).trim()
                                                        .split(SPACE);

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
