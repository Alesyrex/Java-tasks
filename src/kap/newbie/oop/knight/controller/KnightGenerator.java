package kap.newbie.oop.knight.controller;

import kap.newbie.oop.knight.model.Knight;

/**
 * @author Alexandr Korovkin
 */
public class KnightGenerator {
    public static Knight generateKnight() {
        return new Knight();
    }
}
