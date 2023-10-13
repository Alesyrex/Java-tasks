package kap.newbie.multithreading.test.task25honestsumfuture;

import kap.newbie.multithreading.test.task25honestsumfuture.service.ArrayPassingService;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @author Alexandr Korovkin
 */
public class HonestSumFuture {
    private static Random random = new Random();
    public static void main(String[] args) {
        var array = new int[3][4][6];

        var arrayService = new ArrayPassingService(array);
        arrayService.setRandom();
        arrayService.printArray();


    }

    private static void calc(int [][][] array){
        Arrays.stream(array)
                .flatMap(Arrays::stream)
                .map(HonestSumFuture::getTask)
                .map(CompletableFuture::supplyAsync)
                .collect(Collectors.toList())
                .stream()
                .count();
    }

    private static Supplier<Long> getTask(int[] array){
        return () -> Arrays.stream(array)
                    .filter(i -> i % 2 == 0)
                    .count();
    }
}
