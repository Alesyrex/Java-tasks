package kap.newbie.multithreading.test.task23pool_newhour;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Alexandr Korovkin
 */
public class NewHourNotification {
    public static void main(String[] args) {
        ZonedDateTime nextHour = ZonedDateTime.now()
                .plusHours(1)
                .withMinute(0)
                .withSecond(0)
                .withNano(0);

        long delay = Duration.between(ZonedDateTime.now(), nextHour).getSeconds() + 1;

        ScheduledExecutorService pool = Executors.newSingleThreadScheduledExecutor();

        pool.scheduleAtFixedRate(() -> printTimeMessage(ZonedDateTime.now()), delay, 60 * 60, TimeUnit.SECONDS);
    }

    private static void printTimeMessage(ZonedDateTime time){
        System.out.print("New hour is beginning! ");
        System.out.println(time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}
