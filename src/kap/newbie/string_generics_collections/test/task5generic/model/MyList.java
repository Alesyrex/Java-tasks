package kap.newbie.string_generics_collections.test.task5generic.model;

import kap.newbie.string_generics_collections.test.task5generic.exception.FindElementException;

import java.util.Arrays;

/**
 * @author Alexandr Korovkin
 */
public class MyList<T> {
    private T[] myArrayList;

    public MyList(T[] myArrayList){
        this.myArrayList = myArrayList;
    }

    public T find(T element) throws FindElementException {
        for(T type : myArrayList){
            if (type.equals(element)) {
                return type;
            }
        }
        throw new FindElementException(element.getClass().getSimpleName() + " object not found!");
    }

    public void addElement(T element) {
        T[] newArray = Arrays.copyOf(myArrayList,myArrayList.length + 1);
        newArray[myArrayList.length] = element;
        myArrayList = newArray;
    }
}
