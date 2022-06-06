/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 02 - Account
 */

public class Account {

    private int     number;
    private String  name;
    private double  balance;
    static final int DEFAULT_NUMBER = 1;

    public Account(int number, String name) {
        if (number <= 0)
            this.number = DEFAULT_NUMBER;
        else
            this.number = number;
        this.name = name;
        balance = 0;
    }

    public boolean deposit(double amount) {
        if (amount <= 0)
            return false;
        balance += amount; // balance = balance + amount
        return true;
    }

    public boolean withdraw(double amount) {
        if (balance - amount < 0 || amount <= 0)
            return false;
        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
