package BinaryTree;

import BinaryTree.Node;

import java.util.Stack;

public class Tree<T extends Comparable<T>> {
    private Node<T> root;

    public void add(T element) {

        if (this.root == null) {
            this.root = new Node<>(element);
            return;
        }

        if (this.root.getValue().equals(element))
            return;

        Node<T> childNode = this.root;
        Node<T> parentNode = null;

        while ( childNode != null) {
            parentNode = childNode;
            childNode = childNode.getValue().compareTo(element) > 0 ? childNode.getLeft() : childNode.getRight();
        }

        childNode = new Node<T>(element);

       if ( parentNode.getValue().compareTo(element) > 0 )
           parentNode.setLeft(childNode);
       else
           parentNode.setRight(childNode);

    }

    public void delete(T element) {

        if ( this.root.getValue().compareTo(element) == 0 )
            this.root = null;

        Node<T> childNode = this.root;
        Node<T> parentNode = null;
        boolean isRight = false;

        while (childNode != null) {

            int result = childNode.getValue().compareTo(element);

            if (result == 0 )
                break;

            parentNode = childNode;

            childNode = result > 0 ?  childNode.getRight() : childNode.getLeft();
            isRight = result > 0;
        }

        if ( childNode == null )
            return;

        if ( isRight )
            parentNode.setRight(null);
        else
            parentNode.setLeft(null);

    }

    public void preOrder() {

        Node<T> auxiliary = this.root;
        Stack<Node<T>> stack = new Stack<>();

        while ( auxiliary != null ) {
            System.out.println(auxiliary.getValue());
            if (auxiliary.getRight() != null )
                stack.push(auxiliary.getRight());

            auxiliary = auxiliary.getLeft();
        }

        if ( stack.isEmpty() )
            return;

        auxiliary = stack.pop();
        while ( auxiliary != null ) {
            System.out.println(auxiliary.getValue());
            if ( auxiliary.getRight() != null )
                stack.push(auxiliary.getRight());

            if ( auxiliary.getLeft() != null ) {
                auxiliary = auxiliary.getLeft();
                return;
            }

            auxiliary = stack.isEmpty() ? null : stack.pop();

        }

    }

}
