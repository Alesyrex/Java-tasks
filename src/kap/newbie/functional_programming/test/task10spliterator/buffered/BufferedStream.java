package kap.newbie.functional_programming.test.task10spliterator.buffered;

import java.io.*;

/**
 * @author Alexandr Korovkin
 */
public class BufferedStream {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            reader.lines()
                    .forEach(System.out::println);
        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
