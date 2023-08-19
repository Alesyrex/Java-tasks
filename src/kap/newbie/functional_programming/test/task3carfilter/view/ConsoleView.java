package kap.newbie.functional_programming.test.task3carfilter.view;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class ConsoleView {
    public static final String INCORRECT_INPUT = "Incorrect input! Try again:";
    private final Scanner scanner = new Scanner(System.in);

    public String inputData(){
        return scanner.nextLine();
    }

    public int selectOption(int minMenuItem, int maxMenuItem){
        int menuItem = Integer.parseInt(inputData());

        do {
            if (menuItem < minMenuItem || menuItem > maxMenuItem) {
                print(INCORRECT_INPUT);
                menuItem = Integer.parseInt(inputData());
            }
        } while (menuItem < minMenuItem || menuItem > maxMenuItem);

        return menuItem;
    }

    public void closeScanner(){
        scanner.close();
    }

    public void print(String out){
        System.out.print(out);
    }
}
