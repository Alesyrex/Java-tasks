package kap.newbie.multithreading.test.task24pool_arrayfill.model;

import java.util.Random;
import java.util.concurrent.RecursiveAction;

/**
 * @author Alexandr Korovkin
 */
public class ForkTaskToArrayFilling extends RecursiveAction {
    private int[][] array;
    private int minInd;
    private int maxInd;
    private int minSubInd;
    private int maxSubInd;

    private Random random;

    public ForkTaskToArrayFilling(int[][] array, int minInd, int maxInd, int minSubInd, int maxSubImn) {
        this.array = array;
        this.minInd = minInd;
        this.maxInd = maxInd;
        this.minSubInd = minSubInd;
        this.maxSubInd = maxSubImn;
        this.random = new Random();
    }

    @Override
    protected void compute() {

        if(getElementCount() <=
                (array.length * array[0].length) / getPool().getParallelism()){

            for(int i = minInd; i <= maxInd; ++i){
                for (int j = (maxInd == i ? 0 : minSubInd); j <= (maxInd == i ? maxSubInd : array[i].length - 1); ++j){
                    array[i][j] = random.nextInt(50);
                }
            }
        } else {
            int multiple = (maxInd - minInd) * array[0].length;
            int leftMin = minInd;
            int leftMinSub = minSubInd;
            int rightMax = maxInd;
            int rightMaxSub = maxSubInd;

            int preCalcSub = minSubInd + (((multiple + maxSubInd) - minSubInd) / 2);

            int leftMaxSub = preCalcSub % array[0].length;
            int rightMinSub = (leftMaxSub + 1) % array[0].length;
            int leftMax = minInd + (preCalcSub / array[0].length);
            int rightMin = minInd + (preCalcSub + 1) / array[0].length;

            var f1 = new ForkTaskToArrayFilling(array, leftMin, leftMax, leftMinSub, leftMaxSub);
            var f2 = new ForkTaskToArrayFilling(array, rightMin, rightMax, rightMinSub, rightMaxSub);

            invokeAll(f1, f2);
        }
    }

    private int getElementCount(){
        int multiple = (maxInd - minInd) * array[0].length;

        return multiple + maxSubInd - minSubInd;
    }
}
