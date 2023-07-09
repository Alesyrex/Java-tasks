package kap.newbie.oop.test.lection.task12;

/**
 * @author Alexandr Korovkin
 */
public class Test {
    public static void main(String[] args) {
        A a = new A();
        // a ==> [........]

        a = null;
        // a =X=> [........]

        System.gc();
    }
}

class A {
    @Override
    public String toString() {
        System.out.println("A#String");
        return "null";
    }
}
