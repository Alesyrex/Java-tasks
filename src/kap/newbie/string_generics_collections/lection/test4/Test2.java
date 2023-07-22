package kap.newbie.string_generics_collections.lection.test4;

/**
 *
 *
 * pool
 *
 *
 * @author Alexandr Korovkin
 */
public class Test2 {
    public static void main(String[] args) {
        String s = new String(new char[]{'a', 's', 'd', 'f'});
        // [] - pool empty

        System.out.println(s);
         s = s.intern(); // интернирование   -  гарантировано s в пуле;
        // [asdf] - now in the pool

        String w = "qwer";
        w = w.intern();

        String r = new String(new char[]{'q', 'w', 'e', 'r'});

        System.out.println(w == r.intern());


    }
}
