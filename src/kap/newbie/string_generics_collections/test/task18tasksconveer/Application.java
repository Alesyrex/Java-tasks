package kap.newbie.string_generics_collections.test.task18tasksconveer;

import kap.newbie.string_generics_collections.test.task18tasksconveer.model.Task;
import kap.newbie.string_generics_collections.test.task18tasksconveer.service.TasksExecutor;

/**
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) throws InterruptedException {
        TasksExecutor executor = new TasksExecutor();

        executor.addTask(new Task("Print", "Printing document"));
        executor.addTask(new Task("Calculate", "Calculation expression"));
        executor.addTask(new Task("Draw", "Drawing picture"));
        executor.addTask(new Task("Read", "Reading document"));

        executor.executeTasks();
    }
}
