package kap.newbie.string_generics_collections.test.task10regex.service;

import kap.newbie.string_generics_collections.test.task10regex.model.FullName;

import java.util.regex.Pattern;

/**
 * @author Alexandr Korovkin
 */
public class FullNameValidator {
    private final Pattern pattern = Pattern.compile("^([А-Я][а-я]+?(\\-[А-Я][а-я]+?|)) " +
                                                    "([А-Я][а-я]+?) " +
                                                    "([А-Я][а-я]+)", Pattern.MULTILINE);
    private FullName fullName;
}
