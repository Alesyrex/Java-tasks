package kap.newbie.multithreading.test.task21suminbarrier;

import kap.newbie.multithreading.test.task21suminbarrier.service.HonestCalc;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;

/**
 * @author Alexandr Korovkin
 */
public class HonestSumBarrier {
    public static void main(String[] args) {
        int[][][] array = new int[3][4][5];
        CopyOnWriteArrayList<Integer> honestSum = new CopyOnWriteArrayList<>();

        fillArray(array);

        CyclicBarrier barrier = new CyclicBarrier(array.length * array[1].length, new HonestCalc(honestSum));

        honestCalcSum(array, honestSum, barrier);
    }

    private static void fillArray(int[][][] array){
        Random random = new Random();
        for(int i = 0;i < array.length;++i){
            for (int j = 0;j < array[i].length;++j){
                System.out.print("{");
                for (int k = 0;k < array[i][j].length;++k){
                    array[i][j][k] = random.nextInt(20);
                    System.out.print(array[i][j][k] + "\t");
                }
                System.out.print("},");
            }
            System.out.println();
        }
    }

    private static void honestCalcSum(int[][][] array, CopyOnWriteArrayList<Integer> honestSum, CyclicBarrier barrier){
        for(int[][] subArray: array){
            for (int[] subSubArray : subArray){
                new Thread(() -> {
                    int result = Arrays.stream(subSubArray)
                            .filter(i -> i % 2 == 0)
                            .sum();
                    honestSum.add(result);

                    try {
                        barrier.await();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } catch (BrokenBarrierException e) {
                        throw new RuntimeException(e);
                    }
                }).start();
            }
        }
    }
}
