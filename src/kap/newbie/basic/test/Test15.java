package kap.newbie.basic.test;

/**
 * @author Alexandr Korovkin
 */
public class Test15 {
    public static void main(String[] args) {
        int population = 10000000;
        int fertility = 14;
        int mortality = 8;
        int diff = fertility - mortality;
        int thousands;
        for (int years = 0;years < 10; ++years) {
            thousands = population / 1000;
            population = population + diff * thousands;
        }
        System.out.println("Population int ten years: " + population);

    }
}
