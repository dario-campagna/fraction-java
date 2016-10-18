package it.esteco.math;

import it.esteco.math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddFractionTest {

    @Test
    public void zeroPlusZero() throws Exception {
        assertEquals(new Fraction(0), new Fraction(0).plus(new Fraction(0)));
    }

    @Test
    public void nonZeroPlusZero() throws Exception {
        assertEquals(new Fraction(7), new Fraction(7).plus(new Fraction(0)));
    }

    @Test
    public void zeroPlusNonZero() throws Exception {
        assertEquals(new Fraction(11), new Fraction(0).plus(new Fraction(11)));
    }

    @Test
    public void nonNegativeNonZeroOperands() throws Exception {
        assertEquals(new Fraction(13), new Fraction(4).plus(new Fraction(9)));
    }

    @Test
    public void negativePlusPositiveNonZero() throws Exception {
        assertEquals(new Fraction(1), new Fraction(-2).plus(new Fraction(3)));
    }

    @Test
    public void positiveNonZeroPlusNegative() throws Exception {
        assertEquals(new Fraction(4), new Fraction(5).plus(new Fraction(-1)));
    }

    @Test
    public void negativeInputsAndNegativeOutputs() throws Exception {
        assertEquals(new Fraction(-14), new Fraction(-6).plus(new Fraction(-8)));
    }

    @Test
    public void sameDenominators() throws Exception {
        assertEquals(new Fraction(5, 3), new Fraction(1, 3).plus(new Fraction(4, 3)));
        assertEquals(new Fraction(4, 3), new Fraction(-1, 3).plus(new Fraction(5, 3)));
    }

    @Test
    public void differentDenominators() throws Exception {
        assertEquals(new Fraction(7, 12), new Fraction(1, 3).plus(new Fraction(1, 4)));
    }

    @Test
    public void integerPlusFraction() throws Exception {
        assertEquals(new Fraction(9, 4), new Fraction(2).plus(new Fraction(1, 4)));
    }

    @Test
    public void negativesEverywhere() throws Exception {
        assertEquals(new Fraction(5, 63), new Fraction(1, -7).plus(new Fraction(-2, -9)));
    }

    @Test
    public void sameDenominatorsWithReducedResult() throws Exception {
        assertEquals(new Fraction(1, 3), new Fraction(1, 9).plus(new Fraction(2, 9)));
        assertEquals(new Fraction(2), new Fraction(3, 4).plus(new Fraction(5, 4)));
        assertEquals(new Fraction(-2,3), new Fraction(1, 6).plus(new Fraction(-5, 6)));
    }

    @Test
    public void differentDenominatorsWithReducedResult() throws Exception {
        assertEquals(new Fraction(1, 2), new Fraction(1, -4).plus(new Fraction(6, 8)));
    }
}
