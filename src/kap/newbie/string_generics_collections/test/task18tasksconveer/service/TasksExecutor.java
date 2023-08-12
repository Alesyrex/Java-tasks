package kap.newbie.string_generics_collections.test.task18tasksconveer.service;

import kap.newbie.string_generics_collections.test.task18tasksconveer.model.Task;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Alexandr Korovkin
 */
public class TasksExecutor {
    private Deque<Task> tasks;

    public TasksExecutor() {
        tasks = new ArrayDeque<>();
    }

    public void addTask(Task task){
        if (tasks.offerLast(task)) {
            System.out.printf("The task '%s' is added to queue!", task.getTitle());
            System.out.println();
        }
    }

    public void executeTasks() throws InterruptedException {
        for(Task task : tasks){
            System.out.println("Task " + task.getTitle() + " processing... ");
            System.out.println(task.getDescription());
            System.out.printf("The task '%s' is complete!", task.getTitle());
            System.out.println();
        }
    }
}
