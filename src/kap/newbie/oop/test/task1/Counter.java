package kap.newbie.oop.test.task1;

/**
 * Реализовать класс-счетчик. Полями класса должны выступать название счетчика и,
 * непосредственно, целочисленный счетчик.
 * Реализовать для созданного класса конструктор с двумя параметрами,
 * с одним (значение счетчика в таком случае инициализировать как 0),
 * методы увеличения и уменьшения счетчиков на 1 и на заданное пользователем целое значение.
 * Методы должны возвращать актуальное значение счетчика.
 *
 * Используя созданный класс, посчитать количество четных и количество нечетных чисел в ряду от 1 до 100.
 * Конечные показатели счетчиков вывести в консоль.
 *
 * @author Alexandr Korovkin
 */
public class Counter {
    public static final String COUNTER_NAME = "Counter";
    public static final String OUTPUT_FORMAT = "%s : %d";
    private final String counterName;
    private int count;

    public Counter(){
        this(COUNTER_NAME, 0);
    }

    public Counter(String counterName){
        this(counterName, 0);
    }

    public Counter(String counterName, int count){
        this.counterName = counterName;
        this.count = count;
    }

    public int incrementCount(){
        return ++count;
    }

    public int decrementCount(){
        return --count;
    }

    public int userSettingCount(int userCount){
        count += userCount;
        return count;
    }

    public int getCount(){
        return count;
    }

    public String getCounterName(){
        return counterName;
    }

    public static void main(String[] args) {
        Counter honestCounter = new Counter("Honest Counter");
        Counter oddCounter = new Counter("Odd Counter");
        for (int i = 1;i <= 100;++i){
            if (i % 2 == 0) {
                honestCounter.incrementCount();
            } else {
                oddCounter.incrementCount();
            }
        }
        System.out.printf(OUTPUT_FORMAT, honestCounter.counterName, honestCounter.count);
        System.out.println();
        System.out.printf(OUTPUT_FORMAT, oddCounter.counterName, oddCounter.count);
    }
}
