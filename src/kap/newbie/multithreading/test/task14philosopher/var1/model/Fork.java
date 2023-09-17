package kap.newbie.multithreading.test.task14philosopher.var1.model;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Alexandr Korovkin
 */
public class Fork {
    private final int ForkId;
    private final Lock lock;

    public Fork(int forkId) {
        ForkId = forkId;
        this.lock = new ReentrantLock();
    }

    public int getForkId() {
        return ForkId;
    }

    public void lock(){
        lock.lock();
    }

    public void unlock(){
        lock.unlock();
    }
}
