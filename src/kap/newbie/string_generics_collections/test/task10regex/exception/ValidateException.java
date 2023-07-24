package kap.newbie.string_generics_collections.test.task10regex.exception;

import java.security.InvalidParameterException;

/**
 * @author Alexandr Korovkin
 */
public class ValidateException extends Exception {
    public ValidateException(String msg) {
        super(msg);
    }
}
