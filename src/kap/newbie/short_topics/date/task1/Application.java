package kap.newbie.short_topics.date.task1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Реализуйте метод, возвращающий объект LocalDateTime на основании переданной строки.
 * Пример входящей строки: 20.12.2022 20:16:00.
 *
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) {
        String stringDate = "20.12.2022 20:16:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        LocalDateTime dateTime = parseTime(stringDate, formatter);

        System.out.println(dateTime);
        System.out.println(dateTime.format(formatter));
    }

    public static LocalDateTime parseTime(String stringDate, DateTimeFormatter formatter){
        return LocalDateTime.parse(stringDate, formatter);
    }
}
