package kap.newbie.oop.test.task9;

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

        Answer answer = Answer.getAnswer(message);
        System.out.println(answer.getAnswerString());
    }
}
