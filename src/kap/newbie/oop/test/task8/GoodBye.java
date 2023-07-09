package kap.newbie.oop.test.task8;

/**
 * @author Alexandr Korovkin
 */
public class GoodBye implements Answerable{

    public static final String GOOD_BYE = "Good Bye";

    @Override
    public void printAnswer() {
        System.out.println(GOOD_BYE);
    }
}
