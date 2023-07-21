package kap.newbie.string_generics_collections.test.task3generic;

/**
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) {
        PowNumber<Integer> intNumber = new PowNumber<>(5);
        PowNumber<Double> doubleNumber = new PowNumber<>(6.5);
        PowNumber<Float> floatNumber = new PowNumber<>(4.2f);

        System.out.println(intNumber.exponentiation(4));
        System.out.println(doubleNumber.exponentiation(7));
        System.out.println(floatNumber.exponentiation(3.3));
    }
}
