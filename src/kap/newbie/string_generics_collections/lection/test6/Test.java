package kap.newbie.string_generics_collections.lection.test6;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Alexandr Korovkin
 */
public class Test {
    public static void main(String[] args) {

        String s = "asdf\r\n1234";
        Pattern pattern = Pattern.compile(".+");

        Matcher matcher = pattern.matcher(s);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
