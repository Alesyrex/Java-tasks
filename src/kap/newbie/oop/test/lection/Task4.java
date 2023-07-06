package kap.newbie.oop.test.lection;

/**
 * @author Alexandr Korovkin
 */
public class Task4 {

    public static void main(String[] args) {
        new C();
        System.out.println("~~~~");
        new D();
    }
}

class C {
    static { System.out.println("init static block C"); }
    { System.out.println("init block C"); }

    C() {
        System.out.println("C()");
    }
}

class D extends C {
    static { System.out.println("init static block D"); }
    { System.out.println("init block D"); }

    D() {
        System.out.println("D()");
    }
}
