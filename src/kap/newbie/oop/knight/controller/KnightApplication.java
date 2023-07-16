package kap.newbie.oop.knight.controller;

import kap.newbie.oop.knight.model.Knight;
import kap.newbie.oop.knight.view.MainMenuView;

/**
 * Рыцарь. Определить иерархию амуниции рыцаря. Операции с рыцарем:
 *
 * Вывести характеристики рыцаря
 * Вывести список амуниции рыцаря
 * Экипировать рыцаря, что должно отразиться на его характеристиках (например вес, сила атаки и т.д.)
 * Провести сортировку амуниции на основе одного из параметров
 * Найти элементы амуниции, соответствующие заданному диапазону параметров.
 *
 * @author Alexandr Korovkin
 */
public class KnightApplication {
    public static void main(String[] args) {
        KnightApplication application = new KnightApplication();
        application.start();
    }

    private void start() {
        KnightController controller = new KnightController(KnightGenerator.generateKnight());

        do {
            MainMenuView.printMenu();
            controller.selectOperationOnKnight(MainMenuView.selectMenu());
        }while (controller.isBye());
    }
}
