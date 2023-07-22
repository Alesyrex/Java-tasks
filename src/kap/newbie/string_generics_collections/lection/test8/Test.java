package kap.newbie.string_generics_collections.lection.test8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Alexandr Korovkin
 */
public class Test {
    public static void main(String[] args) {

        String s = "login;password;email\n" +
                "ivanov;ivanovpass;ivanov@gmail.com\n" +
                "petrov;petrovpass;petrov@gmail.com";

        Pattern pattern = Pattern.compile("^.+?$",Pattern.MULTILINE);

        Matcher matcher = pattern.matcher(s);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
