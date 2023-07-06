package kap.newbie.oop.test.lection.task7;

import java.io.IOException;

/**
 * @author Alexandr Korovkin
 */
public class Test {

    public static void main(String[] args) throws IOException {
        Parent parent;
        parent = new Child();
        parent.m();

        String s = "sasdfsaf";
        Object o = s;

        o = args;

        if (o instanceof String) {
            String s2 = (String)o;
            System.out.println("ok");
        }

    }
}

class Parent {
    void m() throws IOException {
        System.out.println("Parent#m");
    }
}

class Child extends Parent {
    void m() throws IOException{
        System.out.println("Child#m");
    }
}

