package kap.newbie.string_generics_collections.test.task6generic;

import kap.newbie.string_generics_collections.test.task6generic.exception.InvalidElementException;
import kap.newbie.string_generics_collections.test.task6generic.exception.InvalidRemoveException;

/**
 * @author Alexandr Korovkin
 */
public class MyStack<T> {
    private T parent;
    private MyStack<T> node;
    private int stackDeep;

    public MyStack(){
    }

    public MyStack(T parent){
        this.parent = parent;
        node = null;
        stackDeep = 1;
    }

    public T getParent() {
        return parent;
    }

    public boolean addElement(T element){
        if (parent == null) {
            parent = element;
            node = null;
            stackDeep = 1;
        } else {
            MyStack<T> newNode = new MyStack<>();
            newNode.parent = parent;
            newNode.node = node;
            newNode.stackDeep = stackDeep;
            parent = element;
            node = newNode;
            stackDeep++;
        }
        return true;
    }

    public boolean removeElement() throws InvalidRemoveException {
        if (node != null) {
            parent = node.parent;
            stackDeep = node.stackDeep;
            node = node.node;
        } else {
            throw new InvalidRemoveException("No element to remove, end stack!");
        }

        return true;
    }

    public int getStackDeep(){
        return stackDeep;
    }

    public MyStack<T> findElement(T element) throws InvalidElementException {
        return stackWalk(this, element);
    }

    private MyStack<T> stackWalk(MyStack<T> nextNode, T element) throws InvalidElementException {
        if (element.equals(nextNode.parent)){
            return nextNode;
        } else if (nextNode.node != null){
            return stackWalk(nextNode.node, element);
        }
        throw new InvalidElementException("Element not found!");
    }

    @Override
    public String toString() {
        StringBuilder stackString = new StringBuilder();
        stackString.append("[").append(parent).append(",");
        if(node != null) {
            stackString.append(node.toString()).append("]");
        } else {
            stackString.append("null").append("]");
        }
        return stackString.toString();
    }
}
