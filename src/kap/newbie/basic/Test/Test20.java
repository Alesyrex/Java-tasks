package kap.newbie.basic.Test;

import javax.security.auth.login.AccountLockedException;
import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class Test20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int exit;
        while (true) {
            System.out.print("Input two numbers: ");
            num1 = input.nextInt();
            num2 = input.nextInt();
            System.out.println("result = " + num1 * num2);
            System.out.print("For ending input -1, or any number to continue: ");
            exit = input.nextInt();
            if (exit == -1) {
                break;
            }
        }
        input.close();
    }
}
