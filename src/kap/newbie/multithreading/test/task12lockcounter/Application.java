package kap.newbie.multithreading.test.task12lockcounter;

import kap.newbie.multithreading.test.task12lockcounter.model.LockCounter;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Реализуйте программу, увеличивающую значение счетчика на 1 несколькими параллельными потоками
 * одновременно вплоть до числа, указанного пользователем.
 * Каждый раз, когда число превышает значение, кратное 100,
 * одним из потоков в консоль должно выводиться соответствующее сообщение.
 *
 * Использование атомик-типов недопустимо.
 *
 * @author Alexandr Korovkin
 */
public class Application {

    public static final int COUNT_THREADS = 5;

    public static void main(String[] args) {
        LockCounter counter = new LockCounter();
        int times;

        System.out.print("Input iterate amount: ");

        try(Scanner input = new Scanner(System.in)){
            times = input.nextInt();
        }

        createThreads(getRun(counter, times));

    }

    private static Runnable getRun(LockCounter counter, int times){

        return () ->
               IntStream.range(0, times/COUNT_THREADS)
                       .forEach(i -> {
                           counter.locked();
                           counter.increment();
                           System.out.println(Thread.currentThread() + " - " + counter.getValue());
                           if(counter.getValue() % 100 == 0){
                               System.out.println("Value multiple 100 - " + counter.getValue());
                           }
                           counter.unlocked();
                       });
    }

    private static void createThreads(Runnable runnable){
        IntStream.range(0, COUNT_THREADS)
                .forEach(i -> {
                    new Thread(runnable, "Thread-" + (i+1)).start();
                });
    }

//    private static void startThreads(Thread... threads){
//        Arrays.stream(threads)
//                .forEach(Thread::start);
//    }
//
//    private static void waitThreads(Thread... threads){
//        Arrays.stream(threads)
//                .forEach(Application::joinThread);
//    }
//
//    private static void joinThread(Thread thread){
//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }
//    }
}
