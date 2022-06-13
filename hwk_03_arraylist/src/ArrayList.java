/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Homework 03 - ArrayList
 */

public class ArrayList {

    private int data[];
    private int size;
    private static final int INITIAL_CAPACITY = 5;
    private static final int MIN_CAPACITY = 1;

    public ArrayList() {
        data = new int[INITIAL_CAPACITY];
        size = 0;
    }

    public ArrayList(int capacity) {
        if (capacity < MIN_CAPACITY)
            data = new int[MIN_CAPACITY];
        else
            data = new int[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public void add(int value) {
        if (isFull()) {
            int newData[] = new int[data.length + INITIAL_CAPACITY];
            for (int i = size; i > 0; i--)
                newData[i] = data[i-1];
            data = newData;
        }
        else
            for (int i = size; i > 0; i--)
                data[i] = data[i-1];
        data[0] = value;
        size++;
    }

    public void append(int value) {
        if (isFull()) {
            int newData[] = new int[data.length + INITIAL_CAPACITY];
            for (int i = 0; i < size; i++)
                newData[i] = data[i];
            data = newData;
        }
        data[size++] = value;
    }

    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i < size; i++)
            out += data[i] + " ";
        // optional (get rid of the last space)
        out = out.trim();
        return out;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        if (index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();
        return data[index];
    }

    // TODO: append the elements of the given array list to the (current) list
    public void copy(ArrayList source) {

    }

    public static void main(String[] args) {

        // TODO: create an array list called "current"; add 3 integers; display the list

        // TODO: create a second array list called "source"; add 5 integers; display the list

        // TODO: use the ArrayList's copy method to copy the elements from "source" to "current"; display "current"

    }
}
