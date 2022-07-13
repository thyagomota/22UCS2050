/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Homework 06 - Stack
 */

public class Stack<E> {

    private Node<E> top;

    public Stack() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        int count = 0;
        Node<E> current = top;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
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