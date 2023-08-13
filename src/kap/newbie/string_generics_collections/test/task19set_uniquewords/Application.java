package kap.newbie.string_generics_collections.test.task19set_uniquewords;

import java.util.*;

/**
 * @author Alexandr Korovkin
 */
public class Application {
    public static final String SPACE = " ";
    public static final String INPUT_MENU = "Input string line to parsing and calc count uniques words:";
    public static final String OUTPUT_FORMAT = "Count unique words: %d";

    public static void main(String[] args) {
        System.out.println(INPUT_MENU);
        String[] stringArray;
        try(Scanner input = new Scanner(System.in)) {
            stringArray = input.nextLine().trim()
                    .toLowerCase()
                    .split(SPACE);
        }

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(stringArray));

        System.out.printf(OUTPUT_FORMAT, uniqueWords.size());
    }
}
