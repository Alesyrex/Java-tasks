package kap.newbie.basic.Test;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class Test5 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.print("Input a: ");
        a = input.nextInt();
        System.out.print("Input b: ");
        b = input.nextInt();
        System.out.println((a*a*a) > (b*b));
        input.close();
    }
}
