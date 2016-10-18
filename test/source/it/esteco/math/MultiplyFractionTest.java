package it.esteco.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyFractionTest {

    @Test
    public void multiplyByZero() throws Exception {
        assertEquals(new Fraction(0), new Fraction(0).times(new Fraction(0)));
        assertEquals(new Fraction(0), new Fraction(1).times(new Fraction(0)));
        assertEquals(new Fraction(0), new Fraction(0).times(new Fraction(3, 7)));
    }

    @Test
    public void multiplyFractionByOne() throws Exception {
        assertEquals(new Fraction(-4), new Fraction(-4).times(new Fraction(1)));
        assertEquals(new Fraction(6, 5), new Fraction(6, 5).times(new Fraction(1)));
    }

}
