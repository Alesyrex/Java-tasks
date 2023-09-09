package kap.newbie.multithreading.test.task5waitfor.model;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class Message {
    public static final String FINISH = "Finish";
    public static final String EMPTY = "";
    public static final String INPUT_MESSAGE = "Input message: ";
    public static final String SEND = "Send: ";

    private String message = "";
    private final Scanner input = new Scanner(System.in);

    public synchronized void write() {
        while (!message.equals(EMPTY)){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.print(INPUT_MESSAGE);
        message = input.nextLine();
        notifyAll();
    }

    public synchronized void send() {
        while (message.equals(EMPTY)) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        if (!message.equals(FINISH)){
            System.out.println(SEND + message);
            message = EMPTY;
        } else {
            input.close();
        }
        notifyAll();
    }

    public String getMessage() {
        return message;
    }
}
