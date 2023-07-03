package kap.newbie.basic.Test;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class Test22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Input number: ");
        number = input.nextInt();
        int result = 0;
        while (number != 0) {
            result += number % 10;
            number /= 10;
        }
        System.out.println(result);
    }
}
