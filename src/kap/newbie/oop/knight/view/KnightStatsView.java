package kap.newbie.oop.knight.view;

import kap.newbie.oop.knight.model.Knight;
import kap.newbie.oop.knight.model.ammunition.Ammunition;

/**
 * @author Alexandr Korovkin
 */
public class KnightStatsView {
    public static final String KNIGHT_STATS_STRING = "Ammunition cost: %d\n" +
                                                     "Ammunition weight: %d\n" +
                                                     "Ammunition damage: %d\n" +
                                                     "Ammunition protection: %d";

    public static void printStats(Knight knight) {
        ConsoleView.print(String.format(KNIGHT_STATS_STRING, knight.getCost(), knight.getWeight(),
                knight.getDamage(), knight.getProtection()));
    }

    public static void printKnightAmmunition(Ammunition ammunition){
        ConsoleView.print(ammunition.toString());
    }
}
