package kap.newbie.string_generics_collections.test.task5generic.exception;

/**
 * @author Alexandr Korovkin
 */
public class FindElementException extends Exception{
    public FindElementException() {
        super();
    }

    public FindElementException(String message) {
        super(message);
    }
}
