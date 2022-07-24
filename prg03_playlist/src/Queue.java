/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Prg03 - Queue class
 * Student(s):
 */

public class Queue<E> {

    Node<E> front, rear;

    public Queue() {
        front = rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void push(final E value) {
        Node<E> newNode = new Node(value);
        if (isEmpty())
            front = rear = newNode;
        else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    public E pop() {
        if (isEmpty())
            return null;
        Node<E> frontNode = front;
        if (front == rear)
            front = rear = null;
        else
            front = frontNode.getNext();
        frontNode.setNext(null);
        return frontNode.getValue();
    }

    @Override
    public String toString() {
        String out = "[front] ";
        Node<E> current = front;
        while (current != null) {
            out += current + " ";
            current = current.getNext();
        }
        out = out.trim() + " [rear]";
        return out;
    }
}
