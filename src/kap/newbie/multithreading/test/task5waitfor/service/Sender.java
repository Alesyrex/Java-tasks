package kap.newbie.multithreading.test.task5waitfor.service;

import kap.newbie.multithreading.test.task5waitfor.model.Message;

/**
 * @author Alexandr Korovkin
 */
public class Sender implements Runnable{
    private Message message;

    public Sender(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        while (!message.getMessage().equals("Finish")) {
            message.send();
        }
    }
}
