package kap.newbie.string_generics_collections.test.task11regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Alexandr Korovkin
 */
public class Parser {
    private static final Pattern uniquePattern = Pattern.compile("[а-я][а-я-]+[а-я]");
    public static final String SPACE = " ";

    private Parser(){}

    public static String parseLine(String inputLine){
        StringBuilder outputLine = new StringBuilder();
        Matcher matcher = uniquePattern.matcher(inputLine);

        while (matcher.find()){
            outputLine.append(matcher.group()).append(SPACE);
        }
        return outputLine.toString();
    }
}
