package kap.newbie.oop.test.lection.task14;

/**
 * @author Alexandr Korovkin
 */
public class Test2 {
    public static final int N = 100_000;

    static void test(){
        long before  = System.currentTimeMillis();

        int sum = 0;
        for (int j = 0; j < N; ++j) {
            sum += j;
        }

        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }

    static void test2(){
        long before  = System.currentTimeMillis();

        Integer sum = 0;
        for (int j = 0; j < N; ++j) {
            sum += j;
        }

        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }
    public static void main(String[] args) {
        test();
        test2();
    }
}
