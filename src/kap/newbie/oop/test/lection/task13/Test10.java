package kap.newbie.oop.test.lection.task13;

/**
 * @author Alexandr Korovkin
 */
public class Test10 {

    class A {
        void m(){
            System.out.println(this);
            System.out.println(Test10.this);
        }
    }
    {
        class C {
            void m(){
                System.out.println(this);
                System.out.println(Test10.this);
            }
        }
    }

}
