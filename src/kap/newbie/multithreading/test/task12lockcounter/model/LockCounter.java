package kap.newbie.multithreading.test.task12lockcounter.model;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Alexandr Korovkin
 */
public class LockCounter {
    private final Lock lock;
    private int value;

    public LockCounter() {
        this.lock = new ReentrantLock();
        this.value = 0;
    }

    public void increment(){
        value++;
    }

    public void locked(){
        lock.lock();
    }

    public void unlocked(){
        lock.unlock();
    }

    public int getValue() {
        return value;
    }
}
