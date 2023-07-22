package kap.newbie.string_generics_collections.lection.test5;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Alexandr Korovkin
 */
public class Test {
    public static void main(String[] args) {
//        language
//                country
//                        variant

        Locale locale = new Locale("ru_UA_Kharkov");

        ResourceBundle rb = ResourceBundle.getBundle("messages", locale);

        String value = rb.getString("hanger");
        System.out.println(value);
    }
}
