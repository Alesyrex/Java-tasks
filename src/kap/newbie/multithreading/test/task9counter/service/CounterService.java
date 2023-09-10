package kap.newbie.multithreading.test.task9counter.service;

import kap.newbie.multithreading.test.task9counter.model.Counter;

/**
 * @author Alexandr Korovkin
 */
public class CounterService {
    private final CountersSynchBoxing synchBoxing;

    public CounterService(CountersSynchBoxing synchBoxing) {
        this.synchBoxing = synchBoxing;
    }

    public Counter resetCounter(String counterName){
        return resetCounter(synchBoxing.getCounter(counterName));
    }

    public Counter resetCounter(Counter counter){
        counter.getCount().set(0);
        return counter;
    }

    public Counter incrementCount(String name){
        return incrementCount(synchBoxing.getCounter(name));
    }

    public Counter incrementCount(Counter counter){
        counter.getCount().incrementAndGet();
        return counter;
    }

    public Counter decrementCount(String name){
        return decrementCount(synchBoxing.getCounter(name));
    }

    public Counter decrementCount(Counter counter){
        counter.getCount().decrementAndGet();
        return counter;
    }

    public Counter increaseCount(String name, int value){
        return increaseCount(synchBoxing.getCounter(name), value);
    }

    public Counter increaseCount(Counter counter, int value){
        counter.getCount().accumulateAndGet(value, Integer::sum);
        return counter;
    }

    public Counter decreaseCount(String name, int value){
        return decreaseCount(synchBoxing.getCounter(name), value);
    }

    public Counter decreaseCount(Counter counter, int value){
        counter.getCount().accumulateAndGet(value, (current,val) -> Math.max(current - val, 0));
        return counter;
    }
}
