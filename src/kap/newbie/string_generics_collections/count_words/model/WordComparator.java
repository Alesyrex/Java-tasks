package kap.newbie.string_generics_collections.count_words.model;

import java.util.Comparator;
import java.util.Map;

/**
 * @author Alexandr Korovkin
 */
public class WordComparator implements Comparator<Map.Entry<String, Integer>> {
    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return o2.getValue().compareTo(o1.getValue());
    }
}
