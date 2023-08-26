package kap.newbie.functional_programming.test.task11createstreams;

import java.io.IOException;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Выводить на экран "Не угадал!" до тех пор,
 * пока с клавиатуры не будет введено число 1.
 * Запрашивать число с клавиатуры перед выводом на экран "Не угадал!"
 *
 * with stream
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            Spliterator<String> intSpliterator = Spliterators.spliteratorUnknownSize(scanner, 0);

            StreamSupport.stream(intSpliterator, false)
                    .mapToInt(Integer::parseInt)
                    .takeWhile(x -> x != 1)
                    .forEach(x -> System.out.println("Не угадал!"));

            Stream.generate(scanner::nextInt)
                    .takeWhile(x -> x != 1)
                    .forEach(x -> System.out.println("Не угадал!"));
        }


    }
}
