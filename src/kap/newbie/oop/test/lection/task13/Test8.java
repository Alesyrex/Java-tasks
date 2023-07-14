package kap.newbie.oop.test.lection.task13;

/**
 * @author Alexandr Korovkin
 */
public class Test8 {
    class A {
        void m() {
            System.out.println(this);
            System.out.println(Test8.this);
        }
    }

    public static void main(String[] args) {
        Test8 t = new Test8();
        A a = t.new A();
        a.m();
    }
}
