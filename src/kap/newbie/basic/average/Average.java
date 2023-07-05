package kap.newbie.basic.average;

import java.util.Scanner;

/**
 * Complete the code to compute average value of a given sequence of numbers.
 * A sequence consists of integer values. It may be up to 100 values in length and it finishes with 0.
 * Average value is also an integer. Use integer operations.
 * Get a sequence of numbers from standard input and print the result to standard output.
 *
 * @author Alexandr Korovkin
 */
public class Average {
    public static final String INPUT_MESSAGE = "Input numbers for calculation average: ";
    private int count;
    private int sum;
    private int resultAverage;

    public Average(){
        count = 0;
        sum = 0;
        resultAverage = 0;
    }

    private void calculateSum(){
        int temp;
        System.out.print(INPUT_MESSAGE);
        try(Scanner input = new Scanner(System.in)){
            do {
                temp = input.nextInt();
                sum += temp;
                if (temp != 0){
                    count++;
                }
            } while (temp != 0);
        }
    }

    public void calculateAverage(){
        calculateSum();
        resultAverage = sum / count;
    }

    public int getResultAverage(){
        return resultAverage;
    }

    public static void main(String[] args) {
        Average average = new Average();
        average.calculateAverage();
        System.out.println(average.getResultAverage());
    }
}
