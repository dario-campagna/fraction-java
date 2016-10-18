package it.esteco.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReduceFractionTest {

    @Test
    public void reduceToInteger() throws Exception {
        assertEquals(new Fraction(1), new Fraction(2, 2));
        assertEquals(new Fraction(2), new Fraction(4, 2));
        assertEquals(new Fraction(-3), new Fraction(-9, 3));
        assertEquals(new Fraction(-4), new Fraction(16, -4));
        assertEquals(new Fraction(1), new Fraction(-3, -3));
    }

    @Test
    public void reduceToLowestTerms() throws Exception {
        assertEquals(new Fraction(3, 2), new Fraction(6, 4));
    }

    @Test
    public void reduceWhenNegative() throws Exception {
        assertEquals(new Fraction(-1, 2), new Fraction(4, -8));
        assertEquals(new Fraction(1, 7), new Fraction(-2, -14));
    }
}
