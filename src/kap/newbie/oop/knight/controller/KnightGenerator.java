package kap.newbie.oop.knight.controller;

import kap.newbie.oop.knight.model.Knight;
import kap.newbie.oop.knight.model.ammunition.Ammunition;
import kap.newbie.oop.knight.model.ammunition.Helmet;
import kap.newbie.oop.knight.model.ammunition.Sword;

/**
 * @author Alexandr Korovkin
 */
public class KnightGenerator {
    public static Knight generateKnight() {
        return new Knight(new Ammunition[]{new Sword(30,40,50), new Helmet(60,70,80)});
    }
}
