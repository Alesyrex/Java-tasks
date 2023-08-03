package kap.newbie.string_generics_collections.test.task13mycollection;

import kap.newbie.string_generics_collections.test.task13mycollection.exception.InvalidRemoveException;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Alexandr Korovkin
 */
public class MyStackCollection<T> implements Collection<T> {

    private Node<T> top;
    private int stackDeep;

    public MyStackCollection(){
    }

    public MyStackCollection(T top){
        this.top = new Node<>(top);
        stackDeep = 1;
    }

    public MyStackCollection(MyStackCollection<T> anotherStack){
        this.top = anotherStack.getTop();
        this.stackDeep = anotherStack.size();
    }

    public T getTopValue(){
        return top.value;
    }

    public Node<T> getTop() {
        return top;
    }

    @Override
    public int size() {
        return stackDeep;
    }

    @Override
    public boolean add(T element) {
        if (top == null) {
            top = new Node<>(element);
            stackDeep = 1;
        } else {
            top = new Node<>(element, top);
            stackDeep++;
        }
        return true;
    }

    @Override
    public boolean isEmpty() {
        return stackDeep == 0;
    }

    @Override
    public boolean contains(Object object) {
        Node<T> temp = top;

        while (temp != null) {
            if (temp.value.equals(object)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyStackCollectionIterator(top);
    }

    @Override
    public Object[] toArray() {
        Node<T> temp = top;
        Object[] array = new Object[stackDeep];

        for (int i = 0; i < array.length; ++i){
            array[i] = temp.value;
            temp = temp.next;
        }
        return array;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return (T1[]) Arrays.copyOf(toArray(), size(), a.getClass());
    }

    public boolean removeElement() throws InvalidRemoveException {
        if (top.next != null) {
            top = top.next;
            stackDeep--;
        } else if (top.value != null) {
            top = null;
        } else {
            throw new InvalidRemoveException("No element to remove, end stack!");
        }
        return true;
    }

    @Override
    public boolean remove(Object object) {
        if (object != null) {
            Node<T> temp = top;

            if (object.equals(top.value)) {
                top = top.next;
                stackDeep--;

                return true;
            }

            while (temp.next != null){
                if (temp.next.value.equals(object)){
                    temp.next = temp.next.next;
                    stackDeep--;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        for (T t : c){
            add(t);
        }
        return true;
    }

    @Override
    public void clear() {
        top = null;
        stackDeep = 0;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        while (!c.contains(top.value)){
            top = top.next;
            stackDeep--;
        }
        Node<T> temp = top;

        while (temp.next != null) {
            if (!c.contains(temp.next.value)){
                temp.next = temp.next.next;
                stackDeep--;
            }
            temp = temp.next;
        }
        return stackDeep > 0;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean result = false;
        for (Object object : c){
            if (remove(object)){
                result = true;
            }
        }
        return result;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;
    }



    @Override
    public String toString() {
        return top.toString();
    }

    private static class Node<T> {
        private final T value;
        private Node<T> next;

        private Node(T value){
            this.value = value;
        }

        private Node(T value, Node<T> next){
            this.value = value;
            this.next = next;
        }

        public String toString() {
            StringBuilder stackString = new StringBuilder();
            stackString.append("[").append(value).append(",");
            if(next != null) {
                stackString.append(next.toString()).append("]");
            } else {
                stackString.append("null").append("]");
            }
            return stackString.toString();
        }
    }

    private static class MyStackCollectionIterator<T> implements Iterator<T>{
        private Node<T> current;

        private MyStackCollectionIterator(Node<T> current){
            this.current = current;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()){
                throw new IndexOutOfBoundsException();
            }
            T t = current.value;
            current = current.next;
            return t;
        }
    }
}
