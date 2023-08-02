package kap.newbie.string_generics_collections.test.task12arrlist.exception;

/**
 * @author Alexandr Korovkin
 */
public class CounterNotExistException extends RuntimeException{
    public CounterNotExistException() {
        super();
    }

    public CounterNotExistException(String message) {
        super(message);
    }
}
