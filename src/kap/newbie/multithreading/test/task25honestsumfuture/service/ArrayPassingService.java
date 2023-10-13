package kap.newbie.multithreading.test.task25honestsumfuture.service;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Consumer;

/**
 * @author Alexandr Korovkin
 */
public class ArrayPassingService {
    private final Random random;
    private final int[][][] array;

    public ArrayPassingService(int[][][] array) {
        this.array = array;
        random = new Random();
    }

    private void passingArray(Consumer<? super int[]> consumer){
        Arrays.stream(array)
                .flatMap(Arrays::stream)
                .forEach(consumer);
    }

    public void setRandom(){
        passingArray(setRandomConsumer());
    }

    public void printArray(){
        passingArray(printArrayConsumer());
    }

    private Consumer<int[]> setRandomConsumer () {
        return array -> {
            for(int i = 0;i < array.length;++i){
                array[i] = random.nextInt(50);
            }
        };
    }

    private Consumer<int[]> printArrayConsumer(){
        return array -> {
            for(int i : array){
                System.out.print(i +" ");
            }
            System.out.println();
        };
    }
}
