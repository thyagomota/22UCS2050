/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Homework 04 - LinkedList
 */

public class LinkedList {

    private Node head;

    public LinkedList() {
        head = null;
    }

    // TODOd: return true/false depending whether the list is empty or not
    public boolean isEmpty() {
        return head == null;
    }

    // TODOd: add a new element (with the value) in front of the list!
    public void add(int value) {
        // create a new node
        Node newNode = new Node(value);
        // have the next reference of the new node point to the current head (node)
        newNode.setNext(head);
        // update the head, have it point to the new node
        head = newNode;
    }

    // TODO: add a new element (with the value) at the end of the list!
    public void append(int value) {
        // create a new node
        Node newNode = new Node(value);
        // deal with the special case (list is empty)
        if (isEmpty())
            head = newNode;
        // all the other cases
        else {
            // find the tail's reference
            Node current = head;
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
        Node current = head;
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
        Node current = head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    // TODOd: return the element at index location
    public int get(int index) {
        if (index < 0)
            throw new ArrayIndexOutOfBoundsException();
        Node current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index) {
            current = current.getNext();
            currentIndex++;
        }
        if (current == null)
            throw new ArrayIndexOutOfBoundsException();
        return current.getValue();
    }

    // TODOd: inserts value at the given index location
    // throw an exception if index is invalid
    public void insert(int index, int value) {
        if (index < 0)
            throw new ArrayIndexOutOfBoundsException();
        if (index == 0)
            add(value);
        else {
            Node current = head;
            int currentIndex = 0;
            while (current != null && currentIndex < index - 1) {
                current = current.getNext();
                currentIndex++;
            }
            if (current == null)
                throw new ArrayIndexOutOfBoundsException();
            Node newNode = new Node(value);
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
    }

    // TODO: removes the element at the given index location
    // throw an exception if index is invalid
    public void remove(int index) {
        
    }

}
