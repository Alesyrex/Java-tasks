package kap.newbie.functional_programming.lection.test7;

/**
 * @author Alexandr Korovkin
 */
public class TestMethodReference {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,-5,6,7,8,9};

        System.out.println(sum(array, ExpressionHelper::isEven));

        System.out.println(sum(array, ExpressionHelper::isPositive));
    }

    private static int sum(int [] array, Expression func){
        int result = 0;

        for (int i : array){
            if (func.isEqual(i)){
                result += i;
            }
        }

        return result;
    }
}
