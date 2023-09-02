package kap.newbie.multithreading.test.task2thread.model;

import java.util.Random;

/**
 *
 * 2.    Заполняющую каждый одномерный массив отдельным потоком;
 *
 * @author Alexandr Korovkin
 */
public class ThreadForSubArray implements FillThisArray{
    public static final Random random = new Random(1);
    @Override
    public void filling(int[][] array) throws InterruptedException {
        Thread thread;
        for (int[] i : array){
            thread = new Thread(getRunnable(i));
            thread.start();
            thread.join();
        }
    }

    private Runnable getRunnable(int[] i){
        return () -> {
            for (int j = 0;j < i.length; ++j){
                i[j] = random.nextInt(9);
            }
        };
    }
}
