package kap.newbie.oop.knight.view;

/**
 * @author Alexandr Korovkin
 */
public class SearchMenuView {
    public static final String SEARCH_MENU = "Choose search field:\n" +
                                             "1. Cost\n" +
                                             "2. Weight\n" +
                                             "Choose option:";
    public static final int MIN_MENU_ITEM = 1;
    public static final int MAX_MENU_ITEM = 2;
    public static final String WEIGHT = "weight";
    public static final String COST = "cost";
    public static final String INPUT_MINIMUM = "Input minimum %s:";
    public static final String INPUT_MAXIMUM = "Input maximum %s:";

    public static void printSearchMenu() {
        ConsoleView.print(SEARCH_MENU);
    }

    public static int selectSearchMenu() {
        return ConsoleView.selectOption(MIN_MENU_ITEM, MAX_MENU_ITEM);
    }

    public static int inputMinimum(int menuItem) {
        ConsoleView.print(String.format(INPUT_MINIMUM, menuItem == MIN_MENU_ITEM ? COST : WEIGHT));
        return ConsoleView.inputData();
    }

    public static int inputMaximum(int menuItem) {
        ConsoleView.print(String.format(INPUT_MAXIMUM, menuItem == MIN_MENU_ITEM ? COST : WEIGHT));
        return ConsoleView.inputData();
    }
}
