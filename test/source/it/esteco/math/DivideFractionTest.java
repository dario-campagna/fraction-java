package it.esteco.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivideFractionTest {

    @Test
    public void ZeroDividedByNonZero() throws Exception {
        assertEquals(new Fraction(0), new Fraction(0).dividedBy(new Fraction(3)));
    }
}
