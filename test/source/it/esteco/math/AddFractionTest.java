package it.esteco.math;

import it.esteco.math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddFractionTest {

    @Test
    public void zeroPlusZero() throws Exception {
        Fraction sum = new Fraction(0).plus(new Fraction(0));
        assertEquals(0, sum.intValue());
    }

    @Test
    public void nonZeroPlusZero() throws Exception {
        Fraction sum = new Fraction(7).plus(new Fraction(0));
        assertEquals(7, sum.intValue());
    }

    @Test
    public void zeroPlusNonZero() throws Exception {
        Fraction sum = new Fraction(0).plus(new Fraction(11));
        assertEquals(11, sum.intValue());
    }

    @Test
    public void nonNegativeNonZeroOperands() throws Exception {
        Fraction sum = new Fraction(4).plus(new Fraction(9));
        assertEquals(13, sum.intValue());
    }

    @Test
    public void negativePlusPositiveNonZero() throws Exception {
        Fraction sum = new Fraction(-2).plus(new Fraction(3));
        assertEquals(1, sum.intValue());
    }

    @Test
    public void positiveNonZeroPlusNegative() throws Exception {
        Fraction sum = new Fraction(5).plus(new Fraction(-1));
        assertEquals(4, sum.intValue());
    }

    @Test
    public void negativeInputsAndNegativeOutputs() throws Exception {
        Fraction sum = new Fraction(-6).plus(new Fraction(-8));
        assertEquals(-14, sum.intValue());
    }
}
