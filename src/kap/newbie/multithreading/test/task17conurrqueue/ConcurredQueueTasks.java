package kap.newbie.multithreading.test.task17conurrqueue;

import kap.newbie.multithreading.test.task17conurrqueue.model.Task;
import kap.newbie.multithreading.test.task17conurrqueue.service.TaskExecutor;

/**
 *
 * Реализуйте класс Задание. Он должен содержать поле Название, состав остальных полей - на ваше усмотрение.
 *
 * Реализуйте сервис, хранящий задания.
 * Он должен иметь методы для добавления заданий и их "выполнения".
 * Задания должны обрабатываться в порядке очереди.
 *
 * Процесс добавления и получения задач должен быть потокобезопасен.
 *
 * @author Alexandr Korovkin
 */
public class ConcurredQueueTasks {
    public static final int TASK_COUNT = 10;
    public static final int ADD_TASK_TIME = 900;
    public static final int EXECUTE_TASK_TIME = 600;
    public static final String THREAD_ONE_NAME = "one";
    public static final String THREAD_TWO_NAME = "two";

    public static void main(String[] args) {

        TaskExecutor executor = new TaskExecutor();

        Thread one = new Thread(() -> {
           for(int i = 1; i <= TASK_COUNT; ++i){
               executor.addTask(new Task("task-" + i, "Doing task-" + i));
               try {
                   Thread.sleep(ADD_TASK_TIME);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
           executor.endCycle();
        }, THREAD_ONE_NAME);

        Thread two = new Thread(() -> {
           while(executor.isCycle() || executor.getTasks().size() > 0) {
               executor.executeTask();
               try {
                   Thread.sleep(EXECUTE_TASK_TIME);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        }, THREAD_TWO_NAME);

        one.start();
        two.start();

        try {
            one.join();
            two.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
