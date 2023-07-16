package kap.newbie.oop.knight.view;

import kap.newbie.oop.knight.model.ammunition.AmmunitionType;

/**
 * @author Alexandr Korovkin
 */
public class EquipMenuView {
    public static final String EQUIP_MENU = "What kind of ammunition do you want to equip?\n" +
                                            "%d. %s\n" +
                                            "%d. %s\n" +
                                            "Choose option:";
    public static final String WEIGHT = "weight";
    public static final String COST = "cost";
    public static final String INPUT_PARAMETERS_FORMAT = "Input %s %s:";
    public static final String INCORRECT_INPUT = "Incorrect input! Try again:";

    public static void printEquipMenu() {
        ConsoleView.print(String.format(EQUIP_MENU, AmmunitionType.SWORD.getId(), AmmunitionType.SWORD.getTypeName(),
                            AmmunitionType.HELMET.getId(), AmmunitionType.HELMET.getTypeName()));
    }

    public static int[] inputParameters(AmmunitionType ammunitionType) {
        String[] parametersName = new String[]{WEIGHT, COST, ammunitionType.getFeatureParam()};
        int[] parameters = new int[parametersName.length];

        for (int i = 0; i < parameters.length; ++i) {
            ConsoleView.print(String.format(INPUT_PARAMETERS_FORMAT, ammunitionType.getTypeName(), parametersName[i]));
            parameters[i] = ConsoleView.inputData();
        }
        return parameters;
    }

    public static int selectMenu(){
        int menuItem = ConsoleView.inputData();
        int minMenuItem = AmmunitionType.SWORD.getId();
        int maxMenuItem = AmmunitionType.HELMET.getId();

        do {
            if (menuItem < minMenuItem || menuItem > maxMenuItem) {
                ConsoleView.print(INCORRECT_INPUT);
                menuItem = ConsoleView.inputData();
            }
        } while (menuItem < minMenuItem || menuItem > maxMenuItem);

        return menuItem;
    }
}
