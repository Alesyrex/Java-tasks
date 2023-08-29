package kap.newbie.functional_programming.test.task13intermediatestreams.var2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

/**
 * Реализуйте метод, возвращающий Stream<String> из дат месяца,
 * номер которого был передан параметром. Выведите все даты года в консоль.
 * Избегайте дублирования кода.
 *
 * Вариант 2(*): в main() Stream должен быть лишь 1. Требует использования flatMap().
 *
 * @author Alexandr Korovkin
 */
public class WithFlatMap {
    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public static void main(String[] args) {
        Stream.iterate(1, i -> i <= 12, i -> ++i)
                .flatMap(WithFlatMap::getMonthDays)
                .forEach(System.out::println);
    }

    public static Stream<String> getMonthDays(int month){
        LocalDate date = LocalDate.now().withMonth(month).withDayOfMonth(1);

        return Stream.iterate(date, d -> d.plusDays(1))
                .limit(date.getMonth().length(date.isLeapYear()))
                .map(d -> d.format(FORMATTER));
    }
}
