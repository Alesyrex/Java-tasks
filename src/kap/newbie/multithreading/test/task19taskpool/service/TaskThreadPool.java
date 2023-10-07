package kap.newbie.multithreading.test.task19taskpool.service;

import java.util.stream.IntStream;

/**
 * @author Alexandr Korovkin
 */
public class TaskThreadPool {

    public static final int THREAD_POOL_COUNT = 4;

    public TaskThreadPool(TaskService taskService){

        IntStream.range(0, THREAD_POOL_COUNT)
                .boxed()
                .map(i -> new Thread(runTask(taskService), "thread-" + i))
                .forEach(Thread::start);
    }

    private Runnable runTask(TaskService taskService) {
        return () -> {
            while (true){                    //программа не завершится, будет ждать новых заданий.
                taskService.completeTask();
            }
        };
    }
}
