package kap.newbie.basic.test;

/**
 * @author Alexandr Korovkin
 */
public class Test1 {
    public static void main(String[] args) {
        //boolean
        boolean a;
        a = true;
        a = false;
        //int
        int x = 34;
        x = 0xf;
        x = 012;
        x = 0b10011;
        System.out.println(x);

        //long
        long y = 34L;
        y = 0xfL;
        y = 012L;
        y = 0b10011L;
        System.out.println(y);

        //char
        char ch;
        ch = 'П';

        ch = 104;

        ch = '\u0445';

        ch = '\11';

        ch = '\f';

        System.out.println(ch);
        System.out.println((int)ch);

        //double

        double d;

        d = 1.2;
        d = 1.;
        d = .1;

        d = 1d;
        d = 1D;
        d = 12e-3;
        d = 0x12.43p2;

        System.out.println(d);
    }
}
