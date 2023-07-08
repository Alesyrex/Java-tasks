package kap.newbie.oop.test.lection.task10;

/**
 * @author Alexandr Korovkin
 */
public class Test {
    public static void main(String[] args) {
        G g = null;
        g.toString();
    }
}

interface G {
    int X = 8;  //public statis=c final
    void m(); //public abstract
    class A{};  //public static
    interface J {}  //public static
}