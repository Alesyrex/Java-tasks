package kap.newbie.string_generics_collections.test.task16myonelinkedlist.var1.model;

import java.util.Iterator;

/**
 * @author Alexandr Korovkin
 */
public class MyOneLinkedList<E> implements Iterable<E>{
    private Node<E> head;
    private Node<E> tile;
    private int size;

    public MyOneLinkedList(){
        head = null;
        tile = null;
        size = 0;
    }

    public E getHead(){
        return head.data;
    }

    public E getTile(){
        return tile.data;
    }

    public boolean addFront(E data){
        Node<E> newNode = new Node<>(data);

        if (head == null){
            head = newNode;
            tile = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
        return true;
    }

    public boolean addBack(E data){
        Node<E> newNode = new Node<>(data);

        if(tile == null){
            head = newNode;
        } else {
            tile.next = newNode;
        }
        tile = newNode;
        size++;
        return true;
    }

    public boolean delete(E data){
        if (head.data.equals(data) && size == 1){
            head = null;
            tile = null;
            size = 0;
            return true;
        }

        if (head.data.equals(data)) {
            head = head.next;
            size--;
        }

        Node<E> tempNode = head;
        while (tempNode.next != null){
            if (tempNode.next.data.equals(data)){
                if(tempNode.next == tile){
                    tile = tempNode;
                }
                tempNode.next = tempNode.next.next;
                size--;
                return true;
            }
            tempNode = tempNode.next;
        }
        return false;
    }

    public void deleteByHash(){
        if (head.hashCode() % 2 == 0 && size == 1){
            head = null;
            tile = null;
            size = 0;
            return;
        }

        if (head.hashCode() % 2 == 0) {
            head = head.next;
            size--;
        }

        Node<E> tempNode = head;
        while (tempNode.next != null){
            if (tempNode.next.hashCode() % 2 == 0){
                if(tempNode.next == tile){
                    tile = tempNode;
                }
                tempNode.next = tempNode.next.next;
                size--;
                return;
            }
            tempNode = tempNode.next;
        }
    }

    public void reverse(){
        if (head == null){
            return;
        }
        MyOneLinkedList<E> tempList = new MyOneLinkedList<>();

        Node<E> temp = new Node<>(head);
        head = tile;
        while (temp.next != null) {
            tempList.addFront(temp.data);
            temp = temp.next;
        }
        this.head = tempList.head;
        this.tile = tempList.tile;
        this.size = tempList.size;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyOneLinkedListIterator<>(head);
    }

    public int size() {
        return size;
    }

    public String toString(){
        return head.toString();
    }

    private static class Node<E>{
        private final E data;
        private Node<E> next;

        private Node(E data){
            this.data = data;
            next = null;
        }

        private Node(Node<E> node){
            this.data = node.data;
            this.next = node.next;
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

    private static class MyOneLinkedListIterator<E> implements Iterator<E>{
        private Node<E> current;

        private MyOneLinkedListIterator(Node<E> current){
            this.current = current;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext()){
                throw new IndexOutOfBoundsException();
            }

            E element = current.data;
            current = current.next;
            return element;
        }
    }
}
