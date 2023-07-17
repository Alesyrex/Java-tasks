package kap.newbie.oop.knight.view;

/**
 * @author Alexandr Korovkin
 */
public class SortMenuView {
    public static final String SORT_OPTION = "Choose sort type:\n" +
                                             "1. Cost\n" +
                                             "2. Weight\n" +
                                             "Choose option:";
    public static final int MIN_MENU_ITEM = 1;
    public static final int MAX_MENU_ITEM = 2;

    public static void printSortMenu(){
        ConsoleView.print(SORT_OPTION);
    }

    public static int selectSortMenu(){
        return ConsoleView.selectOption(MIN_MENU_ITEM, MAX_MENU_ITEM);
    }
}
