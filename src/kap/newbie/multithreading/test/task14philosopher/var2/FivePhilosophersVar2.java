package kap.newbie.multithreading.test.task14philosopher.var2;

import kap.newbie.multithreading.test.task14philosopher.var2.model.Philosopher;
import kap.newbie.multithreading.test.task14philosopher.var2.service.PhilosopherRun;

import java.util.HashMap;
import java.util.concurrent.Semaphore;
import java.util.stream.IntStream;

/**
 *
 * Пять безмолвных философов сидят вокруг круглого стола, перед каждым философом стоит тарелка спагетти.
 * Вилки лежат на столе между каждой парой ближайших философов.
 * Каждый философ может либо есть, либо размышлять.
 * Приём пищи не ограничен количеством оставшихся спагетти — подразумевается бесконечный запас.
 * Тем не менее, философ может есть только тогда, когда держит две вилки — взятую справа и слева.
 * Каждый философ может взять ближайшую вилку (если она доступна) или положить — если он уже держит её.
 * Взятие каждой вилки и возвращение её на стол являются раздельными действиями,
 * оторые должны выполняться одно за другим.
 * Чтобы наесться, каждый философ должен поесть трижды.
 * еобходимо накормить философов как можно быстрее – ситуация, когда они будут есть строго по одному – недопустима.
 *
 * 2. Решите задачу об обедающих философах, не вводя блокировок, связанных с вилками.
 *
 * @author Alexandr Korovkin
 */
public class FivePhilosophersVar2 {
    public static final int PHILOSOPHERS_AMOUNT = 5;
    public static final int EATING_PHILOSOPHERS = 2;

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(EATING_PHILOSOPHERS);
        var philosophers = new HashMap<Integer, Philosopher>();
        IntStream.range(0,PHILOSOPHERS_AMOUNT)
                .forEach(i -> philosophers.put(i+1, new Philosopher(i+1)));

        IntStream.range(1, PHILOSOPHERS_AMOUNT + 1)
                .forEach(i -> {
                    new Thread(new PhilosopherRun(semaphore, philosophers.get(i),
                            i == PHILOSOPHERS_AMOUNT ? philosophers.get(1) : philosophers.get(i + 1),
                            i == 1 ? philosophers.get(PHILOSOPHERS_AMOUNT) : philosophers.get(i - 1))).start();
                });
    }
}
