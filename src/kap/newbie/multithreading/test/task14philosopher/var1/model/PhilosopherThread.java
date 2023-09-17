package kap.newbie.multithreading.test.task14philosopher.var1.model;

import java.util.concurrent.Semaphore;

/**
 * @author Alexandr Korovkin
 */
public class PhilosopherThread extends Thread{
    private final int philosopherId;
    private final Fork leftFork;
    private final Fork rightFork;
    private final Semaphore semaphore;
    private int eatingNum;

    public PhilosopherThread(Fork leftFork, Fork rightFork, int philosopherId, Semaphore semaphore){
        this.philosopherId = philosopherId;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.semaphore = semaphore;
        this.eatingNum = 0;
    }

    @Override
    public void run(){
        while (eatingNum < 3) {
            try {
                semaphore.acquire();
                try{
                    leftFork.lock();
                    System.out.printf("Philosopher %d took left fork %d\n", philosopherId, leftFork.getForkId());
                    try{
                        rightFork.lock();
                        System.out.printf("Philosopher %d took right fork %d\n", philosopherId, rightFork.getForkId());
                        System.out.printf("Philosopher %d have eaten portion %d\n", philosopherId, ++eatingNum);
                        sleep(1000);
                        System.out.printf("Philosopher %d leave right fork %d\n", philosopherId, rightFork.getForkId());
                    } finally {
                        rightFork.unlock();
                    }
                    System.out.printf("Philosopher %d leave left fork %d\n", philosopherId, leftFork.getForkId());
                } finally {
                    leftFork.unlock();
                }
                sleep(500);
                semaphore.release();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
