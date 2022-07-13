/*
 * CS 2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Prg02 - Stack class
 * Your name(s):
 */

public class Stack<E> {

    private Node<E> top;

    public Stack() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(final E value) {
        Node<E> newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
    }

    public E pop() {
        if (isEmpty())
            return null;
        Node<E> topNode = top;
        top = top.getNext();
        topNode.setNext(null);
        return topNode.getValue();
    }

    @Override
    public String toString() {
        String out = "[top] ";
        Node<E> current = top;
        while (current != null) {
            out += current + " ";
            current = current.getNext();
        }
        out = out.trim() + " [bottom]";
        return out;
    }
}