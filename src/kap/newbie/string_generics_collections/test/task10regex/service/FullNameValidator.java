package kap.newbie.string_generics_collections.test.task10regex.service;

import kap.newbie.string_generics_collections.test.task10regex.exception.ValidateException;
import kap.newbie.string_generics_collections.test.task10regex.model.FullName;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Alexandr Korovkin
 */
public class FullNameValidator {
    public static final int SUR_NAME_ID = 4;
    public static final int FIRST_NAME_ID = 3;
    public static final int SECOND_NAME_ID = 1;
    public static final String WRONG_INPUT_NAME = "Wrong input name!";

    private static final Pattern pattern = Pattern.compile("(^[А-Я][а-я]+?(-[А-Я][а-я]+?|)) " +
                                                    "([А-Я][а-я]+?) " +
                                                    "([А-Я][а-я]+)", Pattern.MULTILINE);
    private static final FullName fullName = new FullName();

    private FullNameValidator() {}

    public static FullName validateFullName (String inputName) throws ValidateException {
        Matcher matcher = pattern.matcher(inputName);
        if (matcher.find()){
            fullName.setFirstName(matcher.group(FIRST_NAME_ID));
            fullName.setSecondName(matcher.group(SECOND_NAME_ID));
            fullName.setSurname(matcher.group(SUR_NAME_ID));
            return fullName;
        }
        throw new ValidateException(WRONG_INPUT_NAME);
    }
}
