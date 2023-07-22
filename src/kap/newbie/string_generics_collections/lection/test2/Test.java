package kap.newbie.string_generics_collections.lection.test2;

/**
 * @author Alexandr Korovkin
 */
public class Test {
    public static void main(String[] args) {
        String s1 = "asdf";
        String s2 = "123";

        final String s3 = "asdf";
        final String s4 = "123";

        System.out.println(s1 + s2 == "asdf123");  //false

        System.out.println(s3 + s4 == "asdf123"); //true

        String s5 = "asdf123";

        System.out.println(s5 == "asdf123"); //true
    }
}
