package kap.newbie.oop.test.lection.task13;

/**
 * @author Alexandr Korovkin
 */
public class Test7 {
    private int x = new A().y;

    class A{
        private int y = x;
    }
}
