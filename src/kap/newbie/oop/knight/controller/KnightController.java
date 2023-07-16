package kap.newbie.oop.knight.controller;

import kap.newbie.oop.knight.model.Knight;
import kap.newbie.oop.knight.model.ammunition.Ammunition;
import kap.newbie.oop.knight.view.KnightStatsView;

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
    private boolean bye = false;

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
//            case SORT_AMMO:
//                sortAmmunition();
//                break;
//            case SEARCH_AMMO:
//                searchAmmunition();
//                break;
            case EXIT :
                break;
            default:
        }
    }

    private void printKnightStats() {
        KnightStatsView.printStats(knight);
    }

    private void showAmmunition(){
        for (Ammunition ammunition : knight.getAmmunition()) {
            KnightStatsView.printKnightAmmunition(ammunition);
        }
    }

    private void equipAmmunition() {
        
    }

    public boolean isBye(){
        return bye;
    }
}
