package kap.newbie.functional_programming.test.task12createstreams.var2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;
import java.util.stream.Stream;

/**
 * @author Alexandr Korovkin
 */
public class CurrentMonthWithoutLimit {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        LocalDate date = LocalDate.now().withDayOfMonth(1);

        Stream.iterate(date, d -> d.isBefore(date.plusMonths(1)), d -> d.plusDays(1))
                .forEach(d -> System.out.println(d.format(formatter)));
    }
}
