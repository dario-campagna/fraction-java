package it.esteco.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReciprocalFractionTest {

    @Test
    public void reciprocalOfNonZeroInteger() throws Exception {
        assertEquals(new Fraction(1, 5), new Fraction(5).reciprocalOf());
    }

    @Test
    public void reciprocalOfFraction() throws Exception {
        assertEquals(new Fraction(2), new Fraction(1, 2).reciprocalOf());
        assertEquals(new Fraction(-4, 3), new Fraction(-3, 4).reciprocalOf());
    }

    @Test(expected = ArithmeticException.class)
    public void reciprocalOfZero() throws Exception {
        new Fraction(0).reciprocalOf();
    }
}
