package Stack;

import java.util.EmptyStackException;

public class Stack<T> {

    private Node<T> top;

    public Stack() { }

    public void push (T element) {

        if (this.top == null) {
            this.top = new Node<T>(element);
            return;
        }

        Node<T> node = new Node<>(element);
        node.setNext(top);
        this.top = node;

        System.out.println("New element added to the stack");
    }

    public T pop() throws EmptyStackException {
        if (this.top == null)
            throw new EmptyStackException();

        T poppedElement = this.top.getValue();
        this.top = this.top.getNext();

        return poppedElement;

    }

    public T peek() throws EmptyStackException {
        if ( this.top == null )
            throw new EmptyStackException();

        return this.top.getValue();
    }

    public boolean isEmpty() {
        return this.top == null;
    }

}
