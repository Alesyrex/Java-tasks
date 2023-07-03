package kap.newbie.basic.Test;

/**
 * @author Alexandr Korovkin
 */
public class Test6 {
    public static void main(String[] args) {
        int a = 1;
        int b = a++; // b = 1, a = 2
        b += a++; // b = 1 + 2 = 3, a = 3
        System.out.println(b);
    }
}
