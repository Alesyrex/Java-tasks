package kap.newbie.oop.test.task8;

/**
 * @author Alexandr Korovkin
 */
public class Hello implements Answerable {

    public static final String HELLO = "Hello";

    @Override
    public void printAnswer() {
        System.out.println(HELLO);
    }
}
