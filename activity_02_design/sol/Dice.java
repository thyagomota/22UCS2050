/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 02 - Dice
 */

import java.util.Random;

public class Dice {

    private int sides;
    private int value;
    static final int MIN_SIDES     = 2;
    static final int INITIAL_VALUE = 1;
    static final int DEFAULT_SIDES = 6;

    public Dice(int sides) {
        if (sides < MIN_SIDES)
            this.sides = MIN_SIDES;
        else
            this.sides = sides;
        value = INITIAL_VALUE;
    }

    public Dice() {
        this(DEFAULT_SIDES); // calling the parameterized constructor
    }

    public int getValue() {
        return value;
    }

    public void roll() {
        value = new Random().nextInt(sides) + 1;
    }
}
