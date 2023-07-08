package kap.newbie.oop.test.counter_aggregation;

/**
 * Разработать программу в рамках компании com.walking, позволяющую следить за счетчиками на газ, холодную воду,
 * горячую воду и электричество. Обозначение программы в рамках компании — counterAggregation.
 *
 * Используя за основу задачу из темы про классы и объекты (ссылка на разбор),
 * реализовать класс счетчика, который хранит название счетчика и его значение,
 * его единицы измерения, а также обеспечивает доступ к значениям.
 * Название счетчика и его единицы измерения должны быть неизменны.
 *
 * Также реализовать сервис CounterService, зона ответственности которого — хранение массива доступных счетчиков,
 * получение всех доступных счетчиков, получение доступа к счетчику по названию,
 * увеличение значения счетчика на единицу или заданное значение, а также сброс счетчика до нулевого значения.
 *
 * Ответственность класса, содержащего main() — создание счетчиков. Сам класс также предлагаю назвать Main.
 *
 * Также реализовать в классе Main приватный метод, который позволяет вывести значения счетчиков в виде:
 * <Название счетчика>: <Значение счетчика>. Например:
 *
 * Газ: 2333
 * Горячая вода: 0
 * Холодная вода: 23
 *
 * @author Alexandr Korovkin
 */
public class Main {
    public static final String OUTPUT_FORMAT = "%s : %d %s\n";
    public static final String GAS = "Gas";
    public static final String COLD_WATER = "Cold Water";
    public static final String HOT_WATER = "Hot Water";
    public static final String ELECTRICITY = "Electricity";
    public static final String M_2 = "m2";
    public static final String KILOWATT = "kw";

    public static void printCounters(Counter ...counters){
        for (Counter counter : counters){
            System.out.print(printFormat(counter));
        }
    }

    private static String printFormat(Counter counter) {
        return String.format(OUTPUT_FORMAT,counter.getCounterName(),counter.getCount(),counter.getUnit());
    }

    public static void main(String[] args) {
        Counter gasCounter = new Counter(GAS, 10, M_2);
        Counter coldWaterCounter = new Counter(COLD_WATER, 450, M_2);
        Counter hotWaterCounter = new Counter(HOT_WATER, 150, M_2);
        Counter electricityCounter = new Counter(ELECTRICITY,1000, KILOWATT);

        CounterService service = new CounterService(gasCounter,coldWaterCounter,hotWaterCounter,electricityCounter);

        service.incrementCount(GAS);
        service.decrementCount(HOT_WATER);
        service.userSetCount(ELECTRICITY,1150);

        printCounters(service.getCounters());
    }
}
