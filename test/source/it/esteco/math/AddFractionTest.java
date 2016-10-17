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
    public void positiveNonZeroPlusPositiveNonZero() throws Exception {
        Fraction sum = new Fraction(4).plus(new Fraction(9));
        assertEquals(13, sum.intValue());
    }
}
