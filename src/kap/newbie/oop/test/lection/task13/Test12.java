package kap.newbie.oop.test.lection.task13;

/**
 * @author Alexandr Korovkin
 */
public class Test12 {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            void m() {
                System.out.println("Anonimous");
            }
        };
        a.m();
        new A() {
            @Override
            void m() {
                System.out.println("Anonimous2");
            }
        }.m();
    }

    static class A {
        void m(){
            System.out.println("A#m");
        }
    }
}
