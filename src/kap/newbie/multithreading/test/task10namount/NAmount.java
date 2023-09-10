package kap.newbie.multithreading.test.task10namount;

import kap.newbie.multithreading.test.task10namount.service.ArrayFill;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * Реализуйте метод, возвращающий число элементов равных N в двумерном массиве целых чисел.
 * Массив и N должны передаваться как параметры метода.
 *
 * Каждый одномерный массив должен быть обработан в своем потоке.
 *
 * @author Alexandr Korovkin
 */
public class NAmount {
    public static final AtomicInteger atomicInteger = new AtomicInteger(0);
    public static final int N = 14;

    public static void main(String[] args) {
        int[][] numbers = new int[5][100];

        ArrayFill filler = new ArrayFill();
        filler.filling(numbers);

        Arrays.stream(numbers)
                .map(NAmount::getRun)
                .map(Thread::new)
                .peek(Thread::start)
                .forEach(NAmount::joinThread);

        printArray(numbers);

        System.out.println(atomicInteger.get());
    }

    private static Runnable getRun(int [] i){
        return () -> {
            for (int value : i) {
                if (value == N) {
                    atomicInteger.incrementAndGet();
                }
            }
        };
    }

    private static void joinThread(Thread thread){
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0;i < array.length; ++i){
            for (int j = 0;j < array[i].length; ++j){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
