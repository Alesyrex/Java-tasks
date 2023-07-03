package kap.newbie.basic.Test;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class Test4 {
    public static void main(String[] args) {
        double a, b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.print("Input a: ");
        a = input.nextDouble();
        System.out.print("Input b: ");
        b = input.nextDouble();
        c = b * a * (a + b) / (a * a);
        System.out.printf("c = %.4f", c);
        input.close();
    }
}
