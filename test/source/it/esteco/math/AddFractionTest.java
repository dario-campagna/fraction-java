package it.esteco.math;

import it.esteco.math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddFractionTest {

    @Test
    public void zeroPlusZero() throws Exception {
        assertEquals(0, new Fraction(0).plus(new Fraction(0)).intValue());
    }

    @Test
    public void nonZeroPlusZero() throws Exception {
        assertEquals(7, new Fraction(7).plus(new Fraction(0)).intValue());
    }

    @Test
    public void zeroPlusNonZero() throws Exception {
        assertEquals(11, new Fraction(0).plus(new Fraction(11)).intValue());
    }

    @Test
    public void nonNegativeNonZeroOperands() throws Exception {
        assertEquals(13, new Fraction(4).plus(new Fraction(9)).intValue());
    }

    @Test
    public void negativePlusPositiveNonZero() throws Exception {
        assertEquals(1, new Fraction(-2).plus(new Fraction(3)).intValue());
    }

    @Test
    public void positiveNonZeroPlusNegative() throws Exception {
        assertEquals(4, new Fraction(5).plus(new Fraction(-1)).intValue());
    }

    @Test
    public void negativeInputsAndNegativeOutputs() throws Exception {
        assertEquals(-14, new Fraction(-6).plus(new Fraction(-8)).intValue());
    }

    @Test
    public void sameDenominators() throws Exception {
        Fraction sum = new Fraction(1, 3).plus(new Fraction(4, 3));
        assertEquals(5, sum.getNumerator());
        assertEquals(3, sum.getDenominator());
    }

    @Test
    public void differentDenominators() throws Exception {
        Fraction sum = new Fraction(1, 3).plus(new Fraction(1, 4));
        assertEquals(7, sum.getNumerator());
        assertEquals(12, sum.getDenominator());
    }
}
