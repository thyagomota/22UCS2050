/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 11 - ArrayQueue
 */

public class ArrayQueue<E> {

    private E data[];
    private int size;
    private int front;

    private static final int INITIAL_CAPACITY = 5;
    private static final int MIN_CAPACITY = 1;

    public ArrayQueue() {
        data = (E[]) new Object[INITIAL_CAPACITY];
        size = 0;
        front = 0;
    }

    public ArrayQueue(int capacity) {
        if (capacity < MIN_CAPACITY)
            data = (E[]) new Object[MIN_CAPACITY];
        else
            data = (E[]) new Object[capacity];
        size = 0;
        front = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public void push(final E value) {
        if (isFull()) {
            E newData[] = (E[]) new Object[data.length + INITIAL_CAPACITY];
            int current = front;
            for (int i=0, j=0; i < size; i++, j++) {
                newData[j] = data[current];
                current = (current + 1) % data.length;
            }
            front = 0;
            data = newData;
        }
        int rear = (front + size) % data.length;
        data[rear] = value;
        size++;
    }

    public E pop() {
        if (isEmpty())
            return null;
        E value = data[front];
        front = (front + 1) % data.length;
        size--;
        return value;
    }

    @Override
    public String toString() {
        String out = "[front] ";
        int current = front;
        for (int i = 0; i < size; i++) {
            out += data[current] + " ";
            current = (current + 1) % data.length;
        }
        out = out.trim() + " [rear]";
        return out;
    }
}
