package kap.newbie.basic.Test;

/**
 * @author Alexandr Korovkin
 */
public class Test2 {
    public static void main(String[] args) {
        int a = 1348;
        int b = 671;
        b -= a;
        a += b;
        b = a - b;
        System.out.println("a = " + a + " b = " + b);
    }
}
