package kap.newbie.multithreading.test.task2thread;

import kap.newbie.multithreading.test.task2thread.model.FillThisArray;
import kap.newbie.multithreading.test.task2thread.model.OneThreadFilling;
import kap.newbie.multithreading.test.task2thread.model.ThreadForSubArray;

/**
 *
 * Опишите интерфейс, декларирующий метод,
 * заполняющий двумерный массив заданных размеров случайными числами от 1 до 10.
 * Создайте три реализации данного интерфейса:
 *
 * 1. Заполняющую массив в однопоточном режиме;
 * 2. Заполняющую каждый одномерный массив отдельным потоком;
 * 3. Заполняющую каждую секцию каждого одномерного массива отдельным потоком.
 * Оптимальный размер секции рекомендую определить опытным путем
 * или сделать динамически-определяемым в зависимости от размера массива*.
 *
 * Помните, что слишком большое количество потоков может привести с падению производительности –
 * процессор будет тратить на переключение потоков больше времени, чем выполнять полезную работу в рамках потока.
 * Постарайтесь определить опытным путем, на каких размерах массива разница
 * во времени выполнения становится существенной,
 * а на каких объемах данных какая из реализаций показывает лучшие результаты.
 *
 * @author Alexandr Korovkin
 */
public class ArrayFilling {
    public static void main(String[] args) throws InterruptedException {
//        FillThisArray fill = new OneThreadFilling();
        FillThisArray fill = new ThreadForSubArray();
        int[][] array = new int[5][1800000];

        long before = System.currentTimeMillis();
        fill.filling(array);
        long after = System.currentTimeMillis();
        System.out.println(after - before);

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
