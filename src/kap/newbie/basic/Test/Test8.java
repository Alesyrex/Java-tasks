package kap.newbie.basic.Test;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class Test8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Input number: ");
        number = input.nextInt();
        if (number < 9 && number > 2) {
            System.out.println("Number more then 2 and less then 9");
        } else {
            System.out.println("Unknown number");
        }
        input.close();
    }
}
