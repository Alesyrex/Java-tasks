package kap.newbie.functional_programming.test.task12createstreams.var1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

/**
 * @author Alexandr Korovkin
 */
public class CurrentMonth {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        LocalDate date = LocalDate.now().withDayOfMonth(1);

        Stream.iterate(date, d -> d.plusDays(1))
                .limit(date.getMonth().length(date.isLeapYear()))
                .map(d -> d.format(formatter))
                .forEach(System.out::println);
    }
}
