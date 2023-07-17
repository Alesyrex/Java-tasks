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
        weight = calculateAmmunitionWeight();
        cost = calculateAmmunitionCost();
        damage = calculateAmmunitionDamage();
        protection = calculateAmmunitionProtection();
    }

    private int calculateAmmunitionWeight() {
        int tempWeight = 0;
        for (Ammunition element : ammunition) {
            tempWeight += element.getWeight();
        }
        return tempWeight;
    }

    private int calculateAmmunitionCost() {
        int tempCost = 0;
        for (Ammunition element : ammunition) {
            tempCost += element.getCost();
        }
        return tempCost;
    }

    private int calculateAmmunitionDamage() {
        int tempDamage = 0;
        for (Ammunition element : ammunition) {
            if (element instanceof AttackAmmunition) {
                tempDamage += ((AttackAmmunition) element).getDamage();
            }
        }
        return tempDamage;
    }

    private int calculateAmmunitionProtection() {
        int tempProtection = 0;
        for (Ammunition element : ammunition) {
            if (element instanceof ProtectionAmmunition) {
                tempProtection += ((ProtectionAmmunition) element).getProtection();
            }
        }
        return tempProtection;
    }

}
