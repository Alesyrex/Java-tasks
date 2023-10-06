package kap.newbie.multithreading.test.task17conurrqueue.service;

import kap.newbie.multithreading.test.task17conurrqueue.model.Task;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author Alexandr Korovkin
 */
public class TaskExecutor {
    public static final String NO_TASKS_IN_QUEUE = "No tasks in queue!";
    public static final String OUTPUT_FORMAT_TASK = "Thread %s - %s %s\n";
    public static final String ADDED_TASK = "Added";
    public static final String START_TASK = "Start";
    public static final String EMPTY = "";
    private final ConcurrentLinkedQueue<Task> tasks = new ConcurrentLinkedQueue<>();
    private boolean cycle = true;

    public void addTask(Task task){
        if(tasks.offer(task)){
            System.out.printf(OUTPUT_FORMAT_TASK, Thread.currentThread().getName(), ADDED_TASK, task.getTitle());
        }
    }

    public boolean executeTask(){
        Task task = tasks.poll();
        if (task != null) {
            System.out.printf(OUTPUT_FORMAT_TASK, Thread.currentThread().getName(),START_TASK, task.getTitle());
            System.out.printf(OUTPUT_FORMAT_TASK, Thread.currentThread().getName(), EMPTY, task.getDescription());
            return true;
        } else {
            System.out.printf(OUTPUT_FORMAT_TASK, Thread.currentThread().getName(), EMPTY, NO_TASKS_IN_QUEUE);
            return false;
        }
    }

    public boolean isCycle() {
        return cycle;
    }

    public void endCycle(){
        cycle = false;
    }

    public ConcurrentLinkedQueue<Task> getTasks() {
        return tasks;
    }
}
