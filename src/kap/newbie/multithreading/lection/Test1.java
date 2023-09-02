package kap.newbie.multithreading.lection;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Alexandr Korovkin
 */
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss");
        LocalDateTime time = LocalDateTime.now();
        while (true){
            System.out.println(time.format(format));
            Thread.currentThread().sleep(1000);
            time.plusSeconds(10);
        }

    }
}
