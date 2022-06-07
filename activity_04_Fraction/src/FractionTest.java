/*
 * CS 2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 04 - FractionTest
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

    private static double PRECISION = 0.001;

    @Test
    void testZeroOverOne() {
        // case 1
        Fraction f1 = new Fraction(0);
        assertEquals(0, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        assertEquals(0, f1.getValue(), PRECISION);
        assertEquals(1, f1.gcd());
        f1.simplify();
        assertEquals(0, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        assertFalse(f1.isNegative());
        assertTrue(f1.isProper());
        f1.setNumerator(0);
        assertEquals(0, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        f1.setNumerator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        f1.setDenominator(0);
        assertEquals(5, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        f1.setDenominator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(5, f1.getDenominator());
        // case 2
        Fraction f2 = new Fraction(0, 1);
        assertEquals(0, f2.getNumerator());
        assertEquals(1, f2.getDenominator());
        assertEquals(0, f2.getValue(), PRECISION);
        assertEquals(1, f2.gcd());
        f2.simplify();
        assertEquals(0, f2.getNumerator());
        assertEquals(1, f2.getDenominator());
        assertFalse(f2.isNegative());
        assertTrue(f2.isProper());
        f2.setNumerator(0);
        assertEquals(0, f2.getNumerator());
        assertEquals(1, f2.getDenominator());
        f2.setNumerator(5);
        assertEquals(5, f2.getNumerator());
        assertEquals(1, f2.getDenominator());
        f2.setDenominator(0);
        assertEquals(5, f2.getNumerator());
        assertEquals(1, f2.getDenominator());
        f2.setDenominator(5);
        assertEquals(5, f2.getNumerator());
        assertEquals(5, f2.getDenominator());
        // case 3
        Fraction f3 = new Fraction(0, 0);
        assertEquals(0, f3.getNumerator());
        assertEquals(1, f3.getDenominator());
        assertEquals(0, f3.getValue(), PRECISION);
        assertEquals(1, f3.gcd());
        f3.simplify();
        assertEquals(0, f3.getNumerator());
        assertEquals(1, f3.getDenominator());
        assertFalse(f3.isNegative());
        assertTrue(f3.isProper());
        f3.setNumerator(0);
        assertEquals(0, f3.getNumerator());
        assertEquals(1, f3.getDenominator());
        f3.setNumerator(5);
        assertEquals(5, f3.getNumerator());
        assertEquals(1, f3.getDenominator());
        f3.setDenominator(0);
        assertEquals(5, f3.getNumerator());
        assertEquals(1, f3.getDenominator());
        f3.setDenominator(5);
        assertEquals(5, f3.getNumerator());
        assertEquals(5, f3.getDenominator());
    }

    @Test
    void testZeroOverNegativeOne() {
        // case 1
        Fraction f1 = new Fraction(0, -1);
        assertEquals(0, f1.getNumerator());
        assertEquals(-1, f1.getDenominator());
        assertEquals(0, f1.getValue(), PRECISION);
        assertEquals(1, f1.gcd());
        f1.simplify();
        assertEquals(0, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        assertFalse(f1.isNegative());
        assertTrue(f1.isProper());
        f1.setNumerator(0);
        assertEquals(0, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        f1.setNumerator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        f1.setDenominator(0);
        assertEquals(5, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        f1.setDenominator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(5, f1.getDenominator());
    }

    @Test
    void testOneOverZero() {
        // case 1
        Fraction f1 = new Fraction(1, 0);
        assertEquals(1, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        assertEquals(1, f1.getValue(), PRECISION);
        assertEquals(1, f1.gcd());
        f1.simplify();
        assertEquals(1, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        assertFalse(f1.isNegative());
        assertFalse(f1.isProper());
        f1.setNumerator(0);
        assertEquals(0, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        f1.setNumerator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        f1.setDenominator(0);
        assertEquals(5, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        f1.setDenominator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(5, f1.getDenominator());
    }


    @Test
    void testNegativeOneOverZero() {
        // case 1
        Fraction f1 = new Fraction(-1, 0);
        assertEquals(-1, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        assertEquals(-1, f1.getValue(), PRECISION);
        assertEquals(1, f1.gcd());
        f1.simplify();
        assertEquals(-1, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        assertTrue(f1.isNegative());
        assertFalse(f1.isProper());
        f1.setNumerator(0);
        assertEquals(0, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        f1.setNumerator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        f1.setDenominator(0);
        assertEquals(5, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        f1.setDenominator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(5, f1.getDenominator());
    }

    @Test
    void testOneOverOne() {
        // case 1
        Fraction f1 = new Fraction();
        assertEquals(1, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        assertEquals(1, f1.getValue(), PRECISION);
        assertEquals(1, f1.gcd());
        f1.simplify();
        assertEquals(1, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        assertFalse(f1.isNegative());
        assertFalse(f1.isProper());
        f1.setNumerator(0);
        assertEquals(0, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        f1.setNumerator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        f1.setDenominator(0);
        assertEquals(5, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        f1.setDenominator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(5, f1.getDenominator());
        // case 2
        Fraction f2 = new Fraction(1);
        assertEquals(1, f2.getNumerator());
        assertEquals(1, f2.getDenominator());
        assertEquals(1, f2.getValue(), PRECISION);
        assertEquals(1, f2.gcd());
        f2.simplify();
        assertEquals(1, f2.getNumerator());
        assertEquals(1, f2.getDenominator());
        assertFalse(f2.isNegative());
        assertFalse(f2.isProper());
        f2.setNumerator(0);
        assertEquals(0, f2.getNumerator());
        assertEquals(1, f2.getDenominator());
        f2.setNumerator(5);
        assertEquals(5, f2.getNumerator());
        assertEquals(1, f2.getDenominator());
        f2.setDenominator(0);
        assertEquals(5, f2.getNumerator());
        assertEquals(1, f2.getDenominator());
        f2.setDenominator(5);
        assertEquals(5, f2.getNumerator());
        assertEquals(5, f2.getDenominator());
        // case 3
        Fraction f3 = new Fraction(1, 1);
        assertEquals(1, f3.getNumerator());
        assertEquals(1, f3.getDenominator());
        assertEquals(1, f3.getValue(), PRECISION);
        assertEquals(1, f3.gcd());
        f3.simplify();
        assertEquals(1, f3.getNumerator());
        assertEquals(1, f3.getDenominator());
        assertFalse(f3.isNegative());
        assertFalse(f3.isProper());
        f3.setNumerator(0);
        assertEquals(0, f3.getNumerator());
        assertEquals(1, f3.getDenominator());
        f3.setNumerator(5);
        assertEquals(5, f3.getNumerator());
        assertEquals(1, f3.getDenominator());
        f3.setDenominator(0);
        assertEquals(5, f3.getNumerator());
        assertEquals(1, f3.getDenominator());
        f3.setDenominator(5);
        assertEquals(5, f3.getNumerator());
        assertEquals(5, f3.getDenominator());
    }

    @Test
    void testNegativeOneOverOne() {
        // case 1
        Fraction f1 = new Fraction(-1);
        assertEquals(-1, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        assertEquals(-1, f1.getValue(), PRECISION);
        assertEquals(1, f1.gcd());
        f1.simplify();
        assertEquals(-1, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        assertTrue(f1.isNegative());
        assertFalse(f1.isProper());
        f1.setNumerator(0);
        assertEquals(0, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        f1.setNumerator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        f1.setDenominator(0);
        assertEquals(5, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        f1.setDenominator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(5, f1.getDenominator());
        // case 2
        Fraction f2 = new Fraction(-1, 1);
        assertEquals(-1, f2.getNumerator());
        assertEquals(1, f2.getDenominator());
        assertEquals(-1, f2.getValue(), PRECISION);
        assertEquals(1, f2.gcd());
        f2.simplify();
        assertEquals(-1, f2.getNumerator());
        assertEquals(1, f2.getDenominator());
        assertTrue(f2.isNegative());
        assertFalse(f2.isProper());
        f2.setNumerator(0);
        assertEquals(0, f2.getNumerator());
        assertEquals(1, f2.getDenominator());
        f2.setNumerator(5);
        assertEquals(5, f2.getNumerator());
        assertEquals(1, f2.getDenominator());
        f2.setDenominator(0);
        assertEquals(5, f2.getNumerator());
        assertEquals(1, f2.getDenominator());
        f2.setDenominator(5);
        assertEquals(5, f2.getNumerator());
        assertEquals(5, f2.getDenominator());
    }

    @Test
    void testOneOverNegativeOne() {
        // case 1
        Fraction f1 = new Fraction(1, -1);
        assertEquals(1, f1.getNumerator());
        assertEquals(-1, f1.getDenominator());
        assertEquals(-1, f1.getValue(), PRECISION);
        assertEquals(1, f1.gcd());
        f1.simplify();
        assertEquals(-1, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        assertTrue(f1.isNegative());
        assertFalse(f1.isProper());
        f1.setNumerator(0);
        assertEquals(0, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        f1.setNumerator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        f1.setDenominator(0);
        assertEquals(5, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        f1.setDenominator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(5, f1.getDenominator());
    }

    @Test
    void testNegativeOneOverNegativeOne() {
        // case 1
        Fraction f1 = new Fraction(-1, -1);
        assertEquals(-1, f1.getNumerator());
        assertEquals(-1, f1.getDenominator());
        assertEquals(1, f1.getValue(), PRECISION);
        assertEquals(1, f1.gcd());
        f1.simplify();
        assertEquals(1, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        assertFalse(f1.isNegative());
        assertFalse(f1.isProper());
        f1.setNumerator(0);
        assertEquals(0, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        f1.setNumerator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        f1.setDenominator(0);
        assertEquals(5, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        f1.setDenominator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(5, f1.getDenominator());
    }

    @Test
    void test24Over54() {
        // case 1
        Fraction f1 = new Fraction(24, 54);
        assertEquals(24, f1.getNumerator());
        assertEquals(54, f1.getDenominator());
        assertEquals(0.444, f1.getValue(), PRECISION);
        assertEquals(6, f1.gcd());
        f1.simplify();
        assertEquals(4, f1.getNumerator());
        assertEquals(9, f1.getDenominator());
        assertFalse(f1.isNegative());
        assertTrue(f1.isProper());
        f1.setNumerator(0);
        assertEquals(0, f1.getNumerator());
        assertEquals(9, f1.getDenominator());
        f1.setNumerator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(9, f1.getDenominator());
        f1.setDenominator(0);
        assertEquals(5, f1.getNumerator());
        assertEquals(9, f1.getDenominator());
        f1.setDenominator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(5, f1.getDenominator());
    }

    @Test
    void testNegative24Over54() {
        // case 1
        Fraction f1 = new Fraction(-24, 54);
        assertEquals(-24, f1.getNumerator());
        assertEquals(54, f1.getDenominator());
        assertEquals(-0.444, f1.getValue(), PRECISION);
        assertEquals(6, f1.gcd());
        f1.simplify();
        assertEquals(-4, f1.getNumerator());
        assertEquals(9, f1.getDenominator());
        assertTrue(f1.isNegative());
        assertTrue(f1.isProper());
        f1.setNumerator(0);
        assertEquals(0, f1.getNumerator());
        assertEquals(9, f1.getDenominator());
        f1.setNumerator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(9, f1.getDenominator());
        f1.setDenominator(0);
        assertEquals(5, f1.getNumerator());
        assertEquals(9, f1.getDenominator());
        f1.setDenominator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(5, f1.getDenominator());
    }

    @Test
    void test24OverNegative54() {
        // case 1
        Fraction f1 = new Fraction(24, -54);
        assertEquals(24, f1.getNumerator());
        assertEquals(-54, f1.getDenominator());
        assertEquals(-0.444, f1.getValue(), PRECISION);
        assertEquals(6, f1.gcd());
        f1.simplify();
        assertEquals(-4, f1.getNumerator());
        assertEquals(9, f1.getDenominator());
        assertTrue(f1.isNegative());
        assertTrue(f1.isProper());
        f1.setNumerator(0);
        assertEquals(0, f1.getNumerator());
        assertEquals(9, f1.getDenominator());
        f1.setNumerator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(9, f1.getDenominator());
        f1.setDenominator(0);
        assertEquals(5, f1.getNumerator());
        assertEquals(9, f1.getDenominator());
        f1.setDenominator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(5, f1.getDenominator());
    }

    @Test
    void testNegative24OverNegative54() {
        // case 1
        Fraction f1 = new Fraction(-24, -54);
        assertEquals(-24, f1.getNumerator());
        assertEquals(-54, f1.getDenominator());
        assertEquals(0.444, f1.getValue(), PRECISION);
        assertEquals(6, f1.gcd());
        f1.simplify();
        assertEquals(4, f1.getNumerator());
        assertEquals(9, f1.getDenominator());
        assertFalse(f1.isNegative());
        assertTrue(f1.isProper());
        f1.setNumerator(0);
        assertEquals(0, f1.getNumerator());
        assertEquals(9, f1.getDenominator());
        f1.setNumerator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(9, f1.getDenominator());
        f1.setDenominator(0);
        assertEquals(5, f1.getNumerator());
        assertEquals(9, f1.getDenominator());
        f1.setDenominator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(5, f1.getDenominator());
    }

    @Test
    void test54Over24() {
        // case 1
        Fraction f1 = new Fraction(54, 24);
        assertEquals(54, f1.getNumerator());
        assertEquals(24, f1.getDenominator());
        assertEquals(2.25, f1.getValue(), PRECISION);
        assertEquals(6, f1.gcd());
        f1.simplify();
        assertEquals(9, f1.getNumerator());
        assertEquals(4, f1.getDenominator());
        assertFalse(f1.isNegative());
        assertFalse(f1.isProper());
        f1.setNumerator(0);
        assertEquals(0, f1.getNumerator());
        assertEquals(4, f1.getDenominator());
        f1.setNumerator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(4, f1.getDenominator());
        f1.setDenominator(0);
        assertEquals(5, f1.getNumerator());
        assertEquals(4, f1.getDenominator());
        f1.setDenominator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(5, f1.getDenominator());
    }

    @Test
    void testNegative54Over24() {
        // case 1
        Fraction f1 = new Fraction(-54, 24);
        assertEquals(-54, f1.getNumerator());
        assertEquals(24, f1.getDenominator());
        assertEquals(-2.25, f1.getValue(), PRECISION);
        assertEquals(6, f1.gcd());
        f1.simplify();
        assertEquals(-9, f1.getNumerator());
        assertEquals(4, f1.getDenominator());
        assertTrue(f1.isNegative());
        assertFalse(f1.isProper());
        f1.setNumerator(0);
        assertEquals(0, f1.getNumerator());
        assertEquals(4, f1.getDenominator());
        f1.setNumerator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(4, f1.getDenominator());
        f1.setDenominator(0);
        assertEquals(5, f1.getNumerator());
        assertEquals(4, f1.getDenominator());
        f1.setDenominator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(5, f1.getDenominator());
    }

    @Test
    void test54OverNegative24() {
        // case 1
        Fraction f1 = new Fraction(54, -24);
        assertEquals(54, f1.getNumerator());
        assertEquals(-24, f1.getDenominator());
        assertEquals(-2.25, f1.getValue(), PRECISION);
        assertEquals(6, f1.gcd());
        f1.simplify();
        assertEquals(-9, f1.getNumerator());
        assertEquals(4, f1.getDenominator());
        assertTrue(f1.isNegative());
        assertFalse(f1.isProper());
        f1.setNumerator(0);
        assertEquals(0, f1.getNumerator());
        assertEquals(4, f1.getDenominator());
        f1.setNumerator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(4, f1.getDenominator());
        f1.setDenominator(0);
        assertEquals(5, f1.getNumerator());
        assertEquals(4, f1.getDenominator());
        f1.setDenominator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(5, f1.getDenominator());
    }

    @Test
    void testNegative54OverNegative24() {
        // case 1
        Fraction f1 = new Fraction(-54, -24);
        assertEquals(-54, f1.getNumerator());
        assertEquals(-24, f1.getDenominator());
        assertEquals(2.25, f1.getValue(), PRECISION);
        assertEquals(6, f1.gcd());
        f1.simplify();
        assertEquals(9, f1.getNumerator());
        assertEquals(4, f1.getDenominator());
        assertFalse(f1.isNegative());
        assertFalse(f1.isProper());
        f1.setNumerator(0);
        assertEquals(0, f1.getNumerator());
        assertEquals(4, f1.getDenominator());
        f1.setNumerator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(4, f1.getDenominator());
        f1.setDenominator(0);
        assertEquals(5, f1.getNumerator());
        assertEquals(4, f1.getDenominator());
        f1.setDenominator(5);
        assertEquals(5, f1.getNumerator());
        assertEquals(5, f1.getDenominator());
    }
}