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

    private MainMenuView(){}

    public static void printMenu(){
        System.out.println(MENU);
    }

    public static int selectMenu(){
        return ConsoleView.scanner.nextInt();
    }
}
