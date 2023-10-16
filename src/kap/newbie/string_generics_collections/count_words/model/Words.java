package kap.newbie.string_generics_collections.count_words.model;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Alexandr Korovkin
 */
public class Words {
    public static final int MAX_COUNT_WORD = 10;
    public static final String PAIR_FORMAT = " - ";
    public static final String LINE_SEPARATOR = "\n";
    private final Pattern pattern = Pattern.compile("\\b([а-я]|[a-z]){4,}");
    private final WordComparator comparator = new WordComparator();
    private final Map<String, Integer> word = new TreeMap<>();

    public String countWords(List<String> lines){
        for(String line : lines){
            Matcher matcher = pattern.matcher(line.toLowerCase());
            while (matcher.find()) {
                String key = matcher.group();
                word.put(key, word.getOrDefault(key, 0) + 1);
            }
        }

        return getStringFromMap();
    }

    private String getStringFromMap(){
        StringBuilder builder = new StringBuilder();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(word.entrySet());
        list.sort(comparator);

        for(Map.Entry<String, Integer> entry : list){
            if(entry.getValue() < MAX_COUNT_WORD){
                builder.append(entry.getKey()).append(PAIR_FORMAT).append(entry.getValue()).append(LINE_SEPARATOR);
            }
        }
        return builder.toString();
    }
}
