package kap.newbie.oop.test.task8;

import java.util.List;
import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class Application {
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input phrase: ");

        String message = input.nextLine();
        input.close();

        Answerable answer;
        switch (message) {
            case "Hi" :
                answer = new Hello();
                break;
            case "Bye" :
                answer = new GoodBye();
                break;
            case "How are you" :
                answer = new HowDoing();
                break;
            default:
                answer = new Unknown();
        }
        answer.printAnswer();
    }
}
