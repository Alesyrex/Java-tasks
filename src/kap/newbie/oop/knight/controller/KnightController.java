package kap.newbie.oop.knight.controller;

import kap.newbie.oop.knight.model.Knight;
import kap.newbie.oop.knight.model.ammunition.Ammunition;
import kap.newbie.oop.knight.model.comparator.AmmunitionCostComparator;
import kap.newbie.oop.knight.model.comparator.AmmunitionWeightComparator;
import kap.newbie.oop.knight.view.*;

import java.util.Arrays;

/**
 * @author Alexandr Korovkin
 */
public class KnightController {
    public static final int KNIGHT_STATS = 1;
    public static final int SHOW_AMMO = 2;
    public static final int EQUIP_AMMO = 3;
    public static final int SORT_AMMO = 4;
    public static final int SEARCH_AMMO = 5;
    public static final int EXIT = 6;

    private final Knight knight;
    private final AmmunitionWeightComparator weightComparator = new AmmunitionWeightComparator();
    private final AmmunitionCostComparator costComparator = new AmmunitionCostComparator();
    private boolean bye = true;

    public KnightController(Knight knight) {
        this.knight = knight;
    }

    public void selectOperationOnKnight(int itemMenu){
        switch (itemMenu) {
            case KNIGHT_STATS:
                printKnightStats();
                break;
            case SHOW_AMMO:
                showAmmunition();
                break;
            case EQUIP_AMMO:
                equipAmmunition();
                break;
            case SORT_AMMO:
                sortAmmunition();
                break;
            case SEARCH_AMMO:
                searchAmmunition();
                break;
            case EXIT :
                bye = false;
                ConsoleView.closeScanner();
                break;
        }
    }

    private void printKnightStats() {
        knight.calculateAmmunition();
        KnightStatsView.printStats(knight);
    }

    private void showAmmunition(){
        for (Ammunition ammunition : knight.getAmmunition()) {
            KnightStatsView.printKnightAmmunition(ammunition);
        }
    }

    private void equipAmmunition() {

        EquipMenuView.printEquipMenu();

        Ammunition addedAmmunition = AmmunitionGenerator.getAmmunition(EquipMenuView.selectEquipMenu());

        knight.equip(addedAmmunition);
    }

    private void sortAmmunition(){
        SortMenuView.printSortMenu();
        int menuItem = SortMenuView.selectSortMenu();
        if (menuItem == 1){
            Arrays.sort(knight.getAmmunition(), costComparator);
        } else {
            Arrays.sort(knight.getAmmunition(), weightComparator);
        }
    }

    private void searchAmmunition(){
        SearchMenuView.printSearchMenu();
        int menuItem = SearchMenuView.selectSearchMenu();
        int minRageParameter = SearchMenuView.inputMinimum(menuItem);
        int maxRageParameter = SearchMenuView.inputMaximum(menuItem);

        if (menuItem == 1 ){
            for (Ammunition ammunition : knight.getAmmunition()) {
                if (ammunition.getCost() >= minRageParameter && ammunition.getCost() <= maxRageParameter){
                    ConsoleView.print(ammunition.toString());
                }
            }
        } else {
            for (Ammunition ammunition : knight.getAmmunition()) {
                if (ammunition.getWeight() >= minRageParameter && ammunition.getWeight() <= maxRageParameter){
                    ConsoleView.print(ammunition.toString());
                }
            }
        }
    }

    public boolean isBye(){
        return bye;
    }
}
