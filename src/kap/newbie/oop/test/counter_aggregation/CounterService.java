package kap.newbie.oop.test.counter_aggregation;

/**
 * @author Alexandr Korovkin
 */
public class CounterService {
    private Counter[] counters;

    public CounterService(Counter ...counters) {
        this.counters = counters;
    }

    public void addCounter(Counter counter){
        if (counter != null) {
            Counter[] newCounters = new Counter[counters.length + 1];
            newCounters[newCounters.length - 1] = counter;
            counters = copyArray(newCounters);
        }
    }

    public void incrementCount(String counterName){
        Counter currentCounter = getCounter(counterName);
        int count;
        if (currentCounter != null){
            count = currentCounter.getCount();
            currentCounter.setCount(++count);
        }
    }

    public void decrementCount(String counterName){
        Counter currentCounter = getCounter(counterName);
        int count;
        if (currentCounter != null){
            count = currentCounter.getCount();
            currentCounter.setCount(--count);
        }
    }

    public void userSetCount(String counterName, int userCount){
        Counter currentCounter = getCounter(counterName);
        int count;
        if (currentCounter != null){
            count = currentCounter.getCount();
            currentCounter.setCount(count + userCount);
        }
    }

    public void resetCount(String counterName) {
        Counter currentCounter = getCounter(counterName);
        if (currentCounter != null) {
            currentCounter.setCount(0);
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

    private Counter[] copyArray(Counter[] newCounters) {
        for (int i = 0;i < counters.length;++i) {
            newCounters[i] = counters[i];
        }
        return newCounters;
    }
}
