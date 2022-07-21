/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 07 - LinkedList
 */

import java.util.Iterator;

public class LinkedList<E> implements Iterable<E> {

    private Node<E> head;

    public LinkedList() {
        head = null;
    }

    // TODOd: return true/false depending whether the list is empty or not
    public boolean isEmpty() {
        return head == null;
    }

    // TODOd: add a new element (with the value) in front of the list!
    public void add(E value) {
        // create a new node
        Node<E> newNode = new Node<>(value);
        // have the next reference of the new node point to the current head (node)
        newNode.setNext(head);
        // update the head, have it point to the new node
        head = newNode;
    }

    // TODO: add a new element (with the value) at the end of the list!
    public void append(E value) {
        // create a new node
        Node<E> newNode = new Node<>(value);
        // deal with the special case (list is empty)
        if (isEmpty())
            head = newNode;
            // all the other cases
        else {
            // find the tail's reference
            Node<E> current = head;
            while (current.getNext() != null)
                current = current.getNext();
            // have the tail node next point to the new node
            current.setNext(newNode);
        }
    }

    @Override
    public String toString() {
        String out = "";
        // using a for loop
//        for (Node current = head; current != null; current = current.getNext())
//            out += current + " ";
        Node<E> current = head;
        while (current != null) {
            out += current + " ";
            current = current.getNext();
        }
        // optional (get rid of the last space)
        out = out.trim();
        return out;
    }

    // TODOd: do it!
    public int size() {
        int count = 0;
        Node<E> current = head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    // TODO: return the element at index location
    public E get(int index) {
        if (index < 0)
            throw new ArrayIndexOutOfBoundsException();
        Node<E> current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index) {
            current = current.getNext();
            currentIndex++;
        }
        if (current == null)
            throw new ArrayIndexOutOfBoundsException();
        return current.getValue();
    }

    // TODO: sets value to location at index
    public void set(int index, E value) {

    }

    // TODO: inserts value at the given index location
    // throw an exception if index is invalid
    public void insert(int index, E value) {
        if (index < 0)
            throw new ArrayIndexOutOfBoundsException();
        if (index == 0) {
            if (isEmpty())
                throw new ArrayIndexOutOfBoundsException();
            else
                add(value);
        }
        else {
            Node<E> current = head;
            int currentIndex = 0;
            while (current != null && currentIndex < index - 1) {
                current = current.getNext();
                currentIndex++;
            }
            if (current == null || current.getNext() == null)
                throw new ArrayIndexOutOfBoundsException();
            Node<E> newNode = new Node<>(value);
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
    }

    // TODO: removes the element at the given index location
    // throw an exception if index is invalid
    public void remove(int index) {
        if (index < 0)
            throw new ArrayIndexOutOfBoundsException();
        // removing the head
        if (index == 0) {
            // if there is no head -> throw an exception
            if (head == null)
                throw new ArrayIndexOutOfBoundsException();
            // there is a head, so remove it!
            Node<E> temp = head;
            head = head.getNext();
            temp.setNext(null); // gb optimization
        }
        // not removing the head
        else {
            Node<E> current = head;
            int currentIndex = 0;
            while (current != null && currentIndex < index - 1) {
                current = current.getNext();
                currentIndex++;
            }
            if (current == null || current.getNext() == null)
                throw new ArrayIndexOutOfBoundsException();
            Node<E> temp = current.getNext();
            current.setNext(current.getNext().getNext());
            temp.setNext(null);
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            Node<E> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                if (current != null) {
                    E value = current.getValue();
                    current = current.getNext();
                    return value;
                }
                return null;
            }
        };
    }
}