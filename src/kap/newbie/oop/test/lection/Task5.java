package kap.newbie.oop.test.lection;

/**
 * @author Alexandr Korovkin
 */
public class Task5 {
    static int x = m();

    static {
        System.out.println("static block 1");
    }

    static int m() {
        System.out.println("Test5.m");
        return 7;
    }

    public static void main(String[] args) {

    }
}