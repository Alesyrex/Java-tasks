package kap.newbie.multithreading.test.task9counter;

import kap.newbie.multithreading.test.task9counter.model.Counter;
import kap.newbie.multithreading.test.task9counter.service.CounterService;
import kap.newbie.multithreading.test.task9counter.service.CountersSynchBoxing;

import java.util.Random;

/**
 * Реализуйте сервис управления счетчиками.
 * Счетчики могут добавляться и удаляться, в самих счетчиках могут изменяться значения –
 * как увеличиваться, так и уменьшаться. Также возможен сброс счетчика до 0 (нуля).
 *
 * Гарантируйте возможность безопасной работы с данным сервисом.
 *
 * @author Alexandr Korovkin
 */
public class Application {

    public static final String COLD_WATER = "ColdWater";
    public static final String HOT_WATER = "HotWater";
    public static final String ELECTRICITY = "Electricity";
    public static final String GAS = "Gas";
    public static final String M_2 = "m2";

    public static final Random random = new Random();

    public static void main(String[] args) throws InterruptedException {
        CountersSynchBoxing synchBoxing = new CountersSynchBoxing();
        synchBoxing.addCounter(new Counter(COLD_WATER, M_2));
        synchBoxing.addCounter(new Counter(HOT_WATER, M_2));
        synchBoxing.addCounter(new Counter(ELECTRICITY, M_2));
        synchBoxing.addCounter(new Counter(GAS, M_2));

        Thread mainThread = Thread.currentThread();

        CounterService service = new CounterService(synchBoxing);

        Thread one = new Thread(getRun(service, mainThread));
        Thread two = new Thread(getRun(service, mainThread));
        Thread three = new Thread(getRun(service, mainThread));
        Thread four = new Thread(getRun(service, mainThread));

        one.start();
        two.start();
        three.start();
        four.start();

        Thread.sleep(20);
    }

    public static Runnable getRun(CounterService service, Thread monitorThread){
        return () -> {
            while (monitorThread.isAlive()){
                System.out.println(service.incrementCount(COLD_WATER));
                System.out.println(service.increaseCount(HOT_WATER, random.nextInt(56)));
                System.out.println(service.incrementCount(ELECTRICITY));
                System.out.println(service.decrementCount(GAS));
                System.out.println(service.decreaseCount(COLD_WATER, random.nextInt(10)));
                System.out.println(service.increaseCount(GAS, random.nextInt(56)));
                System.out.println(service.increaseCount(HOT_WATER, random.nextInt(56)));
                System.out.println(service.decrementCount(ELECTRICITY));
                System.out.println(service.incrementCount(HOT_WATER));
                System.out.println(service.increaseCount(ELECTRICITY, random.nextInt(56)));
            }
        };
    }
}
