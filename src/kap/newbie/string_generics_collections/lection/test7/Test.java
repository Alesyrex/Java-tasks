package kap.newbie.string_generics_collections.lection.test7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Alexandr Korovkin
 */
public class Test {
    public static void main(String[] args) {

        String s = "<html><bo\r\ndy></body></html>";
        Pattern pattern = Pattern.compile("(?s)<.+?>");

        Matcher matcher = pattern.matcher(s);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
