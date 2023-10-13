package kap.newbie.multithreading.test.task24pool_arrayfill;

import kap.newbie.multithreading.test.task24pool_arrayfill.model.ForkTaskToArrayFilling;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

/**
 * @author Alexandr Korovkin
 */
public class PoolArrayFill {
    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());

//        ForkJoinPool pool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
        ForkJoinPool pool = new ForkJoinPool(16);

        long before = System.currentTimeMillis();

        int[][] array = new int[5][90000000];

        var task = pool.submit(new ForkTaskToArrayFilling(
                array, 0, array.length - 1, 0, array[0].length - 1));

        try {
            task.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

//        for(int[] arr : array){
//            for (int i = 0; i < arr.length; ++i){
//                System.out.print(arr[i] + " ");
//            }
//            System.out.println();
//        }

        long after = System.currentTimeMillis();

        System.out.println(after - before);

        pool.shutdown();
    }
}
