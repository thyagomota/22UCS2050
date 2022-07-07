/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Homework 05 - Customer
 */

public class Customer implements HasPriority {

    private String name;
    private int    priority;

    private static final int SMALLER_PRIORITY = 0;

    public Customer(String name, int priority) {
        this.name = name;
        if (priority < SMALLER_PRIORITY)
            this.priority = SMALLER_PRIORITY;
        else
            this.priority = priority;
    }

    public Customer(String name) {
        this(name, SMALLER_PRIORITY);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "{" + name + "," + priority + "}";
    }

    @Override
    public boolean equals(Object obj) {
        Customer other = (Customer) obj;
        return name.equals(((Customer) obj).name) && priority == other.priority;
    }
}
