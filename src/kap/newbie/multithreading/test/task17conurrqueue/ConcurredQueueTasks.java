package kap.newbie.multithreading.test.task17conurrqueue;

import kap.newbie.multithreading.test.task17conurrqueue.model.Task;
import kap.newbie.multithreading.test.task17conurrqueue.service.TaskExecutor;

/**
 * @author Alexandr Korovkin
 */
public class ConcurredQueueTasks {
    public static void main(String[] args) {

        TaskExecutor executor = new TaskExecutor();

        Thread one = new Thread(() -> {
           for(int i = 1;i <= 20; ++i){
               executor.addTask(new Task("task-" + i, "Doing task-" + i));
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        });

        Thread two = new Thread(() -> {
           int taskExecute = 0;
           while(taskExecute != 20) {
               if (executor.executeTask()) {
                   taskExecute++;
               }
               try {
                   Thread.sleep(500);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        });

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
