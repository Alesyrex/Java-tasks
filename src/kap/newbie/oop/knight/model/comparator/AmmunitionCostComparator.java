package kap.newbie.oop.knight.model.comparator;

import kap.newbie.oop.knight.model.ammunition.Ammunition;

import java.util.Comparator;

/**
 * @author Alexandr Korovkin
 */
public class AmmunitionCostComparator implements Comparator<Ammunition> {

    @Override
    public int compare(Ammunition a1, Ammunition a2) {
        return Integer.compare(a1.getCost(), a2.getCost());
    }
}
