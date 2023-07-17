package kap.newbie.oop.knight.view;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class ConsoleView {
    public static final String INCORRECT_INPUT = "Incorrect input! Try again:";
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

    public static int selectOption(int minMenuItem, int maxMenuItem){
        int menuItem = inputData();

        do {
            if (menuItem < minMenuItem || menuItem > maxMenuItem) {
                print(INCORRECT_INPUT);
                menuItem = inputData();
            }
        } while (menuItem < minMenuItem || menuItem > maxMenuItem);

        return menuItem;
    }
}

