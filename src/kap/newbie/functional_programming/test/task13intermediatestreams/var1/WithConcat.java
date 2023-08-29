package kap.newbie.functional_programming.test.task13intermediatestreams.var1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

/**
 * Реализуйте метод, возвращающий Stream<String> из дат месяца,
 * номер которого был передан параметром. Выведите все даты года в консоль.
 * Избегайте дублирования кода.
 *
 * Вариант 1: каждый Stream, возвращенный из метода, должен быть сохранен в отдельную переменную.
 *
 * @author Alexandr Korovkin
 */
public class WithConcat {
    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public static void main(String[] args) {
        Stream<String> january = getMonthDays(1);
        Stream<String> february = getMonthDays(2);
        Stream<String> march = getMonthDays(3);
        Stream<String> april = getMonthDays(4);
        Stream<String> may = getMonthDays(5);
        Stream<String> june = getMonthDays(6);
        Stream<String> jule = getMonthDays(7);
        Stream<String> august = getMonthDays(8);
        Stream<String> september = getMonthDays(9);
        Stream<String> october = getMonthDays(10);
        Stream<String> november = getMonthDays(11);
        Stream<String> december = getMonthDays(12);

        Stream.concat(january, Stream.concat(february, Stream.concat(march,
                Stream.concat(april, Stream.concat(may, Stream.concat(june,
                        Stream.concat(jule, Stream.concat(august, Stream.concat(september,
                                Stream.concat(october, Stream.concat(november, december)))))))))))
                .forEach(System.out::println);
    }
    public static Stream<String> getMonthDays(int month){
        LocalDate date = LocalDate.now().withMonth(month).withDayOfMonth(1);

        return Stream.iterate(date, d -> d.plusDays(1))
                .limit(date.getMonth().length(date.isLeapYear()))
                .map(d -> d.format(FORMATTER));
    }
}
