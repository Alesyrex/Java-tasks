package kap.newbie.string_generics_collections.test.task8generic2;

/**
 * @author Alexandr Korovkin
 */
public class PowNumber<T extends Number> {
    private final T numberToPow;

    public PowNumber(T numberToPow){
        this.numberToPow = numberToPow;
    }

    public T getNumberToPow(){
        return numberToPow;
    }

    public double exponentiation(double exp){
        return Math.pow(numberToPow.doubleValue(), exp);
    }
}
