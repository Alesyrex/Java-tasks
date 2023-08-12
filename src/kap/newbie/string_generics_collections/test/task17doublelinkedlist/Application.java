package kap.newbie.string_generics_collections.test.task17doublelinkedlist;

import kap.newbie.string_generics_collections.test.task17doublelinkedlist.var1.MyDoubleLinkedList;

/**
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) {
        MyDoubleLinkedList<Integer> list = new MyDoubleLinkedList<>();

        list.add(13);
        list.add(14);
        list.add(15);

        System.out.println(list);

        list.remove(14);

        System.out.println(list);

        list.remove(15);

        System.out.println(list);
    }
}
