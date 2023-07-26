package kap.newbie.iostreams.test.task1;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.MulticastChannel;

/**
 * @author Alexandr Korovkin
 */
public class Main {
    public static void main(String[] args) {
        String line = "";
        int number = 0;
        try(InputStream stream = System.in){
            line = new String(stream.readNBytes(2));
            if (line.matches("\\d+?")) {
                number = Integer.parseInt(line);
            } else {
                throw new IOException("Not number!");
            }
        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println(line);
        System.out.println(number);
    }
}
