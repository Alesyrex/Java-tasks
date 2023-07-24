package kap.newbie.string_generics_collections.test.task9regex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Alexandr Korovkin
 */
public class NumberPhoneValidator {
    private static final Pattern pattern = Pattern.compile("^(\\+7|8)" +
                                                            "(( |)\\(9\\d{2}\\)|( |\\(|)9\\d{2})" +
                                                            "( |)\\d{3}" +
                                                            "(( |-|)\\d{2}){2}"
                                                            ,Pattern.MULTILINE);

    private NumberPhoneValidator(){}

    public static boolean isValid(String inputText) {
        Matcher matcher = pattern.matcher(inputText);

        return matcher.matches();
    }
}
