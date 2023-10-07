package kap.newbie.multithreading.test.task20friends_meeting;

import kap.newbie.multithreading.test.task20friends_meeting.model.Friend;
import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * Эмулируйте сбор компании друзей в цикле.
 *
 * Есть 10 друзей-потоков. Они должны собраться вместе (преодолеть) турникет.
 * Каждый из потоков имеет предел терпения, он же, время ожидание, определенный в случайном порядке.
 * Также каждый из них имеет случайно определенную степень безответственности, выражающуюся в задержке перед сбором.
 *
 * Попробуйте собрать друзей, используя в качестве каждой попытки итерацию цикла.
 * Если хоть один из друзей не вытерпел и покинул место сбора – сбор должен провалиться.
 *
 * С какой попытки друзьям удалось собраться?
 * Верхние и нижние границы терпения и безответственности определите самостоятельно.
 *
 * @author Alexandr Korovkin
 */
public class FriendsMeetingApplication {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(10, () -> System.out.println("success!"));

        Stream.generate(() -> tryMeeting(barrier))
                .takeWhile(success -> !success)
                .forEach(s -> System.out.println("failed!"));


//        AtomicBoolean done = new AtomicBoolean(false);
//        AtomicInteger count = new AtomicInteger(0);
//        while (!done.get()) {
//            new Thread(() -> {
//                try {
//                    Thread.sleep((long) (Math.random() * 100));
//                    done.set(barrier.await((long) (Math.random() * 100), TimeUnit.MILLISECONDS) == 0);
//                } catch (InterruptedException | BrokenBarrierException | TimeoutException e) {
//                    barrier.reset();
//                    count.incrementAndGet();
//                }
//            }).start();
//        }
//        System.out.println("done - " + count.get());
    }

    public static boolean tryMeeting(CyclicBarrier barrier) {
        System.out.println("Trying...");

        IntStream.range(0,10)
                .boxed()
                .map(i -> new Thread(new Friend(barrier)))
                .forEach(Thread::start);

        return true;
    }

    private static boolean isDone(Thread thread){
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return !thread.isInterrupted();
    }
}
