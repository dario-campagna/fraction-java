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
    public void multiplyNonZeroByOne() throws Exception {
        assertEquals(new Fraction(-4), new Fraction(-4).times(new Fraction(1)));
        assertEquals(new Fraction(6, 5), new Fraction(6, 5).times(new Fraction(1)));
    }

    @Test
    public void multiplyOneByNonZero() throws Exception {
        assertEquals(new Fraction(5), new Fraction(1).times(new Fraction(5)));
        assertEquals(new Fraction(1, 4), new Fraction(1).times(new Fraction(1, 4)));
    }

    @Test
    public void multiplyFractionsNoReduction() throws Exception {
        assertEquals(new Fraction(1, 40), new Fraction(1, 5).times(new Fraction(1, 8)));
        assertEquals(new Fraction(3, 20), new Fraction(3, 5).times(new Fraction(1, 4)));
    }

    @Test
    public void multiplyFractionsWithReduction() throws Exception {
        assertEquals(new Fraction(7, 12), new Fraction(2, 3).times(new Fraction(7, 8)));
    }
}
