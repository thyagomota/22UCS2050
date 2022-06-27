/*
 * CS 2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 08 - Polynomial
 */

public class Polynomial {

    private Term firstTerm;

    public Polynomial() {
        firstTerm = null;
    }

    // TODOd: return the maximum exponent value of the polynomial
    public int degree() {
        if (firstTerm == null)
            return 0;
        return firstTerm.getExponent();
    }

    // TODOd: return the number of terms of the polynomial
    public int size() {
        int count = 0;
        Term current = firstTerm;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    // TODO: add the given term to the polynomial (see activity instructions for more detailed information)
    void addTerm(final Term term) {

    }

    // TODO: add the terms of the given polynomial to the callee polynomial; hint: traverse the given
    //  polynomial and call addTerm to add each of its terms to the callee polynomial
    void add(final Polynomial other) {

    }

    // TODO: traverse the callee polynomial and call toString from each of its terms to generate
    //  a string representation of the polynomial; use the following examples to figure it out the
    //  format to use:
    //  8x^3 -2x^2 + 7x + 3.2
    @Override
    public String toString() {
        return "";
    }

    // TODO: return the term with the given exponent; null if the term does not exist
    Term getTerm(int exponent) {

        return null;
    }
}
