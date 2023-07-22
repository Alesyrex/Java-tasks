package kap.newbie.string_generics_collections.test.task7generic2;

/**
 * @author Alexandr Korovkin
 */
public class Main {

    private static <T> T getFieldSthClass(SthGenericClass<T> sthGenericClass, T type){
        return sthGenericClass.getSthField() != null ? sthGenericClass.getSthField() : type;
    }

    public static void main(String[] args) {
        SthGenericClass<Integer> intClass = new SthGenericClass<>(5);
        SthGenericClass<Integer> intClass2 = new SthGenericClass<>();
        SthGenericClass<String> strClass = new SthGenericClass<>();
        SthGenericClass<String> strClass2 = new SthGenericClass<>("Hello");

        Integer intType = 3;
        String strType = "Hi";

        System.out.println(getFieldSthClass(intClass, intType));
        System.out.println(getFieldSthClass(intClass2, intType));
        System.out.println(getFieldSthClass(strClass, strType));
        System.out.println(getFieldSthClass(strClass2, strType));
    }
}
