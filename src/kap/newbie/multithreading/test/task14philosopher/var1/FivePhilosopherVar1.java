package kap.newbie.multithreading.test.task14philosopher.var1;

import kap.newbie.multithreading.test.task14philosopher.var1.model.Fork;
import kap.newbie.multithreading.test.task14philosopher.var1.model.PhilosopherThread;

import java.util.concurrent.Semaphore;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
 * 1. Решите задачу об обедающих философах, используя посредника –
 * механизм, определяющий, кто из философов может взять вилку.
 *
 * @author Alexandr Korovkin
 */
public class FivePhilosopherVar1 {
    public static final int PHILOSOPHERS_AMOUNT = 5;
    public static final int ACTIVE_PHILOSOPHERS = 4;

    public static void main(String[] args) {
        Fork[] forks = Stream.iterate(1, i -> i <= PHILOSOPHERS_AMOUNT, i -> ++i)
                .map(Fork::new)
                .toArray(Fork[]::new);

        Semaphore semaphore = new Semaphore(ACTIVE_PHILOSOPHERS);

        IntStream.range(0, PHILOSOPHERS_AMOUNT)
                .forEach(i ->
                    new PhilosopherThread(
                            forks[i], i == PHILOSOPHERS_AMOUNT - 1 ? forks[0] : forks[i + 1], i+1, semaphore
                    ).start()
                );
    }
}
