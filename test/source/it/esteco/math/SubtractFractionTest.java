package it.esteco.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractFractionTest {

    @Test
    public void zeroMinusZero() throws Exception {
        assertEquals(new Fraction(0), new Fraction(0).minus(new Fraction(0)));
    }

    @Test
    public void nonZeroMinusZero() throws Exception {
        assertEquals(new Fraction(15), new Fraction(15).minus(new Fraction(0)));
    }

    @Test
    public void zeroMinusNonZero() throws Exception {
        assertEquals(new Fraction(-1), new Fraction(0).minus(new Fraction(1)));
        assertEquals(new Fraction(2), new Fraction(0).minus(new Fraction(-2)));
    }

    @Test
    public void subtractNonZeroPositiveIntegers() throws Exception {
        assertEquals(new Fraction(3), new Fraction(4).minus(new Fraction(1)));
    }
}
