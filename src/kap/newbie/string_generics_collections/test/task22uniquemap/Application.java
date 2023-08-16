package kap.newbie.string_generics_collections.test.task22uniquemap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

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
        try (Scanner input = new Scanner(System.in)) {
            stringArray = input.nextLine().trim()
                    .toLowerCase()
                    .split(SPACE);
        }

        TreeMap<String, Integer> uniqueWords = new TreeMap<>();

        for (String word : stringArray) {
            int count = 1;
            if (uniqueWords.containsKey(word)){
                count = uniqueWords.get(word) + 1;
            }
            uniqueWords.put(word, count);
        }

        for (Map.Entry<String, Integer> entry : uniqueWords.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.printf(OUTPUT_FORMAT, uniqueWords.size());
    }
}
