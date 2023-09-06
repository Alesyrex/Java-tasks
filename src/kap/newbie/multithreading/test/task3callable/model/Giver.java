package kap.newbie.multithreading.test.task3callable.model;

import java.util.concurrent.Callable;

/**
 * @author Alexandr Korovkin
 */
public class Giver<T> implements Runnable {
    private T t;
    private final Callable<T> callable;

    public Giver(Callable<T> callable){
        this.callable = callable;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(6000);
            t = callable.call();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public T get(){
        return t;
    }
}
