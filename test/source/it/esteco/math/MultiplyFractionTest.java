package it.esteco.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyFractionTest {

    @Test
    public void multiplyByZero() throws Exception {
        assertEquals(new Fraction(0), new Fraction(0).times(new Fraction(0)));
        assertEquals(new Fraction(0), new Fraction(1).times(new Fraction(0)));
        assertEquals(new Fraction(0), new Fraction(0).times(new Fraction(3)));
    }
}
