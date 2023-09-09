package kap.newbie.multithreading.test.task5waitfor.service;

import kap.newbie.multithreading.test.task5waitfor.model.Message;

/**
 * @author Alexandr Korovkin
 */
public class Writer implements Runnable{
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        while (!message.getMessage().equals("Finish")){
            message.write();
        }
    }
}
