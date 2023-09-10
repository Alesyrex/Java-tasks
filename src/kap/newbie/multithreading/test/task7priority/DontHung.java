package kap.newbie.multithreading.test.task7priority;

/**
 * Напишите программу из 10 последовательно запускающихся потоков.
 * Каждый из этих потоков должен выводить в консоль сообщение вида
 * «%Имя потока% запущен и не спешит», вызывать yield(), а после выводить сообщение «%Имя потока% завершен».
 *
 * Обратите внимание на порядок вывода. Как он изменится, если убрать yield()?
 * Как изменится ситуация, если паре потоков выставить приоритет 10?
 *
 * @author Alexandr Korovkin
 */
public class DontHung {

    public static final String DONT_HUNG = " is run and don't hung";
    public static final String ENDED = " ended";

    public static void main(String[] args) {
        Thread one = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + DONT_HUNG);
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + ENDED);
        }, "one");
        Thread two = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + DONT_HUNG);
            System.out.println(Thread.currentThread().getName() + ENDED);
        }, "two");
        Thread three = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + DONT_HUNG);
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + ENDED);
        },"three");
        Thread four = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + DONT_HUNG);
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + ENDED);
        }, "four");
        Thread five = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + DONT_HUNG);
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + ENDED);
        }, "five");
        Thread six = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + DONT_HUNG);
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + ENDED);
        }, "six");
        Thread seven = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + DONT_HUNG);
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + ENDED);
        }, "seven");
        Thread eight = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + DONT_HUNG);
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + ENDED);
        }, "eight");
        Thread nine = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + DONT_HUNG);
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + ENDED);
        }, "nine");
        Thread ten = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + DONT_HUNG);
            System.out.println(Thread.currentThread().getName() + ENDED);
        }, "ten");


        two.setPriority(10);
        ten.setPriority(10);
        one.start();
        two.start();
        three.start();
        four.start();
        five.start();
        six.start();
        seven.start();
        eight.start();
        nine.start();
        ten.start();
    }
}
