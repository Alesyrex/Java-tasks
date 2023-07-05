package kap.newbie.basic.test;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class Test13 {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        String secondName;

        Scanner input = new Scanner(System.in);
        System.out.print("Input first name: ");
        firstName = input.nextLine();
        System.out.print("Input last name: ");
        lastName = input.nextLine();
        System.out.print("Input second name: ");
        secondName = input.nextLine();

        System.out.println(lastName + " " + firstName + " " + secondName);
        System.out.printf("%s %s %s", lastName, firstName, secondName);

        input.close();
    }
}
