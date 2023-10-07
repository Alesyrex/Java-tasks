package kap.newbie.multithreading.test.task19taskpool.service;

import kap.newbie.multithreading.test.task19taskpool.model.Task;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Alexandr Korovkin
 */
public class TaskService {
    public static final int STORAGE_CAPACITY = 30;
    public static final String ADDED_FORMAT = "Thread %s: added %s\n";
    public static final String THREAD_COMPLETE_FORMAT = "Thread %s complete - {%s}\n";
    private final BlockingQueue<Task> tasksStorage;

    public TaskService(){
        this.tasksStorage = new LinkedBlockingQueue<>(STORAGE_CAPACITY);
    }

    public TaskService(BlockingQueue<Task> tasksStorage){
        this.tasksStorage = tasksStorage;
    }

    public void addTask(Task task) {
        try {
            tasksStorage.put(task);
            System.out.printf(ADDED_FORMAT, Thread.currentThread().getName(), task.getDescription());
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void completeTask(){
        try {
            System.out.printf(THREAD_COMPLETE_FORMAT,
                    Thread.currentThread().getName(), tasksStorage.take().toString());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
