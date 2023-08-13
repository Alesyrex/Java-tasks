package kap.newbie.string_generics_collections.test.task20binary_tree;

/**
 * @author Alexandr Korovkin
 */
public class BinaryTree<K extends Comparable<K>, V> {
    private Node<K, V> root;
    private int size;

    public BinaryTree(){
        root = null;
        size = 0;
    }

    public BinaryTree(K key, V value) {
        root = new Node<>(key, value);
        size++;
    }

    public int size() {
        return size;
    }

    public boolean insert(K key, V value){
        if (root == null){
            root = new Node<>(key ,value);
            return true;
        }

        if (key == null){
            return false;
        }

        return insert(root, key, value);
    }

    private boolean insert(Node<K, V> node, K key, V value){
        if (node.key.compareTo(key) > 0){
            if (node.left == null){
                node.left = new Node<>(key, value);
                size++;
                return true;
            }
            insert(node.left, key ,value);
        } else {
            if (node.right == null) {
                node.right = new Node<>(key, value);
                size++;
                return true;
            }
            insert(node.right, key ,value);
        }
        return false;
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
        return node;
    }

    public String toString(){
        return root.toString();
    }

    private static class Node<K extends Comparable<K>, V> implements Comparable<Node<K, V>>{
        private K key;
        private V value;
        private Node<K, V> left;
        private Node<K, V> right;

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
