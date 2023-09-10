package kap.newbie.multithreading.test.task8fillarray.var2;

import kap.newbie.multithreading.test.task8fillarray.model.FillingThis;

import javax.imageio.stream.ImageInputStream;
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
 * Вариант 2
 * @author Alexandr Korovkin
 */
public class FillArrayAlive {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();

        Thread currentTime = new Thread(() -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
            while (mainThread.isAlive()){
                System.out.println(LocalTime.now().format(formatter));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        currentTime.start();

        int[][] array = new int[5][90000000];
        FillingThis fillingThis = new FillingThis();
        fillingThis.filling(array);
    }
}
