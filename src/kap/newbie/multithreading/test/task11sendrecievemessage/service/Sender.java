package kap.newbie.multithreading.test.task11sendrecievemessage.service;

import kap.newbie.multithreading.test.task11sendrecievemessage.model.Message;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Alexandr Korovkin
 */
public class Sender {
    public static final String FINISH = "Finish";
    public static final String SEND_MESSAGE = "Send message: ";
    private final Message message;
    private final Lock sendLock;
    private final Condition condition;

    private final Scanner scanner = new Scanner(System.in);

    public Sender(Message message) {
        this.message = message;
        this.sendLock = new ReentrantLock();
        this.condition = sendLock.newCondition();
    }

    public Sender(Message message, Lock sendLock, Condition condition) {
        this.message = message;
        this.sendLock = sendLock;
        this.condition = condition;
    }

    public void sendMessage(){
        try {
            sendLock.lock();
            while (message.isReceive()) {
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.print(SEND_MESSAGE);
            message.setMessage(scanner.nextLine());

            if (message.getMessage().equals(FINISH)){
                scanner.close();
            }

            message.setReceive(true);
            condition.signalAll();
        } finally {
            sendLock.unlock();
        }
    }
}
