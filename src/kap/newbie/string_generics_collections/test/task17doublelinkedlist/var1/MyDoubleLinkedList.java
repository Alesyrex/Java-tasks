package kap.newbie.string_generics_collections.test.task17doublelinkedlist.var1;

import kap.newbie.string_generics_collections.test.task16myonelinkedlist.var1.model.MyOneLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Alexandr Korovkin
 */
public class MyDoubleLinkedList<E> implements Iterable<E>{
    private Node<E> head;
    private Node<E> tile;
    private int size;

    public MyDoubleLinkedList(){
        size = 0;
        head = null;
        tile = null;
    }

    public E getHead() {
        return head.data;
    }

    public E getTile() {
        return tile.data;
    }

    public int size() {
        return size;
    }

    public boolean add(E element){
        Node<E> temp = new Node<>(element);

        if(head != null){
            head.previous = temp;
            temp.next = head;
        } else {
            tile = temp;
        }
        head = temp;
        size ++;
        return true;
    }

    private void unlink(Node<E> node){
        Node<E> prev = node.previous;
        Node<E> next = node.next;

        if(prev == null){
            head = next;
        }else {
            prev.next = next;
            node.previous = null;
        }

        if(next == null){
            tile = prev;
        }else {
            next.previous = prev;
            node.next = null;
        }

        node.data = null;
        size--;
    }

    public boolean remove(E element){
        for (Node<E> x = head; x != null; x = x.next){
            if (x.data.equals(element)){
                unlink(x);
                return true;
            }
        }
        return false;
    }

    public boolean reverse(){
        if (size > 1){
            tile = head;

            Node<E> temp = null;
            for (Node<E> x = head; x != null; x = x.previous){
                temp = x.previous;
                x.previous = x.next;
                x.next = temp;
            }
            head = temp.previous;
            return true;
        }
        return false;
    }

    public void deleteByHash(){
        for (Node<E> x = head; x != null; x = x.next){
            if (x.hashCode() % 2 == 0){
                unlink(x);
            }
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new MyDoubleLinkedListIterator<>(head);
    }

    public String toString(){
        return head.toString();
    }

    private static class Node<E>{
        private E data;
        private Node<E> next;
        private Node<E> previous;

        private Node(E data){
            this.data = data;
            next = null;
            previous = null;
        }

        public String toString() {
            StringBuilder stackString = new StringBuilder();
            stackString.append("[").append(data).append(",");
            if(next != null) {
                stackString.append(next.toString()).append("]");
            } else {
                stackString.append("null").append("]");
            }
            return stackString.toString();
        }
    }

    private static class MyDoubleLinkedListIterator<E> implements Iterator<E> {
        private Node<E> current;

        public MyDoubleLinkedListIterator(Node<E> current){
            this.current = current;
        }
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if(!hasNext()){
                throw new IndexOutOfBoundsException();
            }

            E element = current.data;
            current = current.next;
            return element;
        }
    }
}
