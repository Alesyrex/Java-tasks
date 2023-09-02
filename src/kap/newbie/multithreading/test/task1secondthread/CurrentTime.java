package kap.newbie.multithreading.test.task1secondthread;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * Напишите программу, отдельный (не main) поток которой пишет
 * в консоль текущее время каждый две секунды, пока программа запущена.
 *
 * @author Alexandr Korovkin
 */
public class CurrentTime {
    public static void main(String[] args) throws InterruptedException {
        Thread second = new Thread(getRunnable(),"second");
        second.start();
//        second.join();
//        System.out.println("Main finish");
    }

    public static Runnable getRunnable() {
        return () -> {
                DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss");
                LocalTime endTime = LocalTime.of(1, 32, 30);
                 while (LocalTime.now().isBefore(endTime)) {
                     System.out.println(LocalTime.now().format(format));
                     try {
                         Thread.sleep(2000);
                     } catch (InterruptedException e) {
                         System.out.println(e.getMessage());
                     }
                 }
            };
    }
}
