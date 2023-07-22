package kap.newbie.string_generics_collections.test.task7generic2;

/**
 * @author Alexandr Korovkin
 */
public class SthGenericClass<T> {
    private T sthField;

    public SthGenericClass(){}

    public SthGenericClass(T sthField){
        this.sthField = sthField;
    }

    public T getSthField() {
        return sthField;
    }
}
