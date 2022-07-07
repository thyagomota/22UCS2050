/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Homework 05 - PriorityQueue
 */

public class PriorityQueue<E extends HasPriority> {

    // priority queue does not benefit much by having a rear pointer, so let's not worried about it
    private Node<E> front;

    public PriorityQueue() {
        front = null;
    }

    // TODO: finish the implementation of the method
    public void push(E value) {

        // create a new node with value

        // add the new node as the front node if queue is empty


        // if the queue is not empty

            // if new node has a higher priority than the front node, add the new node as the front node


            // if that is not the case, add the new node in the correct location of the queue


            // if you haven't returned at this point, add the new node at the rear of the queue

    }

    public E pop() {
        if (isEmpty())
            return null;
        E value = front.getValue();
        Node temp = front;
        front = front.getNext();
        temp.setNext(null);
        return value;
    }

    public E peek() {
        if (isEmpty())
            return null;
        return front.getValue();
    }

    public int size() {
        int count = 0;
        Node current = front;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    public boolean isEmpty() {
        return front == null;
    }

    // front to rear (left to right)
    @Override
    public String toString() {
        String out = "(front)";
        Node current = front;
        while (current != null) {
            out += " " + current.toString();
            current = current.getNext();
        }
        out += " (rear)";
        return out;
    }
}