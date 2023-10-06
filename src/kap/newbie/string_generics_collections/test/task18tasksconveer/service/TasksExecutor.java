package kap.newbie.string_generics_collections.test.task18tasksconveer.service;

import kap.newbie.string_generics_collections.test.task18tasksconveer.model.Task;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * Реализуйте класс Задание. Он должен содержать поле Название, состав остальных полей - на ваше усмотрение.
 *
 * Реализуйте сервис, хранящий задания. Он должен иметь методы для добавления заданий и их "выполнения".
 * Задания должны обрабатываться в порядке очереди.
 * Критерием выполнения задания будем считать выведение в консоль фразы "Задание %название задания% выполнено!".
 *
 * Также добавьте вывод сообщения в консоль о том, что задание (с указанием названия) добавлено.
 *
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

    public void executeTasks() {
        for(Task task : tasks){
            System.out.println("Task " + task.getTitle() + " processing... ");
            System.out.println(task.getDescription());
            System.out.printf("The task '%s' is complete!", task.getTitle());
            System.out.println();
        }
    }
}
