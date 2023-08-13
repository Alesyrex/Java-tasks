package kap.newbie.string_generics_collections.test.task18tasksconveer.service;

import kap.newbie.string_generics_collections.test.task18tasksconveer.model.Task;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * @author Alexandr Korovkin
 */
public class TaskExecutorSet {
    private NavigableSet<Task> tasks;

    public TaskExecutorSet(){
        tasks = new TreeSet<>();
    }

    public void addTask(Task task) {
        if (tasks.add(task)) {
            System.out.printf("The task '%s' is added to queue!", task.getTitle());
            System.out.println();
        }
    }

    public void executeTask(){
        Task current = tasks.pollLast();
        System.out.println("Task " + current.getTitle() + " processing... ");
        System.out.println(current.getDescription());
        System.out.printf("The task '%s' is complete!", current.getTitle());
        System.out.println();
    }

    public NavigableSet<Task> getTasks() {
        return tasks;
    }
}
