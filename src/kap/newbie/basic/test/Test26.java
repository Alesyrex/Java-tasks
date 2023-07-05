package kap.newbie.basic.test;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class Test26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Не угадал!");
        } while (input.nextInt() != 1);
    }
}
