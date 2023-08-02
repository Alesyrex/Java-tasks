package kap.newbie.string_generics_collections.test.task12arrlist.model;

/**
 * @author Alexandr Korovkin
 */
public class Counter {
    public static final String COUNTER_NAME = "Counter";
    public static final String DEFAULT_UNIT = "y.e.";
    private final String counterName;
    private int count;
    private final String unit;

    public Counter(){
        this(COUNTER_NAME, 0, DEFAULT_UNIT);
    }

    public Counter(String counterName){
        this(counterName, 0, DEFAULT_UNIT);
    }

    public Counter(String counterName, String unit) { this(counterName,0,unit); }

    public Counter(String counterName, int count, String unit){
        this.counterName = counterName;
        this.count = count;
        this.unit = unit;
    }

    public void setCount(int count){
        this.count = count;
    }

    public String getUnit() { return unit; }

    public int getCount(){
        return count;
    }

    public String getCounterName(){
        return counterName;
    }
}
