package kap.newbie.short_topics.date.test2localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * @author Alexandr Korovkin
 */
public class Test {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.of(2015,4,15, 23, 12,18);
        System.out.println(LocalDate.now());
        System.out.println(date);
        System.out.println(date.plusWeeks(12));

        String stringDate = "16-09-1990 10:30:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime newDate = LocalDateTime.parse(stringDate,formatter);
        System.out.println(formatter.format(date));
    }
}
