package kap.newbie.short_topics.date.task3;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * Реализуйте программу, выводящую в консоль количество времени между двумя введенными с клавиатуры
 * датами и временем в секундах, минутах, часах, днях, месяцах и годах.
 *
 * Пример ввода:
 *
 * 20.12.2022 20:16:00
 * 28.06.1932 02:51:56
 *
 * Пример вывода:
 *
 * Seconds: 2855323444
 * Minutes: 47588724
 * Hours: 793145
 * Days: 33047
 * Months: 1085
 * Years: 90
 * Summary: 90 years, 5 months, 22 days, 17 hours 24 minutes 4 seconds
 *
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) {
        System.out.println("Input two dates and time in format dd.mm.yyyy hh:mm:ss");

        LocalDateTime dateTime1;
        LocalDateTime dateTime2;

        try(Scanner scanner = new Scanner(System.in)) {
            String dateString1 = scanner.nextLine();
            String dateString2 = scanner.nextLine();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

            dateTime1 = LocalDateTime.parse(dateString1,formatter);
            dateTime2 = LocalDateTime.parse(dateString2,formatter);

            if (dateTime1.isBefore(dateTime2)){
                printDifferenceTime(dateTime1, dateTime2);
            }else {
                printDifferenceTime(dateTime2, dateTime1);
            }

        } catch (DateTimeParseException exception){
            System.out.println("Incorrect format date!");
        }
    }

    public static void printDifferenceTime(LocalDateTime before, LocalDateTime after){
        Period period = Period.between(before.toLocalDate(), after.toLocalDate());
        Duration duration = Duration.between(before.toLocalTime(),after.toLocalTime());

        System.out.printf("Seconds: %d\nMinutes: %d\nHours: %d\nDays: %d\nMonths: %d\nYears: %d\n",
                ChronoUnit.SECONDS.between(before, after),
                ChronoUnit.MINUTES.between(before, after),
                ChronoUnit.HOURS.between(before, after),
                ChronoUnit.DAYS.between(before, after),
                ChronoUnit.MONTHS.between(before, after),
                ChronoUnit.YEARS.between(before, after));
        System.out.printf("Summary: %d years, %d months, %d days, %d hours %d minutes %d seconds",
                period.getYears(),
                period.getMonths(),
                period.getDays(),
                duration.getSeconds() / 3600 % 24,
                duration.getSeconds() / 60 % 60,
                duration.getSeconds() % 60);
    }
}
