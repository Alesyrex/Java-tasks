package kap.newbie.multithreading.test.task20friends_meeting.model;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @author Alexandr Korovkin
 */
public class Friend implements Runnable{
    private final CyclicBarrier barrier;
    private final int waiting;
    private final int late;

    public Friend(CyclicBarrier barrier){
        Random random = new Random();
        this.waiting = random.nextInt(5) + 1;
        this.late = random.nextInt(2) + 1;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try{
            TimeUnit.SECONDS.sleep(late);

            barrier.await(waiting, TimeUnit.SECONDS);
        } catch (InterruptedException | BrokenBarrierException | TimeoutException e){
            Thread.currentThread().interrupt();
        }
    }
}
