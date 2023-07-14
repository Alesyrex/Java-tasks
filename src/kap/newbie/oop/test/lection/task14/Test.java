package kap.newbie.oop.test.lection.task14;

import java.util.Arrays;

/**
 * @author Alexandr Korovkin
 */
public class Test {
    public static void main(String[] args) {
        char[] ar = Character.toChars(119070);
        System.out.println(Arrays.toString(ar));

        for (char ch : ar) {
            System.out.println(Integer.toHexString(ch));
        }
    }
}
/*
boolean     Boolean
byte
short       Integer
int
long
char        Character
float
double
*/