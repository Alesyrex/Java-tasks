package kap.newbie.string_generics_collections.test.task13mycollection.exception;

/**
 * @author Alexandr Korovkin
 */
public class InvalidRemoveException extends RuntimeException{
    public InvalidRemoveException(String message) {
        super(message);
    }
}
