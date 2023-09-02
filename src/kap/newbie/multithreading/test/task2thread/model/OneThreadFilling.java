package kap.newbie.multithreading.test.task2thread.model;

import java.util.Random;

/**
 * 1. Заполняющую массив в однопоточном режиме;
 *
 * @author Alexandr Korovkin
 */
public class OneThreadFilling implements FillThisArray{
    public static final Random random = new Random(0);
    @Override
    public void filling(int[][] array) {
        for (int[] i : array){
            for (int j = 0;j < i.length; ++j){
                i[j] = random.nextInt(9);
            }
        }
    }
}
