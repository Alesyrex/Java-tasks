package kap.newbie.oop.test.lection;

/**
 * @author Alexandr Korovkin
 */
public class Task3 {


    public static void main(String[] args) {
        new B();
    }
}

class A {
    {
        System.out.println("init block A");
    }

    A() {
        System.out.println("A()");
    }
}

class B extends A {
    {
        System.out.println("init block B");
    }

    B() {
        System.out.println("B()");
    }
}
