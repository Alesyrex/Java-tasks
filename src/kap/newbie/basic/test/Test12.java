package kap.newbie.basic.test;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class Test12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input line:");
        String line = input.nextLine();
        if (line.equals("Hi")) {
            System.out.println("Hello");
        } else if (line.equals("Bye")) {
            System.out.println("Good bye");
        } else if (line.equals("How are you")){
            System.out.println("How are you doing");
        } else {
            System.out.println("Unknown message");
        }

        switch (line) {
            case "Hi" :
                System.out.println("Hello");
                break;
            case "Bye" :
                System.out.println("Good bye");
                break;
            case "How are you" :
                System.out.println("How are you doing");
                break;
            default:
                System.out.println("Unknown message");
        }
        input.close();
    }
}
