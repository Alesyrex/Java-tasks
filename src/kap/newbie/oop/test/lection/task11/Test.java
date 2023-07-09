package kap.newbie.oop.test.lection.task11;

/**
 * @author Alexandr Korovkin
 */

@G(x = 7)
public class Test {
    @G
    void m(){}
}

@interface G{
    int x() default -1;
    String s() default "";
}
