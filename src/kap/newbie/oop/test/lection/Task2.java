package kap.newbie.oop.test.lection;

/**
 * @author Alexandr Korovkin
 */
public class Task2 {
    int x = m();

    { System.out.println("init block"); }

    { System.out.println("init block 2"); }

    Task2 () {
        super();
        System.out.println("Test2()");
    }

    Task2 (int x) {
        this();
        System.out.println("Test2(int)");
    }

    int m() {
        System.out.println("Test#m");
        return 8;
    }

    public static void main(String[] args) {
        new Task2(2);
    }
}
