package kap.newbie.string_generics_collections.test.task12arrlist.service;

import kap.newbie.string_generics_collections.test.task12arrlist.exception.CounterNotExistException;
import kap.newbie.string_generics_collections.test.task12arrlist.model.Counter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Alexandr Korovkin
 */
public class CounterService {
    public static final String OUTPUT_FORMAT = "%s : %d %s\n";
    public static final String HEAD = "~~~~~~~~~~~~~~~~~~~~";

    private final ArrayList<Counter> counters;

    public CounterService(){
        counters = new ArrayList<>();
    }

    public CounterService(Counter ...counters){
        this.counters = new ArrayList<>(Arrays.asList(counters));
    }

    public void addCounter(Counter counter){
        counters.add(counter);
    }

    public void addCounterByIndex(Counter counter, int index){
        if (index >= 0 && index < counters.size()){
            counters.add(index, counter);
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void deleteCounterByIndex(int index){
        if (index >= 0 && index <= counters.size() - 1){
            counters.remove(index);
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public boolean deleteCounter(Counter counter){
        return counters.remove(counter);
    }

    public void incrementCount(String counterName){
        Counter currentCounter = getCounter(counterName);
        int count;
        if (currentCounter != null){
            count = currentCounter.getCount();
            currentCounter.setCount(++count);
        }
    }

    public void incrementCount(Counter counter){
        incrementCount(counter.getCounterName());
    }

    public void decrementCount(String counterName){
        Counter currentCounter = getCounter(counterName);
        int count;
        if (currentCounter != null){
            count = currentCounter.getCount();
            currentCounter.setCount(--count);
        }
    }

    public void decrementCount(Counter counter){
        decrementCount(counter.getCounterName());
    }

    public void userSetCount(String counterName, int userCount){
        Counter currentCounter = getCounter(counterName);
        int count;
        if (currentCounter != null){
            count = currentCounter.getCount();
            currentCounter.setCount(count + userCount);
        }
    }

    public void userSetCount(Counter counter, int userCount){
        userSetCount(counter.getCounterName(), userCount);
    }

    public void resetCount(String counterName){
        Counter currentCounter = getCounter(counterName);
        if (currentCounter != null) {
            currentCounter.setCount(0);
        }
    }

    public void resetCount(Counter counter){
        resetCount(counter.getCounterName());
    }

    public Counter getCounter(String counterName){
        for (Counter c : counters){
            if (c.getCounterName().equals(counterName)){
                return getCounter(c);
            }
        }
        throw new CounterNotExistException("Counter not exist!");
    }

    public Counter getCounter(Counter counter){
        if(counters.contains(counter)) {
            return counters.get(counters.indexOf(counter));
        } else {
            throw new CounterNotExistException("Counter not exist!");
        }
    }

    public List<Counter> getCounters(){
        return counters;
    }

    public void printCounters(){
        System.out.println(HEAD);
        for(Counter c : counters){
            System.out.print(printFormat(c));
        }
    }

    private String printFormat(Counter counter){
        return String.format(OUTPUT_FORMAT, counter.getCounterName(), counter.getCount(), counter.getUnit());
    }
}
