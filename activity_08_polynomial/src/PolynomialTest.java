/*
 * CS 2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 08 - PolynomialTest
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolynomialTest {

    @Test
        // p1 = 0
        // add 3x^4 to p1
    void testA() {
        Polynomial p1 = new Polynomial();
        Term t4 = new Term(3, 4);
        p1.addTerm(t4);
        assertEquals(1, p1.size());
        assertEquals(4, p1.degree());
        assertEquals(t4, p1.getTerm(4));
    }

    @Test
        // p1 = 3x^4
        // add -2x^2 to p1
    void testB() {
        Polynomial p1 = new Polynomial();
        Term t4 = new Term(3, 4);
        p1.addTerm(t4);
        Term t2 = new Term(-2, 2);
        p1.addTerm(t2);
        assertEquals(2, p1.size());
        assertEquals(4, p1.degree());
        assertEquals(t4, p1.getTerm(4));
        assertEquals(t2, p1.getTerm(2));
    }


    @Test
        // p1 = 3x^4 - 2x^2
        // add 8x^3 to p1
    void testC() {
        Polynomial p1 = new Polynomial();
        Term t4 = new Term(3, 4);
        p1.addTerm(t4);
        Term t2 = new Term(-2, 2);
        p1.addTerm(t2);
        Term t3 = new Term(8, 3);
        p1.addTerm(t3);
        assertEquals(3, p1.size());
        assertEquals(4, p1.degree());
        assertEquals(t4, p1.getTerm(4));
        assertEquals(t3, p1.getTerm(3));
        assertEquals(t2, p1.getTerm(2));
    }

    @Test
        // p1 = 3x^4 + 8x^3 - 2x^2
        // add 7.5x^6 to p1
    void testD() {
        Polynomial p1 = new Polynomial();
        Term t4 = new Term(3, 4);
        p1.addTerm(t4);
        Term t2 = new Term(-2, 2);
        p1.addTerm(t2);
        Term t3 = new Term(8, 3);
        p1.addTerm(t3);
        Term t6 = new Term(7.5, 6);
        p1.addTerm(t6);
        assertEquals(4, p1.size());
        assertEquals(6, p1.degree());
        assertEquals(t6, p1.getTerm(6));
        assertEquals(t4, p1.getTerm(4));
        assertEquals(t3, p1.getTerm(3));
        assertEquals(t2, p1.getTerm(2));
    }

    @Test
        // p1 = 7.5x^6 + 3x^4 + 8x^3 - 2x^2
        // add 3.2 to p1
    void testE() {
        Polynomial p1 = new Polynomial();
        Term t4 = new Term(3, 4);
        p1.addTerm(t4);
        Term t2 = new Term(-2, 2);
        p1.addTerm(t2);
        Term t3 = new Term(8, 3);
        p1.addTerm(t3);
        Term t6 = new Term(7.5, 6);
        p1.addTerm(t6);
        Term t0 = new Term(3.2);
        p1.addTerm(t0);
        assertEquals(5, p1.size());
        assertEquals(6, p1.degree());
        assertEquals(t6, p1.getTerm(6));
        assertEquals(t4, p1.getTerm(4));
        assertEquals(t3, p1.getTerm(3));
        assertEquals(t2, p1.getTerm(2));
        assertEquals(t0, p1.getTerm(0));
    }

    @Test
        // p1 = 7.5x^6 + 3x^4 + 8x^3 - 2x^2 + 3.2
        // add -2x^4 to p1
    void testF() {
        Polynomial p1 = new Polynomial();
        Term t4 = new Term(3, 4);
        p1.addTerm(t4);
        Term t2 = new Term(-2, 2);
        p1.addTerm(t2);
        Term t3 = new Term(8, 3);
        p1.addTerm(t3);
        Term t6 = new Term(7.5, 6);
        p1.addTerm(t6);
        Term t0 = new Term(3.2);
        p1.addTerm(t0);
        p1.addTerm(new Term(-2, 4));
        assertEquals(5, p1.size());
        assertEquals(6, p1.degree());
        assertEquals(t6, p1.getTerm(6));
        assertEquals(new Term(1, 4), p1.getTerm(4));
        assertEquals(t3, p1.getTerm(3));
        assertEquals(t2, p1.getTerm(2));
        assertEquals(t0, p1.getTerm(0));
    }

    @Test
        // p1 = 7.5x^6 + 3x^4 + 8x^3 - 2x^2 + 3.2
        // p2 = 4x^5 - 2x^4 + 7x
        // p1 += p2, resulting in 7.5x^6 + 4x^5 + x^4 + 8x^3 - 2x^2 + 7x + 3.2
    void testG() {
        Polynomial p1 = new Polynomial();
        Term t4 = new Term(3, 4);
        p1.addTerm(t4);
        Term t2 = new Term(-2, 2);
        p1.addTerm(t2);
        Term t3 = new Term(8, 3);
        p1.addTerm(t3);
        Term t6 = new Term(7.5, 6);
        p1.addTerm(t6);
        Term t0 = new Term(3.2);
        p1.addTerm(t0);
        Polynomial p2 = new Polynomial();
        p2.addTerm(new Term(4, 5));
        p2.addTerm(new Term(-2, 4));
        p2.addTerm(new Term(7, 1));
        p1.add(p2);
        assertEquals(7, p1.size());
        assertEquals(6, p1.degree());
        assertEquals(new Term(7.5, 6), p1.getTerm(6));
        assertEquals(new Term(4, 5), p1.getTerm(5));
        assertEquals(new Term(1, 4), p1.getTerm(4));
        assertEquals(new Term(8, 3), p1.getTerm(3));
        assertEquals(new Term(-2, 2), p1.getTerm(2));
        assertEquals(new Term(7, 1), p1.getTerm(1));
        assertEquals(new Term(3.2, 0), p1.getTerm(0));
    }
}