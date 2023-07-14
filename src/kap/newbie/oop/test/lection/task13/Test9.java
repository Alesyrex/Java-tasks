package kap.newbie.oop.test.lection.task13;

import java.lang.reflect.Field;

/**
 * @author Alexandr Korovkin
 */
public class Test9 {

    class F{}

    public static void main(String[] args) {
        Class c = F.class;
        for (Field field : c.getDeclaredFields()){
            System.out.println(field);
        }

        // final kap.newbie.oop.test.lection.task13.Test9 kap.newbie.oop.test.lection.task13.Test9$F.this$0
    }
}

class Base {
    class A {}  //Base.A
}

/*class D extends Base.A {

}*/
