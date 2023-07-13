package kap.newbie.oop.test.task15.exception;

/**
 * @author Alexandr Korovkin
 */
public class UnknownAnimalException extends IllegalArgumentException{
    public UnknownAnimalException(String message) {
        super(message);
    }
}
