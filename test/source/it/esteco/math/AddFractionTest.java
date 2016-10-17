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
}
