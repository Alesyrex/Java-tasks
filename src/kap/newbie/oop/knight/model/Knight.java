package kap.newbie.oop.knight.model;

import kap.newbie.oop.knight.model.ammunition.Ammunition;

/**
 * @author Alexandr Korovkin
 */
public class Knight {

    private Ammunition[] ammunition;

    public Ammunition[] getAmmunition() {
        throw new UnsupportedOperationException("You need to implement this method");
    }

    public Knight() {
        this(new Ammunition[0]);
    }

    public Knight(Ammunition[] ammunition){
        this.ammunition = ammunition;
    }

    /**
     * Add new ammunition element to knight
     * @param element that should be equipped to the knight
     */
    public void equip(Ammunition element) {
        throw new UnsupportedOperationException("You need to implement this method");
    }

    public int calculateAmmunitionWeight() {
        throw new UnsupportedOperationException("You need to implement this method");
    }

    public int calculateAmmunitionCost() {
        throw new UnsupportedOperationException("You need to implement this method");
    }

    public int calculateAmmunitionDamage() {
        throw new UnsupportedOperationException("You need to implement this method");
    }

    public int calculateAmmunitionProtection() {
        throw new UnsupportedOperationException("You need to implement this method");
    }

}
