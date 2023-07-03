package kap.newbie.basic.Test;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class Test21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Input number to factorial: ");
        number = input.nextInt();
        int result = 1;
        for (int i = 1;i <= number;++i) {
            result *= i;
        }
        System.out.println(result);
    }
}
