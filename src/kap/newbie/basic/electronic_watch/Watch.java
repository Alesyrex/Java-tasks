package kap.newbie.basic.electronic_watch;
import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class Watch {

    public static final String INPUT_VALUE_OF_SECONDS = "Input value of seconds:";
    public static final int SEC_IN_HOURS = 3600;
    public static final int SEC_IN_MINUTES = 60;
    public static final String TIME_FORMAT = "%02d:%02d:%02d";

    public static void main(String[] args) {
        System.out.print(INPUT_VALUE_OF_SECONDS);
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        int hours = inputValue / SEC_IN_HOURS;
        int minutes = (inputValue % SEC_IN_HOURS) / SEC_IN_MINUTES;
        int seconds = inputValue % SEC_IN_MINUTES;

        System.out.printf(TIME_FORMAT, hours, minutes, seconds);
    }
}
