package kap.newbie.multithreading.test.task11sendrecievemessage;

import kap.newbie.multithreading.test.task11sendrecievemessage.model.Message;
import kap.newbie.multithreading.test.task11sendrecievemessage.service.Receiver;
import kap.newbie.multithreading.test.task11sendrecievemessage.service.Sender;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Реализуйте имитацию отправки и получения сообщений.
 * Один поток должен принимать сообщение, введенное с клавиатуры,
 * другой поток должен выводить это сообщение в консоль.
 * Выполнение программы должно завершиться при вводе пользователем «Finish».
 *
 * Реализуйте с помощью Lock
 *
 * @author Alexandr Korovkin
 */
public class SendReceiveWithLock {

    public static final String FINISH = "Finish";

    public static void main(String[] args) {
        final Lock lock = new ReentrantLock();
        final Condition condition = lock.newCondition();
        Message message = new Message();
        Sender sender = new Sender(message, lock, condition);
        Receiver receiver = new Receiver(message, lock, condition);

        Thread recThread = new Thread(getReceiverRun(receiver, message));
        Thread sendThread = new Thread(getSenderRun(sender, message));

        startAndWaitThreads(recThread, sendThread);
    }

    private static void startAndWaitThreads(Thread... threads){
        Arrays.stream(threads)
                .forEach(Thread::start);
    }

    private static Runnable getSenderRun(Sender sender, Message message){
        return () -> {
            while (!message.getMessage().equals(FINISH)){
                sender.sendMessage();
            }
        };
    }

    private static Runnable getReceiverRun(Receiver receiver, Message message){
        return () -> {
            while (!message.getMessage().equals(FINISH)){
                receiver.receiveMessage();
            }
        };
    }
}
