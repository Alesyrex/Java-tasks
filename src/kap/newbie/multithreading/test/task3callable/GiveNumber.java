package kap.newbie.multithreading.test.task3callable;

import kap.newbie.multithreading.test.task3callable.model.Giver;

/**
 * @author Alexandr Korovkin
 */
public class GiveNumber {
    public static void main(String[] args) throws InterruptedException {
        boolean even = false;

        Giver<Integer> give = new Giver<>(() -> even ? 2 : 3);
        Thread tr = new Thread(give);
        int x = 7;
        tr.start();
        while (x != 2 && x != 3){
            System.out.println("not");
            Thread.sleep(1000);
            if (give.get() != null){
                x = give.get();
            }
        }

        System.out.println(give.get());
    }
}
