package kap.newbie.multithreading.test.task19taskpool;

import kap.newbie.multithreading.test.task19taskpool.model.Task;
import kap.newbie.multithreading.test.task19taskpool.service.TaskService;
import kap.newbie.multithreading.test.task19taskpool.service.TaskThreadPool;

import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * Реализуйте сервис заданий, позволяющий добавлять и получать задания.
 * Заданиями должно выступать выведение случайно сгенерированного числа
 * (пределы определите самостоятельно) в консоль, а потом усыпления потока-исполнителя на указанное число секунд.
 * Задания должны генерироваться безостановочно (можно ограничить емкость хранилища заданий),
 * обрабатывать их должно не более 4 потоков одновременно.
 *
 * @author Alexandr Korovkin
 */
public class TaskPoolApplication {

    public static final int STORAGE_CAPACITY = 30;
    public static final int TASK_COUNT = 100;

    public static void main(String[] args) {
        var taskStorage = new LinkedBlockingQueue<Task>(STORAGE_CAPACITY);
        var taskService = new TaskService(taskStorage);

        var generator = new Thread(getTaskGenerator(taskService), "generator");
        generator.start();

        new TaskThreadPool(taskService);
    }

    private static Runnable getTaskGenerator(TaskService taskService) {
        return () -> {
            for(int i = 1; i <= TASK_COUNT; ++i) {
                taskService.addTask(new Task("task-" + i));
            }
        };
    }
}
