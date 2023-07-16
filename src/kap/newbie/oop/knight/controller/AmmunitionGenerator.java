package kap.newbie.oop.knight.controller;

import kap.newbie.oop.knight.model.ammunition.*;
import kap.newbie.oop.knight.view.EquipMenuView;

/**
 * @author Alexandr Korovkin
 */
public class AmmunitionGenerator {

    public static final int FIRST_PARAM_AMMO = 0;
    public static final int SECOND_PARAM_AMMO = 1;
    public static final int THIRD_PARAM_AMMO = 2;

    private AmmunitionGenerator(){}

    public static Ammunition getAmmunition(int itemMenu){
        int[] parameters;
        if (itemMenu == 1) {
            parameters = EquipMenuView.inputParameters(AmmunitionType.SWORD);
            return new Sword(parameters[FIRST_PARAM_AMMO], parameters[SECOND_PARAM_AMMO], parameters[THIRD_PARAM_AMMO]);
        }else {
            parameters = EquipMenuView.inputParameters(AmmunitionType.HELMET);
            return new Helmet(parameters[FIRST_PARAM_AMMO], parameters[SECOND_PARAM_AMMO], parameters[THIRD_PARAM_AMMO]);
        }
    }
}
