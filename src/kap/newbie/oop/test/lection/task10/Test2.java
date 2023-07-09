package kap.newbie.oop.test.lection.task10;

import java.lang.reflect.Method;

/**
 * @author Alexandr Korovkin
 */
public class Test2 {
    public static void main(String[] args) {
        W w = new T(); // T ==> W

        System.out.println(w.getClass().getComponentType());
        w.m();
        Class c = T.class;
        for (Method m : c.getDeclaredMethods()){
            System.out.println(m.getName());
        }
    }
}

class T implements W {
    void hmm(){
        System.out.println("hmm");
    }
}
interface W {
    default void m() {
        System.out.println(this);
    }
}
