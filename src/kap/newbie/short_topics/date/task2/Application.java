package kap.newbie.short_topics.date.task2;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 * Реализуйте программу, выводящую в консоль сообщение,
 * являются ли введенные с клавиатуры дата и время больше или меньше текущего.
 * Формат вводимых даты и времени рекомендую взять 20.12.2022 20:16:00;
 *
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) {
        System.out.println("Input date and time in format dd.mm.yyyy hh:mm:ss");

        LocalDateTime dateTime;
        try(Scanner scanner = new Scanner(System.in)){
            String dateString = scanner.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

            dateTime = LocalDateTime.parse(dateString,formatter);

            if (LocalDateTime.now().isAfter(dateTime)){
                System.out.println("Entered date and time are less then current.");
            } else if (LocalDateTime.now().isBefore(dateTime)) {
                System.out.println("Entered date and time are more then current.");
            } else {
                System.out.println("Entered date and time are equal to the current.");
            }

        }catch (DateTimeParseException exception){
            System.out.println("Incorrect format date!");
        }
    }
}
