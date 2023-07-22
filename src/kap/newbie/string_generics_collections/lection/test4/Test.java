package kap.newbie.string_generics_collections.lection.test4;

import javax.print.DocFlavor;
import java.lang.reflect.Field;

/**
 *
 *   pool
 *
 *
 * @author Alexandr Korovkin
 */
public class Test {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        Integer x = 120;
//        Integer y = 120;
//
//        System.out.println(x == y); // true
//
//        Integer c = 1200;
//        Integer z = 1200;
//
//        System.out.println(c == z); //false   (1200 уже не входит в пул)

        String s = "asdf";

        Class<String> c = String.class;
        Field f = c.getDeclaredField("hash");
        System.out.println(f);
        f.setAccessible(true);

        Object o = f.get(s);
        System.out.println(o);

        System.out.println(s.hashCode());

        o = f.get(s);
        System.out.println(o);
    }
}
