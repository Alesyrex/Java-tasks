package kap.newbie.multithreading.test.task22pool_ptinttime.service;

import kap.newbie.multithreading.test.task22pool_ptinttime.model.CurrentTime;

import java.time.format.DateTimeFormatter;

/**
 * @author Alexandr Korovkin
 */
public class CurrentTimePrint {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public static void printTime(CurrentTime time){
        System.out.println(time.getCurrentTime().format(formatter));
    }
}
