package kap.newbie.oop.test.lection.task8;

/**
 * @author Alexandr Korovkin
 */
public class Test {

    public static void main(String[] args) {
        Parent parent;
        parent = new Child();
        parent = null;
        parent.m();

        Child.m();

    }
}

class Parent {
    static void m() {
        System.out.println("Parent#m");
    }
}

class Child extends Parent {
    static void m() {
        Parent.m();
        System.out.println("Child#m");
    }
}

