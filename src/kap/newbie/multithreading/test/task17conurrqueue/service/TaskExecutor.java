package kap.newbie.multithreading.test.task17conurrqueue.service;

import kap.newbie.multithreading.test.task17conurrqueue.model.Task;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author Alexandr Korovkin
 */
public class TaskExecutor {
    public static final String NO_TASKS_IN_QUEUE = "No tasks in queue!";
    private final ConcurrentLinkedQueue<Task> tasks = new ConcurrentLinkedQueue<>();

    public void addTask(Task task){
        System.out.println("Added task " + task.getTitle());
        tasks.offer(task);
    }

    public boolean executeTask(){
        Task task = tasks.poll();
        if (task != null) {
            System.out.println(task.getTitle());
            System.out.println(task.getDescription());
            return true;
        } else {
            System.out.println(NO_TASKS_IN_QUEUE);
            return false;
        }
    }
}
