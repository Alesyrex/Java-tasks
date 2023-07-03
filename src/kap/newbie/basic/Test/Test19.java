package kap.newbie.basic.Test;

/**
 * @author Alexandr Korovkin
 */
public class Test19 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; ++i) {
            for (int j = 1; j < 10; ++j) {
                System.out.print("\t" + i * j);
            }
            System.out.println();
        }
    }
}
