package BinaryTree;

public class Node <T> {

    private Node<T> left;
    private final T value;
    private Node<T> right;

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public Node<T> getLeft() {
        return this.left;
    }

    public Node<T> getRight() {
        return this.right;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }
}