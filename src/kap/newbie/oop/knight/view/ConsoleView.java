package kap.newbie.oop.knight.view;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class ConsoleView {
    public static final Scanner scanner = new Scanner(System.in);

    public static void print(String input){
        System.out.println(input);
    }

    public static int inputData(){
        return scanner.nextInt();
    }

    public static void closeScanner(){
        scanner.close();
    }
}

