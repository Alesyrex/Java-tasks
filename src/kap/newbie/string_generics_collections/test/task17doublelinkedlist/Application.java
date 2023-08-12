package kap.newbie.string_generics_collections.test.task17doublelinkedlist;

import kap.newbie.string_generics_collections.test.task17doublelinkedlist.var1.MyDoubleLinkedList;
import kap.newbie.string_generics_collections.test.task17doublelinkedlist.var2.OneLineQueue;

/**
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) {
        MyDoubleLinkedList<Integer> list = new MyDoubleLinkedList<>();

        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);

        System.out.println(list);

        list.reverse();

        System.out.println(list);

        OneLineQueue<Integer> queue = new OneLineQueue<>(list);

        System.out.println(queue.pop());
        System.out.println(queue.pop());

        System.out.println(list);

        queue.push(17);
        queue.push(18);

        System.out.println(list);

        System.out.println(queue.pop());

        System.out.println(list);
    }
}
