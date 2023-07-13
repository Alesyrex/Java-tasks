package kap.newbie.oop.test.task15.exception;

/**
 * @author Alexandr Korovkin
 */
public class ArrayValidationException extends NullPointerException{
    public ArrayValidationException() {
        super("Null!");
    }
}
