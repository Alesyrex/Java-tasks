package kap.newbie.string_generics_collections.test.task13mycollection.exception;

/**
 * @author Alexandr Korovkin
 */
public class InvalidElementException extends RuntimeException{
    public InvalidElementException(String message) {
        super(message);
    }
}
