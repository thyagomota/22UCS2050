/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 09 - ArrayStack
 */

public class ArrayStack<E> {

    private E data[];
    private int size;

    private static final int INITIAL_CAPACITY = 5;
    private static final int MIN_CAPACITY = 1;

    public ArrayStack() {
        data = (E[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public ArrayStack(int capacity) {
        if (capacity < MIN_CAPACITY)
            data = (E[]) new Object[MIN_CAPACITY];
        else
            data = (E[]) new Object[capacity];
        size = 0;
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
            for (int i = 0; i < size; i++)
                newData[i] = data[i];
            data = newData;
        }
        data[size++] = value;
    }

    public E pop() {
        if (isEmpty())
            return null;
        return data[--size];
    }

    @Override
    public String toString() {
        String out = "[top] ";
        for (int i = size - 1; i >= 0; i--)
            out += data[i] + " ";
        out = out.trim() + " [bottom]";
        return out;
    }
}
