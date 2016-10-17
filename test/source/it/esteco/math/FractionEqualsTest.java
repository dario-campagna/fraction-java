package it.esteco.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionEqualsTest {

    @Test
    public void zero() throws Exception {
        assertEquals(new Fraction(0), new Fraction(0));
    }

    @Test
    public void fraction() throws Exception {
        assertEquals(new Fraction(1, 2), new Fraction(1, 2));
    }

    @Test
    public void trivialDenominator() throws Exception {
        assertEquals(new Fraction(3), new Fraction(3, 1));
    }

    @Test
    public void negativeDenominator() throws Exception {
        assertEquals(new Fraction(-1, 2), new Fraction(1, -2));
    }

    @Test
    public void negativeEverywhere() throws Exception {
        assertEquals(new Fraction(1, 4), new Fraction(-1, -4));
    }
}
