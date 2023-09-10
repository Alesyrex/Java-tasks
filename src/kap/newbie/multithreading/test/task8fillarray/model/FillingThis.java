package kap.newbie.multithreading.test.task8fillarray.model;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Alexandr Korovkin
 */
public class FillingThis {
    public void filling(int[][] array){
        Arrays.stream(array)
                .map(this::getRun)
                .map(Thread::new)
                .peek(Thread::start)
                .forEach(this::joinThread);
    }

    private Runnable getRun(int [] i){
        Random random = new Random();

        return () -> {
            for(int j = 0;j < i.length;++j){
                i[j] = random.nextInt(55);
            }
        };
    }

    private void joinThread(Thread thread){
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
