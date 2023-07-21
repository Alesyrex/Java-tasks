package kap.newbie.string_generics_collections.test.task4generic;

/**
 * @author Alexandr Korovkin
 */
public class SomethingWrapperClass<T> {
    private T somethingClass;

    public SomethingWrapperClass(T somethingClass){
        this.somethingClass = somethingClass;
    }

    public T getSomethingClass() {
        return somethingClass;
    }

    public void setSomethingClass(T somethingClass) {
        this.somethingClass = somethingClass;
    }

    public boolean isEmpty() {
        return somethingClass == null;
    }
}
