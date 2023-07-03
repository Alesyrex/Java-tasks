package kap.newbie.basic.Test;

/**
 * @author Alexandr Korovkin
 */
public class Test16 {
    public static void main(String[] args) {
        int population = 10000000;
        int fertility = 14;
        int mortality = 8;
        int diff;
        for (int years = 1;years <= 10; ++years) {

            diff = fertility - mortality;
            population += population * diff / 1000;
            if (fertility > 7) {
                --fertility;
            }
            if (mortality > 6) {
                --mortality;
            }

        }
        System.out.println("Population int ten years: " + population);
    }
}
