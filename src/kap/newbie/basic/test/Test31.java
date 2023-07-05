package kap.newbie.basic.test;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class Test31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input line:");
        String line = input.nextLine();

        chooseAnswerWithIfElse(line);
        chooseAnswerWithCase(line);
        input.close();
    }

    static void print(String message) {
        System.out.println(message);
    }

    static void chooseAnswerWithCase(String line) {
        switch (line) {
            case "Hi" :
                print("Hello");
                break;
            case "Bye" :
                print("Good bye");
                break;
            case "How are you" :
                print("How are you doing");
                break;
            default:
                print("Unknown message");
        }
    }

    static void chooseAnswerWithIfElse(String line) {
        if (line.equals("Hi")) {
            print("Hello");
        } else if (line.equals("Bye")) {
            print("Good bye");
        } else if (line.equals("How are you")){
            print("How are you doing");
        } else {
            print("Unknown message");
        }
    }
}
