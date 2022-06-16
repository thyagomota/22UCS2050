/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 06 - ArrayList
 */

public class ArrayList<E> {

    private E data[];
    private int size;
    private static final int INITIAL_CAPACITY = 5;
    private static final int MIN_CAPACITY = 1;

    // TODOd: define a constructor that creates an array list with an initial capacity of INITIAL_CAPACITY
    public ArrayList() {
        data = (E[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    // TODOd: define a constructor that creates an array list with an initial capacity defined by the user
    public ArrayList(int capacity) {
        if (capacity < MIN_CAPACITY)
            data = (E[]) new Object[MIN_CAPACITY];
        else
            data = (E[]) new Object[capacity];
        size = 0;
    }

    // TODOd: return true/false depending whether the list is empty or not
    public boolean isEmpty() {
        return size == 0;
    }

    // TODOd: return true/false depending whether the list is at capacity or not
    public boolean isFull() {
        return size == data.length;
    }

    // TODO: add a new element (with the value) in front of the list!
    // if list is full, increase the capacity of the array by INITIAL_CAPACITY before adding
    public void add(E value) {
        if (isFull()) {
            E newData[] = (E[]) new Object[data.length + INITIAL_CAPACITY];
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

    // TODO: add a new element (with the value) at the end of the list!
    // if list is full, increase the capacity of the array by INITIAL_CAPACITY before appending
    public void append(E value) {
        if (isFull()) {
            E newData[] = (E[]) new Object[data.length + INITIAL_CAPACITY];
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

    // returns the # of elements -> assigned as homework!
    public int size() {
        return size;
    }

    // TODOd: return the element at index location
    public E get(int index) {
        if (index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();
        return data[index];
    }

    // TODO: sets value to location at index
    public void set(int index, E value) {

    }

    // TODO: inserts value at the given index location
    // throw an exception if index is invalid
    public void insert(int index, E value) {
        if (index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();
        if (isFull()) {
            E newData[] = (E[]) new Object[data.length + INITIAL_CAPACITY];
            for (int i = size; i > index; i--)
                newData[i] = data[i-1];
            data = newData;
        }
        else
            for (int i = size; i > index; i--)
                data[i] = data[i-1];
        data[index] = value;
        size++;
    }

    /*
        5 0 2 7 8 3
index = 0 1 2 3 4 5

      array.remove(2)

        5 0 7 8 3 3 _ _ _ _
index = 0 1 2 3 4
i = 5 until 5
size = 5
     */
    // TODO: removes the element at the given index location
    // throw an exception if index is invalid
    public void remove(int index) {
        if (index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();
        for (int i = index; i < size - 1; i++)
            data[i] = data[i+1];
        size--;
    }
}
