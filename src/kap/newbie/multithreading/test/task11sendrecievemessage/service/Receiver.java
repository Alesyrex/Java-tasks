package kap.newbie.multithreading.test.task11sendrecievemessage.service;

import kap.newbie.multithreading.test.task11sendrecievemessage.model.Message;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Alexandr Korovkin
 */
public class Receiver {
    private final Message message;
    private final Lock receiveLock;
    private final Condition condition;

    public Receiver(Message message){
        this.message = message;
        receiveLock = new ReentrantLock();
        condition = receiveLock.newCondition();
    }

    public Receiver(Message message, Lock receiveLock, Condition condition) {
        this.message = message;
        this.receiveLock = receiveLock;
        this.condition = condition;
    }

    public void receiveMessage(){
        try{
            receiveLock.lock();
            while (!message.isReceive()){
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.printf("Receive message: %s\n", message.getMessage());
            message.setReceive(false);
            condition.signalAll();
        } finally {
            receiveLock.unlock();
        }
    }
}
