package kap.newbie.multithreading.test.task16concurrdeleteelemets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Alexandr Korovkin
 */
public class ConcurrentDeleteElements {
    public static void main(String[] args) {
        List<Integer> list;
//        list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list = new CopyOnWriteArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        list.forEach(list::remove);

        System.out.println(list);
    }
}
