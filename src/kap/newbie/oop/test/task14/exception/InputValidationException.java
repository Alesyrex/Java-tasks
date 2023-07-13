package kap.newbie.oop.test.task14.exception;


import javax.management.relation.RoleUnresolved;

/**
 * @author Alexandr Korovkin
 */
public class InputValidationException extends RuntimeException {

    public InputValidationException(String message) {
        super(message);
    }
}
