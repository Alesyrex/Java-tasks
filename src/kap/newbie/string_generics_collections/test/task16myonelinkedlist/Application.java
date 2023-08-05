package kap.newbie.string_generics_collections.test.task16myonelinkedlist;

import kap.newbie.string_generics_collections.test.task16myonelinkedlist.model.MyOneLinkedList;

/**
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) {
        MyOneLinkedList<Integer> list = new MyOneLinkedList<>();

        list.addFront(14);
        list.addFront(15);
        list.addFront(16);
        list.addFront(17);


        System.out.println(list + "  size: " + list.size());

        list.addBack(18);
        list.addBack(19);

        for(Integer i : list){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println(list + "  size: " + list.size());

        list.deleteByHash();

        System.out.println(list + "  size: " + list.size());

        for(Integer i : list){
            System.out.print(i + " ");
        }
        System.out.println();

        list.reverse();

        System.out.println(list + "  size: " + list.size());

        list.delete(16);

        System.out.println(list + "  size: " + list.size());

        for(Integer i : list){
            System.out.print(i + " ");
        }
    }
}
