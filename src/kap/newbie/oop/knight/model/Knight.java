package kap.newbie.oop.knight.model;

import kap.newbie.oop.knight.model.ammunition.Ammunition;
import kap.newbie.oop.knight.model.ammunition.AttackAmmunition;
import kap.newbie.oop.knight.model.ammunition.ProtectionAmmunition;

import java.util.Arrays;

/**
 * @author Alexandr Korovkin
 */
public class Knight {
    private int damage;
    private int protection;
    private int weight;
    private int cost;

    private Ammunition[] ammunition;

    public Ammunition[] getAmmunition() {
        return ammunition;
    }

    public Knight() {
        this(new Ammunition[0]);
    }

    public Knight(Ammunition[] ammunition){
        this.ammunition = ammunition;
    }

    public int getDamage() {
        return damage;
    }

    public int getProtection() {
        return protection;
    }

    public int getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }

    public void equip(Ammunition element) {
        Ammunition[] newAmmunition = Arrays.copyOf(ammunition, ammunition.length + 1);
        newAmmunition[ammunition.length] = element;
        ammunition = newAmmunition;
    }

    public void calculateAmmunition(){
        calculateAmmunitionWeight();
        calculateAmmunitionCost();
        calculateAmmunitionDamage();
        calculateAmmunitionProtection();
    }

    private void calculateAmmunitionWeight() {
        for (Ammunition element : ammunition) {
            weight += element.getWeight();
        }
    }

    private void calculateAmmunitionCost() {
        for (Ammunition element : ammunition) {
            cost += element.getCost();
        }
    }

    private void calculateAmmunitionDamage() {
        for (Ammunition element : ammunition) {
            if (element instanceof AttackAmmunition) {
                damage += ((AttackAmmunition) element).getDamage();
            }
        }
    }

    private void calculateAmmunitionProtection() {
        for (Ammunition element : ammunition) {
            if (element instanceof ProtectionAmmunition) {
                protection += ((ProtectionAmmunition) element).getProtection();
            }
        }
    }

}
