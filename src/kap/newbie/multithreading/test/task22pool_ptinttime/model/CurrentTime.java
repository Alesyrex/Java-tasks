package kap.newbie.multithreading.test.task22pool_ptinttime.model;

import java.time.LocalDateTime;

/**
 * @author Alexandr Korovkin
 */
public class CurrentTime {
    private LocalDateTime time;

    public LocalDateTime getCurrentTime(){
        return time = LocalDateTime.now();
    }
}
