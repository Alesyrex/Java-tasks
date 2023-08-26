package kap.newbie.functional_programming.test.task10spliterator.scanner;

import java.util.Scanner;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.StreamSupport;

/**
 * @author Alexandr Korovkin
 */
public class ScannerStream {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            Spliterator<String> scannerSplit = Spliterators.spliteratorUnknownSize(scanner,
                    Spliterator.ORDERED | Spliterator.NONNULL);

            int t = StreamSupport.stream(scannerSplit, false)
                    .limit(10)
                    .mapToInt(Integer::parseInt)
                    .sum();

            System.out.println(t);
        }
    }
}
