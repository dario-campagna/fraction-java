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
}
