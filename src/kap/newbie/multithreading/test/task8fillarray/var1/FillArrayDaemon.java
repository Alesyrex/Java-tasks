package kap.newbie.multithreading.test.task8fillarray.var1;

import kap.newbie.multithreading.test.task8fillarray.model.FillingThis;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Напишите программу, заполняющую двумерный массив большого размера
 * (подберите на свой вкус, ограничения могут зависеть от заданного размера хипа в JVM)
 * случайными числами. Параллельно должен работать поток, каждые 100 миллисекунд пишущий в консоль текущее время.
 *
 * Программа должна завершиться, как только массив будет заполнен.
 * Предоставьте три различных решения данной программы.
 *
 * Вариант 1
 * @author Alexandr Korovkin
 */
public class FillArrayDaemon {
    public static void main(String[] args) {
        Thread currentTime = new Thread(() -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
            while (true){
                System.out.println(LocalTime.now().format(formatter));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        currentTime.setDaemon(true);
        currentTime.start();

        int[][] array = new int[5][90000000];
        FillingThis fillingThis = new FillingThis();
        fillingThis.filling(array);
    }
}
