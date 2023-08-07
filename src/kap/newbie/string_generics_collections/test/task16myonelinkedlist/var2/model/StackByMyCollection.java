package kap.newbie.string_generics_collections.test.task16myonelinkedlist.var2.model;

import kap.newbie.string_generics_collections.test.task13mycollection.MyStackCollection;
import kap.newbie.string_generics_collections.test.task16myonelinkedlist.var1.model.MyOneLinkedList;

/**
 * @author Alexandr Korovkin
 */
public class StackByMyCollection<E> {
    MyOneLinkedList<E> list;

    public StackByMyCollection() {
        list  = new MyOneLinkedList<>();
    }

    public StackByMyCollection(MyOneLinkedList<E> list){
        this.list = list;
    }

    public boolean push(E element){
        return list.addFront(element);
    }

    public E pop(){
        E element = list.getHead();
        list.delete(element);
        return element;
    }

    public MyOneLinkedList<E> getList() {
        return list;
    }
}
