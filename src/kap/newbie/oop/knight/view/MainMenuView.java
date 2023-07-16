package kap.newbie.oop.knight.view;

/**
 * @author Alexandr Korovkin
 */
public class MainMenuView {
    public static final String MENU =   "Main menu:\n" +
                                        "1. Print knight stats\n" +
                                        "2. Show ammunition\n" +
                                        "3. Equip ammunition\n" +
                                        "4. Sort ammunition\n" +
                                        "5. Search ammunition\n" +
                                        "6. Exit\n" +
                                        "Choose option:";
    public static final String INCORRECT_INPUT = "Incorrect input! Try again:";

    private MainMenuView(){}

    public static void printMenu(){
        ConsoleView.print(MENU);
    }

    public static int selectMenu(){
        int menuItem = ConsoleView.inputData();

        do {
            if (menuItem < 1 || menuItem > 6) {
                ConsoleView.print(INCORRECT_INPUT);
                menuItem = ConsoleView.inputData();
            }
        } while (menuItem < 1 || menuItem > 6);

        return ConsoleView.inputData();
    }
}
