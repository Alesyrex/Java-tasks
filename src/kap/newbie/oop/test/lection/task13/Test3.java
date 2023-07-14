package kap.newbie.oop.test.lection.task13;

/**
 * @author Alexandr Korovkin
 */
public class Test3 {
    public static void main(String[] args) {
        Outer.Nested n = new Outer.Nested();
        n.m();

        Outer o = new Outer();

        Outer.Inner i = o.new Inner();

        i.m();
    }
}

class Outer {
    static class Nested {
        void m() {
            System.out.println("Nested#m");
        }
    }

    class Inner {
        void m() {
            System.out.println("Inner#m");
        }
    }
}