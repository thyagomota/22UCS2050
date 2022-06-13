/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 06 - ArrayList
 */

public class ArrayList {

    private int data[];
    private int size;
    private static final int INITIAL_CAPACITY = 5;
    private static final int MIN_CAPACITY = 1;

    // TODOd: define a constructor that creates an array list with an initial capacity of INITIAL_CAPACITY
    public ArrayList() {
        data = new int[INITIAL_CAPACITY];
        size = 0;
    }

    // TODOd: define a constructor that creates an array list with an initial capacity defined by the user
    public ArrayList(int capacity) {
        if (capacity < MIN_CAPACITY)
            data = new int[MIN_CAPACITY];
        else
            data = new int[capacity];
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

    // TODO: add a new element (with the value) at the end of the list!
    // if list is full, increase the capacity of the array by INITIAL_CAPACITY before appending
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

    // returns the # of elements -> assigned as homework!
    public int size() {
        return size;
    }

    // TODOd: return the element at index location
    public int get(int index) {
        if (index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();
        return data[index];
    }

    // TODO: inserts value at the given index location
    // throw an exception if index is invalid
    public void insert(int index, int value) {

    }

    // TODO: removes the element at the given index location
    // throw an exception if index is invalid
    public void remove(int index) {

    }
}
