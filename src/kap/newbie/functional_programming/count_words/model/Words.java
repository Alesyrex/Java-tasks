package kap.newbie.functional_programming.count_words.model;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Alexandr Korovkin
 */
public class Words {
    public static final int MIN_AMOUNT_WORDS = 2;
    private final Pattern pattern = Pattern.compile("\\b([a-z]|[а-я]){4,}");

    public String countWords(List<String> words){
       return List.copyOf(getMap(words).entrySet())
                .stream()
                .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                .filter(e -> e.getValue().intValue() >= MIN_AMOUNT_WORDS)
                .map(e -> String.format("%s - %d", e.getKey(), e.getValue()))
                .collect(Collectors.joining("\n"));
    }

    private TreeMap<String, Long> getMap(List<String> words){
        return words.stream()
                .map(String::toLowerCase)
                .flatMap(this::getStream)
                .collect(Collectors.groupingBy(s -> s, TreeMap::new, Collectors.counting()));
    }

    public Stream<String> getStream(String line){

        return pattern.matcher(line)
                .results()
                .map(MatchResult::group);

    }
}
