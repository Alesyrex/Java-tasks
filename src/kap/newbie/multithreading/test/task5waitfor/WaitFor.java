package kap.newbie.multithreading.test.task5waitfor;

import kap.newbie.multithreading.test.task5waitfor.model.Message;
import kap.newbie.multithreading.test.task5waitfor.service.Sender;
import kap.newbie.multithreading.test.task5waitfor.service.Writer;

/**
 * @author Alexandr Korovkin
 */
public class WaitFor {
    public static void main(String[] args) throws InterruptedException {
        Message message = new Message();

        Thread one = new Thread(new Writer(message), "one");
        Thread two = new Thread(new Sender(message), "two");

        one.start();
        two.start();

        one.join();
        two.join();
    }
}
