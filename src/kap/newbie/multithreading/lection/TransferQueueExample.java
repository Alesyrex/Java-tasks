package kap.newbie.multithreading.lection;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

/**
 * @author Alexandr Korovkin
 */
public class TransferQueueExample {
    public static final String WAIT_PRODUCER = "Producer waiting to transfer : ";
    public static final String TRANSFERED = "Producer transfered :";

    public static final String WAIT_CONSUMER = "Consumer waiting to consumed : ";
    public static final String CONSUMED = "Consumer consumed :";

    private TransferQueue<String> queue = null;

    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    public TransferQueueExample(){
        queue = new LinkedTransferQueue<>();

        new Thread(new Producer()).start();
        new Thread(new Consumer()).start();
    }

    private void printMessage(final String message){
        System.out.println(sdf.format(new Date()) + " " + message);
    }

    private class Producer implements Runnable{
        @Override
        public void run() {
            for(int i = 0;i < 2;++i){
                try{
                    printMessage(WAIT_PRODUCER + i);
                    queue.transfer("'producer-" + i + "'");
                    printMessage(TRANSFERED + i + "\n");
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    private class Consumer implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 2; ++i){
                try{
                    Thread.sleep(2000);
                    printMessage(WAIT_CONSUMER + i);
                    String element = queue.take();
                    printMessage(CONSUMED + element);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        new TransferQueueExample();
    }

}
