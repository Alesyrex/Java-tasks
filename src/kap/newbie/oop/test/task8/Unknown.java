package kap.newbie.oop.test.task8;

/**
 * @author Alexandr Korovkin
 */
public class Unknown implements Answerable{

    public static final String UNKNOWN_MESSAGE = "Unknown message";

    @Override
    public void printAnswer() {
        System.out.println(UNKNOWN_MESSAGE);
    }
}
