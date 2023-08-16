package kap.newbie.string_generics_collections.test.task21avltree;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Alexandr Korovkin
 */
public class AVLTree<K extends Comparable<K>, V> {
    private Node<K, V> root;
    private int size;

    public AVLTree(){
        root = null;
        size = 0;
    }

    public AVLTree(K key, V value){
        root = new Node<>(key, value);
        size++;
    }

    public int size() {
        return size;
    }

    private int getHeight(Node<K, V> node){
        return node == null ? -1 : node.height;
    }

    private void updateHeight(Node<K, V> node){
        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }

    private int getBalance(Node<K, V> node){
        return (node == null) ? 0 : getHeight(node.right) - getHeight(node.left);
    }

    private void swap(Node<K, V> nodeA, Node<K, V> nodeB){
        K key = nodeA.key;
        nodeA.key = nodeB.key;
        nodeB.key = key;
        V value = nodeA.value;
        nodeA.value = nodeB.value;
        nodeB.value = value;
    }

    private void rotateRight(Node<K, V> node){
        swap(node, node.left);
        Node<K, V> temp = node.right;
        node.right = node.left;
        node.left = node.right.left;
        node.right.left = node.right.right;
        node.right.right = temp;
        updateHeight(node.right);
        updateHeight(node);
    }

    private void rotateLeft(Node<K, V> node){
        swap(node, node.right);
        Node<K, V> temp = node.left;
        node.left = node.right;
        node.right = node.left.right;
        node.left.right = node.left.left;
        node.left.left = temp;
        updateHeight(node.left);
        updateHeight(node);
    }

    private void balance(Node<K, V> node){
        int balance = getBalance(node);
        if(balance == -2){
            if(getBalance(node.left) == 1){
                rotateLeft(node.left);
            }
            rotateRight(node);
        } else if (balance == 2){
            if (getBalance(node.right) == -1){
                rotateRight(node.right);
            }
            rotateLeft(node);
        }
    }

    public void insert(K key, V value){
        if (root == null){
            root = new Node<>(key ,value);
            return;
        }

        if (key == null){
            return;
        }

        insert(root, key, value);
    }

    private void insert(Node<K, V> node, K key, V value){
        if (node.key.compareTo(key) > 0){
            if (node.left == null){
                node.left = new Node<>(key, value);
                size++;
            } else {
                insert(node.left, key ,value);
            }
        } else {
            if (node.right == null) {
                node.right = new Node<>(key, value);
                size++;
            } else {
                insert(node.right, key ,value);
            }
        }
        updateHeight(node);
        balance(node);
    }

    public V search(K key){
        if (root == null){
            return null;
        }

        return search(root, key);
    }

    private V search(Node<K, V> node, K key){
        if (node.key.compareTo(key) > 0){
            return search(node.left, key);
        } else if (node.key.compareTo(key) < 0) {
            return search(node.right, key);
        } else if (node.key.compareTo(key) == 0){
            return node.value;
        } else {
            return null;
        }
    }

    public Node<K, V> getMin(){
        if (root == null) {
            return null;
        }
        return getMin(root);
    }

    private Node<K, V> getMin(Node<K, V> node){
        if (node.left == null){
            return node;
        }
        return getMin(node.left);
    }

    public Node<K, V> getMax(){
        if (root == null) {
            return null;
        }
        return getMax(root);
    }

    private Node<K, V> getMax(Node<K, V> node){
        if (node.right == null){
            return node;
        }
        return getMax(node.right);
    }

    public void remove(K key){
        root = remove(root, key);
    }

    private Node<K, V> remove(Node<K, V> node, K key){
        if (root == null){
            return null;
        }
        if (node.key.compareTo(key) > 0){
            node.left = remove(node.left, key);
        } else if (node.key.compareTo(key) < 0){
            node.right = remove(node.right, key);
        } else {
            if (node.left == null || node.right == null) {
                node = (node.left == null) ? node.right : node.left;
                size--;
            } else {
                Node<K, V> maxInLeft = getMax(node.left);
                node.key = maxInLeft.key;
                node.value = maxInLeft.value;
                node.left = remove(node.left, maxInLeft.key);
            }
        }
        if (node != null){
            updateHeight(node);
            balance(node);
        }
        return node;
    }

    public String widthWalk(){
        Deque<Node<K, V>> queue = new ArrayDeque<>();
        StringBuilder width = new StringBuilder();
        queue.offerFirst(root);
        Node<K, V> temp;
        while (!queue.isEmpty()) {
            temp = queue.pollFirst();
            width.append(temp.value).append(" ");
            if (temp.left != null){
                queue.offerLast(temp.left);
            }
            if (temp.right != null){
                queue.offerLast(temp.right);
            }
        }
        return width.toString().trim();
    }

    public String toString(){
        return root.toString();
    }

    private static class Node<K extends Comparable<K>, V> implements Comparable<Node<K, V>>{
        private K key;
        private V value;
        private Node<K, V> left;
        private Node<K, V> right;
        private int height = 0;

        private Node(K key, V value){
            this.key = key;
            this.value = value;
            left = null;
            right = null;
        }

        @Override
        public String toString(){
            StringBuilder symmetricWalk = new StringBuilder();
            if (left != null){
                symmetricWalk.append(left.toString());
            }
            symmetricWalk.append(value).append(" ");
            if (right != null) {
                symmetricWalk.append(right.toString());
            }
            return symmetricWalk.toString();
        }

        @Override
        public int compareTo(Node<K, V> another) {
            return key.compareTo(another.key);
        }
    }
}
