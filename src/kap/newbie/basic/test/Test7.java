package kap.newbie.basic.test;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class Test7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Input number 1: ");
        num1 = input.nextInt();
        System.out.print("Input number 2: ");
        num2 = input.nextInt();
        if(num1 > num2) {
            System.out.println("Number 1 more then number 2");
        } else if (num1 < num2) {
            System.out.println("Number 2 more then number 1");
        } else {
            System.out.println("Numbers equals!");
        }
        input.close();
    }
}
