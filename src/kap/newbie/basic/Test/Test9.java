package kap.newbie.basic.Test;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class Test9 {

    public static final int SUM_ONE_HUNDRED = 100;
    public static final int SUM_TWO_HUNDRED = 200;
    public static final int FIVE_PERCENT = 5;
    public static final int SEVEN_PERCENT = 7;
    public static final int TEN_PERCENT = 10;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double contribution;
        System.out.print("Input sum of contribution: ");
        contribution = input.nextDouble();
        if (contribution < SUM_ONE_HUNDRED) {
            calculateSum(contribution, FIVE_PERCENT);
        } else if (contribution < SUM_TWO_HUNDRED) {
            calculateSum(contribution, SEVEN_PERCENT);
        } else {
            calculateSum(contribution, TEN_PERCENT);
        }
        input.close();
    }

    public static void calculateSum(double contribution, int percent) {
        contribution += (contribution / SUM_ONE_HUNDRED) * percent;
        System.out.printf("Your percent - %d%% and accrued sum = %.1f", percent, contribution);
    }
}
