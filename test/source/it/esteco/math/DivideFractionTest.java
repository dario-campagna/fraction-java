package it.esteco.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivideFractionTest {

    @Test
    public void ZeroDividedByNonZero() throws Exception {
        assertEquals(new Fraction(0), new Fraction(0).dividedBy(new Fraction(3)));
    }

    @Test
    public void divisionByOne() throws Exception {
        assertEquals(new Fraction(4), new Fraction(4).dividedBy(new Fraction(1)));
        assertEquals(new Fraction(1, 14), new Fraction(1, 14).dividedBy(new Fraction(1)));
    }

    @Test
    public void divideNonZeroIntegerByNonTrivialNonZeroIntegers() throws Exception {
        assertEquals(new Fraction(1, 4), new Fraction(1).dividedBy(new Fraction(4)));
        assertEquals(new Fraction(-2, 5), new Fraction(-2).dividedBy(new Fraction(5)));
        assertEquals(new Fraction(-1, 3), new Fraction(3).dividedBy(new Fraction(-9)));
        assertEquals(new Fraction(1, 2), new Fraction(-6).dividedBy(new Fraction(-12)));
    }

    @Test
    public void divideFractions() throws Exception {
        assertEquals(new Fraction(2), new Fraction(1, 2).dividedBy(new Fraction(1, 4)));
        assertEquals(new Fraction(1, 4), new Fraction(1, 2).dividedBy(new Fraction(2)));
        assertEquals(new Fraction(9), new Fraction(3).dividedBy(new Fraction(1, 3)));
        assertEquals(new Fraction(-12), new Fraction(-3).dividedBy(new Fraction(1, 4)));
        assertEquals(new Fraction(-3, 80), new Fraction(-1, 5).dividedBy(new Fraction(16, 3)));
        assertEquals(new Fraction(11, 49), new Fraction(-1, 7).dividedBy(new Fraction(7, -11)));
    }
}
