package kap.newbie.oop.test.counter_aggregation;

/**
 * @author Alexandr Korovkin
 */
public class CounterService {
    private final Counter[] counters;

    public CounterService(Counter ...counters) {
        this.counters = counters;
    }

    public void incrementCount(String counterName){
        Counter tempCounter = getCounter(counterName);
        int count;
        if (tempCounter != null){
            count = tempCounter.getCount();
            tempCounter.setCount(++count);
        }
    }

    public void decrementCount(String counterName){
        Counter tempCounter = getCounter(counterName);
        int count;
        if (tempCounter != null){
            count = tempCounter.getCount();
            tempCounter.setCount(--count);
        }
    }

    public void userSetCount(String counterName, int count){
        Counter tempCounter = getCounter(counterName);
        if (tempCounter != null){
            tempCounter.setCount(count);
        }
    }

    public Counter getCounter (String counterName){
        for (Counter counter : counters) {
            if (counter.getCounterName().equals(counterName)){
                return counter;
            }
        }
        return null;
    }

    public Counter[] getCounters() {
        return counters;
    }
}
