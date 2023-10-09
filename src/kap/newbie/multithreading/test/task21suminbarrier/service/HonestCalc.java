package kap.newbie.multithreading.test.task21suminbarrier.service;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Alexandr Korovkin
 */
public class HonestCalc implements Runnable {
    private final CopyOnWriteArrayList<Integer> honestSum;

    public HonestCalc(CopyOnWriteArrayList<Integer> honestSum) {
        this.honestSum = honestSum;
    }

    @Override
    public void run() {
        var result = honestSum.stream()
                .mapToInt(i ->i)
                .sum();
        System.out.println("Result: " + result);
    }
}
