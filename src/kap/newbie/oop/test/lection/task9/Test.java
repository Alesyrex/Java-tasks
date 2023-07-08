package kap.newbie.oop.test.lection.task9;

/**
 * @author Alexandr Korovkin
 */
public class Test {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a);
    }
}

abstract class A{
    abstract void m();
}

class B extends A{
    @Override
    void m() {
        System.out.println("B#m");
    }
}
