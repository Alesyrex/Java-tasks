package kap.newbie.oop.test.lection.task13;

/**
 * @author Alexandr Korovkin
 */
public class Test13 {
    public static void main(String[] args) {
        new A(7){};

        G g = new G(){
            @Override
            public void m() {
                System.out.println("Hello may friend");
            }
        };
        g.m();
    }

    static class A {
        A(int x){}
    }

    interface G {
        void m();
    }
}
