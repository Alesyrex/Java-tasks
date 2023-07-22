package kap.newbie.string_generics_collections.test.task8generic2;

/**
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) {
        PowNumber<?> intNumber = getPowNumber(5);
        PowNumber<?> doubleNumber = getPowNumber(6.5);
        PowNumber<?> floatNumber = getPowNumber(4.2f);

        System.out.println(intNumber.exponentiation(4));
        System.out.println(doubleNumber.exponentiation(7));
        System.out.println(floatNumber.exponentiation(3.3));
    }

    private static PowNumber<? extends Number> getPowNumber(Number number){
        return new PowNumber<>(number);
    }
}
