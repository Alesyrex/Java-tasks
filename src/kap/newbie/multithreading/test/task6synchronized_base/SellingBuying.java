package kap.newbie.multithreading.test.task6synchronized_base;

import kap.newbie.multithreading.test.task6synchronized_base.model.Buyer;
import kap.newbie.multithreading.test.task6synchronized_base.model.SaleBase;
import kap.newbie.multithreading.test.task6synchronized_base.model.Supplier;
import kap.newbie.multithreading.test.task6synchronized_base.service.*;

import java.util.Scanner;

/**
 * Реализуйте имитацию оптовой базы с тремя поставщиками и тремя покупателями.
 * Максимальное число хранимых товаров определите на свой вкус.
 *
 * Покупатели должны выкупать случайно сгенерированное число товаров при каждом посещении.
 * Если товаров недостаточно – при следующем посещении они должны попытаться купить на 1 единицу товара меньше.
 * Если это число достигает нуля – должно быть сгенерировано новое число. Если база опустела
 * (на ней не осталось товаров) – покупатели должны прекратить ее посещение до новых поставок.
 *
 * Поставщики должны поставлять случайно сгенерированное число товаров при каждом посещении.
 * Если на базе не хватает места для всех товаров поставщика – он должен поставить максимально возможное количество,
 * остальную поставку отложить до следующего посещения. Если число товаров для поставки достигло нуля –
 * должно быть сгенерировано новое число. Если база заполнилась на 100% -
 * поставщики должны прекратить попытки поставок до момента, пока заполняемость базы не достигнет 25%.
 *
 * Логируйте действия покупателей и поставщиков в консоли.
 * Программа должна завершиться при вводе пользователем «Finish» с клавиатуры.
 * Другие пользовательские вводы не предусмотрены.
 *
 * Рекомендую ограничить максимальное значение у Покупателей меньшим лимитом, чем у Поставщиков.
 * В таком случае выполнение программы будет более наглядным.
 *
 * @author Alexandr Korovkin
 */
public class SellingBuying {

    public static final String FINISH = "Finish";

    public static void main(String[] args) {
        SaleBaseHolder base = new SaleBaseHolder(new SaleBase(42, 0.25));

        Thread one = new Thread(new BuyerRun(new Buyer("buyer_one"), new BuyerService(base)), "one");
        Thread two = new Thread(new BuyerRun(new Buyer("buyer_two"), new BuyerService(base)), "two");
        Thread three = new Thread(new BuyerRun(new Buyer("buyer_three"), new BuyerService(base)), "three");

        Thread four = new Thread(
                new SupplierRun(new Supplier("supplier_one"), new SupplierService(base)), "four");
        Thread five = new Thread(
                new SupplierRun(new Supplier("supplier_two"), new SupplierService(base)), "five");
        Thread six = new Thread(
                new SupplierRun(new Supplier("supplier_three"), new SupplierService(base)), "six");

        one.start();
        two.start();
        three.start();
        four.start();
        five.start();
        six.start();

        boolean isFinished = false;
        Scanner input = new Scanner(System.in);
        while (!isFinished){
            isFinished = FINISH.equals(input.nextLine());
        }

        one.interrupt();
        two.interrupt();
        three.interrupt();
        four.interrupt();
        five.interrupt();
        six.interrupt();
        input.close();
    }
}
