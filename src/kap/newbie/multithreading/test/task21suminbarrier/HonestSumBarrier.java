package kap.newbie.multithreading.test.task21suminbarrier;

import java.util.Random;

/**
 * @author Alexandr Korovkin
 */
public class HonestSumBarrier {
    public static void main(String[] args) {
        int[][][] array = new int[3][4][5];

        fillArray(array);
    }

    private static void fillArray(int[][][] array){
        Random random = new Random();
        for(int i = 0;i < array.length;++i){
            for (int j = 0;j < array[i].length;++j){
                System.out.print("{");
                for (int k = 0;k < array[i][j].length;++k){
                    array[i][j][k] = random.nextInt(20);
                    System.out.print(array[i][j][k] + "\t");
                }
                System.out.print("},");
            }
            System.out.println();
        }
    }
}
