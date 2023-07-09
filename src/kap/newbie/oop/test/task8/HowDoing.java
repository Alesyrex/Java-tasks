package kap.newbie.oop.test.task8;

/**
 * @author Alexandr Korovkin
 */
public class HowDoing implements Answerable{

    public static final String HOW_ARE_YOU_DOING = "How are you doing";

    @Override
    public void printAnswer() {
        System.out.println(HOW_ARE_YOU_DOING);
    }
}
