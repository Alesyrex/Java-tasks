package kap.newbie.oop.knight.controller;

import kap.newbie.oop.knight.model.ammunition.Ammunition;
import kap.newbie.oop.knight.model.ammunition.AttackAmmunition;
import kap.newbie.oop.knight.model.ammunition.ProtectionAmmunition;

/**
 * @author Alexandr Korovkin
 */
public class AmmunitionGenerator {
    public static Ammunition getAmmunition(int itemMenu){
        switch (itemMenu){
            case 1 :
                return new AttackAmmunition();
            case 2 :
                return new ProtectionAmmunition();
            default:
                return null;
        }
    }
}
