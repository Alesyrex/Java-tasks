package kap.newbie.oop.test.lection.task13;

/**
 * @author Alexandr Korovkin
 */
public class Test {  // top level class

    static class A {}   // nested class

    class A2 {}   // inner class (member of class)

    void m() {
        class A3 {}  //local inner class

        new B() {}; // anonymous class

        G g = new G() {};  // anonymous class

    }
}

class B {}

interface G {}