package kap.newbie.string_generics_collections.test.task17doublelinkedlist.var2;

import kap.newbie.string_generics_collections.test.task17doublelinkedlist.var1.MyDoubleLinkedList;

/**
 * @author Alexandr Korovkin
 */
public class OneLineQueue<E> {
    private MyDoubleLinkedList<E> list;

    public OneLineQueue(){
        list = new MyDoubleLinkedList<>();
    }

    public OneLineQueue(MyDoubleLinkedList<E> list) {
        this.list = list;
    }

    public E pop(){
        E element = list.getTile();
        list.remove(element);
        return element;
    }

    public boolean push(E element){
        return list.add(element);
    }
}
