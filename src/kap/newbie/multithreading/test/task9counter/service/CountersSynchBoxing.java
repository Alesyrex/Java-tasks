package kap.newbie.multithreading.test.task9counter.service;

import kap.newbie.multithreading.test.task9counter.model.Counter;

import java.util.HashMap;

/**
 * @author Alexandr Korovkin
 */
public class CountersSynchBoxing {
    private final HashMap<String, Counter> counters;

    public CountersSynchBoxing(){
        counters = new HashMap<>();
    }

    public CountersSynchBoxing(HashMap<String, Counter> counters) {
        this.counters = counters;
    }

    public synchronized Counter addCounter(Counter counter){
        return counters.put(counter.getName(), counter);
    }

    public synchronized Counter deleteCounter(String name){
        return counters.remove(name);
    }

    public synchronized Counter getCounter(String name){
        return counters.get(name);
    }
}
