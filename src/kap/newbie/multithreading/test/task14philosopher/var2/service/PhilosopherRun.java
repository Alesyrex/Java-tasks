package kap.newbie.multithreading.test.task14philosopher.var2.service;

import kap.newbie.multithreading.test.task14philosopher.var2.model.Philosopher;

import java.util.concurrent.Semaphore;

/**
 * @author Alexandr Korovkin
 */
public class PhilosopherRun implements Runnable {
    private final Semaphore semaphore;
    private final Philosopher philosopher;
    private final Philosopher rightNeighbor;
    private final Philosopher leftNeighbor;

    public PhilosopherRun(Semaphore semaphore, Philosopher philosopher,
                          Philosopher rightNeighbor, Philosopher leftNeighbor){
        this.semaphore = semaphore;
        this.philosopher = philosopher;
        this.rightNeighbor = rightNeighbor;
        this.leftNeighbor = leftNeighbor;
    }

    @Override
    public void run() {
        while (philosopher.getEatingNum() < 3){
            try{
                semaphore.acquire();
                if (!rightNeighbor.isEating() && !leftNeighbor.isEating()){
                    philosopher.setEating(true);
                    System.out.printf("Philosopher %d have eaten portion %d\n",
                            philosopher.getPhilosopherId(), philosopher.incrementEatingNum());
                    Thread.sleep(500);
                    philosopher.setEating(false);
                }
                semaphore.release();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
