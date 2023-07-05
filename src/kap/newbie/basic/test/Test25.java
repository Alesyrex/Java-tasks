package kap.newbie.basic.test;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class Test25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.nextInt() != 1) {
                System.out.println("Не угадал!");
        }
    }
}
