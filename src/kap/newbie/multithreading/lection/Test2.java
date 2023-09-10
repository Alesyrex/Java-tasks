package kap.newbie.multithreading.lection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author Alexandr Korovkin
 */
public class Test2 {
    public static void main(String[] args) {
        AtomicReference<Object> obj = new AtomicReference<>();

        obj.set(new Random());

        var integer = new AtomicInteger(6);

        integer.accumulateAndGet(5, Integer::sum);

        System.out.println(integer);

        var list = new ArrayList<Integer>();

        print(list);
    }

    public static void print(List list){
        list.forEach(System.out::println);
    }
}
