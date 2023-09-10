package kap.newbie.multithreading.test.task9counter.model;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Alexandr Korovkin
 */
public class Counter {
    private AtomicInteger count;
    private final String name;
    private final String unit;

    public Counter(String name, String unit, AtomicInteger count) {
        this.unit = unit;
        this.name = name;
        this.count = count;
    }

    public Counter(String name, String unit){
        this(name, unit,new AtomicInteger(0));
    }

    public AtomicInteger getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }

        if(this == obj){
            return true;
        }

        Counter counter = (Counter) obj;
        return Objects.equals(name, counter.name) && Objects.equals(unit, counter.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, unit);
    }

    @Override
    public String toString() {
        return String.format("Counter %s - %d %s", name, count.get(), unit);
    }
}
