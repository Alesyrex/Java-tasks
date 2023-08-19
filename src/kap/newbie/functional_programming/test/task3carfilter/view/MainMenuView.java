package kap.newbie.functional_programming.test.task3carfilter.view;

/**
 * @author Alexandr Korovkin
 */
public class MainMenuView {

    public static final int MAX_MENU = 5;
    public static final int MIN_MENU = 1;
    public static final String MENU = "Выберете фильтр для поиска:\n" +
            "1. Фильтр по номеру\n" +
            "2. Фильтр по части номера\n" +
            "3. Фильтр по цвету\n" +
            "4. Фильтр по году выпуска (укажите диапазон)\n" +
            "5. Выход\n>>";
    public static final String CAR_NUMBER = "Введите номер машины для поиска совпадений: ";
    public static final String CAR_COLOR = "Введите цвет машины для поиска совпадений: ";
    public static final String CAR_SUB_NUMBER = "Введите часть номера машины для поиска совпадений: ";
    public static final String CAR_YEAR = "Введите год выпуска машины для поиска совпадений: ";
    public static final String BYE = "До свидания!";

    private MainMenuView(){}

    public static String menu(){
        return MENU;
    }

    public static String numberSearch(){
        return CAR_NUMBER;
    }

    public static String colorSearch() {
        return CAR_COLOR;
    }

    public static String subNumberSearch() {
        return CAR_SUB_NUMBER;
    }

    public static String yearSearch() {
        return CAR_YEAR;
    }

    public static String bye() {
        return BYE;
    }
}

