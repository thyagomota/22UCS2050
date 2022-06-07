/*
 * CS 2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 04 - Fraction
 */

public class Fraction {

    // instance variables
    private int numerator;
    private int denominator;

    // class variable
    private static final int DEFAULT_VALUE = 1;

    // TODO: implement the parameter-less constructor
    Fraction() {

    }

    // TODO: implement the parametrized constructor with one parameter
    Fraction(int numerator) {

    }

    // TODO: implement the parametrized constructor with two parameters
    Fraction(int numerator, int denominator) {

    }

    // TODO: implement getNumerator
    int getNumerator() {
        return DEFAULT_VALUE;
    }

    // TODO: implement getDenominator
    int getDenominator() {
        return DEFAULT_VALUE;
    }

    // TODO: implement setNumerator
    void setNumerator(int numerator) {

    }

    // TODO: implement setDenominator (do not to allow having the denominator set to zero)
    void setDenominator(int denominator) {

    }

    // TODO: implement getValue
    double getValue() {
        return DEFAULT_VALUE;
    }

    // TODO: correct the error in the code
    int gcd() {
        int a = Math.abs(this.numerator);
        int b = Math.abs(this.denominator);
        while (b != 0) {
            a = b;
            b = a;
        }
        return a;
    }

    // nothing to do here (code is given to you, enjoy)
    void simplify() {
        int gcd = this.gcd();
        this.numerator /= gcd;
        this.denominator /= gcd;
        if (numerator == 0)
            denominator = 1;
        else if ((this.numerator > 0 && this.denominator < 0) || (this.numerator < 0 && this.denominator < 0)) {
            this.numerator *= -1;
            this.denominator *= -1;
        }
    }

    // TODO: implement isNegative
    public boolean isNegative() {
        return false;
    }

    // TODO: implement isProper
    public boolean isProper() {
        return false;
    }

    // nothing to do here (code is given to you, enjoy)
    @Override
    public String toString() {
        String str = "";
        if (this.numerator == 0)
            str += this.numerator;
        else
        if (this.isProper())
            str += this.numerator + "/" + this.denominator;
        else {
            int whole = this.numerator / this.denominator;
            str += whole;
            if (this.numerator % this.denominator != 0)
                str += " " + (this.numerator - whole * this.denominator) + "/" + this.denominator;
        }
        return str;
    }
}