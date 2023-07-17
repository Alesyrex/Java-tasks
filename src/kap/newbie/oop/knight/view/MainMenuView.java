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
    public static final int MIN_MENU_ITEM = 1;
    public static final int MAX_MENU_ITEM = 6;

    private MainMenuView(){}

    public static void printMenu(){
        ConsoleView.print(MENU);
    }

    public static int selectMainMenu(){
        return ConsoleView.selectOption(MIN_MENU_ITEM, MAX_MENU_ITEM);
    }
}
