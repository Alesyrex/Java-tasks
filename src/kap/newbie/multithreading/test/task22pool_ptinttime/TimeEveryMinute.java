package kap.newbie.multithreading.test.task22pool_ptinttime;

import kap.newbie.multithreading.test.task22pool_ptinttime.model.CurrentTime;
import kap.newbie.multithreading.test.task22pool_ptinttime.service.CurrentTimePrint;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Реализуйте программу, которая выводит актуальное время каждую минуту,
 * начиная с текущего момента. Не используйте Thread.sleep() или циклы.
 *
 * @author Alexandr Korovkin
 */
public class TimeEveryMinute {
    public static void main(String[] args) {
        CurrentTime time = new CurrentTime();

        ScheduledExecutorService pool = Executors.newSingleThreadScheduledExecutor();

        pool.scheduleAtFixedRate(() -> CurrentTimePrint.printTime(time), 0, 1, TimeUnit.MINUTES);
    }
}
